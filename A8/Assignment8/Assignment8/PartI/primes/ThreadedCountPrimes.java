package primes;

import java.util.HashSet;
import java.util.Set;

public class ThreadedCountPrimes implements Runnable {
	private long min;
	private long max;
	private long count;
	
	
	public ThreadedCountPrimes(long min, long max) {
		this.min = min;
		this.max = max;
		count = 0;
	}

	@Override
	public void run() {
		
		for (long i = min; i < max; i++) {
			if (CountPrimes.isPrime(i)) {
				count = count + 1;
			}
		}
	}
	
	public long getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {

		long min = 10_000_000;
		long max = 20_000_000;
		
		long startTime = System.currentTimeMillis();
		long numPrimes = CountPrimes.numPrimes(min, max);

		long endTime = System.currentTimeMillis();
		System.out.println("number of primes from "+ min + " to " + max + " is " + numPrimes);
		System.out.println("this took  " + (endTime - startTime) + " ms ");
		//System.exit(0);
		numPrimes = 0;
		Set<Thread> threadSet = new HashSet<Thread>();
		Set<ThreadedCountPrimes> primesSet = new HashSet<ThreadedCountPrimes>();
		
		startTime = System.currentTimeMillis();

		/* you're going to start a bunch of threads, and you want them
		 * all to complete and get the total number of primes within
		 * the interval min, max when the threads are complete.
		 * 
		 * Figure this out. Specifically, figure out how to wait until
		 * a bunch of threads finish until continuing your code
		 */
		
		int threads = 100; //Set number of threads
		//10 ~ 2671 ms, 100 ~ 2568 ms, 1000 ~ 2598 ms, 10,000 ~ 2720 ms, 100,000 ~ 7764 ms
		//Best amount of threads seem to be between 10 and 100
		//50 ~ 2598 ms, 75 ~ 2548 ms but it misses 2 prime numbers
		//I would leave it at 100 threads with an interval of 100,000 observations
		//The time varies a bit between runs so any number of threads between 50-100, I'm considering the same
		long range = (max-min)/threads; //Have an equivalent amount of observations on each thread
		long tempMin = min; //Start value for thread loop, needs to be updated for each new thread
		
		for (int i = 0; i < threads; i++) {
			long tempMax = tempMin + range; // Same as tempMin just with the distributed observations on each thread accounted for
			
			ThreadedCountPrimes dummy = new ThreadedCountPrimes(tempMin, tempMax); //New object, changed in each loop
			Thread thread = new Thread(dummy); //Put each object on a thread, changed in each loop
			
			threadSet.add(thread); // Adds the thread to the thread set so it isn't lost
			primesSet.add(dummy); // Adds ThreadedCountPrimes object to a set of those objects
			
			tempMin = tempMax; //Updates the tempMin value and tempMax will update at the start of the loop
		}
		
		for (Thread dummy: threadSet) {
			dummy.start(); //Starts each thread in the thread set, runs the run() method for each object
		}
		
		for (Thread dummy: threadSet) {
			try {
				dummy.join(); //Waits for all of the threads to finish running, embarrassed to say how long I couldn't get this to work
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (ThreadedCountPrimes dummy : primesSet) {
            numPrimes += dummy.getCount(); //Combines the count from each object after the thread running changed the count value
        }
		
		
		
		
		endTime = System.currentTimeMillis();
		System.out.println("Threaded: number of primes from "+ min + " to " + max + " is " + numPrimes);
		System.out.println("this took  " + (endTime - startTime) + " ms ");

	}
}

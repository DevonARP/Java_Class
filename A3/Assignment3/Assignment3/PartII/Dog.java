
public class Dog {
        private int age;
        private String owner;
        private String breed;
        
    	public Dog(int age, String owner, String breed) {
    		this.age = age;
    		this.owner = owner;
    		this.breed = breed;
    	}
    	
    	public static boolean hasSameOwner(Dog dog, Dog dog2) {
    		if (dog2.owner==dog.owner) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    	
    	public static double avgAge(Dog[] dogs) {
    		double sum = 0;
    		int actualLength = 0;
    		for(int i=0;i<dogs.length;i++) {
    			if(dogs[i] != null) {
    				sum = sum + dogs[i].age;
    				actualLength = actualLength + 1;
    			}
    		}
    		sum = sum/actualLength;
    		return sum;
    	}
    	
    	public int getAge() {
    		return age;
    	}
    	
    	public String getOwner() {
    		return owner;
    	}
    	
    	public String getBreed() {
    		return breed;
    	}
    	
      	public void setAge(int age) {
    		this.age = age;
    	}
      	
      	public void setOwner(String owner) {
    		this.owner = owner;
    	}

      	public void setBreed(String breed) {
    		this.breed = breed;
    	}

      	public String toString() {
      		return "Breed: " + breed + ", Owner: " + owner + ", Age: " + age;
    	}

        public static void main(String[] args) {
                
                Dog[] dogs = new Dog[5];
                dogs[0] = new Dog(4, "Stephen Colbert", "Boxer");
                dogs[1] = new Dog(8, "Dexter Morgan", "Corgi");
                dogs[2] = new Dog(8, "Dexter Morgan", "Corgi");
        		
        		System.out.println("Dog Age: " + dogs[1].getAge());
        		System.out.println("Dog Owner: " + dogs[1].getOwner());
        		System.out.println("Dog Breed: " + dogs[1].getBreed());
        		System.out.println("Dog as a String: " + dogs[1].toString());
        		System.out.println("Dogs Average Age: " + avgAge(dogs));
        		System.out.println("Same Owner Name: " + hasSameOwner(dogs[0],dogs[1]));
        		System.out.println("Same Owner Name: " + hasSameOwner(dogs[1],dogs[2]));
        		System.out.println();
        		
        		dogs[1].setAge(9);
        		dogs[1].setOwner("Stephen Colbert");
        		dogs[1].setBreed("Boxer");
                
        		System.out.println("After changes");
        		System.out.println("Dog Age: " + dogs[1].getAge());
        		System.out.println("Dog Owner: " + dogs[1].getOwner());
        		System.out.println("Dog Breed: " + dogs[1].getBreed());
        		System.out.println("Dog as a String:: " + dogs[1].toString());
        		System.out.println("Dogs Average Age: " + avgAge(dogs));
        		System.out.println("Same Owner Name: " + hasSameOwner(dogs[0],dogs[1]));
        		System.out.println("Same Owner Name: " + hasSameOwner(dogs[1],dogs[2]));
        }
}
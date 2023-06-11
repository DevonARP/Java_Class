import java.util.Arrays;

public class CopyShift {

	public static void copyShift(int[] sourceArray, int[] destArray, int shift) {
		int actualShift = shift%sourceArray.length;
		for (int i = 0;i < sourceArray.length-actualShift; i++) {
			destArray[i+actualShift] = sourceArray[i];
		}
		for (int i = 0;i < actualShift; i++) {
			destArray[i] = sourceArray[sourceArray.length-actualShift+i];
		}

	}
	
	public static void main(String[] args) {
		
		int[] sourceArray = new int[50];
		int[] destArray = new int[50];
		
		/* initialize the source Array */
		for (int i = 0;i < sourceArray.length; i++) {
			sourceArray[i] = (int)(Math.random()*100);
		}
		
		int shiftValue = 64;
		copyShift(sourceArray, destArray, shiftValue);
		
		/* destArray should have the contents of sourceArray
		 * but in shifted over "shiftValue" values
		 * if sourceArray has the contents [1,5,6,7,9] and we want to shift it 
		 * 3 spaces over, destArray should have the contents [6,7,9,1,5].
		 * 
		 * It should work for arbitrarily large values of shift
		 */
		System.out.println("source array: " + Arrays.toString(sourceArray));
		System.out.println("destination array: " + Arrays.toString(destArray));
	}
}

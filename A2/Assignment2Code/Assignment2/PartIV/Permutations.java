import java.util.Arrays;

class Permutations {
	
	
	
	public static int[][] getPermutations(int[] array, int i, int j) {
		
		int factorial = 1; //Getting the total permutations
		for (int k = 2; k<= array.length; k++) {
			factorial = factorial * k;
		}
		
		int[][] permutations = new int[factorial][array.length]; //I didn't end up using this
		
		for(; j < array.length && i < array.length; j++) {
			int[] temp = array;
			if (i!=j) { //Should be different once i and j reach array length as the for loop will backtrack and have a different i and j values
				int tempInt = temp[i]; //Swapping value positions
				temp[i] = temp[j];
				temp[j] = tempInt;
				//System.out.println(Arrays.toString(temp));
				//System.out.println(i);
				//System.out.println(j);
				
				String str = Arrays.toString(temp); //Converting to a string
		        String[] string = str.replaceAll("\\[", "")
                        .replaceAll("]", "")
                        .replaceAll(" ", "")
                        .split(",");
		        
		        for (int k = 0; k < string.length; k++) { //Converting to array and adding to double array
		        	arrayIndex[currentIndex][k] = Integer.valueOf(string[k]);
		        	
		        }
		        currentIndex++;
				//System.out.println(Arrays.deepToString(arrayIndex));
		        
			}

			
			getPermutations(temp, i + 1, i + 1); //Recursing through with new i and j values

		}
		
		
		return permutations;
		
	}
	
	
	private static int currentIndex = 0;
	private static int[][] arrayIndex;
	
	
    
    public static void main(String[] args) {
    	int[] startingArray =   {1, 2, 3, 4 , 5};
    	Arrays.sort(startingArray); //Sorting array in order
    	
		int factorial = 1; //Getting the total permutations
		for (int k = 2; k<= startingArray.length; k++) { 
			factorial = factorial * k;
		}
    	arrayIndex = new int[factorial-1][startingArray.length]; //Setting size
    	
    	getPermutations(startingArray, 0, 0);
		for (int i = 0; i< factorial-1 ; i++) { //Printing double array line by line
			System.out.println(Arrays.toString(arrayIndex[i]));
		}
    }
}

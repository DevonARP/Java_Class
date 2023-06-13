
public class WordReverser {

	public static String reverseSentence(String sentence) {
		
		String[] resultList = sentence.split(" ");
		
		String end = "";
		
		for (int i = 0; i< resultList.length ; i++) {
			
			//System.out.println(resultList[i]);
			//System.out.println(resultList[i].length());
			
			for (int j = 0; j< resultList[i].length() ; j++) {
				if(Character.isUpperCase(resultList[i].charAt(j))) { //Capitalizes the order of letters
					end = end + Character.toUpperCase(resultList[i].charAt(resultList[i].length()-1-j));
				} else {
					end = end + Character.toLowerCase(resultList[i].charAt(resultList[i].length()-1-j));
				}
				
			}
			end = end + " "; //Gets rid of the extra space at the end
			
		}
		
		end = end.substring(0,end.length()-1);
		
		//System.out.println(Arrays.toString(resultList));
		//System.out.println(end);
		
		return end;
	}
	
	public static void main(String[] args) {
		String result = reverseSentence("The quick brown fox jumps over the lazy dog");
		
		System.out.println(result);
		

	}

}

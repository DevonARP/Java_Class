
public class DumbPasswords {

	public static void printDumbPasswords(int m, int n) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for (int a = 1; a < m; a++) {
			for (int b = 1; b < m; b++) {
				for (int c = 1; c < n+1; c++) {
					char letter1 = alphabet.charAt(c-1);
					for (int d = 1; d < n+1; d++) {
						char letter2 = alphabet.charAt(d-1);
						for (int e = 1; e < m+1; e++) {
							if(e>a && e>b) {
								System.out.print(a);
								System.out.print(b);
								System.out.print(letter1);
								System.out.print(letter2);
								System.out.print(e);
								System.out.print(" ");
							}
							}
						}
					}
				}
			}
		}
	
	public static void main(String[] args) {
		printDumbPasswords(4,2);
		
	}
}

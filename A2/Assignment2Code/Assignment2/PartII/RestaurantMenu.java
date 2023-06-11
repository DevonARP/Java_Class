import java.util.Scanner;

public class RestaurantMenu {

	public static double itemCost(char item) {
		return -1;
	}
	
	public static void main(String[] args) {
		
		char item = 'X';
		double total = 0;
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter menu item: ");
			item = in.next().charAt(0);
			item = Character.toUpperCase(item);
			switch(item) {
			case 'H':
				total = total + 5.25;
				break;
			case 'F':
				total = total + 2.55;
				break;
			case 'C':
				total = total + 7.00;
				break;
			case 'M':
				total = total + 3.75;
				break;
			case 'B':
				total = total + 6.25;
				break;
			case 'S':
				total = total + 1.25;
				break;
			case 'X':
				System.out.print("Order Complete. Total is $" + total );
				break;
			default:
				System.out.println("Invalid menu item");
				break;
			}
			
		}
		while(item != 'X');
		
		

		
		
	}
}

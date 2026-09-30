package DAY2;
import java.util.Scanner;
public class choices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Language for Communication: ");
		System.out.println("1.English");
		System.out.println("2.Hindi");
		System.out.println("3.French");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : System.out.println("Call routed to london");
		break;
		case 2 : System.out.println("Call routed to Delhi");
		break;
		case 3 : System.out.println("Call routed to Sweden");
		break;
		}
		
		System.out.println("Thanks for Reaching out, Have a Nice Day!");
		sc.close();
	}
}

package git_taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		Taschenrechner ts = new Taschenrechner();

		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Multiplizieren |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);

		// Switch construct
		switch (swValue) {
		case '1':
			System.out.println("The first number you want to sum: ");
			int addNumb1 = myScanner.nextInt();
			
			System.out.println("The second number you want to sum: ");
			int addNumb2 = myScanner.nextInt();
			
			System.out.println(ts.add(addNumb1, addNumb2));
			break;
			
		case '2':
			System.out.println("The first number you want to sub: ");
			int subNumb1 = myScanner.nextInt();
			
			System.out.println("The second number you want to sub: ");
			int subNumb2 = myScanner.nextInt();
			System.out.println(ts.sub(subNumb1, subNumb2));
			break;
			
		case '3':
			System.out.println("The first number you want to mul: ");
			int mulNumb1 = myScanner.nextInt();
			
			System.out.println("The second number you want to mul: ");
			int mulNumb2 = myScanner.nextInt();
			System.out.println(ts.mul(mulNumb1, mulNumb2));
			break;
			
		case '4':
			System.out.println("The first number you want to div: ");
			int divNumb1 = myScanner.nextInt();
			
			System.out.println("The second number you want to div: ");
			int divNumb2 = myScanner.nextInt();
			System.out.println(ts.add(divNumb1, divNumb2));
			break;
			
		case '5':
			System.out.println("Exit Confirmed");
			
		  
		  
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}

	}

}

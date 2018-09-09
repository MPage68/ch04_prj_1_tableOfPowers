package ch04_prj_1_tableOfPowers;

import java.util.Scanner;

public class tableOfPawerapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Squares and Cubes table");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an interger:  ");
			int x = sc.nextInt();
			String table = "";
			String header = "Number\tSquared\tCubed\n";
			String separator = "=====\t=====\t=====\n";
			table += header;
			table += separator;
			
			for (int i = 1; i <= x; i++) {
				int squared = i * i;
				int cubed = i * i * i;
				table += i + "\t" + squared + "\t" + cubed +"\n";
			}
			System.out.println(table);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}

		sc.close();
		System.out.println("Bye");
	}

}

package userInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter your age: ");
		int number =sc.nextInt();
		
		System.out.println("Your hight: ");
		double num1 =sc.nextDouble();
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(num1);

	}

}

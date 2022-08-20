package q3;

import java.util.Scanner;

public class Scenario2 {
	static int itemCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Print Cart \t 2. exit \t 3. Add Item \t 4. Remove Item \t 5. Buy");
		//Add Any Code if needed Here
	}
	private static String addItem(){
		itemCount++;
		//Add Any Code if needed Here
		return "New Item Added \n";
	}
	private static String removeItem(){
		itemCount--;
		//Add Any Code if needed Here
		return "Item removed \n";
	}
	private static String exit(){
		//Add Any Code if needed Here
		return "Exiting Without buying \n";
	}
	private static String print(){
		//Add Any Code if needed Here
		return "Cart Has "+itemCount+" Items \n";
	}
	private static String buy(){
		//Add Any Code if needed Here
		return "Buying "+itemCount+" Items \n";
	}
}

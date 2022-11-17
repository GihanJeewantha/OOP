package Ex2;
import java.util.Scanner;

public class Student {
	String name,address,RegNo;
	
	public static void main(String []args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = Sc.nextLine();
		
		System.out.println("Address : ");
		String address = Sc.nextLine();
		
		System.out.println("Reg Number : ");
		String RegNo = Sc.nextLine();
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Reg No: "+RegNo);
		
	}

}

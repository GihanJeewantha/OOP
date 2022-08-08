
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String name =Sc.nextLine();
		
		System.out.println("Enter Student ID : ");
		int ID = Sc.nextInt();
		
		System.out.println("Enter District : ");
		String dis = Sc.nextLine();
		
		
		System.out.println("Student Name : "+ name);
		System.out.println("Student ID Number : " + ID);
		System.out.println("Student District : " + dis);
		
	}

}

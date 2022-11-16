package Ex3;
import java.util.Scanner;

public class Main {
	int age = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age =Sc.nextInt();
		
		if(age>=18) {
			System.out.println("Adult !");
		}else {
			System.out.println("Chield !");
		}

	}

}

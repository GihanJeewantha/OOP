import java.util.Scanner;

public class SwitchInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		System.out.println("Enter name : ");
		System.out.println("------name list------");
		System.out.println("jeewantha/ Dilshan");
		
		Scanner sc = new Scanner(System.in);
		
		name=sc.nextLine();
		
		switch(name) {
		
		case "jeewantha":
			System.out.println("you pick jeewantha !");
			break;
			
		case "dilshan":
			System.out.println("you pick Dilshan !");
			break;
			
			default:
				System.out.println("invalid input");
		}
		

	}

}

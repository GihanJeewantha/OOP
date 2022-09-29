package constructor_overloding;

public class Bank {
	int rupees;
	Bank(){
		rupees =0;
	}
	
	Bank(int x){
		rupees = x;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new Bank();
		Bank obj1 = new Bank(20);
		
		System.out.println(obj.rupees);
		System.out.println(obj1.rupees);
	}

}

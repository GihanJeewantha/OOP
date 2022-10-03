package polymorphism2;

public class child extends parent {  //inherit parent class
	
	public void phone() {
		System.out.println("oppo");  // override the method
	}
	
	public static void main (String [] args) {
		child obj = new child();
		obj.phone();
	}

}

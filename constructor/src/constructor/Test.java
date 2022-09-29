package constructor;

public class Test {
	
	String name;
	Test(){
		name ="Jeewantha Dilshan";
		System.out.println("JD Welcome To java");
	}
	
	
	void meth() {
		System.out.println("Hello World !");
		
	}
	
	public static void main(String[]args) {
		
		Test obj = new Test();
		obj.meth();
		
		Test obj1 = new Test();
		System.out.println(obj1.name);
		
		
		
	}

}

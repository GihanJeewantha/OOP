

class A{
	int x = 10;
}

class B extends A{
	int x = 15;
	
	public void print() {
		System.out.println(super.x);
	}
}


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.print();

	}

}

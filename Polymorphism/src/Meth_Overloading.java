
public class Meth_Overloading {
	public void meth() {
		System.out.println("method 1");
	}
	
	public void meth(int x) {            //give argument inside method
		System.out.println("method 2");
	}
	
	public void meth(int a,int b) {
		System.out.println("method 3");
	}
	
	public static void main(String []args) {
		Meth_Overloading obj1 = new Meth_Overloading();
		obj1.meth();
		obj1.meth(5);
		obj1.meth(4,6);
	}

}

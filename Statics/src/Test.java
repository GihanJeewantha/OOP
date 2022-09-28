
public class Test {
	
	int x;
	static int y;
	
	void meth1() {
		
	}

	
	//static
	
	static void meth2() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = 4;  //non static
		
		y = 369; //statics
		
		meth1();  //non static
		
		meth2();  //statics
		
		//We can access Statics Variable and methods derectly in main methoda
		//without create any object  but  we need to use non statics method or variable in 
		//main method we have to create object then call then true the object
		
		
		Test obj = new Test();
		obj.x=4;
		obj.meth1();

	}

}

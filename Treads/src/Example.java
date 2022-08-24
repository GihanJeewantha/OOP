
public class Example extends Thread {

	public static void main(String[] args) {
	
		Example e1 = new Example();
		e1.start(); // after create thread u need add start 
		
		for(int i=0; i<20; i++) {
			System.out.println("Main prints " +i);
		}

	}
	
	public void run() {
		for(int i=0; i<20; i+=2) {
			System.out.println("Child prints " + i);
		}
	}

}

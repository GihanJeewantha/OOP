
public class ChildThread1 extends Thread {
	
	public void run() {
		for(int x=0; x<5; x++){
			System.out.println("Hello world in child thread");
		}
	}

}

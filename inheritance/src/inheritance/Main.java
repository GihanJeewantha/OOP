package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.go();
		
		Bycycle bycycle = new Bycycle();
		bycycle.stop();
		
		System.out.println(car.speed);
		System.out.println(bycycle.speed);
		
	}

}

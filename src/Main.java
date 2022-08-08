
public class Main {

	public static void main(String[] args) {
		

		int miles , yards ;
		double kilometers;
		
		miles = 26;
		yards = 385;
		
		kilometers = (yards/1760.0 + miles)* 1.609;
		System.out.println("Kilometers : " + kilometers);
		
	}

}

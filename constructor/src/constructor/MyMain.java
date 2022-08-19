package constructor;

public class MyMain {

	public static void main(String[] args) {
		
		//object1
		Student student = new Student(36,"jeewantha Dilshan", 369.00);
		student.show();
		
		
		//object2
		Student student2 = new Student(369,"jeewanthaDilshan",369.0);
		
		student2.show();

	}

}

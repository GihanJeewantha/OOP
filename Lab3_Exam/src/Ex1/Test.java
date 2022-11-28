package Ex1;

public class Test {
	
	public static void main(String [] args) {
		
		Student student1 = new Student();
		student1.name ="JD";
		student1.address="kandy";
		student1.ditno=123;
		
		Student student2 = new Student();
		student2.name="tharu";
		student2.address="malabe";
		student2.ditno=123;
		
		System.out.println("Student 1"+student1.name+"\nStudent1"+student1.address+"\nstudent1"+student1.ditno);
		System.out.println("Student 2"+student2.name+"/nStudent2"+student2.address+"/nstudent2"+student2.ditno);
	}

}

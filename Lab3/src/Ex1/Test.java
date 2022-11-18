package Ex1;

public class Test {
	
	public static void main(String []args) {
	
	Student student1 = new Student();
	student1.name="Tharu";
	student1.address="Kandy";
	student1.ditNo="1234";
	System.out.println("Student 1 : Name: "+student1.name +"Address: "+student1.address +"ditNo: "+student1.ditNo);
	
	Student student2 = new Student();
	student2.name="Dili";
	student2.address="Galle";
	student2.ditNo="5678";
	
	System.out.println("Student 2 : Name: "+student2.name +"Address: "+student2.address +"ditNo: "+student2.ditNo);
	
	}
	
}

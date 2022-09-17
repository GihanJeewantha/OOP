
public class Student {
	
	private  int id;
	private String name;
	private double mark;
	
	public Student() {
		id=1;
		name="Jeewantha";
		mark=369;
	}
	
	public Student(int pid,String pname,double pmark) {
		
		
	}
	
	public void show() {
		System.out.println("Your id is "+id);
		System.out.println("Your name is "+ name);
		System.out.println("Your mark is " +mark);
	}

}

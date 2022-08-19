package constructor;

public class Student {
	
	private int ID;
	private String name;
	private double mark;
	
	//if you doesn't add constructor to class java will added defualt constrctor for you 
	
	 public Student() {
		ID = 369;
		name = "Jeewantha Dilshan";
		mark = 369.0;
	}  
	
	//paramiter constructor
	
	public Student(int pid, String pname, double pmark) {
		this.ID=pid;
		this.name = pname;
		this.mark = pmark;
	}
	
	public void show() {
		System.out.println("your ID is "+ID);
		System.out.println("your Name is "+name);
		System.out.println("your Mark is "+mark);
	}

}

package Ex1;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Nimal";
		s1.ditno = "IT123";
		s1.address = "Malabe";
		
		Student s2 = new Student();
		s2.name = "Jeewantha Dilshan";
		s2.ditno = "IT345";
		s2.address = "Anuradhapura";
		
		Student s3 = new Student();
		s3.name = "Sanga";
		s3.ditno = "IT678";
		s3.address ="Colombo";
		
		System.out.println("Name : "+s1.name + "DitNo : "+s1.ditno+ "Address :"+s1.address);
		System.out.println("Name : "+s2.name + "DitNo : "+s2.ditno+ "Address :"+s2.address);
		System.out.println("Name : "+s3.name + "DitNo : "+s3.ditno+ "Address :"+s3.address);
		

	}

}


public class Product {
	
	int pid;
	String name;
	int price;
	
	Product(){
		System.out.println("this is constructor");
	}
	
	void setProductDetails(int pid,String name,int price) {
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	
	void showProductDetails() {
		System.out.println("product ID"+pid+"-----");
		
		System.out.println("Product Name"+name+"------");
	}
	
	Product product = new Product();
	
	product.setProductDetails(101,"iPhone13",7000);

}

package Encapsulation;
class Product{
	private String productName;
	private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else
			price=0.0;
	}
	public void displayProduct() {
		System.out.println("Product Name:"+getProductName());
		System.out.println("Price: "+getPrice());
	}
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setProductName("Laptop");
		p.setPrice(-50);
		p.displayProduct();

	}

}

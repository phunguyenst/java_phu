package nguyenVanPhu.bai12;

import java.text.DecimalFormat;

public class Product {
	private String description;
	private String productID;
	private double price;
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return String.format("%-16s|%-16s|%10s", this.description, this.productID, df.format(price));
	}
	public Product() {
		this("chưa biết", "chưa biết",0);
	}
	public Product(String description, String productID, double price) {
		setDescription(description);
		setProductID(productID);
		setPrice(price);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

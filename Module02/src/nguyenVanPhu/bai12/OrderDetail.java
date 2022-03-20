package nguyenVanPhu.bai12;

import java.text.NumberFormat;
import java.util.Locale;

public class OrderDetail {
	private int quatity;
	private Product product;
	
	public double calcTotalPrice() {
		return quatity * product.getPrice();
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi","vn");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		return product+ String.format("%10s| %10s", this.quatity, nf.format(calcTotalPrice()));
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public OrderDetail( Product product, int quantity) {
		super();
		setQuatity(quantity);
		this.product = product;
	}
	
}

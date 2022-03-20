package nguyenVanPhu.bai12;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;

	public void addLineItem(Product p, int q) throws Exception {
		if (count < lineItems.length) {
			lineItems[count] = new OrderDetail(p, q);
			count++;
		} else
			throw new Exception("lỗi số lượng sản phẩm lớn hơn số lượng tối đa");
	}

	public double calcTotalCharge() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += lineItems[i].calcTotalPrice();
		}
		return sum;
	}

	public static String getTieuDe() {
		return String.format("%-6s| %-16s| %-16s| %10s | %10s | %15s", "STT", "Mã SP", "Mô tả", "Đơn giá", "S Lượng","Thành tiền");
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String s = String.format("Mã HD: %d\nNgày lập hóa đơn: %s\n", orderID, dtf.format(orderDate));

		for (int i = 0; i < count; i++)
			s += String.format("\n%-6d| %s", i + 1, lineItems[i]);
		Locale lo = new Locale("vi", "vn");
		NumberFormat nf = NumberFormat.getNumberInstance(lo);
		return s + String.format("\nTổng tiền thanh toán: %s VND", nf.format(calcTotalCharge()));
	}

	public Order(int orderID, LocalDate orderDate) {
		super();
		this.orderID = orderID;
		setOrderDate(orderDate);
		this.lineItems = new OrderDetail[20];
		count = 0;
	}

	

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

}

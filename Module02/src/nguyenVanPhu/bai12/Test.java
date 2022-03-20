package nguyenVanPhu.bai12;
import java.time.LocalDate;
public class Test {

	public static void main(String[] args) {
		try {
			Order or = new Order(1,LocalDate.of(2015, 9, 10));
			or.addLineItem(new Product("sp4", "Nước tương", 8000), 10);
			or.addLineItem(new Product("sp1", "Gạo", 18000), 5);
			or.addLineItem(new Product("sp3", "Đường", 10000), 1);
			or.addLineItem(new Product("sp1", "Gạo", 18000), 1);
			System.out.println(Order.getTieuDe());
			System.out.println(or);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	}


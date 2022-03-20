package nguyenVanPhu.bai09;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang kh = new KhachHang("KH001", "Nguyen Van An", 2);
		kh.themSoTietKiem("111", LocalDate.of(2021, 05, 01), 1000000.00, 3, (float) 0.005);

		kh.themSoTietKiem("112", LocalDate.of(2020, 12, 10), 1000000000.00, 6, (float) 0.006);
		System.out.println(kh);
	}

}

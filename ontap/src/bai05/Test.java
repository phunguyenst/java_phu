package bai05;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args)  {
		try {
		HangThucPham[] htp =  new HangThucPham[3];
		htp[0] = new HangThucPham("001", "Gạo", 100000.00,LocalDate.of(2021, 07, 10), LocalDate.of(2021, 07, 10));
		htp[1] = new HangThucPham("002", "Mì", 5000.00, LocalDate.of(2021, 03, 01), LocalDate.of(2021,9, 01));
		htp[2] =  new HangThucPham("003", "Nước", 10000.00, LocalDate.of(2020, 03, 01), LocalDate.of(2021, 03, 01));
		System.out.println(HangThucPham.getTieuDe());
		for (int i = 0; i < htp.length; i++) {
			System.out.println(htp[i]);
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

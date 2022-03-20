package bai04;


public class test {

	public static void main(String[] args) {
		ThongTinDangKiXe[] tt1 = new ThongTinDangKiXe[3];
		tt1[0] = new ThongTinDangKiXe("Nguyễn Thu Loan", "Future Neo", 35000000.00, 100);
		tt1[1] = new ThongTinDangKiXe("Lê Minh Tính", "Ford Ranger", 250000000.00, 3000);
		tt1[2] = new ThongTinDangKiXe("Nguyễn Minh Triết", "Landscape", 1000000000.00, 1500);
		System.out.println(ThongTinDangKiXe.getTieuDe());
		for (int i = 0; i < tt1.length; i++) {
			System.out.println(tt1[i]);
		}

		

	}

}

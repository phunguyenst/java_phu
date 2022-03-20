package nguyenVanPhu.bai03;

public class TestHinhChuNhat {

	public static void main(String[] args) {
		try {
			HinhTamGiac[] tg = new HinhTamGiac[5];
			tg[0] = new HinhTamGiac(-2,3,4);
			tg[1] = new HinhTamGiac(-2, 4, 3);
			tg[2] = new HinhTamGiac(6,3,5);
			tg[3] = new HinhTamGiac(3, 5,5);
			tg[4] = new HinhTamGiac(4,4,4);
			System.out.printf("%9s %9s %9s %-20s %9s %9s", "ma", "mb", "mc", "loại tam giác", "chu vi, ", "diện tích\n");
			System.out.println(tg[0].toString());
			System.out.println(tg[1].toString());
			System.out.println(tg[2].toString());
			System.out.println(tg[3].toString());
			System.out.println(tg[4].toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		

	}

}

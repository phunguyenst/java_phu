package nguyenVanPhu.bai04;

public class TestThongTinDangKyXe {

	public static void main(String[] args) {
		try {
			ThongTinDangKyXe[] tt = new ThongTinDangKyXe[3];
			tt[0] = new ThongTinDangKyXe("Nguyễn Thu Loan", "Future Neo", 35000000, 100);
			 tt[1] = new ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger", 250000000, 300);
			 tt[2] = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1000000000, 1500);
				System.out.println(ThongTinDangKyXe.getTieuDe());
			System.out.println("====================================================================================");
			for (int i = 0; i < tt.length; i++) {
				System.out.println(tt[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

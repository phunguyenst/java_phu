package nguyenVanPhu.bai11;

public class Test {

	public static void main(String[] args) {
		DanhSachCongNhan ds1 = new DanhSachCongNhan(3);
		ds1.themMotCongNhan("nguyễn", "thọ", 13);
		ds1.themMotCongNhan("nguyễn", "tài", 4);
		ds1.themMotCongNhan("nguyễn", "tèo", 210);
		System.out.println(ds1);
		//ds1.xoaCongNhanTheoTen("thọ");
		
	

	}

}

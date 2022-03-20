package hinhChuNhat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat h1 = new HinhChuNhat(3, 5);
		h1.setChieuDai(6);
		h1.setChieuRong(7);
		System.out.println("Dien tich la: " + h1.tinhDienTich());
		System.out.println("Chu vi la: " + h1.tinhChuVi());
		System.out.println(h1.layThongTin());
	}

}

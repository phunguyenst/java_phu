package arraylist;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachSinhVien a = new DanhSachSinhVien();
		a.themDanhSachSinhVien(new SinhVien(123, "nguyen van a", 1900));
		a.themDanhSachSinhVien(new SinhVien(345, "nguyen van b", 1900));
		a.xoaSV(123);
		System.out.println(a);
	}

}

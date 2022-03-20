package nguyenVanPhu.bai02;

import java.util.Scanner;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DiemSinhVien sv1 = new DiemSinhVien(20048881, "Nguyen Van Phu", 9.5, 9.5);
			DiemSinhVien sv2 = new DiemSinhVien(20048882, "Tran Cong", 5.2, 6.2);

			int maSV;
			String hoTen;
			double diemLT, diemTH;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ma sinh vien: ");
			maSV = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap ten sinh vien: ");
			hoTen = sc.nextLine();
			System.out.println("Nhap diem ly thuyet: ");
			diemLT = sc.nextDouble();
			System.out.println("Nhap diem thuc hanh: ");
			diemTH = sc.nextDouble();
			sc.close();
			DiemSinhVien sv3 = new DiemSinhVien(maSV, hoTen, diemLT, diemTH);
			System.out.printf("%-10s %-30s %7s %7s %7s\n", "maSV", "hoTen", "diemLT", "diemTH", "diemTB");
			System.out.println(sv1.toString());
			System.out.println(sv2.toString());
			System.out.println(sv3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

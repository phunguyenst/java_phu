package bai02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien (11111, "Nguyễn Thành An", 6.50, 8.50);
		DiemSinhVien sv2 = new DiemSinhVien(22222, "Lê Thị Bông", 7.50, 8.00); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập mã số của sinh viên sv3");
		int maSV = sc.nextInt();
		sc.nextLine();
		System.out.println("\nNhập họ và tên của sinh viên sv3");
		String hoTen = sc.nextLine();
		System.out.println("nhập điểm lý thuyết của sinh viên sv3");
		double diemLT = sc.nextDouble();
		System.out.println("nhập điểm thực hành của sinh viên sv3");
		double diemTH = sc.nextDouble();
		sc.close();
		DiemSinhVien sv3 = new DiemSinhVien(maSV, hoTen,diemLT ,diemTH);
		System.out.println(DiemSinhVien.getTieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	
		

	}

}

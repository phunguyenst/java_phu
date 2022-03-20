package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DanhSachPhongHoc ph = new DanhSachPhongHoc();
		ph.themPhongHoc(new PhongLyThuyet("123", "a11", 25.3, 10, true));
		ph.themPhongHoc(new PhongMayTinh("356", "d11", 11.5, 12, 30));
		ph.themPhongHoc(new PhongThucHanh("642", "b44", 35.6, 30, "lý", 100, true));
		
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			System.out.println("1.lấy thông tin toàn bộ danh sách các phòng học");
			System.out.println("2.lấy thông tin các phòng đạt chuẩn: ");
			System.out.println("3.sắp xếp danh sách tăng dần theo dãy nhà: ");
			System.out.println("4.sắp xếp danh sách giảm dần theo diện tích: ");
			System.out.println("5.sắp xếp danh sách tăng dần theo số bóng đèn: ");
			System.out.println("7.cập nhập số máy tính của 1 phòng học: ");
			System.out.println("8.xóa một phòng học khi biết mã phòng: ");
			System.out.println("9.tính tổng số phòng học: ");
			System.out.println("10.lấy danh sách các phòng có 60 máy: ");
			System.out.println("mời nhập lựa chọn: ");
			luaChon = sc.nextInt();
			switch(luaChon) {
			case 1:{
				System.out.println("=====Phòng Lý Thuyết=====");
				System.out.println(PhongHoc.getTieuDePhongLyThuyet());
				System.out.println(ph.getPhongLyThuyet());
				System.out.println("=====Phòng Máy Tính=====");
				System.out.println(PhongHoc.getTieuDePhongMayTinh());
				System.out.println(ph.getPhongMayTinh());
				
				System.out.println("=====Phòng Thực Hành=====");
				System.out.println(PhongHoc.getTieuDePhongThucHanh());
				System.out.println(ph.getPhongThucHanh());
				
			}break;
			case 2: {
				ArrayList<PhongHoc> kq = ph.getPhongDatChuan();
				for (PhongHoc phongHoc : kq) {
					System.out.println(phongHoc);
				}
			}break;
			
			case 3:{
				ph.sapXepTangDanTheoDayNha();
				System.out.println("=====Phòng Lý Thuyết=====");
				System.out.println(PhongHoc.getTieuDePhongLyThuyet());
				System.out.println(ph.getPhongLyThuyet());
				System.out.println("=====Phòng Máy Tính=====");
				System.out.println(PhongHoc.getTieuDePhongMayTinh());
				System.out.println(ph.getPhongMayTinh());
				
				System.out.println("=====Phòng Thực Hành=====");
				System.out.println(PhongHoc.getTieuDePhongThucHanh());
				System.out.println(ph.getPhongThucHanh());
			}break;
			
			case 4:{
				ph.sapXepGiamDanTheoDienTich();
				System.out.println("=====Phòng Lý Thuyết=====");
				System.out.println(PhongHoc.getTieuDePhongLyThuyet());
				System.out.println(ph.getPhongLyThuyet());
				System.out.println("=====Phòng Máy Tính=====");
				System.out.println(PhongHoc.getTieuDePhongMayTinh());
				System.out.println(ph.getPhongMayTinh());
				
				System.out.println("=====Phòng Thực Hành=====");
				System.out.println(PhongHoc.getTieuDePhongThucHanh());
				System.out.println(ph.getPhongThucHanh());
			}break;
			case 5:{
				ph.sapXepTangDanTheoSoBongDen();
				System.out.println("=====Phòng Lý Thuyết=====");
				System.out.println(PhongHoc.getTieuDePhongLyThuyet());
				System.out.println(ph.getPhongLyThuyet());
				System.out.println("=====Phòng Máy Tính=====");
				System.out.println(PhongHoc.getTieuDePhongMayTinh());
				System.out.println(ph.getPhongMayTinh());
				
				System.out.println("=====Phòng Thực Hành=====");
				System.out.println(PhongHoc.getTieuDePhongThucHanh());
				System.out.println(ph.getPhongThucHanh());
			}break;
			case 6:{
				System.out.println("nhập số máy tính cần cập nhập");
				int soMayTinh = sc.nextInt();
				System.out.println("nhập mã phòng cần lấy");
				sc.nextLine();
				String maPhong = sc.nextLine();
				boolean kq = ph.capNhapSoMayTinh(maPhong, soMayTinh);
				if(kq == true) {
					System.out.println("phòng máy tính sau khi cập nhập là: ");
					System.out.println("=====Phòng Máy Tính=====");
					System.out.println(PhongHoc.getTieuDePhongMayTinh());
					System.out.println(ph.getPhongMayTinh());
				}
				else
				{
					System.out.println("không cập nhập được");
				}
			}
			case 7:
			{
				System.out.println("nhập mã cần xóa");
				sc.nextLine();
				String maPhong = sc.nextLine();
				boolean kq = ph.xoaPhongHoc(maPhong);
				if(kq == true) {
					System.out.println("phòng sau khi xóa");
					ph.sapXepTangDanTheoSoBongDen();
					System.out.println("=====Phòng Lý Thuyết=====");
					System.out.println(PhongHoc.getTieuDePhongLyThuyet());
					System.out.println(ph.getPhongLyThuyet());
					System.out.println("=====Phòng Máy Tính=====");
					System.out.println(PhongHoc.getTieuDePhongMayTinh());
					System.out.println(ph.getPhongMayTinh());
					
					System.out.println("=====Phòng Thực Hành=====");
					System.out.println(PhongHoc.getTieuDePhongThucHanh());
					System.out.println(ph.getPhongThucHanh());
				}
				else
				{
					System.out.println("không xóa được");
				}
			}
			}
		}while(luaChon<10);
		
	
		

	}

}

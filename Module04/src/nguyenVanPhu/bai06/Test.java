package nguyenVanPhu.bai06;

import java.util.ArrayList;
import java.util.Scanner;

import nguyenVanPhu.bai07.Employee;

public class Test {

	public static void main(String[] args) {

		DanhSachPhongHoc ph = new DanhSachPhongHoc();
		ph.themPhongHoc(new PhongLyThuyet("123", "A12", 200, 10, true));
		ph.themPhongHoc(new PhongMayTinh("456", "A11", 135.5, 20, 70));
		ph.themPhongHoc(new PhongThiNghiem("789", "B23", 220.5, 9, "CNTT", 90, false));

		Scanner sc = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("1. Xuat danh sach phong hoc");
			System.out.println("2. Tim kien phong hoc");
			System.out.println("3. Danh sach cac phong hoc dat chuan");
			System.out.println("4. Tong so phong hoc");
			System.out.println("5. Sap xep theo day nha tang dan");
			System.out.println("6. Sap xep theo dien tich giam dan");
			System.out.println("7. Sap xep theo so bong den tang dan: ");
			System.out.println("8. Cap nhat so may tinh:");
			System.out.println("9. Xoa phong hoc khi biet ma phong");
			System.out.println("10. Phong may tinh tren 60");
			System.out.println("11. Thoat");
			System.out.println("nhap lua chon: ");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: {
				System.out.println("=====Phòng lý thuyết=====");
				System.out.println(PhongHoc.getTieuDePhongLyThuyet());
				System.out.println(ph.getPhongLyThuyet());
				System.out.println("=====Phòng máy tính=====");
				System.out.println(PhongHoc.getTieuDePhongMayTinh());
				System.out.println(ph.getPhongMayTinh());
				System.out.println("=====Phòng thí nghiệm=====");
				System.out.println(PhongHoc.getTieuDePhongThiNghiem());
				System.out.println(ph.getPhongThiNghiem());
				break;
			}
			case 2: {
				System.out.print("Nhập mã phòng  cần tìm:");
				sc.nextLine();
				String maPhong = sc.nextLine();

				PhongHoc pH = ph.timKiemPhongHoc(maPhong);
				if (pH != null) {
					System.out.println("\nmã phòng cần tìm là: \n");
					System.out.println(ph.timKiemPhongHoc(maPhong));
				} else
					System.out.println("Khong tim thay.");

			}
				break;
			case 3: {
				DanhSachPhongHoc ds = ph.layDanhSachPhongDatChuan();
				if (ds.getSize() == 0) {
					System.out.println("khong co!");
				} else
					System.out.println("danh sach cac phong dat chuan: " + ph.layDanhSachPhongDatChuan());
				break;
			}
			case 4:
				System.out.println("So phong hoc: " + ph.getSize());
				break;
			case 5: {
				ph.sapXepTangDanTheoDayNha();
				System.out.println("sau khi sap xep: \n" + ph);
			}
				break;
			case 6: {
				ph.sapXepGiamDanTheoDienTich();
				System.out.println("sau khi sap xep: \n" + ph);

			}
				break;
			case 7: {
				ph.sapXepTangDanTheoSoBongDen();
				System.out.println("sau khi sap xep: \n" + ph);
			}
				break;
			case 8: {
				System.out.println("nhập mã phòng cập nhat: ");
				String mP = sc.nextLine();
				System.out.println("nhập số máy tính mới: ");
				int soMayTinh = sc.nextInt();
				boolean tt = ph.capNhatPhongHoc(mP, soMayTinh);
				if (tt == true) {
					System.out.println("số máy tính sau khi sửa: \n" + ph);
				} else {
					System.out.println("\nkhông sửa được");
				}
			}
				break;
			case 9: {
				System.out.println("Nhập mã phòng cần xóa: ");
				String maP = sc.nextLine();
				boolean kq = ph.xoaPhongHoc(maP);
				if (kq == true) {

					System.out.println("mã Phòng sau khi xóa: \n" + ph);

				} else {
					System.out.println("không xóa được!");
				}
			}
				break;
			case 10: {
				ArrayList<PhongHoc> ds = ph.getDSPhongHocCo60May();
				for (PhongHoc phongHoc : ds) {
					System.out.println(phongHoc.toString());
				}
			}
				break;
			
			default:
				luachon = 12;
			}

		} while (luachon < 12);
	}
}

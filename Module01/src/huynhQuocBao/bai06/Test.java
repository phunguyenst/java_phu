package huynhQuocBao.bai06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon;
		DanhSachPhongHoc ds = null;
		do {
			System.out.println(getMenu());
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				ds = new DanhSachPhongHoc();
				break;
			case 2:
				System.out.println("\t1. Phong hoc ly thuyet\n" + "\t2. Phong may tinh\n" + "\t3. Phong thi nghiem");
				int luaChon2;
				luaChon2 = sc.nextInt();

				int maPhong, soBongDen;
				String dayNha;
				double dienTich;

				System.out.print("Ma phong: ");
				maPhong = sc.nextInt();

				sc.nextLine();
				System.out.print("Day nha: ");
				dayNha = sc.nextLine();

				System.out.print("Dien tich: ");
				dienTich = sc.nextDouble();

				System.out.print("So bong den: ");
				soBongDen = sc.nextInt();

				switch (luaChon2) {
				case 1:
					sc.nextLine();
					System.out.print("Co may chieu khong(Co/Khong): ");
					String mayChieu = sc.nextLine();

					if (mayChieu.trim().equalsIgnoreCase("Co"))
						ds.themPhongHoc(new PhongLyThuyet(maPhong, soBongDen, dayNha, dienTich, 1));
					else
						ds.themPhongHoc(new PhongLyThuyet(maPhong, soBongDen, dayNha, dienTich, 0));
					break;
				case 2:
					System.out.print("Co bao nhieu may tinh: ");
					int soMayTinh = sc.nextInt();
					ds.themPhongHoc(new PhongMayTinh(maPhong, soBongDen, dayNha, dienTich, soMayTinh));
					break;
				case 3:
					System.out.print("Chuyen nganh: ");
					String chuyenNganh = sc.nextLine();

					System.out.print("Suc chua: ");
					int sucChua = sc.nextInt();

					System.out.print("Co bon rua khong(Co/Khong): ");
					String bonRua = sc.nextLine();

					if (bonRua.trim().equalsIgnoreCase("Co"))
						ds.themPhongHoc(
								new PhongThiNghiem(maPhong, soBongDen, dayNha, dienTich, chuyenNganh, sucChua, 1));
					else
						ds.themPhongHoc(
								new PhongThiNghiem(maPhong, soBongDen, dayNha, dienTich, chuyenNganh, sucChua, 0));
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.print("Nhap ma phong can tim: ");
				int maP = sc.nextInt();
				PhongHoc ph1 = ds.timKiemPhongHoc(maP);
				
				if (ph1 != null) {
					System.out.println(ph1.getTitle() + '\n' + ph1.toString()); 
				}
				break;
			case 4:
				System.out.println("Thong tin toan bo phong: ");
				System.out.println(ds.toString());
				System.out.println();
				break;
			case 5:
				System.out.println("Danh sach cac phong hoc dat chuan: ");
				System.out.println(ds.layDsDatChuan().toString());
				break;
			case 6:
				System.out.println("Danh sach sau khi sap xep tang theo day nha: ");
				ds.sapXepTangTheoDayNha();
				System.out.println(ds.toString());
				break;
			case 7:
				System.out.println("Danh sach sau khi sap xep giam theo dien tich: ");
				ds.sapXepGiamTheoDienTich();
				System.out.println(ds.toString());
				break;
			case 8:
				System.out.println("Danh sach sau khi sap xep tang theo so bong den: ");
				ds.sapXepTangTheoSoBongDen();
				System.out.println(ds.toString());
				break;
			case 9:
				System.out.print("Nhap ma phong can cap nhat: ");
				int mp = sc.nextInt();
				System.out.print("Nhap so may tinh: ");
				int soMay = sc.nextInt();
				System.out.println(ds.capNhatSoMayTinh(mp, soMay) ? "Cap nhat thanh cong" : "Cap nhat that bai");
				break;
			case 10:
				System.out.print("Nhap ma phong can xoa: ");
				int ma = sc.nextInt();
				System.out.println(ds.xoaPhongHoc(ma) ? "Xoa thanh cong" : "Xoa that bai");
				break;
			case 11:
				System.out.println("Tong so phong hoc: " + ds.tinhTongSoPhongHoc());
				break;
			case 12:
				System.out.println("Danh sach cac phong co 60 may tinh: ");
				System.out.println(ds.layDsPhong60May().toString());
				break;
			default:
				break;
			}
		} while (luaChon > 0 && luaChon < 13);
	}

	public static String getMenu() {
		return "1. Khoi tao danh sach\n" 
				+ "2. Them phong hoc\n" 
				+ "3. Tim kiem phong hoc theo ma\n"
				+ "4. Lay thong tin toan bo phong\n" 
				+ "5. Lay danh sach phong hoc dat chuan\n"
				+ "6. Sap xep danh sach tang dan theo day nha\n" 
				+ "7. Sap xep danh sach giam dan theo dien tich\n"
				+ "8. Sap xep tang dan theo so bong den\n" 
				+ "9. Cap nhat so may tinh\n" 
				+ "10. Xoa phong hoc\n"
				+ "11. Tinh tong so phong hoc\n" 
				+ "12. Lay danh sach cac phong may co 60 may tinh";
	}
}

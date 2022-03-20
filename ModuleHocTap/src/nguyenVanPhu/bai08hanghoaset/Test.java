package nguyenVanPhu.bai08hanghoaset;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			DanhSachHangHoa hh = new DanhSachHangHoa();

			HangHoa hh1 = new HangThucPham("123", "bánh mì", 25000.00, 30, "fooded", LocalDate.of(2018, 12, 1),
					LocalDate.of(2019, 1, 30));
			HangHoa hh2 = new HangDienMay("456", "máy lạnh", 125000000.00, 3, 12, 65);
			HangHoa hh3 = new HangSanhSu("788", "gốm", 100000.00, 70, "làng gốm", LocalDate.of(2021, 12, 2));
			hh.themHangHoa(hh1);
			hh.themHangHoa(hh2);
			hh.themHangHoa(hh3);
			Scanner sc = new Scanner(System.in);
			int luachon;
			do {
				System.out.println("\n========menu========\n");
				System.out.println("1.xuat danh sach cac hang hoa");
				System.out.println("2.tim kiem hang hoa khi biet ma hang");
				System.out.println("3.sap xep cac hang hoa theo ten tang dan");
				System.out.println("4.sap xep cac hang hoa theo so luong ton giam dan");
				System.out.println("5.lay thong tin hang thuc pham kho ban");
				System.out.println("6.xoa hang hoa khi biet ma hang");
				System.out.println("7.sua thong tin don gia khi biet ma hang");
				System.out.println("nhap lua chon: ");
				luachon = sc.nextInt();
				switch (luachon) {
				case 1: {
					System.out.println("=====hàng thực phẩm=====");
					System.out.println(HangHoa.getTieuDeHangThucPham());
					System.out.println(hh.getHangThucPham());
					System.out.println("=====hàng điện máy=====");
					System.out.println(HangHoa.getTieuDeHangDienMay());
					System.out.println(hh.getHangDienMay());
					System.out.println("=====hàng sành sứ=====");
					System.out.println(HangHoa.getTieuDeHangSangSu());
					System.out.println(hh.getHangSanhSu());
				}
					break;
				case 2: {
					System.out.println("nhap ma hang can tim: ");
					sc.nextLine();
					String maHang = sc.nextLine();
					HangHoa h = hh.timKiemHangHoa(maHang);
					if (h != null) {
						System.out.println("mã hàng cần tìm là: ");
						System.out.println(HangHoa.getTieuDeHangThucPham());
						System.out.println(hh.timKiemHangHoa(maHang));
					} else
						System.out.println("không tìm thấy");
				}
					break;
				case 3: {
					List<HangHoa> kq = hh.sapXepTenHangTangDan();
					System.out.println("sau khi sap xep: \n");
					for (HangHoa hangHoa : kq) {
						System.out.println(hangHoa);
					}
				}
					break;
				case 4: {
					List<HangHoa> kq = hh.sapXepSoLuongTonGiamDan();
					System.out.println("sau khi sap xep: \n");
					for (HangHoa hangHoa : kq) {
						System.out.println(hangHoa);
					}

				}
					break;
				case 5: {
					List<HangHoa> kq = hh.getThongTinHangThucPhamKhoBan();
					System.out.println("các hàng thực phẩm khó bán");
					for (HangHoa hangHoa : kq) {
						System.out.println(hangHoa);
					}
				}
					break;
				case 6: {
					sc.nextLine();
					System.out.println("nhập mã hàng cần xóa: ");
					String maHang = sc.nextLine();
					boolean kq = hh.xoaHangHoa(maHang);
					if (kq == true) {
						System.out.println("mã hàng sau khi xóa: \n");
						System.out.println(hh.layToanBoThongTin());
					} else
						System.out.println("không xóa được");
				}
					break;
				case 7: {
					System.out.println("nhập đơn giá cần sửa: ");
					double donGia = sc.nextDouble();
					sc.nextLine();
					System.out.println("nhập mã hàng so sánh: ");
					String maHang = sc.nextLine();
					boolean kq = hh.suaHangHoa(donGia, maHang);
					if (kq == true) {
						System.out.println("mã hàng sau khi sửa: ");
						System.out.println(hh.layToanBoThongTin());
					} else
						System.out.println("không sửa được");
				}
					break;
				default:
					luachon = 8;
				}
			} while (luachon < 10);
			sc.close();
			/*
			 * System.out.println(hh.layToanBoThongTin()); List<HangHoa> h =
			 * hh.getThongTinHangThucPhamKhoBan(); for (HangHoa hangHoa : h) {
			 * System.out.println(hangHoa.toString()); }
			 */
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

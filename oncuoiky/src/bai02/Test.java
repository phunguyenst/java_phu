package bai02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachHangHoa hh = new DanhSachHangHoa();
		hh.themHangHoa(new HangThucPham("123", "bánh mì", 200000.00, 10, "ba mica", LocalDate.of(2018, 5, 3), LocalDate.of(2019, 6, 2)));
		hh.themHangHoa(new HangThucPham("444", "đậu nành", 30000.00, 25, "daunanhcare", LocalDate.of(2018, 5, 3), LocalDate.of(2019, 6, 2)));
		hh.themHangHoa(new HangDienMay("111", "ti vi", 100000000, 1, 10, 120));
		hh.themHangHoa(new HangDienMay("532", "máy lạnh", 70000000, 2, 10, 120));
		hh.themHangHoa(new HangSanhSu("344", "nồi sứ", 300000, 15, "sứ giả", LocalDate.of(2018, 3, 5)));
		hh.themHangHoa(new HangSanhSu("235", "gốm sứ", 500000, 5, "sứ giả", LocalDate.of(2018, 3, 5)));
		
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			System.out.println("1.xuat danh sach phong hoc");
			System.out.println("2.tim kiem hang hoa khi biet ma hang");
			System.out.println("3.sap xep hang hoa theo ten tang dan");
			System.out.println("4.sap xep hang hoa theo so luong ton giam dan");
			System.out.println("5.lay thong tin hang thuc pham kho ban");
			System.out.println("6.xoa hang hoa khi biet ma hang");
			System.out.println("7.sua thong tin don gia khi biet ma hang");
			System.out.println("8.thoat");
			System.out.println("nhap lua chon: ");
			luaChon = sc.nextInt();
			switch(luaChon) {
			case 1: {
				System.out.println("=====hàng thực phẩm=====");
				System.out.println(HangHoa.getTieuDeHangThucPham());
				System.out.println(hh.getHangThucPham());
				System.out.println("=====hàng điện máy=====");
				System.out.println(HangHoa.getTieuDeHangDienMay());
				System.out.println(hh.getHangDienMay());
				System.out.println("=====hàng sành sứ=====");
				System.out.println(HangHoa.getTieuDeHangSanhSu());
				System.out.println(hh.getHangSanhSu());
			}break;
			case 2: {
				System.out.println("nhap ma phong can tim : ");
				sc.nextLine();
				String maHH = sc.nextLine();
				HangHoa kq = hh.timKiemHangHoa(maHH);
				if(kq != null)
				{
					System.out.println("phong can tim la: ");
					System.out.println(hh.timKiemHangHoa(maHH));
				}
				else
					System.out.println("khong tim thay");
			}break;
			case 3:{
				hh.sapXepTheoTenTangDanTheoTen();
				System.out.println("=====hàng thực phẩm=====");
				System.out.println(HangHoa.getTieuDeHangThucPham());
				System.out.println(hh.getHangThucPham());
				System.out.println("=====hàng điện máy=====");
				System.out.println(HangHoa.getTieuDeHangDienMay());
				System.out.println(hh.getHangDienMay());
				System.out.println("=====hàng sành sứ=====");
				System.out.println(HangHoa.getTieuDeHangSanhSu());
				System.out.println(hh.getHangSanhSu());
			}break;
			case 4:{
				hh.sapXepTheoSoLuongTonGiamDan();
				System.out.println("=====hàng thực phẩm=====");
				System.out.println(HangHoa.getTieuDeHangThucPham());
				System.out.println(hh.getHangThucPham());
				System.out.println("=====hàng điện máy=====");
				System.out.println(HangHoa.getTieuDeHangDienMay());
				System.out.println(hh.getHangDienMay());
				System.out.println("=====hàng sành sứ=====");
				System.out.println(HangHoa.getTieuDeHangSanhSu());
				System.out.println(hh.getHangSanhSu());
			}break;
			case 5:{
				ArrayList<HangHoa> kq = hh.getHangThucPhamKhoBan();
				for (HangHoa hangHoa : kq) {
					System.out.println(HangHoa.getTieuDeHangThucPham());
					System.out.println(hangHoa);
				}
			}break;
			case 6:{
				System.out.println("nhap hang can xoa voi ma hang:");
				sc.nextLine();
				String maHH = sc.nextLine();
				boolean kq = hh.xoaHangHoa(maHH);
				if(kq == true)
				{
					System.out.println("mã hàng sau khi xóa");
					System.out.println("=====hàng thực phẩm=====");
					System.out.println(HangHoa.getTieuDeHangThucPham());
					System.out.println(hh.getHangThucPham());
					System.out.println("=====hàng điện máy=====");
					System.out.println(HangHoa.getTieuDeHangDienMay());
					System.out.println(hh.getHangDienMay());
					System.out.println("=====hàng sành sứ=====");
					System.out.println(HangHoa.getTieuDeHangSanhSu());
					System.out.println(hh.getHangSanhSu());
				}
				else
					System.out.println("không xóa được");
			}break;
			case 7:{
				System.out.println("nhập đơn giá mới: ");
				sc.nextLine();
				double donGiaMoi = sc.nextDouble();
				System.out.println("nhập mã hàng với đơn giá cần sửa: ");
				sc.nextLine();
				String maHH = sc.nextLine();
				boolean kq = hh.suaThongTinDonGia(maHH, donGiaMoi);
				if(kq == true)
				{
					System.out.println("đơn giá sau khi sửa");
					System.out.println("=====hàng thực phẩm=====");
					System.out.println(HangHoa.getTieuDeHangThucPham());
					System.out.println(hh.getHangThucPham());
					System.out.println("=====hàng điện máy=====");
					System.out.println(HangHoa.getTieuDeHangDienMay());
					System.out.println(hh.getHangDienMay());
					System.out.println("=====hàng sành sứ=====");
					System.out.println(HangHoa.getTieuDeHangSanhSu());
					System.out.println(hh.getHangSanhSu());
				}
				else
					System.out.println("không sửa được");
			}
			}
		}while(luaChon<9);
		
	
	}

}

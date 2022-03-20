package nguyenVanPhu.bai01loaisachset;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LoaiSach ls = new LoaiSach("123", LocalDate.of(2018, 12, 3), 29000.00, 30,
		 * "kim đồng"); SachGiaoKhoa sgk = new SachGiaoKhoa("123", LocalDate.of(2018,
		 * 12, 3), 29000.00, 30, "kim đồng", false);
		 */

		DanhSachLoaisach ls = new DanhSachLoaisach();
		ls.themLoaiSach(new SachGiaoKhoa("123", LocalDate.of(2018, 12, 3), 29000.00, 30, "kim đồng", false));
		ls.themLoaiSach(new SachGiaoKhoa("133", LocalDate.of(2018, 12, 3), 25000.00, 10, "kim đồng", true));
		ls.themLoaiSach(new SachThamKhao("456", LocalDate.of(2018, 12, 3), 32000.00, 40, "học tốt", 0.25));
		ls.themLoaiSach(new SachThamKhao("455", LocalDate.of(2018, 12, 3), 33000.00, 20, "học tốt", 0.3));

		System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
		System.out.println(ls.getSachGiaoKhoa());
		System.out.println(LoaiSach.getTieuDeSachThamKhao());
		System.out.println(ls.getSachThamKhao());

		int luaChon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n========menu========\n");
			System.out.println("1.xuất loại sách");
			System.out.println("2.xóa loại sách theo mã ");
			System.out.println("3.tìm kiếm loại sách theo mã ");
			System.out.println("4.sửa đơn giá và nhà xuất bản sách tham khảo theo mã ");
			System.out.println("5.tính thành tiền");
			System.out.println("6.lấy ra nhà xuất bản loại k");
			System.out.println("nhập lựa chọn: ");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1: {
				System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
				System.out.println(ls.getSachGiaoKhoa());
				System.out.println(LoaiSach.getTieuDeSachThamKhao());
				System.out.println(ls.getSachThamKhao());
			}break;
			case 2: {
				System.out.println("nhập mã sách cần xóa: ");
				sc.nextLine();
				String maSach = sc.nextLine();
				boolean kq = ls.xoaLoaiSach(maSach);
				if(kq == true) {
					System.out.println("sách sau khi xóa là ");
					System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
					System.out.println(ls.getSachGiaoKhoa());
					System.out.println(LoaiSach.getTieuDeSachThamKhao());
					System.out.println(ls.getSachThamKhao());
				}
				else
				{
					System.out.println("không xóa được");
				}
			}
			case 3:{
				System.out.println("nhập mã sách cần tìm: "); 
				sc.nextLine();
				String maSach = sc.nextLine();
				LoaiSach kq = ls.timKiemLoaiSach(maSach);
				if(kq != null) {
					System.out.println("mã sách cần tìm là ");
					System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
					System.out.println(ls.timKiemLoaiSach(maSach));
				}
				else
				{
					System.out.println("không tìm thấy");
				}
			}break;
			case 4:{
				System.out.println("nhập đơn giá cần sửa: ");
				double donGia = sc.nextDouble();
				System.out.println("nhập nhà xuất bản cần sửa: ");
				sc.nextLine();
				String nhaXuatBan = sc.nextLine();
				System.out.println("nhập mã hàng cần tìm: ");
				String maHang = sc.nextLine();
				boolean kq = ls.suaDonGiaVaNhaXuatBanSachThamKhao(donGia, nhaXuatBan, maHang);
				if(kq == true) {
					System.out.println("loại sách sau khi sửa");
					System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
					System.out.println(ls.getSachGiaoKhoa());
					System.out.println(LoaiSach.getTieuDeSachThamKhao());
					System.out.println(ls.getSachThamKhao());
				}
				else {
					System.out.println("không sửa được");
				}
			}break;
			case 5: {
				System.out.println("thành tiền là ");
				System.out.println(ls.tinhThanhTienSachGiaoKhoa());
				System.out.println(ls.tinhThanhTienSachThamKhao());
			}break;
			case 6:{
				System.out.println("nhập nhà xuất bản cần lấy: ");
				sc.nextLine();
				String nhaXuatBan = sc.nextLine();
				List<LoaiSach> kq = ls.getNhaXuatban(nhaXuatBan);
				System.out.println(LoaiSach.getTieuDeSachGiaoKhoa());
				for (LoaiSach loaiSach : kq) {
					System.out.println(loaiSach);
				}
				
			}break;
			default: luaChon = 7;
		}
		} while (luaChon < 10);
	}

}

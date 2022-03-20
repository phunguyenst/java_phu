package nguyenVanPhu.bai05;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * Trong hàm main, tạo sẵn mỗi loại 3 khách hàng vào danh sách (không cần nhập từ bàn phím), sau đó:
	o Tính tổng số lượng cho từng loại khách hàng.
	o Tính trung bình thành tiền của khách hàng người nước ngoài.
	o Xuất ra các hoá đơn trong tháng 09 năm 2018 (cùa cả 2 loại khách hàng).
 */
public class Test {

	public static void main(String[] args) {
		
		DanhMucHoaDon hd = new DanhMucHoaDon(6);
		hd.themHoaDon(new HoaDonKhachHangVietNam("123", "Nguyen Van A", LocalDate.of(2018, 9, 25), 2.5, 50000.0, "sinh hoạt",
				50.0));
		hd.themHoaDon(new HoaDonKhachHangVietNam("456", "Nguyen Van B", LocalDate.of(2021, 10, 25), 130.0, 100000.0, "kinh doanh",
				150.0));
		hd.themHoaDon(new HoaDonKhachHangVietNam("789", "Nguyen Van C", LocalDate.of(2021, 10, 25), 290.0, 500000.0, "sinh hoạt",
				300.0));
		hd.themHoaDon(new HoaDonKhachHangNuocNgoai("321", "Peter", LocalDate.of(2021, 10, 25), 30.0, 50000.0, "US"));
		hd.themHoaDon(new HoaDonKhachHangNuocNgoai("654", "John With", LocalDate.of(2021, 10, 25), 50.0, 1200000.0, "US"));
		hd.themHoaDon(new HoaDonKhachHangNuocNgoai("987", "Shinkai Makoto", LocalDate.of(2018, 9, 26), 80.0, 160000.0, "Japan"));
		System.out.println(HoaDon.getTieuDe());
		System.out.println(hd.layThongTinDanhMuc());
		System.out.println("\nTổng số lượng khách hàng việt nam: " + hd.tongSoLuongKhachHangVietNam());
		System.out.println("\nTổng số lượng khách hàng nước ngoài: " + hd.tongSoLuongKhachHangNuocNgoai());
		System.out.println("\nTrung bình thành tiền của khách hàng nước ngoài: "+
				hd.trungBinhThanhTienCuaKhachHangNuocNgoai());
		
		
		System.out.println( HoaDon.getTieuDe()+"\n"+ hd.xuatCacHoaDon()+"\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập mã khách hàng cần tìm:");
		
		String maKH= sc.nextLine();
		if(!hd.timKiemHoaDonTheoMa(maKH))
			System.out.println("Không tìm thấy!");
		else
		{
			System.out.println("tìm thấy");
		}
		System.out.println("Nhập mã khách hàng cần xóa: ");
		String maKhachHang = sc.nextLine();
		if(hd.xoaHoaDonTheoMa(maKhachHang)) {
			System.out.println("mã khách hàng sau khi xóa: "+ hd.layThongTinDanhMuc());
			
		}
		System.out.println("nhập mã khách hàng cần sửa: ");
		String MKH = sc.nextLine();
		System.out.println("nhập số cần sửa lại: ");
		String maKHCanSua = sc.nextLine();
		hd.suaChuyenXeTheoMa(MKH, maKHCanSua);
		System.out.println(hd.layThongTinDanhMuc());
	}


}

	


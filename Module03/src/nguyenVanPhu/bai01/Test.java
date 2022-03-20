package nguyenVanPhu.bai01;

import java.util.Scanner;

/*
 * Trong hàm main, tạo sẵn mỗi loại 2 chuyến xe vào danh sách (không cần cho nhập từ bàn phím). Xuất
	tổng doanh thu cho tất cả các chuyến xe và tổng doanh thu của từng loại chuyến xe.
 */
public class Test {

	public static void main(String[] args) {
		DanhMucChuyenXe cx = new DanhMucChuyenXe(100);
		cx.themChuyenXe(new ChuyenXeNoiThanh("123", "Nguyen Van Teo", "AH-123", 60000.00, 2, 100.00));
		cx.themChuyenXe(new ChuyenXeNoiThanh("456", "Nguyen Van Ti", "AH-124", 70000.00, 3, 200.00));
		cx.themChuyenXe(new ChuyenXeNgoaiThanh("789", "Nguyen Van Loi", "AH-380", 75000.00, "GoVap", 1));
		cx.themChuyenXe(new ChuyenXeNgoaiThanh("355", "Nguyen Van Ty", "AH-380", 75000.00, "ba ria vung tau", 1));
		System.out.println(cx.layThongTinDanhMuc());
		System.out.println("Tong doanh thu cua cac chuyen xe la: " + cx.tinhTongDoanhThu());
		System.out.println("Tong doanh thu cua chuyen xe noi thanh la: " + cx.tinhTongChuyenXeNoiThanh());
		System.out.println("Tong doanh thu cua chuyen xe ngoai thanh la: " + cx.tinhTongChuyenXeNgoaiThanh());
		//cx.xoaChuyenXeTheoMa("123");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập mã chuyến xe cần tìm:");
		
		String maChuyenXe = sc.nextLine();
		if(!cx.timKiemChuyenXeTheoMa(maChuyenXe))
			System.out.println("Không tìm thấy!");
		else
		{
			System.out.println("tìm thấy");
		}
		System.out.println("Nhập mã chuyến xe cần xóa: ");
		String maCX = sc.nextLine();
		if(cx.xoaChuyenXeTheoMa(maCX)) {
			System.out.println("mã chuyến xe sau khi xóa: "+ cx.layThongTinDanhMuc());
			
		}
		System.out.println("nhập mã chuyến xe cần sửa: ");
		String MCX = sc.nextLine();
		System.out.println("nhập số cần sửa lại: ");
		String maCXCanSua = sc.nextLine();
		cx.suaChuyenXeTheoMa(MCX, maCXCanSua);
		System.out.println(cx.layThongTinDanhMuc());
		
	}

	
}

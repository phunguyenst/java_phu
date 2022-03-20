package nguyenVanPhu.bai04;

/*
 * Trong hàm main, tạo sẵn mỗi loại 3 giao dịch vào danh sách (không cần cho nhập từ bàn phím), sau đó:
	o Tính tổng số lượng cho từng loại.
	o Tính trung bình thành tiền của giao dịch đất.
	o Xuất ra các giao dịch của tháng 9 năm 2013.
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhMucGiaoDich gd = new DanhMucGiaoDich(100);
		gd.themGiaoDich(new GiaoDichDat("123", LocalDate.of(2013, 9, 26), 100000000.00, 5.00, "B"));
		gd.themGiaoDich(new GiaoDichDat("456", LocalDate.of(2021, 8, 27), 100000000.00, 7.00, "C"));
		gd.themGiaoDich(new GiaoDichDat("789", LocalDate.of(2021, 10, 28), 100000000.00, 8.00, "A"));
		gd.themGiaoDich(new GiaoDichNha("123", LocalDate.of(2013, 9, 26), 1500000000.00, 5000.00, "cao cấp",
				"32 tổ 8 ấp 5 xã hòa bình"));
		gd.themGiaoDich(new GiaoDichNha("456", LocalDate.of(2021, 11, 1), 400000000.00, 6000.00, "thường",
				"35 tổ 9 ấp 5 xã hòa hưng"));
		gd.themGiaoDich(new GiaoDichNha("789", LocalDate.of(2013, 11, 26), 1200000000.00, 7000.00, "cao cấp",
				"40 tổ 2 ấp 5 xã sơn bình"));
		System.out.println(gd.layThongTinDanhMuc());
		System.out.println("\nTổng số lượng giao dịch đất là: " + gd.tongSoLuongGiaoDichDat());
		System.out.println("\nTổng số lượng giao dịch nhà là: " + gd.tongSoLuongGiaoDichNha());
		System.out.println("\nTrung bình thành tiền giao dịch đất là: "+ gd.tinhTrungBinhThanhTienGiaoDichDat());
		System.out.println("\nCác giao dịch của tháng 9 nam 2013: " + gd.xuatCacGiaoDich());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập mã giao dịch cần tìm:");
		
		String maGiaoDich = sc.nextLine();
		if(!gd.timKiemGiaoDichTheoMa(maGiaoDich))
			System.out.println("Không tìm thấy!");
		else
		{
			System.out.println("tìm thấy");
		}
		System.out.println("Nhập mã giao dịch cần xóa: ");
		String maGD = sc.nextLine();
		if(gd.xoaDanhMucTheoMa(maGD)) {
			System.out.println("mã giao dịch sau khi xóa: "+ gd.layThongTinDanhMuc());
			
		}
		System.out.println("nhập mã giao dịch cần sửa: ");
		String mGD = sc.nextLine();
		System.out.println("nhập số cần sửa lại: ");
		String mGDCanSua = sc.nextLine();
		gd.suaGiaoDichTheoMa(mGD, mGDCanSua);
		System.out.println(gd.layThongTinDanhMuc());
	}

	
}

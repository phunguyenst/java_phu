package nguyenVanPhu.bai03;

/*
 * Trong hàm main, tạo sẵn mỗi loại 3 giao dịch vào danh sách (không cần cho nhập từ bàn phím), sau đó:
	o Tính tổng số lượng cho từng loại.
	o Tính trung bình thành tiền của giao dịch tiền tệ.
	o Xuất ra các giao dịch có đơn giá > 1 tỷ.
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DanhMucGiaoDich gd = new DanhMucGiaoDich(100);
		gd.themDanhMucGiaoDich(new GiaoDichVang("123", LocalDate.of(2021, 11, 22), 1100000000.00, 5, "Vàng giả"));
		gd.themDanhMucGiaoDich(new GiaoDichVang("456", LocalDate.of(2021, 11, 22), 1000000000.00, 6, "Vàng dẻo"));
		gd.themDanhMucGiaoDich(new GiaoDichVang("789", LocalDate.of(2021, 11, 22), 300000.00, 7, "Vàng nguyên chất"));
		gd.themDanhMucGiaoDich(new GiaoDichTienTe("123", LocalDate.of(2021, 11, 22), 120000.00, 6, 1.25, "USD"));
		gd.themDanhMucGiaoDich(new GiaoDichTienTe("456", LocalDate.of(2021, 11, 22), 120000.00, 6, 1.1, "VND"));
		gd.themDanhMucGiaoDich(new GiaoDichTienTe("789", LocalDate.of(2021, 11, 22), 120000.00, 7, 1.5, "Euro"));
		System.out.println(gd.layThongTinDanhMuc());
		System.out.println("\nTổng số lượng giao dịch vàng là: " + gd.tongSoLuongGiaoDichVang());
		System.out.println("\nTổng số lượng giao dịch tiền tệ là: " + gd.tongSoLuongGiaoDichTienTe());
		System.out.println(
				"\nTổng Trung bình thành tiền giao dịch tiền tệ là: " + gd.tinhTrungBinhThanhTienGiaoDichTienTe());
		System.out.println("\nSố giao dịch có đơn giá lớn hơn 1 tỷ là: \n" + gd.soLuongGiaoDichMotTy());
		
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
		if(gd.xoaGiaoDichTheoMa(maGD)) {
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

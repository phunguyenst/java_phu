n

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		KhachHang[] kh = new KhachHang[6];
		kh[0] = new KhachHangVietNam("001", "Truong Van Thong", LocalDate.of(2018, 9, 23), 5, 123, "Kinh Doanh", 12);
		kh[1] = new KhachHangVietNam("002", "Nguyen Thi Rem", LocalDate.of(2021, 8, 17), 4, 123, "sinh hoat", 12);
		kh[2] = new KhachHangVietNam("003", "Yeu Be Nhat", LocalDate.of(2018, 9, 4), 3, 123, "san xuat", 12);
		kh[3] = new KhachHangNuocNgoai("123", "Fai Fai", LocalDate.of(2021, 12, 3), 10000, 121212, "My");
		kh[4] = new KhachHangNuocNgoai("234", "Lua Chua", LocalDate.of(2021, 2, 23), 102000, 21212, "AnDo");
		kh[5] = new KhachHangNuocNgoai("345", "Good Game", LocalDate.of(2018, 9, 30), 130000, 1212, "LienMinh");
		xuatThongTin(kh);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Tong So Luong Khach Hang Viet Nam: " + sumSoSLKhachHangVietNam(kh));
		System.out.println("Tong So Luong Khach Hang Nuoc Ngoai: " + sumSoSLKhachHangNuocNgoai(kh));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Trung Binh Thanh Tien Cua Khach Hang Nuoc Ngoai: " + tinhTBThanhTienKhachHangNuocNgoai(kh));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Cac Hoa Don Trong Thang 9 nam 2018 :");
		xuatHoaDon(kh);
	}

	public static void xuatThongTin(KhachHang[] kh) {
		for (int i = 0; i < kh.length; i++)
			System.out.println(kh[i]);
	}

	public static int sumSoSLKhachHangVietNam(KhachHang[] kh) {
		int sum = 0;
		for (int i = 0; i < kh.length; i++)
			if (kh[i] instanceof KhachHangVietNam)
				sum++;
		return sum;
	}

	public static int sumSoSLKhachHangNuocNgoai(KhachHang[] kh) {
		int sum = 0;
		for (int i = 0; i < kh.length; i++)
			if (kh[i] instanceof KhachHangNuocNgoai)
				sum++;
		return sum;
	}

	public static double tinhTBThanhTienKhachHangNuocNgoai(KhachHang[] kh) {
		double sum = 0;
		for (int i = 0; i < kh.length; i++) {
			if (kh[i] instanceof KhachHangNuocNgoai)
				sum += kh[i].tinhThanhTien();
		}
		return sum / sumSoSLKhachHangNuocNgoai(kh);
	}

	public static void xuatHoaDon(KhachHang[] kh) {
		for (int i = 0; i < kh.length; i++) {
			if (kh[i].getNgayLapHD().getMonthValue() == 9 && kh[i].getNgayLapHD().getYear() == 2018)
				System.out.println(kh[i]);
		}

	}

}

package nguyenQuangVinh.bai05;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DanhSachKhanhHang ql = new DanhSachKhanhHang(100);
		ql.themHD(new KhachHangVN("001", "A", LocalDate.of(2018, 9, 21), 300, 15000, "san xuat", 400));
		ql.themHD(new KhachHangVN("002", "B", LocalDate.of(2020, 9, 15), 500, 20000, "kinh doanh", 300));
		ql.themHD(new KhachHangVN("003", "C", LocalDate.of(2018, 10, 3), 100, 10000, "sinh hoat", 200));
		ql.themHD(new KhachHangNuocNgoai("004", "D", LocalDate.of(2020, 4, 12), 200, 15000, "Laos"));
		ql.themHD(new KhachHangNuocNgoai("005", "E", LocalDate.of(2013, 9, 1), 300, 15000, "Korea"));
		ql.themHD(new KhachHangNuocNgoai("006", "F", LocalDate.of(2018, 9, 30), 100, 15000, "China"));
		
		System.out.println("So luong hoa don khach hang VN: ");
		System.out.println(ql.tinhTongSoLuongKHVN());
		
		System.out.println("So luong hoa don khach hang NN: ");
		System.out.println(ql.tinhTongSoLuongKHNN());
		
		System.out.println("Trung binh thanh tien khach hang NN: ");
		System.out.println(ql.tinhTBThanhTienKHNN());
		
		System.out.println("Hoa don thang 9 nam 2018: ");
		System.out.println(ql.giaoDichThang9());
//		KhachHang[] kh= new KhachHang[6];
//		kh[0]=new KhachHangVN("001", "A", LocalDate.of(2018, 9, 21), 300, 15000, "san xuat", 400);
//		kh[1]=new KhachHangVN("002", "B", LocalDate.of(2020, 9, 15), 500, 20000, "kinh doanh", 300);
//		kh[2]=new KhachHangVN("003", "C", LocalDate.of(2018, 10, 3), 100, 10000, "sinh hoat", 200);
//		kh[3]=new KhachHangNuocNgoai("004", "D", LocalDate.of(2020, 4, 12), 200, 15000, "Laos");
//		kh[4]=new KhachHangNuocNgoai("005", "E", LocalDate.of(2013, 9, 1), 300, 15000, "Korea");
//		kh[5]=new KhachHangNuocNgoai("006", "F", LocalDate.of(2018, 9, 30), 100, 15000, "China");
//		for (int i = 0; i < kh.length; i++) {
//			System.out.println(kh[i]);
//			
//			
//		}System.out.println("Xuat giao dich  thang 9\n" +xuatGDThang9(kh));
//	}
//	
//	public static double tinhTongSoLuongKHVN(KhachHang[] kh) {
//		double sum=0;
//		for (int i = 0; i < kh.length; i++) {
//			
//			if(kh[i] instanceof KhachHangVN)
//				sum++;
//		}
//		return sum;
//		
//	}
//	public static double tinhTongSoLuongKHNuocNgoai(KhachHang[] kh) {
//		double sum=0;
//		for (int i = 0; i < kh.length; i++) {
//			
//			if(kh[i] instanceof KhachHangNuocNgoai)
//				sum++;
//		}
//		return sum;
//		
//	}
//	public static double tinhTBThanhTienKHNuocNgoai(KhachHang[] kh) {
//		double sum=0;
//		int n=0;
//		for (int i = 0; i < kh.length; i++) {
//			if(kh[i] instanceof KhachHangNuocNgoai) {
//				sum+=kh[i].getThanhTien();
//				n++;
//				
//			}
//				
//			
//		}
//		return sum/n;
//		
//	}
//	public static String xuatGDThang9(KhachHang[] kh) {
//		String s="";
//		String r="";
//		for (int i = 0; i < kh.length; i++) {
//			if(kh[i].getNgayLapHD().isAfter(LocalDate.of(2018,8,31))
//					&& kh[i].getNgayLapHD().isBefore(LocalDate.of(2018,10,1))){
//				if(kh[i] instanceof KhachHangVN)
//					s+=kh[i];
//				if(kh[i] instanceof KhachHangNuocNgoai)
//					r+=kh[i];
//				
//			}
//			
//		}
//		return String.format("%s \n%s \n%s \n%s \n%s \n%s", "Khach hang VN", KhachHangVN.getLayTieuDe(),s,"Khach hang nuoc ngoai",KhachHangNuocNgoai.getLayTieuDe(),r);
//		
	}

}

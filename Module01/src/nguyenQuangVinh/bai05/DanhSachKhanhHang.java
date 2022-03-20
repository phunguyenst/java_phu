package nguyenQuangVinh.bai05;

import java.time.LocalDate;

public class DanhSachKhanhHang {
	private KhachHang[] qlHD;
	private int count;
	
	public DanhSachKhanhHang(int n) {
		qlHD = new  KhachHang[n];
		count = 0;
	}
	
	public boolean themHD(KhachHang x) {
		if(count<qlHD.length){
			qlHD[count++] = x;
			return true;
		}
		return false;
	}
	public double tinhTongSoLuongKHVN() {
		double tong = 0;
		for (int i = 0; i < count; i++) {
			if(qlHD[i] instanceof KhachHangVN)
				tong++;
		}
		return tong;
	}
	public double tinhTongSoLuongKHNN() {
		double tong = 0;
		for (int i = 0; i < count; i++) {
			if(qlHD[i] instanceof KhachHangNuocNgoai)
				tong++;
		}
		return tong;
	}
	public double tinhTBThanhTienKHNN() {
		double tong = 0;
		int n =0;
		for (int i = 0; i < count; i++) {
			if(qlHD[i] instanceof KhachHangNuocNgoai){
				tong += qlHD[i].getThanhTien();
				n++;
			}
		}
		return tong/n;
	}
	public String giaoDichThang9() {
		String s = "";
		String r = "";
		for (int i = 0; i < count; i++)
			if (qlHD[i].getNgayLapHD().isAfter(LocalDate.of(2018, 8, 31))
					&& qlHD[i].getNgayLapHD().isBefore(LocalDate.of(2018, 10, 1))) {
				if (qlHD[i] instanceof KhachHangVN)
					s += qlHD[i];
				if (qlHD[i] instanceof KhachHangNuocNgoai)
					r += qlHD[i];
			}
		return String.format("%s \n%s \n%s \n%s \n%s \n%s", "Khach hang VN",
				KhachHangVN.getLayTieuDe(), s, "Khach hang NN",
				KhachHangNuocNgoai.getLayTieuDe(), r);
	}

}

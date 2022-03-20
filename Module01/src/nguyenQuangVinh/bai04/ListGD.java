package nguyenQuangVinh.bai04;

import java.time.LocalDate;

public class ListGD {
	private GiaoDichNhaDat[] dsGD;
	private int count;
	
	public ListGD(int n) {
		dsGD = new GiaoDichNhaDat[n];
		count = 0;		
	}
	public boolean themGD(GiaoDichNhaDat x) {
		if(count < dsGD.length){
			dsGD[count++] = x;
			return true;
		}
		return false;
	}
	public int tinhSoLuongGDDat() {
		int tong = 0;
		for (int i = 0; i < count; i++) {
			if(dsGD[i] instanceof GiaoDichDat)
				tong ++; 
		}
		return tong;
	}
	public int tinhSoLuongGDNha() {
		int tong = 0;
		for (int i = 0; i < count; i++) {
			if(dsGD[i] instanceof GiaoDichNha)
				tong ++; 
		}
		return tong;
	}
	public double tinhTBThanhTienGDDat() {
		double tong = 0;
		int n = 0;
		for (int i = 0; i < count; i++) {
			if(dsGD[i] instanceof GiaoDichDat){
				tong += dsGD[i].getThanhTien();
				n++;
			}
		}
		if (n == 0)
			return 0;
		return tong/n;
	}
	public String giaoDichThang9() {
		String s = "";
		String r = "";
		for (int i = 0; i < count; i++)
			if (dsGD[i].getNgayGiaoDich().isAfter(LocalDate.of(2013, 8, 31))
					&& dsGD[i].getNgayGiaoDich().isBefore(LocalDate.of(2013, 10, 1))) {
				if (dsGD[i] instanceof GiaoDichNha)
					s += dsGD[i];
				if (dsGD[i] instanceof GiaoDichDat)
					r += dsGD[i];
			}
		return String.format("%s \n%s \n%s \n%s \n%s \n%s","Giao dich dat",GiaoDichDat.getLayTieuDe(),r,"Giao dich nha",GiaoDichNha.getLayTieuDe(),s);
	}

}

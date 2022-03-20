package nguyenQuangVinh.bai03;

public class DanhSachGiaoDich {
	private GiaoDich[] QLGD;
	private int count;
	
	public DanhSachGiaoDich(int n) {
		QLGD = new GiaoDich[n];
		count = 0;		
	}
	public boolean themGD(GiaoDich x) {
		if(count < QLGD.length){
			QLGD[count++] = x;
			return true;
		}
		return false;
	}	
	public double tinhTongSoLuongGDTienTe() {
		float tong = 0;
		for (int i = 0; i < count; i++) {
			if(QLGD[i] instanceof GiaoDichTienTe)
				tong += QLGD[i].getSoLuong();
		}
		return tong;
	}
	public double tinhTongSoLuongGDVang() {
		float tong = 0;
		for (int i = 0; i < count; i++) {
			if(QLGD[i] instanceof GiaoDichVang)
				tong += QLGD[i].getSoLuong();
		}
		return tong;
	}
	public double tinhTBThanhTienGDTienTe() {
		float tong = 0;
		int n = 0;
		for (int i = 0; i < count; i++) {
			if(QLGD[i] instanceof GiaoDichTienTe){
				tong += QLGD[i].getThanhTien();
				n++;
			}
		}
		return tong/n;
	}
	@Override
	public String toString() {
		String s = "";
		String r = "";
		for (int i = 0; i < count; i++){
			if(QLGD[i] instanceof GiaoDichVang)
				if (QLGD[i].getDonGia() > 1000000000) 
					s += QLGD[i] + "\n";
			if(QLGD[i] instanceof GiaoDichTienTe)
				if (QLGD[i].getDonGia() > 1000000000)
					r += QLGD[i] + "\n";
		}
		return String.format("%s \n%s \n%s \n%s \n%s \n%s", "Giao dich vang",
				GiaoDichVang.getLayTieuDe(), s, "Giao dich tien te",
				GiaoDichTienTe.getLayTieuDe(), r);
	}
	
	public String output() {
		String s="";
		for (int i = 0; i < count; i++) {
			s+=QLGD[i]+"\n";
			
		}
		return s;
		
	}

}

package nguyenQuangVinh.bai01;

public class DanhSachChuyenXe {
	private ChuyenXe[] dsCX;
	private int count;
	
	public DanhSachChuyenXe(int n) {
		dsCX = new ChuyenXe[n];
		count =0;
	}
	public boolean themCX(ChuyenXe x) {
		if(count < dsCX.length){
			dsCX[count++] = x;
			return true;
		}
		return false;
	}
	public double tongDoanhThu() {
		double tong = 0;
		for (int i = 0; i < count; i++) 
			tong += dsCX[i].getDoanhThu();	
		return tong;
	}
	public double tongDoanhThuNoiThanh() {
		double tong = 0;
		for (int i = 0; i < count; i++) 
			if(dsCX[i] instanceof ChuyenXeNoiThanh)
				tong += dsCX[i].getDoanhThu();	
		return tong;
	}
	public double tongDoanhThuNgoaiThanh() {
		double tong = 0;
		for (int i = 0; i < count; i++) 
			if(dsCX[i] instanceof ChuyenXeNgoaiThanh)
				tong += dsCX[i].getDoanhThu();	
		return tong;
	}
	@Override
	public String toString() {
		String s="";
		for (int i = 0; i <count; i++) {
			s+= dsCX[i]+"\n";
			
		}
		return s;
	}
	

}

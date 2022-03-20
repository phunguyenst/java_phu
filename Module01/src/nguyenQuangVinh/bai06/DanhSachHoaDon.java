package nguyenQuangVinh.bai06;

public class DanhSachHoaDon {
	private HoaDon[] ds;
	private int count;
	public DanhSachHoaDon(int n) {
		ds= new HoaDon[n];
		count=0;
	}
	public boolean themHoaDon(HoaDon hd) {
		if(count<ds.length) {
			ds[count++]=hd;
		return true;

	}return false;
	}
	public String getHDTheoGio() {
		String s="";
		for (int i = 0; i <count; i++) {
			if(ds[i] instanceof HoaDonTheoGio)
				s+=ds[i]+"\n";
			
		}
		return s;
		
	}
	public String getHDTheoNgay() {
		String s="";
		for (int i = 0; i < count; i++) {
			if(ds[i] instanceof HoaDonTheoNgay) {
				s+=ds[i]+"\n";
			}
		}
		return s;
	}
	public int thongKeSoLuongHDTheoNgay() {
		
		int n=0;
		for (int i = 0; i < count; i++) {
			if(ds[i] instanceof HoaDonTheoNgay) {
				n++;
			}
			
		}
		return n;
	}
	public int thongKeSoLuongHDTheoGio() {
		int n=0;
		for (int i = 0; i < count; i++) {
			if(ds[i] instanceof HoaDonTheoGio)
				n++;
			
		}
		return n;
		
	}
	public double tinhTongThanhTien(int thang, int nam) {
		double sum=0;
		for (int i = 0; i < count; i++) {
			if(ds[i].getNgayHoaDon().getMonthValue()==thang 
					&& ds[i].getNgayHoaDon().getYear()==nam)
				sum+=ds[i].getThanhTien();
				
			
		}
		return sum;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}

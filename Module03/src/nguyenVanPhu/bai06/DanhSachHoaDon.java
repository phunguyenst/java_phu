package nguyenVanPhu.bai06;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
	private int count;
	
	public DanhSachHoaDon(int n) {
		danhSach = new HoaDon[n];
		count = 0;
	}
	public boolean them(HoaDon hd) {
		if(count< danhSach.length)
		{
			
			danhSach[count++] = hd;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s ="";
		for (int i = 0; i < count; i++) {
			s += danhSach[i] + "\n";
		}
		return s;
	}
	public int thongKeSoLuongHDTheoGio() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof HoaDonTheoGio)
			{
				dem++;
			}
		}
		return dem;
	}
	public int thongKeSoLuongHDTheoNgay() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof HoaDonTheoNgay)
			{
				dem++;
			}
		}
		return dem;
	}
	
	public double tinhTongThanhTien(int thang, int nam) {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if(danhSach[i].getNgayHoaDon().getMonthValue() == thang && danhSach[i].getNgayHoaDon().getYear() == nam)
			{
				s += danhSach[i].tinhThanhTien();
			}
		}
		return s;
	}

	
}

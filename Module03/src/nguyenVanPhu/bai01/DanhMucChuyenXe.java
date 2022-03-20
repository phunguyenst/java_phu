package nguyenVanPhu.bai01;

public class DanhMucChuyenXe {
	private ChuyenXe[] list;
	private int count;

	public DanhMucChuyenXe(int n) {
		list = new ChuyenXe[n];
		count = 0;
	}

	public boolean themChuyenXe(ChuyenXe cx) {
		if (count < list.length) {
			list[count++] = cx;
			return true;
		} else
			return false;
	}

	public String layThongTinDanhMuc() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += list[i] + "\n";
		}
		return s;
	}

	public double tinhTongDoanhThu() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			s += list[i].getDoanhThu();
		}
		return s;
	}

	public double tinhTongChuyenXeNoiThanh() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof ChuyenXeNoiThanh) {
				s += list[i].getDoanhThu();
			}

		}
		return s;
	}

	public double tinhTongChuyenXeNgoaiThanh() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof ChuyenXeNgoaiThanh) {
				s += list[i].getDoanhThu();
			}

		}
		return s;
	}

	public boolean xoaChuyenXeTheoMa(String maSoChuyen) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaSoChuyen().equalsIgnoreCase(maSoChuyen)) {
				for (int j = i; j < count - 1; j++)
					list[j] = list[j + 1];
				count--;

				return true;
			}
		}
		return false;
	}
	public boolean timKiemChuyenXeTheoMa(String maSoChuyen) {
		
		for (int i = 0; i <count; i++) 
			if(list[i].getMaSoChuyen().equalsIgnoreCase(maSoChuyen)) 
				return true;
			return false;
	}
	public void suaChuyenXeTheoMa(String maSoChuyen, String maCanSua) {
	
		for (int i = 0; i < count; i++) {
			if(list[i].getMaSoChuyen().equalsIgnoreCase(maSoChuyen))
				 list[i].setMaSoChuyen(maCanSua);
		}
	}
}

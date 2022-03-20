package nguyenVanPhu.bai02;

import java.util.ArrayList;
import java.util.List;

public class DanhMucSach {
	private LoaiSach[] list;
	private int count;

	public DanhMucSach(int n) {
		list = new LoaiSach[n];
		count = 0;
	}

	public boolean themLoaiSach(LoaiSach s) {
		if (count < list.length) {
			list[count++] = s;
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

	public double tinhThanhTienSachGiaoKhoa() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachGiaoKhoa) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;
	}

	public double tinhThanhTienSachThamKhao() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachThamKhao) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;
	}

	public List<SachGiaoKhoa> getSachGiaoKhoa(String nhaXuatBan) {
		List<SachGiaoKhoa> kq = new ArrayList<SachGiaoKhoa>();
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachGiaoKhoa)
				if (list[i].getNhaXuatBan().equalsIgnoreCase(nhaXuatBan)) {
					kq.add((SachGiaoKhoa) list[i]);
				}
		}
		return kq;

	}

	public double thanhTienLonNhat() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (tinhThanhTienSachGiaoKhoa() < tinhThanhTienSachThamKhao()) {
				s = tinhThanhTienSachThamKhao();
			} else {
				s = tinhThanhTienSachGiaoKhoa();
			}
		}
		return s;
	}

	public boolean xoaLoaiSachTheoMa(String maSach) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaSach().equalsIgnoreCase(maSach)) {
				for (int j = i; j < count; j++)
					list[j] = list[j + 1];
				count--;

				return true;

			}
		}
		return false;
	}
	public boolean timKiemLoaiSachTheoMa(String maSach) {
		for (int i = 0; i < count; i++) 
			if(list[i].getMaSach().equalsIgnoreCase(maSach))
				return true;
			return false;
	}
	public void suaLoaiSachTheoMa(String maSach, String maCanSua) {
		
		for (int i = 0; i < count; i++) {
			if(list[i].getMaSach().equalsIgnoreCase(maSach))
				 list[i].setMaSach(maCanSua);
		}
	}
}

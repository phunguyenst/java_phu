package nguyenVanPhu.bai01loaisachset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DanhSachLoaisach {
	private Set<LoaiSach> list;

	public int getSize() {
		return list.size();
	}

	public DanhSachLoaisach() {
		list = new HashSet<LoaiSach>();
	}

	public boolean themLoaiSach(LoaiSach ls) {
		return list.add(ls);
	}

	public String toString() {
		String s = "";
		for (LoaiSach loaiSach : list) {
			s += loaiSach + "\n";
		}
		return s;
	}

	public String getSachGiaoKhoa() {
		String s = "";
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachGiaoKhoa) {
				s += loaiSach + "\n";
			}
		}
		return s;
	}

	public String getSachThamKhao() {
		String s = "";
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachThamKhao) {
				s += loaiSach + "\n";
			}
		}
		return s;
	}

	public boolean xoaLoaiSach(String maSach) {
		Iterator<LoaiSach> it = list.iterator();
		while (it.hasNext()) {
			LoaiSach ls = (LoaiSach) it.next();
			if (ls.getMaSach().equalsIgnoreCase(maSach)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public LoaiSach timKiemLoaiSach(String maSach) {
		for (LoaiSach loaiSach : list) {
			if (loaiSach.getMaSach().equalsIgnoreCase(maSach)) {
				return loaiSach;
			}
		}
		return null;
	}

	public boolean suaDonGiaVaNhaXuatBanSachThamKhao(double donGiaMoi, String nhaXuatBanMoi, String maSach) {
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachThamKhao) {
				if (loaiSach.getMaSach().equalsIgnoreCase(maSach)) {
					loaiSach.setDonGia(donGiaMoi);
					loaiSach.setNhaXuatBan(nhaXuatBanMoi);
					return true;
				}
			}
		}
		return false;
	}

	public double tinhThanhTienSachGiaoKhoa() {
		double s = 0;
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachGiaoKhoa)
				s = loaiSach.tinhThanhTien();
		}
		return s;
	}

	public double tinhThanhTienSachThamKhao() {
		double s = 0;
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachThamKhao)
				s = loaiSach.tinhThanhTien();
		}
		return s;
	}

	public List<LoaiSach> getNhaXuatban(String loai) {
		List<LoaiSach> temp = new ArrayList<LoaiSach>();
		for (LoaiSach loaiSach : list) {
			if (loaiSach instanceof SachGiaoKhoa) {

				if (loaiSach.getNhaXuatBan().equalsIgnoreCase(loai)) {

					temp.add(loaiSach);
				}
			}
		}
		return temp;
	}
}

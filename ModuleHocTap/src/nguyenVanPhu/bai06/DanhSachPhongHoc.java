package nguyenVanPhu.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DanhSachPhongHoc {
	private Set<PhongHoc> list;

	public int getSize() {
		return list.size();
	}

	public DanhSachPhongHoc() {
		list = new HashSet<PhongHoc>();
	}

	public boolean themPhongHoc(PhongHoc ph) {
		return list.add(ph);

	}

	public String toString() {
		String s = "";
		for (PhongHoc phongHoc : list) {
			s += phongHoc + "\n";
		}
		return s;
	}

	public boolean xoaPhongHoc(String maPhong) {
		Iterator<PhongHoc> it = list.iterator();
		while (it.hasNext()) {
			PhongHoc ph = (PhongHoc) it.next();
			if (ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	public boolean suaPhongHoc(String maPhong, int soMayTinhMoi) {
		for (PhongHoc phongHoc : list) {
			if(phongHoc instanceof PhongMayTinh) {
				if(phongHoc.getMaPhong().equalsIgnoreCase(maPhong)) {
					((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
					return true;
				}
			}
		}
		return false;
	}
	public PhongHoc timKiemPhongHoc(String maPhong) {
		for (PhongHoc phongHoc : list) {
			if(phongHoc.getMaPhong().equalsIgnoreCase(maPhong)) {
				return phongHoc;
			}
		}
		return null;
	}
	public List<PhongHoc> sapXepDanhSachTangDanTheoDayNha() {
		List<PhongHoc> temp = new ArrayList<PhongHoc>(list);
		Collections.sort(temp, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return ((String)o1.getDayNha()).compareTo((String)o2.getDayNha());
			}
		});
		return temp;
	}
}

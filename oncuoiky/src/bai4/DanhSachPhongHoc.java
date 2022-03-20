package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DanhSachPhongHoc {
	private List<PhongHoc> dsPhongHoc;

	/**
	 * khởi tạo danh sách
	 */
	public DanhSachPhongHoc() {
		dsPhongHoc = new ArrayList<PhongHoc>();
	}

	/**
	 * thêm một phòng học vào danh sách (thêm được nếu không trùng mã phòng)
	 * 
	 * @param ph
	 * @return
	 */
	public boolean themPhongHoc(PhongHoc ph) {
		if (dsPhongHoc.contains(ph))
			return false;
		else
			dsPhongHoc.add(ph);
		return true;
	}
	/**
	 *  lấy thông tin toàn bộ danh sách các phòng học.
	 */
	public String toString() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			s += phongHoc + "\n";
		}
		return s;
	}

	public String getPhongLyThuyet() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongLyThuyet) {
				s += phongHoc + "\n";

			}
		}
		return s;
	}

	public String getPhongMayTinh() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {
				s += phongHoc + "\n";

			}
		}
		return s;
	}

	public String getPhongThucHanh() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongThucHanh) {
				s += phongHoc + "\n";

			}
		}
		return s;
	}

	public ArrayList<PhongHoc> getPhongDatChuan() {
		ArrayList<PhongHoc> ph = new ArrayList<PhongHoc>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.kiemTraDatChuan() == true) {
				ph.add(phongHoc);
			}
		}
		return ph;
	}

	public void sapXepTangDanTheoDayNha() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return ((String) o1.getDayNha()).compareTo((String) o2.getDayNha());
			}
		});
	}

	public void sapXepGiamDanTheoDienTich() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getDienTich(), o1.getDienTich());
			}
		});
	}

	public void sapXepTangDanTheoSoBongDen() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
		});
	}

	public boolean capNhapSoMayTinh(String maPH, int soMayTinhMoi) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {
				if (phongHoc.getMaPhong().equalsIgnoreCase(maPH)) {
					((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
					return true;
				}
			}
		}
		return false;
	}

	public boolean xoaPhongHoc(String maPH) {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while (it.hasNext()) {
			PhongHoc ph = (PhongHoc) it.next();
			if (ph.getMaPhong().equalsIgnoreCase(maPH))
				it.remove();
			return true;
		}
		return false;
	}

	public int getSize() {
		return dsPhongHoc.size();
	}

	public ArrayList<PhongHoc> getPhongCo60May() {
		ArrayList<PhongHoc> ph = new ArrayList<PhongHoc>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {
				if (((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
					ph.add(phongHoc);
				}
			}

		}
		return ph;
	}
}

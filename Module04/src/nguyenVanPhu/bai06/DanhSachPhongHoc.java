package nguyenVanPhu.bai06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import nguyenVanPhu.bai07.Employee;
import nguyenVanPhu.bai07.Programmer;

public class DanhSachPhongHoc {
	private List<PhongHoc> dsPhongHoc;

	public DanhSachPhongHoc() {
		dsPhongHoc = new ArrayList<PhongHoc>();
	}

	/**
	 * thêm một phòng học vào danh sách (thêm được nếu không trùng mã phòng).
	 * 
	 * @param p
	 * @return
	 */
	public boolean themPhongHoc(PhongHoc p) {
		if (dsPhongHoc.contains(p))
			return false;
		else
			dsPhongHoc.add(p);
		return true;
	}

	/**
	 * tìm kiếm một phòng học nào đó khi biết mã phòng
	 * 
	 * @param maPH
	 * @return
	 */
	public PhongHoc timKiemPhongHoc(String maPH) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.getMaPhong().equalsIgnoreCase(maPH))
				return phongHoc;
		}
		return null;
	}

	/**
	 * lấy thông tin toàn bộ danh sách các phòng học.
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			s += phongHoc + "\n";
		}
		return s;
	}

	/**
	 * xuất phòng lý thuyết
	 * 
	 * @return
	 */
	public String getPhongLyThuyet() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongLyThuyet)
				s += phongHoc + "\n";
		}

		return s;
	}

	/**
	 * xuất phòng máy tính
	 * 
	 * @return
	 */
	public String getPhongMayTinh() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh)
				s += phongHoc + "\n";
		}

		return s;
	}

	/**
	 * xuất phòng thí nghiệm
	 * 
	 * @return
	 */
	public String getPhongThiNghiem() {
		String s = "";
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongThiNghiem)
				s += phongHoc + "\n";
		}

		return s;
	}

	/**
	 * lấy danh sách các phòng học đạt chuẩn.
	 * 
	 * @return
	 */
	public DanhSachPhongHoc layDanhSachPhongDatChuan() {
		DanhSachPhongHoc s = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.kiemTraDatChuan())
				s.themPhongHoc(phongHoc);
		}
		return s;
	}

	/**
	 * sắp xếp danh sách tăng dần theo dãy nhà
	 */
	public void sapXepTangDanTheoDayNha() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return ((String) o1.getDayNha()).compareTo((String) o2.getDayNha());
			}
		});
	}

	/**
	 * sắp xếp danh sách giảm dần theo diện tích.
	 * 
	 */
	public void sapXepGiamDanTheoDienTich() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return Double.compare(o2.getDienTich(), o1.getDienTich());
			}
		});

	}

	/**
	 * sắp xếp danh sách tăng dần theo số bóng đèn
	 */
	public void sapXepTangDanTheoSoBongDen() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {

				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
		});
	}

	/**
	 * cập nhật số máy tính cho một phòng máy tính nào đó khi biết mã phòng.
	 * 
	 * @param maHang
	 * @param soMayTinh
	 * @return
	 */
	public boolean capNhatPhongHoc(String maPhong, int soMayTinh) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {
				if (phongHoc.getMaPhong().equalsIgnoreCase(maPhong)) {
					((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinh);
					;

					return true;
				}
			}
		}
		return false;
	}

	/**
	 * xóa một phòng học nào đó khi biết mã phòng.
	 * 
	 * @param maPhong
	 * @return
	 */
	public boolean xoaPhongHoc(String maPhong) {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while (it.hasNext()) {
			PhongHoc ph = (PhongHoc) it.next();
			if (ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	/**
	 * tổng số phòng học
	 * 
	 * @return
	 */
	public int getSize() {
		return dsPhongHoc.size();
	}

	/**
	 * lấy danh sách các phòng máy có 60 máy
	 * 
	 * @return
	 */
	public ArrayList<PhongHoc> getDSPhongHocCo60May() {
		ArrayList<PhongHoc> s = new ArrayList<PhongHoc>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {

				if (((PhongMayTinh) phongHoc).getSoMayTinh() >= 60)
					s.add(phongHoc);
			}
		}
		return s;

	}
}

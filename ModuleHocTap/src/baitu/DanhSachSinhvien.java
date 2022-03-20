package baitu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class DanhSachSinhvien {
	private ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();

	public boolean ktTrungma(String masv) {
		for (SinhVien sv : dsSv) {
			if (sv.getMasv().equalsIgnoreCase(masv))
				return true;
		}
		return false;

	}

	public boolean addSinhvien(SinhVien sv) {
		if (ktTrungma(sv.getMasv()))
			return false;
		return dsSv.add(sv);
	}

	public SinhVien findSinhvien1(String masv) {
		for (SinhVien sv : dsSv) {
			if (sv.getMasv().equalsIgnoreCase(masv))
				return sv;
		}
		return null;
	}

	public int findSinhvien2(String masv) {
		for (int i = 0; i < dsSv.size(); i++) {
			if (dsSv.get(i).getMasv().equalsIgnoreCase(masv))
				return i;
		}
		return -1;
	}

	public SinhVien updateSinhvien(int index, SinhVien sv) {
		return dsSv.set(index, sv);
	}

	public void removeSinhvien(String masv) {
		SinhVien sv = findSinhvien1(masv);
		dsSv.remove(sv);
//int pos=findSinhvien2(masv);
//dsSv.remove(pos);
	}

	public String toString() {
		return dsSv.toString();
	}
	public void sapXepTangDanTheoMa() {
		Collections.sort(dsSv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return ((String)o1.getMasv()).compareTo((String)o2.getMasv());
			}
			
		});
	}
	public void sapGiamDanTheoMa() {
		Collections.sort(dsSv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return ((String)o2.getMasv()).compareTo((String)o1.getMasv());
			}
			
		});
	}
}

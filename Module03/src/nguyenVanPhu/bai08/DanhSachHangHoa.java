package nguyenVanPhu.bai08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> dsHangHoa;

	public DanhSachHangHoa() {
		dsHangHoa = new ArrayList<HangHoa>();
	}

	public boolean themHangHoa(HangHoa hh) {
		if (dsHangHoa.contains(hh))

			return false;
		else
			dsHangHoa.add(hh);
		return true;
	}

	public String layThongTinToanBo() {
		String s = "";
		for (HangHoa hh : dsHangHoa) {
			s += hh + "\n";
		}
		return s;
	}

	public List<HangHoa> getDanhSachHangTP() {
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : a) {
			if (hangHoa instanceof HangThucPham) {
				a.add(hangHoa);
			}
		}
		return a;
	}

	public List<HangHoa> getDanhSachHangThucPham() {
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : a) {
			if (hangHoa instanceof HangSanhSu) {
				a.add(hangHoa);
			}
		}
		return a;
	}

	public List<HangHoa> getDanhSachHangDienMay() {
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : a) {
			if (hangHoa instanceof HangDienMay) {
				a.add(hangHoa);
			}
		}
		return a;
	}

	public HangHoa timKiemHangHoaSanhSu(String maHD) {
		for (HangHoa hh : dsHangHoa) {
			if (hh.getMaHang().equalsIgnoreCase(maHD))
				return hh;
		}
		return null;
	}

	public boolean xoaHangHoa(String maHang) {
		Iterator<HangHoa> it = dsHangHoa.iterator();
		while (it.hasNext()) {
			HangHoa hh = (HangHoa) it.next();
			if (hh.getMaHang().equalsIgnoreCase(maHang)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public void sapXepTangDanTheoTenHang() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return ((String) o1.getTenHang()).compareTo((String) o2.getTenHang());
			}
		});
	}

	public void sapXepHangHoaGiamDanTheoSoLuongTon() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}

		});
	}

	public ArrayList<HangHoa> getDSHangThucPhamKhoBan() {
		ArrayList<HangHoa> temp = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : temp) {
			if (hangHoa.danhGiaMucDoBanBuon().equalsIgnoreCase("Khó bán"))
				temp.add(hangHoa);
		}
		return temp;
	}

	public boolean suaDonGia(String maHang, double donGia) {
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa.getMaHang().equalsIgnoreCase(maHang)) {
				hangHoa.setDonGia(donGia);
				return true;
			}
		}
		return false;
	}
}

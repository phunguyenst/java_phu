package nguyenVanPhu.bai08hanghoaset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;




public class DanhSachHangHoa {
	private Set<HangHoa> list;

	public int getSize() {
		return list.size();
	}

	public DanhSachHangHoa() {
		list = new HashSet<HangHoa>();
	}

	public boolean themHangHoa(HangHoa hh) {
		return list.add(hh);
	}

	public String layToanBoThongTin() {
		String s = "";
		for (HangHoa hangHoa : list) {
			s += hangHoa + "\n";

		}
		return s;
	}

	public String getHangThucPham() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangThucPham) {
				s += hangHoa + "\n";
			}
		}
		return s;
	}

	public String getHangDienMay() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangDienMay) {
				s += hangHoa + "\n";
			}
		}
		return s;
	}

	public String getHangSanhSu() {
		String s = "";
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangSanhSu) {
				s += hangHoa + "\n";
			}
		}
		return s;
	}

	public HangHoa timKiemHangHoa(String maHang) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHang().equalsIgnoreCase(maHang)) {
				return hangHoa;
			}
		}
		return null;
	}

	public List<HangHoa> sapXepSoLuongTonGiamDan() {
		List<HangHoa> temp = new ArrayList<HangHoa>(list);
		Collections.sort(temp, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {

				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
		return temp;
	}

	public List<HangHoa> sapXepTenHangTangDan() {
		List<HangHoa> temp = new ArrayList<HangHoa>(list);
		Collections.sort(temp, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return ((String) o1.getTenHang()).compareTo((String) o2.getTenHang());
			}
		});
		return temp;
	}

	public List<HangHoa> getThongTinHangThucPhamKhoBan()
	{
		List<HangHoa> hh = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangThucPham) {

				if (hangHoa.danhGiaMucDoBanBuon().equalsIgnoreCase("khó bán")) {
					hh.add(hangHoa);
				}
			}
		}
		return hh;
	}
	public boolean xoaHangHoa(String maHang) {
		Iterator<HangHoa> it = list.iterator();
		while(it.hasNext()) {
			HangHoa hh =  (HangHoa)it.next();
			if(hh.getMaHang().equalsIgnoreCase(maHang))
				it.remove();
			return true;
		}
		return false;
	}
	public boolean suaHangHoa(double donGiaMoi, String maHang) {
		for (HangHoa hangHoa : list) {
			if(hangHoa.getMaHang().equalsIgnoreCase(maHang))
				hangHoa.setDonGia(donGiaMoi);
			return true;
		}
		return false;
	}

	
}

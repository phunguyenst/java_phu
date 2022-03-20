package nguyenQuangVinh.bai08;

import java.util.Comparator;
import java.util.Arrays;

public class DanhSachHangHoa {
	private HangHoa[] ds;
	private int count;

	/**
	 * 
	 */
	public DanhSachHangHoa(int n) {
		ds = new HangHoa[n];
		count = 0;
	}

	/**
	 * lay thong tin toan bo hang hoa
	 * 
	 * @return
	 */
	public String layThongTinAllHangHoa() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += ds[i];

		}
		return s;

	}

	public String layThongTinTungLoai() {
		String s = "Hang Thuc Pham\n" + HangThucPham.getTieuDe() + "\n" + layThongTinHangThucpham();
		String r = "Hàng sành sứ\n" + HangSanhSu.getTieuDe() + "\n" + layThongTinHangSanhSu();
		String x = "Hàng điện máy\n" + HangDienMay.getTieuDe() + "\n" + layThongTinHangDienMay();
		return s + r + x;
	}

	/**
	 * hang thuc pham
	 * 
	 * @return
	 */
	public String layThongTinHangThucpham() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (ds[i] instanceof HangThucPham)
				s += ds[i];

		}
		return s;

	}

	/**
	 * hang dien may
	 * 
	 * @return
	 */
	public String layThongTinHangDienMay() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (ds[i] instanceof HangDienMay)
				s += ds[i];

		}
		return s;

	}

	/**
	 * hang sanh su
	 * 
	 * @return
	 */
	public String layThongTinHangSanhSu() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (ds[i] instanceof HangSanhSu)
				s += ds[i];

		}
		return s;

	}

	/**
	 * them hang hoa khong trung ma
	 * 
	 * @param x
	 * @return
	 */
	public boolean themHH(HangHoa x) {
		if (count < ds.length)
			for (int i = 0; i < count; i++) {
				if (ds[i].getMaHang().equalsIgnoreCase(x.getMaHang())) {
					return false;
				}

			}
		ds[count++] = x;
		return true;

	}

	/**
	 * Tim theo ma
	 * 
	 * @param maCanTim
	 * @return
	 */
	public HangHoa timKiemTheoMa(String maCanTim) {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (ds[i].getMaHang().equals(maCanTim))
				return ds[i];
		}
		return null;
	}

	/**
	 * sap xep tang dan theo ten
	 */
	public void sapXepTheoTenHangTangDan() {
		Arrays.sort(ds, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1 != null && o2 != null)
					return o1.getTenHang().compareTo(o2.getTenHang());
				return 0;
			}
		});

	}

	/**
	 * Sap xep giam dan theo so luong
	 */
	public void sapXepTheoSoLuongTonGiamDan() {
		Arrays.sort(ds, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return Integer.compare(o2.getSoLuongTon(), (o1.getSoLuongTon()));
			}
		});

	}

	/**
	 * Lay thong tin hang kho bna
	 * 
	 * @return
	 */
	public String layThongTinHangThucPhamKhoBan() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (ds[i] instanceof HangThucPham) {
				if (ds[i].danhGiaMucDoBanBuon().equals("Kho ban"))
					s += ds[i];
			}
		}
		return s;
	}

	/**
	 * Xao theo ma
	 * 
	 * @param maCanXoa
	 * @return
	 */
	public boolean xoaHangHoaTheoMa(String maCanXoa) {
		int vt = -1;
		for (int i = 0; i < count; i++)
			if (ds[i].getMaHang().equals(maCanXoa))
				vt = i;
		if (vt != -1) {
			for (int i = vt; i < count; i++)
				ds[i] = ds[i + 1];
			count--;
			return true;
		} else
			return false;
	}

	/**
	 * Sua don gia theo ma
	 * 
	 * @param maCanSua
	 * @param donGiaMoi
	 * @return
	 */

	public boolean suaDonGiaTheoMaHang(String maCanSua, double donGiaMoi) {
		for (int i = 0; i < count; i++)
			if (ds[i].getMaHang().equals(maCanSua)) {
				ds[i].setDonGia(donGiaMoi);
				return true;
			}
		return false;
	}

}

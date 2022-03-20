package bai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> dsHangHoa;

	/**
	 * Tạo constructor khởi tạo danh sách n phần tử
	 */
	public DanhSachHangHoa() {
		dsHangHoa = new ArrayList<HangHoa>();
	}

	/**
	 * thêm một hàng hóa vào danh sách (thêm thành công nếu không bị trùng mã hàng)
	 * 
	 * @param hh
	 * @return
	 */
	public boolean themHangHoa(HangHoa hh) {
		if (dsHangHoa.contains(hh))
			return false;
		else
			dsHangHoa.add(hh);
		return true;
	}

	/**
	 * lấy thông tin toàn bộ danh sách các hàng hóa
	 */
	public String toString() {
		String s = "";
		for (HangHoa hangHoa : dsHangHoa) {
			s += hangHoa + "\n";
		}
		return s;
	}

	/**
	 * lấy thông tin hàng thực phẩm
	 * 
	 * @return
	 */
	public String getHangThucPham() {
		String s = "";
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa instanceof HangThucPham)
				s += hangHoa + "\n";
		}
		return s;
	}

	/**
	 * lấy thông tin hàng điện máy
	 * 
	 * @return
	 */
	public String getHangDienMay() {
		String s = "";
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa instanceof HangDienMay)
				s += hangHoa + "\n";
		}
		return s;
	}

	/**
	 * lấy thông tin hàng sành sứ
	 * 
	 * @return
	 */
	public String getHangSanhSu() {
		String s = "";
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa instanceof HangSanhSu)
				s += hangHoa + "\n";
		}
		return s;
	}

	/**
	 * tìm kiếm hàng hóa khi biết mã hàng (trả về hàng hóa tìm thấy)
	 * 
	 * @param maHH
	 * @return
	 */
	public HangHoa timKiemHangHoa(String maHH) {
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa.getMaHang().equalsIgnoreCase(maHH))
				return hangHoa;
		}
		return null;
	}

	/**
	 * tìm kiếm hàng hóa khi biết mã hàng (trả về hàng hóa tìm thấy)
	 */
	public void sapXepTheoTenTangDanTheoTen() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return ((String) o1.getTenHang()).compareTo((String) o2.getTenHang());
			}
		});
	}

	/**
	 * sắp xếp hàng hóa theo số lượng tồn giảm dần
	 */
	public void sapXepTheoSoLuongTonGiamDan() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
	}

	/**
	 * Viết phương thức lấy thông tin các hàng thực phẩm khó bán
	 * 
	 * @return
	 */
	public ArrayList<HangHoa> getHangThucPhamKhoBan() {
		ArrayList<HangHoa> s = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa instanceof HangThucPham) {
				if (hangHoa.danhGiaMucDoBanBuon().equalsIgnoreCase("Khó bán"))
					s.add(hangHoa);
			}
		}
		return s;
	}

	/**
	 * xóa hàng hóa khi biết mã hàng
	 * 
	 * @param maHang
	 * @return
	 */
	public boolean xoaHangHoa(String maHang) {
		Iterator<HangHoa> it = dsHangHoa.iterator();
		while (it.hasNext()) {
			HangHoa ph = (HangHoa) it.next();
			if (ph.getMaHang().equalsIgnoreCase(maHang)) {
				it.remove();
				return true;
			}

		}
		return false;
	}

	/**
	 * sửa thông tin đơn giá của hàng hóa khi biết mã hàng
	 * 
	 * @param maHH
	 * @param donGiaMoi
	 * @return
	 */
	public boolean suaThongTinDonGia(String maHH, double donGiaMoi) {
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa.getMaHang().equalsIgnoreCase(maHH)) {
				hangHoa.setDonGia(donGiaMoi);
				return true;
			}
		}
		return false;
	}
}

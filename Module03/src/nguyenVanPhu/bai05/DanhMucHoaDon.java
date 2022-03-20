package nguyenVanPhu.bai05;


import java.util.ArrayList;
import java.util.List;

public class DanhMucHoaDon {
	private HoaDon[] list;
	private int count;
	
	public DanhMucHoaDon(int n) {
		list = new HoaDon[n];
		count = 0;
	}
	public boolean themHoaDon(HoaDon hd) {
		if(count<list.length) {
			list[count++] = hd;
			return true;
		}
		return false;
	}
	public String layThongTinDanhMuc() {
		String s = "";
		for (int i = 0; i < list.length; i++) {
			s+= list[i] + "\n";
		}
		return s;
	}
	public  int tongSoLuongKhachHangVietNam() {
		int dem = 0;
		for (int i = 0; i < count; i++) {

			if (list[i] instanceof HoaDonKhachHangVietNam) {
				dem++;
			}
		}
		return dem;
	}

	public int tongSoLuongKhachHangNuocNgoai() {
		int dem = 0;
		for (int i = 0; i < count; i++) {

			if (list[i] instanceof HoaDonKhachHangNuocNgoai) {
				dem++;
			}
		}
		return dem;
	}

	public double tinhTongThanhTienCuaKhachHangNuocNgoai() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof HoaDonKhachHangNuocNgoai) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;
	}

	public double trungBinhThanhTienCuaKhachHangNuocNgoai() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			s = tinhTongThanhTienCuaKhachHangNuocNgoai() / tongSoLuongKhachHangNuocNgoai();
		}
		return s;
	}

	public String xuatCacHoaDon() {
		 String s= "";
		for (int i = 0; i < count; i++) {
			if (list[i].getNgayLapHD().getMonthValue() ==9 && list[i].getNgayLapHD().getYear() == 2018) {
				s += list[i] +"\n";
			}
		}
		return s;
	}
	public boolean xoaHoaDonTheoMa(String maKhachHang) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaKH().equalsIgnoreCase(maKhachHang)) {
				for (int j = i; j < count - 1; j++)
					list[j] = list[j + 1];
				count--;

				return true;
			}
		}
		return false;
	}
	public boolean timKiemHoaDonTheoMa(String maKhachHang) {
		
		for (int i = 0; i <count; i++) 
			if(list[i].getMaKH().equalsIgnoreCase(maKhachHang)) 
				return true;
			return false;
	}
public void suaChuyenXeTheoMa(String maKhachHang, String maCanSua) {
		
		for (int i = 0; i < count; i++) {
			if(list[i].getMaKH().equalsIgnoreCase(maKhachHang))
				 list[i].setMaKH(maCanSua);;
		}
	}
}

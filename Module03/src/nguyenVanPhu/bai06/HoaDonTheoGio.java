package nguyenVanPhu.bai06;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private int soGioThue;

	public HoaDonTheoGio() {
		super();
		soGioThue = 0;
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue)throws Exception {
		if(soGioThue<=24)
		{
			this.soGioThue = soGioThue;
		}
		else if(soGioThue>24 && soGioThue<30) {
			soGioThue = 24;
		}
		else if(soGioThue>30)
			throw new Exception("không dùng loại hóa đơn theo giờ do soGioThue>30");
		
	}

	@Override
	public double tinhThanhTien() {
		return getDonGia() * soGioThue;
	}

	@Override
	public String toString() {
		return String.format("%s số giờ thuê: %12d", super.toString(), this.soGioThue);
	}
	
	
	
}

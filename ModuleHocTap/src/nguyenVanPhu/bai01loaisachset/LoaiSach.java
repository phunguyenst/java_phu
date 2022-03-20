package nguyenVanPhu.bai01loaisachset;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class LoaiSach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public LoaiSach() {
		this("chưa biết", LocalDate.now(), 0, 0, "chưa biết");
	}

	public LoaiSach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if (!maSach.equals("")) {
			this.maSach = maSach;
		} else
			this.maSach = "chưa biết";
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isBefore(LocalDate.now())) {
			this.ngayNhap = ngayNhap;
		} else

			this.ngayNhap = LocalDate.now();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong >= 0) {
			this.soLuong = soLuong;
		}
		else
		this.soLuong = 0;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (!nhaXuatBan.equals("")) {
			this.nhaXuatBan = nhaXuatBan;
		} else
			this.nhaXuatBan = "chưa biết";
	}

	public double tinhThanhTien() {
		return soLuong * donGia;
	}

	public static String getTieuDeSachGiaoKhoa() {
		return String.format("%-15s %-20s %-15s %-10s %-20s %-15s %-15s", "mã sách", "ngày nhập", "đơn giá", "số lượng",
				"nhà xuất bản", "thành tiền", "tình trạng");
	}
	public static String getTieuDeSachThamKhao() {
		return String.format("%-15s %-20s %-15s %-10s %-20s %-15s %-10s", "mã sách", "ngày nhập", "đơn giá", "số lượng",
				"nhà xuất bản", "thành tiền", "thuế");
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(maSach);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiSach other = (LoaiSach) obj;
		return Objects.equals(maSach, other.maSach);
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-15s %-10d %-20s %-15s", this.maSach, dtf.format(ngayNhap),
				df.format(donGia), this.soLuong, this.nhaXuatBan, df.format(tinhThanhTien()));
	}

}

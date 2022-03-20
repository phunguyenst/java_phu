package nguyenVanPhu.bai08hanghoaset;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham() throws Exception {
		super();
		nhaCungCap = "chưa biết";
		ngaySanXuat = LocalDate.now();
		ngayHetHan = ngaySanXuat;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if (!nhaCungCap.equals("")) {
			this.nhaCungCap = nhaCungCap;
		}
		else
		this.nhaCungCap = "chưa biết";
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	/**
	 * ngày sản xuất (phải trước ngày hiện tại, mặc định là ngày hiện tại)
	 * 
	 * @param ngaySanXuat
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	/**
	 * ngày hết hạn (phải sau ngày sản xuất, mặc định là ngày sản xuất)
	 * 
	 * @param ngayHetHan
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(LocalDate.now())) {
			this.ngayHetHan = ngayHetHan;
		}
		else
			this.ngayHetHan = ngaySanXuat;
	}

	/**
	 * Hàng thực phẩm, nếu vẫn còn tồn kho và bị hết hạn thì đánh giá là khó bán. o
	 * Hàng điện máy, nếu số lượng tồ
	 */
	@Override
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() > 0 && ngayHetHan.isBefore(LocalDate.now()))
			return "khó bán";
		else
			return "không đánh giá";
	}

	/**
	 * VAT của hàng thực phẩm là 5%
	 */
	@Override
	public double tinhTienVAT() {
		return 0.05;
	}

	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %-15s %-20s %-15s %-15s", super.toString(),this.danhGiaMucDoBanBuon(), this.nhaCungCap, df.format(ngaySanXuat), df.format(ngaySanXuat));
	}
	
}

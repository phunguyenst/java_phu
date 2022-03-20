package nguyenVanPhu.bai05;

import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	/**
	 * hàm trả về giá trị thuộc tính cho maHang
	 * 
	 * @return maHang
	 */
	public String getMaHang() {
		return maHang;
	}

	/**
	 * hàm gán giá trị cho maHang
	 * 
	 * @param maHang: giá trị muốn gán
	 */
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho tenHang
	 * 
	 * @return tenHang
	 */
	public String getTenHang() {
		return tenHang;
	}

	/**
	 * hàm gán giá trị cho tenHang
	 * 
	 * @param tenHang: giá trị muốn gán
	 */
	public void setTenHang(String tenHang) throws Exception {
		if (!tenHang.equals("")) {
			this.tenHang = tenHang;
		} else
			throw new Exception("Lỗi: Tên hàng rỗng");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho donGia
	 * 
	 * @return donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * hàm gán giá trị cho donGia
	 * 
	 * @param donGia: giá trị muốn gán
	 */
	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho ngaySanXuat
	 * 
	 * @return ngaySanXuat
	 */
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	/**
	 * hàm gán giá trị cho ngaySanXuat ngaySanXuat phải trước ngày hiện tại, mặc
	 * định là ngày hiện tại
	 * 
	 * @param ngaySanXuat: giá trị muốn gán
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else
			this.ngaySanXuat = LocalDate.now();
	}

	/**
	 * hàm trả về giá trị thuộc tính cho ngayHetHan
	 * 
	 * @return ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	/**
	 * hàm gán giá trị cho ngayHetHan phải sau ngày sản xuất, mặc định là ngày sản
	 * xuất
	 * 
	 * @param ngayHetHan: giá trị muốn gán
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		} else
			this.ngayHetHan = ngaySanXuat;
	}

	public HangThucPham() throws Exception {
		setMaHang("chua biet");
		setTenHang("xxx");
		setDonGia(0);
		setNgaySanXuat(LocalDate.now());
		setNgayHetHan(LocalDate.now());

	}

	public HangThucPham(String maHang) throws Exception {
		setMaHang(maHang);
		setTenHang("xxx");
		setDonGia(0);
		setNgaySanXuat(LocalDate.now());
		setNgayHetHan(LocalDate.now());
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
			throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	/**
	 * 
	 * @return true nếu hết hạn, false là ngược lại
	 */
	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		//String donGia = df.format(this.donGia) + "VND";
		//cach1
		/*String hh = "";
		if(kiemTraHetHan())
		{
			hh = "Hang het han";
		}*/
		return String.format("%-8s %-15s %15s %-15s %-15s %-15s", this.maHang, this.tenHang, df.format(donGia), dtf.format(ngaySanXuat),
				dtf.format(ngayHetHan), kiemTraHetHan() ? "Hang het han" : "");
	}

}

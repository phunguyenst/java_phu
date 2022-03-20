package nguyenVanPhu.bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa{
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
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho nhaCungCap
	 * 
	 * @return nhaCungCap
	 */
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	/**
	 * 
	 * @param nhaCungCap: giá trị muốn gán
	 */
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
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
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %-15s %-15s %-15s %-15s", super.toString(), this.danhGiaMucDoBanBuon(), this.nhaCungCap, dtf.format(ngaySanXuat),dtf.format(ngayHetHan));
	}

	@Override
	public double tinhTienVAT() {
		// TODO Auto-generated method stub
		return getDonGia() * getSoLuongTon() * 0.05;
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if(getSoLuongTon()>= 0 && ngayHetHan.isBefore(LocalDate.now()))
		{
			return "khó bán";
		}
		else {
			return "không đánh giá";
		}
	}
	
	
}

package nguyenVanPhu.bai08;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	public HangSanhSu() throws Exception {
		super();
		nhaSanXuat = "chưa biết";
		ngayNhapKho = LocalDate.now();
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	/**
	 * hàm trả về giá trị thuộc tính cho nhaSanXuat
	 * 
	 * @return nhaSanXuat
	 */
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	/**
	 * hàm gán giá trị cho nhaSanXuat 
	 * 
	 * @param nhaSanXuat: giá trị muốn gán
	 */
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	/**
	 * hàm trả về giá trị thuộc tính cho ngayNhapKho
	 * 
	 * @return ngayNhapKho
	 */
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	/**
	 * hàm gán giá trị cho ngayNhapKho  phải trước ngày hiện tại, mặc
	 * định là ngày hiện tại
	 * 
	 * @param ngayNhapKho: giá trị muốn gán
	 */
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
		this.ngayNhapKho = ngayNhapKho;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %-15s %-15s", super.toString(), this.nhaSanXuat, dtf.format(ngayNhapKho));
	}
	@Override
	public double tinhTienVAT() {
		
		return getDonGia() * getSoLuongTon() *0.1;
	}
	@Override
	public String danhGiaMucDoBanBuon() {
		Period ngay=Period.between(ngayNhapKho, LocalDate.now());
		int day=ngay.getDays();
		int month=ngay.getMonths();
		int year=ngay.getYears();
		int thoiGianLuuKho= day+ month*30 + year *365;
		if(super.getSoLuongTon()>50&& thoiGianLuuKho>10)
			return "bán chậm";
		return "không đanh giá";
	}
	
	
	
	
}

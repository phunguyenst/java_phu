package nguyenVanPhu.bai08hanghoaset;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
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
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		if (!nhaSanXuat.equals("")) {
			this.nhaSanXuat = nhaSanXuat;
		} else
			this.nhaSanXuat = "chưa biết";
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	/**
	 * ngày nhập kho (phải trước ngày hiện tại, mặc định là ngày hiện tại)
	 * 
	 * @param ngayNhapKho
	 */
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now())) {
			this.ngayNhapKho = ngayNhapKho;
		} else
			this.ngayNhapKho = LocalDate.now();
	}

	/**
	 * Hàng sành sứ, nếu số lượng tồn kho >50 và thời gian lưu kho >10 ngày thì đánh
	 * giá là bán chậm
	 */
	@Override
	public String danhGiaMucDoBanBuon() {
		Period ngay = Period.between(ngayNhapKho, LocalDate.now());
		int day = ngay.getDays();
		int month = ngay.getMonths();
		int year = ngay.getYears();
		int thoiGianLuuKho = day + month * 30 + year * 365;
		if (super.getSoLuongTon() > 50 && thoiGianLuuKho > 10) {
			return "bán chậm";
		} else
			return "không đánh giá";
	}

	/**
	 * VAT của sành sứ là 10%
	 */
	@Override
	public double tinhTienVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}

	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %-15s %-15s", super.toString(), this.nhaSanXuat, df.format(ngayNhapKho));
	}

}

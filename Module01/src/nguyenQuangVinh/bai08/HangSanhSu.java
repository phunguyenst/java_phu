package nguyenQuangVinh.bai08;

import java.time.LocalDate;
import java.time.Period;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	/**
	 * @return the nhaSanXuat
	 */
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	/**
	 * @param nhaSanXuat the nhaSanXuat to set
	 */
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	/**
	 * @return the ngayNhapKho
	 */
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	/**
	 * @param ngayNhapKho the ngayNhapKho to set
	 */
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho=LocalDate.now();
	}
	

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param nhaSanXuat
	 * @param ngayNhapKho
	 * @throws Exception
	 */
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}
	

	/**
	 * @throws Exception
	 */
	public HangSanhSu() throws Exception {
		super();
		this.nhaSanXuat="";
		this.ngayNhapKho=LocalDate.now();
				
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		Period ngay=Period.between(ngayNhapKho, LocalDate.now());
		int day=ngay.getDays();
		int month=ngay.getMonths();
		int year=ngay.getYears();
		int thoiGianLuuKho= day+ month*30 + year *365;
		if(super.getSoLuongTon()>50&& thoiGianLuuKho>10)
			return "ban cham";
		return "không đanh giá";
	}

	@Override
	public double getTienVAT() {
		return 0.1;
	}
	@Override
	public String toString() {
		return String.format("%s %-15s %15.2f %-15s %-15s\n",super.toString(),danhGiaMucDoBanBuon(),getTienVAT(),nhaSanXuat,ngayNhapKho);
	}
	public static String getTieuDe() {
		return String.format("%s %-15s %15s %-15s %-15s",HangHoa.getTieuDe(),"Danh gia","Tien VAT","Nha san xuat","Ngay nhap kho");
	}
	

}

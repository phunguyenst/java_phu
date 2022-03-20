package nguyenQuangVinh.bai08;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	

	/**
	 * @return the nhaCungCap
	 */
	public String getNhaCungCap() {
		return nhaCungCap;
	}

	/**
	 * @param nhaCungCap the nhaCungCap to set
	 * @throws Exception 
	 */
	public void setNhaCungCap(String nhaCungCap) throws Exception {
		if(!nhaCungCap.equals(""))
			this.nhaCungCap = nhaCungCap;
		else
			throw new Exception("Loi");
	}

	/**
	 * @return the ngaySanXuat
	 */
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	/**
	 * @param ngaySanXuat the ngaySanXuat to set
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat=LocalDate.now();
	}

	/**
	 * @return the ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan=ngaySanXuat;
	}
	

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param nhaCungCap
	 * @param ngaySanXuat
	 * @param ngayHetHan
	 * @throws Exception
	 */
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	

	

	

	/**
	 * @throws Exception
	 */
	public HangThucPham() throws Exception {
		super();
		this.nhaCungCap="Loi";
		this.ngaySanXuat=LocalDate.now();
		this.ngayHetHan=ngaySanXuat;
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if( super.getSoLuongTon()>=0&& ngayHetHan.isBefore(LocalDate.now()))
			return "Kho ban";
		return "Khong danh gia";
	}

	@Override
	public double getTienVAT() {
		return 0.05;
	}
	@Override
	public String toString() {
		return String.format("%s %-15s %15.2f %-15s %-15s %-15s\n",
				super.toString(), danhGiaMucDoBanBuon(), getTienVAT(),
				nhaCungCap, ngaySanXuat, ngayHetHan);
	}
	public static String getTieuDe() {
		return String.format("%s %-15s %15s %-15s %-15s %-15s",
				HangHoa.getTieuDe(), "Danh gia", "Tien VAT", "Nha cung cap", "Ngay san xuat",
				"Ngay het han");
	}
	

}

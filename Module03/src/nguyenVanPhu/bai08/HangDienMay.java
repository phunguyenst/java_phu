package nguyenVanPhu.bai08;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private int congSuat;
	public HangDienMay() throws Exception {
		super();
		thoiGianBaoHanh = 0;
		congSuat = 0;
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, int congSuat)
			throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	
	/**
	 * hàm trả về giá trị thuộc tính cho thoiGianBaoHanh
	 * 
	 * @return thoiGianBaoHanh
	 */
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	/**
	 * hàm gán giá trị cho thoiGianBaoHanh
	 * 
	 * @param thoiGianBaoHanh: giá trị muốn gán
	 */
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	/**
	 * hàm trả về giá trị thuộc tính cho congSuat
	 * 
	 * @return congSuat
	 */
	public int getCongSuat() {
		return congSuat;
	}
	/**
	 * hàm gán giá trị cho congSuat
	 * 
	 * @param congSuat: giá trị muốn gán
	 */
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public String toString() {
		return String.format("%s %-10d %10d", super.toString(), this.thoiGianBaoHanh, this.congSuat);
	}
	
	@Override
	public double tinhTienVAT() {
		return 0.1;
	}
	@Override
	public String danhGiaMucDoBanBuon() {
		if(getSoLuongTon()<3)
			return "Bán được";
		else
			return "Khong danh gia";
	}
	
	
	
}

package nguyenVanPhu.bai08hanghoaset;

public class HangDienMay extends HangHoa {
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
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	/**
	 * thời gian bảo hành bao nhiêu tháng (>=0)
	 * 
	 * @param thoiGianBaoHanh
	 */
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (thoiGianBaoHanh >= 0) {
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		} else
			this.thoiGianBaoHanh = 0;
	}

	public int getCongSuat() {
		return congSuat;
	}

	/**
	 * công suất bao nhiêu KW (>=0)
	 * 
	 * @param congSuat
	 */
	public void setCongSuat(int congSuat) {
		if (congSuat >= 0) {
			this.congSuat = congSuat;
		} else
			this.congSuat = congSuat;
	}

	/**
	 * Hàng điện máy, nếu số lượng tồn kho <3 thì được đánh giá là bán được
	 */
	@Override
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() < 3)
			return "bán được";
		else
			return "không đánh giá";
	}

	/**
	 * hàng điện máy là 10%
	 */
	@Override
	public double tinhTienVAT() {

		return 0.1;
	}

	@Override
	public String toString() {
		return String.format("%s %-20d %-15d", super.toString(), this.thoiGianBaoHanh, this.congSuat);
	}

}

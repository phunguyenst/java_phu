package bai02;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHang;
	private int congSuat;
	
	
	public HangDienMay() {
		super();
		thoiGianBaoHang = 0;
		congSuat = 0;
	}
	
	
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHang,
			int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHang(thoiGianBaoHang);
		setCongSuat(congSuat);
	}


	public int getThoiGianBaoHang() {
		return thoiGianBaoHang;
	}

	/**
	 * thời gian bảo hành bao nhiêu tháng (>=0)
	 * @param thoiGianBaoHang
	 */
	public void setThoiGianBaoHang(int thoiGianBaoHang) {
		if(thoiGianBaoHang >=0)
		{
			this.thoiGianBaoHang = thoiGianBaoHang;
		}
		else
		this.thoiGianBaoHang = 0;
	}


	public int getCongSuat() {
		return congSuat;
	}
	/**
	 * công suất bao nhiêu KW (>=0).
	 * @param congSuat
	 */

	public void setCongSuat(int congSuat) {
		if(congSuat >=0)
		{
			this.congSuat = congSuat;
		}
		else
			this.congSuat = 0;
	}

	/**
	 * Hàng điện máy, nếu số lượng tồn kho <3 thì được đánh giá là bán được
	 */
	@Override
	public String danhGiaMucDoBanBuon() {
		// TODO Auto-generated method stub
		if(getSoLuongTon()<3)
		{
			return "bán được";
		}
		else
			return "Không đánh giá";
	}
	
	/**
	 * VAT của hàng điện máy 
	 */
	@Override
	public double tinhTienVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}


	@Override
	public String toString() {
		return String.format("%s %-20d %-10d", super.toString(), this.thoiGianBaoHang, this.congSuat);
	}
	
	
}

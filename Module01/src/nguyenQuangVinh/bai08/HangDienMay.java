package nguyenQuangVinh.bai08;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private double congSuat;
	

	/**
	 * @return the thoiGianBaoHanh
	 */
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	/**
	 * @param thoiGianBaoHanh the thoiGianBaoHanh to set
	 */
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if(thoiGianBaoHanh>=0)
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else
			this.thoiGianBaoHanh=-1;
	}

	/**
	 * @return the congSuat
	 */
	public double getCongSuat() {
		return congSuat;
	}

	/**
	 * @param congSuat the congSuat to set
	 */
	public void setCongSuat(double congSuat) {
		if(congSuat>=0)
			this.congSuat = congSuat;
		else
			this.congSuat=-1;
	}
	

	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @param thoiGianBaoHanh
	 * @param congSuat
	 * @throws Exception
	 */
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			double congSuat) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}
	

	/**
	 * @throws Exception
	 */
	public HangDienMay() throws Exception {
		super();
		this.congSuat=-1;
		this.thoiGianBaoHanh=-1;
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if(super.getSoLuongTon()<3)
			return "Ban duoc";
		else
			return "Khong danh gia";
	}

	@Override
	public double getTienVAT() {
		return 0.1;
	}
	@Override
	public String toString() {
		return String.format("%s %-15s %15.2f %-20d %10.1f\n",super.toString(),danhGiaMucDoBanBuon(),getTienVAT(),thoiGianBaoHanh,congSuat);
	}
	public static String getTieuDe() {
		return String.format("%s %-15s %15s %-20s %10s",HangHoa.getTieuDe(),"Danh gia","Tien VAT","Thoi gian bao hanh","Cong suat");
	}
	

}

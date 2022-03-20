package nguyenVanPhu.bai06;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;

	public PhongThiNghiem() {
		super();
		chuyenNganh = "chưa biết";
		sucChua = 0;
		coBonRua = false;
	}

	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	/**
	 * tất cả các phòng đều phải đủ ánh sáng
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return (duAnhSang() && coBonRua);
	}

	/**
	 * Phòng máy tính: trung bình 1.5m2 đặt một máy
	 * kiểm tra có bồn rửa hoặc ko có
	 */
	@Override
	public String toString() {
		
		return String.format("%s %-15s %-15d %-15s", super.toString(), this.chuyenNganh, this.sucChua, coBonRua? "có" : "không");
	}

}

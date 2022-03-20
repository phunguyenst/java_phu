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
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setCoBonRua(coBonRua);
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		if (!chuyenNganh.equals("")) {
			this.chuyenNganh = chuyenNganh;
		} else
			this.chuyenNganh = "chưa biết";
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		if (sucChua > 0) {
			this.sucChua = sucChua;
		} else
			this.sucChua = 0;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	/**
	 * đủ ánh sáng (trung bình 10m2 - 1 bóng đèn) và Phòng thí nghiệm: phải có bồn
	 * rửa đi kèm
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return duAnhSang() && coBonRua;
	}

	public String toString() {
		return String.format("%s %-20s %-10d %-15s", super.toString(), this.chuyenNganh, this.sucChua,
				coBonRua ? "có" : "không");
	}
}

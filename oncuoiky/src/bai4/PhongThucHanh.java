package bai4;

public class PhongThucHanh extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;

	public PhongThucHanh() {
		super();
		chuyenNganh = "chưa biết";
		sucChua = 0;
		bonRua = false;
	}

	public PhongThucHanh(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setBonRua(bonRua);
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

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	/**
	 * Phòng thí nghiệm: phải có bồn rửa đi kèm
	 */
	@Override
	public boolean kiemTraDatChuan() {

		return (duAnhSang() && bonRua);
	}

	@Override
	public String toString() {
		return String.format("%s %-20s %-15d %-15s", super.toString(), this.chuyenNganh, this.sucChua,
				bonRua ? "có" : "không");
	}

}

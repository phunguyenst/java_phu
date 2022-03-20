package huynhQuocBao.bai06;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua, bonRua;

	public PhongThiNghiem(int maPhong, int soBongDen, String dayNha, double dienTich, String chuyenNganh, int sucChua,
			int bonRua) {
		super(maPhong, soBongDen, dayNha, dienTich);
		setBonRua(bonRua);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
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

	public int getBonRua() {
		return bonRua;
	}

	public void setBonRua(int bonRua) {
		this.bonRua = bonRua;
	}

	@Override
	public boolean kiemTraDatChuan() {
		return (getDienTich() / 10 <= getSoBongDen()) && (bonRua > 0) ? true : false;
	}

	public String getTitle() {
		return super.getTitle() + String.format("%-15s %-15s %-15s", "Chuyen nganh", "Suc chua", "Bon rua");
	}

	public String toString() {
		return super.toString() + String.format("%-15s %-15d %-15d", chuyenNganh, sucChua, bonRua);
	}
}

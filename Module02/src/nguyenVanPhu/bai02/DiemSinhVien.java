package nguyenVanPhu.bai02;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;

	public DiemSinhVien() throws Exception {
		maSV = 0;
		hoTen = "";
		diemLT = 0;
		diemTH = 0;
	}

	public DiemSinhVien(int maSV, String hoTen, double diemLT, double diemTH) throws Exception {

		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	/**
	 * hàm trả về giá trị thuộc tính cho maSV
	 * 
	 * @return maSV
	 */

	public int getMaSV() {
		return maSV;
	}

	/**
	 * hàm gán giá trị cho maSV
	 * 
	 * @param maSV: giá trị muốn gán
	 * 
	 */
	public void setMaSV(int maSV) throws Exception {
		if (maSV > 0) {
			this.maSV = maSV;
		} else
			throw new Exception("Lỗi nhập maSV < 0");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho hoTen
	 * 
	 * @return hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * hàm gán giá trị cho hoTen
	 * 
	 * @param hoTen: giá trị muốn gán
	 * 
	 */
	public void setHoTen(String hoTen) throws Exception {
		if (!hoTen.equals("")) {
			this.hoTen = hoTen;
		} else
			throw new Exception("Lỗi nhap hoTen rong");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho diemLT;
	 * 
	 * @return diemLT;
	 */
	public double getDiemLT() {
		return diemLT;
	}

	/**
	 * hàm gán giá trị cho diemLT
	 * 
	 * @param diemLT: giá trị muốn gán
	 * 
	 */
	public void setDiemLT(double diemLT) throws Exception {
		if (diemLT >= 0 && diemLT <= 10) {
			this.diemLT = diemLT;
		} else
			throw new Exception("lỗi nhập điểm lý thuyết ko phải số thực hoặc không thuộc [0.0, 10.0]");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho diemTH;
	 * 
	 * @return diemTH
	 */
	public double getDiemTH() {
		return diemTH;
	}

	/**
	 * hàm gán giá trị cho diemTH
	 * 
	 * @param diemTH: giá trị muốn gán
	 * 
	 */
	public void setDiemTH(double diemTH) throws Exception {
		if (diemTH >= 0 && diemTH <= 10) {
			this.diemTH = diemTH;
		} else
			throw new Exception("lỗi nhập điểm thực hành ko phải số thực hoặc không thuộc [0.0, 10.0]");
	}

	public double tinhDiemTrungBinh() {
		return (diemLT + diemTH) / 2;
	}

	public String toString() {
		return String.format("%-10d %-30s %7.2f %7.2f %7.2f", this.maSV, this.hoTen, this.diemLT, this.diemTH,
				this.tinhDiemTrungBinh());
	}

}

package nguyenVanPhu.bai04;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private int triGiaXe;
	private int dungTichXyLanh;

	public ThongTinDangKyXe() throws Exception {
	
		this("chua biet", "chua biet", 0,0);
	}

	public ThongTinDangKyXe(String chuXe, String loaiXe, int triGiaXe, int dungTichXyLanh) throws Exception {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGiaXe(triGiaXe);
		setDungTichXyLanh(dungTichXyLanh);
	}

	/**
	 * hàm trả về giá trị thuộc tính cho chuXe
	 * 
	 * @return chuXe;
	 */
	public String getChuXe() {
		return chuXe;
	}

	/**
	 * hàm gán giá trị cho chuXe
	 * 
	 * @param chuXe: giá trị muốn gán
	 */
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho loaiXe
	 * 
	 * @return loaIXe
	 */
	public String getLoaiXe() {
		return loaiXe;
	}

	/**
	 * hàm gán giá trị cho loaiXe
	 * 
	 * @param loaiXe: giá trị muốn gán
	 */
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho triGiaXe
	 * 
	 * @return triGiaXe
	 */
	public int getTriGiaXe() {
		return triGiaXe;
	}

	/**
	 * hàm gán giá trị cho triGiaXe
	 * 
	 * @param triGiaXe: giá trị muốn gán
	 * 
	 */
	public void setTriGiaXe(int triGiaXe) throws Exception {
		if (triGiaXe >= 0) {
			this.triGiaXe = triGiaXe;
		} else
			throw new Exception("lỗi nhập triGiaXe<0");

	}

	/**
	 * hàm trả về giá trị thuộc tính cho dungTichXyLanh
	 * 
	 * @return dungTichXyLanh
	 */
	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}

	/**
	 * hàm gán giá trị cho dungTichXyLanh
	 * 
	 * @param dungTichXyLanh: giá trị muốn gán
	 * 
	 */
	public void setDungTichXyLanh(int dungTichXyLanh) throws Exception {
		if (dungTichXyLanh >= 0) {
			this.dungTichXyLanh = dungTichXyLanh;
		} else
			throw new Exception("lỗi nhập dungTichXyLanh<0");
	}

	public double tinhMucThue() {
		double thueXe;
		if (dungTichXyLanh < 100) {
			thueXe = triGiaXe * 0.01;
		} else if (dungTichXyLanh >= 100 && dungTichXyLanh < 200) {
			thueXe = triGiaXe * 0.03;
		} else {
			thueXe = triGiaXe * 0.05;
		}
		return thueXe;
	}

	public static String getTieuDe() {
		return String.format("%-20s %-15s %15s %15s %15s", "Tên chủ xe", "Loại xe ", "Dung tích ", "Trị giá","Thuế phải nộp"); 
	}

	@Override
	public String toString() {
		return String.format("%-20s %-15s %15d %15d %15.2f", this.chuXe, this.loaiXe, this.triGiaXe,
				this.dungTichXyLanh, this.tinhMucThue());
	}

}

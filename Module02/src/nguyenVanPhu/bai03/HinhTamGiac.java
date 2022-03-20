package nguyenVanPhu.bai03;

public class HinhTamGiac {
	private int ma;
	private int mb;
	private int mc;

	public HinhTamGiac() throws Exception {
		ma = 0;
		mb = 0;
		mc = 0;
	}

	public HinhTamGiac(int ma, int mb, int mc) throws Exception {
		if (ma + mb >= mc && mb + mc >= ma && ma + mc >= mb) {
			setMa(ma);
			setMb(mb);
			setMc(mc);
		} else {
			ma = 0;
			mb = 0;
			mc = 0;
		}
	}

	/**
	 * hàm trả về giá trị thuộc tính cho ma
	 * 
	 * @return ma
	 */
	public int getMa() {
		return ma;
	}

	/**
	 * hàm gán giá trị cho ma
	 * 
	 * @param ma: giá trị muốn gán
	 * @throws Exception
	 */
	public void setMa(int ma) throws Exception {
		if (ma > 0) {
			this.ma = ma;
		} else
			throw new Exception("lỗi nhập ma < 0 hoặc ma không tạo thành tam giác");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho mb
	 * 
	 * @return mb
	 */
	public int getMb() {
		return mb;
	}

	/**
	 * hàm gán giá trị cho mb
	 * 
	 * @param mb: giá trị muốn gán
	 * 
	 */
	public void setMb(int mb) throws Exception {
		if (mb > 0) {
			this.mb = mb;
		} else
			throw new Exception("lỗi nhập mb < 0 hoặc mb không tạo thành tam giác");

	}

	/**
	 * hàm trả về giá trị thuộc tính cho mc
	 * 
	 * @return mc
	 */
	public int getMc() {
		return mc;
	}

	/**
	 * hàm gán giá trị cho mc
	 * 
	 * @param mc: giá trị muốn gán
	 * 
	 */
	public void setMc(int mc) throws Exception {
		if (mc > 0) {
			this.mc = mc;
		} else {
			throw new Exception("lỗi nhập mc < 0 hoặc mc không tạo thành tam giác");
		}
	}

	public String phanLoaiTamGiac() {
		if (ma + mb > mc && mb + mc > ma && ma + mc > mb) {
			if (ma == mb && mb == mc)
				return "đều";
			if (ma == mb || mb == mc || ma == mc)
				return "cân";
			else
				return "thường";
		} else
			return "khong phai tam giac";
	}

	public float tinhChuVi() {
		return ma + mb + mc;
	}

	public float tinhDienTich() {
		float p = (ma + mb + mc) / 2;
		return (float) Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public String toString() {
		return String.format("%9d %9d %9d %20s %9.5f %9.5f", this.ma, this.mb, this.mc, this.phanLoaiTamGiac(),
				this.tinhChuVi(), this.tinhDienTich());
	}

}

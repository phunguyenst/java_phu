package nguyenVanPhu.bai07;

public class ToaDo {
	private int x;
	private int y;
	private String ten;

	public String toString() {
		return String.format("%s(%d,%d)", this.ten, this.x, this.y);
	}

	public ToaDo() {
		this("XYZ", 0, 0);
	}

	public ToaDo(String ten,int x, int y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	/**
	 * hàm trả về giá trị thuộc tính cho x
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * hàm gán giá trị cho x
	 * 
	 * @param x: giá trị muốn gán
	 */
	public void setX(int x) {

		this.x = x;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho y
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * hàm gán giá trị cho y
	 * 
	 * @param y: giá trị muốn gán
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * hàm trả về giá trị thuộc tính cho tên
	 * 
	 * @return ten
	 */
	public String getTen() {
		return ten;
	}

	/**
	 * hàm giá giá trị cho tên
	 * 
	 * @param ten
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}

}

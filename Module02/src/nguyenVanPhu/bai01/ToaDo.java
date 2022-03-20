package nguyenVanPhu.bai01;

public class ToaDo {
	private int x;
	private int y;
	private String ten;

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

	public ToaDo() {
		x = 0;
		y = 0;
		ten = "XYZ";
	}

	public ToaDo(int x, int y, String ten) {
		setX(x);
		setY(y);
		setTen(ten);
	}

	public String toString() {
		return String.format("%s(%d,%d)", this.ten, this.x, this.y);
	}

}

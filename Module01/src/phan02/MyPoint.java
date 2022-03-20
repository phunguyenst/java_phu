package phan02;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		super();
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] a = new int[2];
		a[0] = this.x;
		a[1] = this.y;
		return a;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d", this.x, this.y);
	}
	/**tính khoảng cách từ tọa độ (x,y) tới tọa độ (x2, y2)
	 * 
	 */
	public double distance(int x2, int y2)
	{
		return Math.sqrt((x2-this.x) *(x2-this.x) + (y2-this.y) * (y2-this.y));
	}
	/**
	 * tính khoảng cách từ tọa độ (x,y) tới p2
	 */
	public double distance(MyPoint p2)
	{
		return Math.sqrt((p2.x - x)*(p2.x - x) + (p2.y-y)*(p2.y-y));
	}
	/**
	 * tính khoảng cách từ tọa độ (x,y) tới (0,0);
	 * @return
	 */
	public double distance ()
	{
		return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
	}
}

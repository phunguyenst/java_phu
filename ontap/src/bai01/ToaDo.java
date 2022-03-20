package bai01;

public class ToaDo {
	//thuộc tính
	private int x;
	private int y;
	private String tenToaDo;
	//phương thức
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x > 0)
		{
			this.x = x;
		}
		else 
			this.x = 0;
		
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y > 0)
		{
			this.y = y;
		}
			else
			this.y = 0;

	}
	public String getTenToaDo() {
		return tenToaDo;
	}
	public void setTenToaDo(String tenToaDo) {
		if(!tenToaDo.equals(""))
		{
			this.tenToaDo = tenToaDo;
		}
		else
			this.tenToaDo = "chưa biết";
		
	}
	public ToaDo() {
		this(0,0, "chưa biết");
	}
	public ToaDo(int x, int y, String tenToaDo) {
		setX(x);
		setY(y);
		setTenToaDo(tenToaDo);
	}
	@Override
	public String toString() {
		return String.format("%s(%d,%d)", this.tenToaDo, this.x, this.y);
	}
	
}

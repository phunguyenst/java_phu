package nguyenVanQuy.baiCD;

public class CD {
	private int maCD;
	private String tenCD;
	private int soBaiHat;
	private float giaThanh;
	
	
	public int getMaCD() {
		return maCD;
	}
	
	public void setMaCD(int maCD) 
	{
		if (maCD > 0 && maCD != 999999)
			this.maCD = maCD;
		else {
			this.maCD = 999999;
		}
	}
	
	public String getTenCD() {
		return tenCD;
	}
	
	public void setTenCD(String tenCD) throws Exception 
	{
		if (tenCD != " ") {
			this.tenCD = tenCD;
		} else {
			throw new Exception("Ten CD khong duoc trong ");
		}
	}
	
	public int getSoBaiHat() {
		return soBaiHat;
	}
	
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if (soBaiHat > 0) {
			this.soBaiHat = soBaiHat;
		} 
		else {
			throw new Exception("Số bài hát phải lớn hơn 0 ");
		}
	}
	
	public float getGiaThanh() {
		return giaThanh;
	}
	
	public void setGiaThanh(float giaThanh) throws Exception {
		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		} 
		else {
			throw new Exception("Giá mua phải lớn hơn 0 VND");
		}
	}
	
	public CD(int maCD, String tenCD, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		String contentString = String.format("%-10d"+"%-30s"+"%-15d"+"%-20.2f",maCD,tenCD,soBaiHat,giaThanh);
		return contentString;
	}
	
	
	
	
}
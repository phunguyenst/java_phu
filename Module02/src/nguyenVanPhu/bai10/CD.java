package nguyenVanPhu.bai10;

public class CD {
	private int maCD = 999999;
	private String tuaCD = "Chưa Xác Định";
	private int soBaiHat;
	private double giaThanh;
	public CD() {
		this(999999, "Chưa Xác Định", 0, 0);
	}
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
	setMaCD(maCD);
	setTuaCD(tuaCD);
	setSoBaiHat(soBaiHat);
	setGiaThanh(giaThanh);
	}
	public int getMaCD() {
		return maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setMaCD(int maCD) {
		if(maCD >0)
		{
			this.maCD = maCD;
		}
		else 
			this.maCD = 999999;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.equals("") )
		{
			this.tuaCD = tuaCD;
		}
		else 
			this.tuaCD = "Chưa xác định";
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat>0)
		{
			this.soBaiHat = soBaiHat;
		}
		else
			this.soBaiHat = 0;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh>0)
		{
			this.giaThanh = giaThanh;
		}
		else 
			this.giaThanh = 0;
	}

	public String toString() {
		return String.format("mã cd: %d, tựa đĩa: %s, số bài hát: %d, giá thành: %.3f", this.maCD, this.tuaCD, this.soBaiHat, this.giaThanh);
	}
	
}

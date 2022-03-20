package hinhChuNhat;

public class HinhChuNhat {
	private float cDai;
	private float cRong;
	public HinhChuNhat(float cd, float cr)
	{
		this.cDai = cd;
		this.cRong = cr;
	}
	public void setChieuDai(float cd)
	{
		this.cDai = cd;
	}
	public void setChieuRong(float cr)
	{
		this.cRong = cr;
	}
	public float getChieuDai()
	{
		return cDai;
		
	}
	public float getChieuRong()
	{
		return cRong;
		
	}
	public float tinhDienTich()
	{
		return cDai *cRong;
	}
	public float tinhChuVi()
	{
		return (cDai + cRong) *2;
	}
	String layThongTin()
	{
		return cDai +" " + cRong + "\t" + tinhDienTich() +" " + tinhChuVi();
	}
}

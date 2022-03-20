package nguyenQuangVinh.bai08;

public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	/**
	 * @return the maHang
	 */
	public String getMaHang() {
		return maHang;
	}
	/**
	 * @param maHang the maHang to set
	 */
	public void setMaHang(String maHang) throws Exception {
		if(!maHang.equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Loi:Ma hang rong");
	}
	/**
	 * @return the tenHang
	 */
	public String getTenHang() {
		return tenHang;
	}
	/**
	 * @param tenHang the tenHang to set
	 */
	public void setTenHang(String tenHang) {
		if(!tenHang.equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang="xxx";
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		if(donGia>=0)
			this.donGia = donGia;
		else
			this.donGia=-1;
	}
	/**
	 * @return the soLuongTon
	 */
	public int getSoLuongTon() {
		return soLuongTon;
	}
	/**
	 * @param soLuongTon the soLuongTon to set
	 */
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon>=0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon=-1;
	}
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param soLuongTon
	 * @throws Exception 
	 */
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
		
	}
	/**
	 * @throws Exception 
	 * 
	 */
	public HangHoa() throws Exception {
		this("", "xxx",-1, -1);
	}
	//lop truu tuong 
	public abstract String  danhGiaMucDoBanBuon() ;
	public abstract double getTienVAT();

	@Override
	public String toString() {
		return String.format("%-10s %-15s %15.1f %15d",maHang,tenHang,donGia,soLuongTon);
	}	
	public static String getTieuDe() {
		return String.format("%-10s %-15s %15s %15s","Ma hang","Ten hang","Don gia","So luong ton");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		if (maHang == null) {
			if (other.maHang != null)
				return false;
		} else if (!maHang.equals(other.maHang))
			return false;
		return true;
	}
	
	
	
	


}

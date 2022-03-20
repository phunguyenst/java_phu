package baithk14;

public class RapPhim {
	private String maPhim;
	private String tenPhim;
	private String loaiPhim;
	private String tenDaoDien;
	private int soXuatChieu;
	private double giaXuatChieu;
	public RapPhim() {
		this("chưa biết", "chưa cập nhật","chưa biết","chưa biết",0,0 );
	}
	public RapPhim(String maPhim, String tenPhim, String loaiPhim, String tenDaoDien, int soXuatChieu,
			double giaXuatChieu) {
		setMaPhim(maPhim);
		setTenPhim(tenPhim);
		setLoaiPhim(loaiPhim);
		setTenDaoDien(tenDaoDien);
		setSoXuatChieu(soXuatChieu);
		setGiaXuatChieu(giaXuatChieu);

	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		if(!maPhim.equals("")) {
			this.maPhim = maPhim;
		}
		else
		this.maPhim = "chưa biết";
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		if(!tenPhim.equals(""))
		{
			this.tenPhim = tenPhim;
		}
		else 
		this.tenPhim = "chưa cập nhật";
	}
	public String getLoaiPhim() {
		return loaiPhim;
	}
	public void setLoaiPhim(String loaiPhim) {
		if(!loaiPhim.equals(""))
		{
			this.loaiPhim = loaiPhim;
		}
		else
		this.loaiPhim = "chưa biết";
	}
	public String getTenDaoDien() {
		return tenDaoDien;
	}
	public void setTenDaoDien(String tenDaoDien) {
		if(!tenDaoDien.equals("")) {
			this.tenDaoDien = tenDaoDien;
		}
		else
		this.tenDaoDien = "chưa biết";
	}
	public int getSoXuatChieu() {
		return soXuatChieu;
	}
	public void setSoXuatChieu(int soXuatChieu) {
		if(soXuatChieu>0)
		{
			this.soXuatChieu = soXuatChieu;
		}
		else
		this.soXuatChieu = 0;
	}
	public double getGiaXuatChieu() {
		return giaXuatChieu;
	}
	public void setGiaXuatChieu(double giaXuatChieu) {
		if(giaXuatChieu>0) {
			this.giaXuatChieu = giaXuatChieu;
		}
		else
		this.giaXuatChieu = 0;
	}
	
	
	
}

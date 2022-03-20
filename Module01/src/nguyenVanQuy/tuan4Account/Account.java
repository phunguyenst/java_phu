package nguyenVanQuy.tuan4Account;

public class Account {

		private long soTaiKhoan;
		private String tenTaiKhoan;
		private double tienDu;
		static final double LAISUAT = 0.035;
		static final double PHICHUYEN = 0.02;
		static final int PHIRUT = 1000;

		public long getSoTaiKhoan() {
			return soTaiKhoan;
		}

		public void setSoTaiKhoan(long soTaiKhoan) {
			if (soTaiKhoan > 0 && soTaiKhoan != 999999)
				this.soTaiKhoan = soTaiKhoan;
			else {
				this.soTaiKhoan = 999999;
			}
		}

		public String getTenTaiKhoan() {
			return tenTaiKhoan;
		}

		public void setTenTaiKhoan(String tenTaiKhoan) { // throws Exception {
			//if (tenTaiKhoan != " ") {
				this.tenTaiKhoan = tenTaiKhoan;
			//} else {
				//throw new Exception("Ten tai khoan khong duoc trong ");
			//}
		}

		public double getTienDu() {
			return tienDu;
		}

		public void setTienDu(double tienDu) { // throws Exception {
			//if (tienDu > 50000) {
				this.tienDu = tienDu;
			//} 
			/*else {
				throw new Exception("So du phai lon hon 50000VND ");
			}*/
		}
		/*public static double getLaisuat() {
		return LAISUAT;
	}

	public static double getPhichuyen() {
		return PHICHUYEN;
	}

	public static int getPhirut() {
		return PHIRUT;
	} */
	
	public boolean napTien(double tienNap)  throws Exception
	{
		if(tienNap>0)
		{
			double tienTrongTK = this.getTienDu();
			tienTrongTK += tienNap;
			this.setTienDu(tienTrongTK);
			return true;
		}
		else
		throw new Exception("Tien gui vao phai lon hon 0");
	}
	
	public void rutTien(double tienRut) throws Exception
	{
		double tienTrongTK = this.getTienDu();
		if(tienTrongTK >= (tienRut+50000))
		{
			tienTrongTK = tienTrongTK - tienRut - PHIRUT;
			this.setTienDu(tienTrongTK);
		}
		else
			throw new Exception("Vuot qua so du trong tai khoan !");
	}
	
	public boolean chuyenTien(double tienChuyen, Account nguoiNhan) throws Exception
	{
		double tienTrongTK =this.getTienDu();
		if(tienTrongTK >= (tienChuyen + tienChuyen*PHICHUYEN) && tienChuyen>0)
		{
			this.rutTien(tienChuyen);
			nguoiNhan.napTien(tienChuyen);
			return true;
		}
		return false;
	}
	
	public void daoHan() throws Exception
	{
		this.setTienDu(tienDu+tienDu*LAISUAT);
	}

	public Account(long soTaiKhoan, String tenTaiKhoan, double tienDu) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.tienDu = tienDu;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String contentString = String.format("%-15d"+"%-30s"+"%-25.2f",soTaiKhoan,tenTaiKhoan,tienDu);
		return contentString;
	}
	
	

}



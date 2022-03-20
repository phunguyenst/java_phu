package nguyenVanQuy.tuan4Account;

public class DanhSachAccount {
	//Khai bao mang
	Account dsAcc[];
	public int soLuongAccHienTai = 0;
	
	public DanhSachAccount(int soLuongAcc) {
		dsAcc = new Account[soLuongAcc];
	}
	
	private void tangKichThuocMang()
	{
		Account tempAcc[] = new Account[dsAcc.length*2];
		for(int i=0; i<dsAcc.length; i++)
		{
			tempAcc[i] = dsAcc[i];
		}
		dsAcc = tempAcc;
	}
	
	public Account timAcc(long soTaiKhoan)
	{
		for(int i=0; i<soLuongAccHienTai; i++)
		{
			if(soTaiKhoan == dsAcc[i].getSoTaiKhoan())
				return dsAcc[i];
		}
		return null;
	}
	
	public int timKiem(long soTaiKhoan)
	{
		int viTri = -1;
		for(int i=0; i<soLuongAccHienTai; i++)
		{
			//if(dsAcc[i].getSoTaiKhoan().equals(soTaiKhoan))
			if(dsAcc[i].getSoTaiKhoan() == soTaiKhoan)
			{
				viTri=i;
				break;
			}
		}
		return viTri;
	}
	
	public boolean themAcc(Account acc)
	{
		if(soLuongAccHienTai == dsAcc.length)
			tangKichThuocMang();
		if(timKiem(acc.getSoTaiKhoan()) != -1)  //tìm thấy
			return false;
		else
		{
			dsAcc[soLuongAccHienTai] = acc;
			soLuongAccHienTai++;
			return true;
		}
	}
	
	public boolean xoaAcc(long soTaiKhoan)
	{
		boolean hoanTat = true;
		int viTri = timKiem(soTaiKhoan);
		if(viTri != 1)
		{
			for(int i=viTri; i<dsAcc.length-1; i++)
			{
				dsAcc[i] = dsAcc[i+1];
			}
			soLuongAccHienTai--;
		}
		else {
			return false;
		}
		return hoanTat;
	}
	
	public Account[] xuatDS() {
		return dsAcc;
	}
	
	public void suaAcc(Account acc)
	{
		int viTri = timKiem(acc.getSoTaiKhoan());
		if(viTri > 0)
			dsAcc[viTri] = acc; 
	}
	
	public Account xuatThongTinAcc(int viTri)
	{
		return dsAcc[viTri];
	}
	

}



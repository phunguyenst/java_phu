package nguyenVanQuy.baiCD;



public class dsCD {
	CD dsCD[];
	public int soLuongCDHienTai;
	public int dem = 0;
	
	public dsCD(int soLuongCD)
	{
		dsCD = new CD[soLuongCD];
	}
	
	private void tangKichThuocMang()
	{
		CD tempCD[] = new CD[dsCD.length*2];
		for(int i=0; i<dsCD.length; i++)
		{
			tempCD[i] = dsCD[i];
		}
		dsCD = tempCD;
	}
	
	public CD timCD(long maCD)
	{
		for(int i=0; i<soLuongCDHienTai; i++)
		{
			if(maCD == dsCD[i].getMaCD())
				return dsCD[i];
		}
		return null;
	}
	
	public int timKiem(int maCD)
	{
		int viTri = -1;
		for(int i=0; i<soLuongCDHienTai; i++)
		{
			//if(dsAcc[i].getSoTaiKhoan().equals(soTaiKhoan))
			if(dsCD[i].getMaCD() == maCD)
			{
				viTri=i;
				break;
			}
		}
		return viTri;
	}
	
	public boolean themCD(CD cd)
	{
		if(soLuongCDHienTai == dsCD.length)
			tangKichThuocMang();
		if(timKiem(cd.getMaCD()) != -1)  //tìm thấy
			return false;
		else
		{
			dsCD[soLuongCDHienTai] = cd;
			soLuongCDHienTai++;
			return true;
		}
	}
	
	public boolean xoaCD(int maCD)
	{
		boolean hoanTat = true;
		int viTri = timKiem(maCD);
		if(viTri != 1)
		{
			for(int i=viTri; i<dsCD.length-1; i++)
			{
				dsCD[i] = dsCD[i+1];
			}
			soLuongCDHienTai--;
		}
		else {
			return false;
		}
		return hoanTat;
	}
	
	public void Sua(CD sua)
	{
		int vt = timKiem(sua.getMaCD());
		dsCD[vt] = sua;
	}
	
	public void sapXepTheoGia()
	{
		CD temp = null;
		for(int i=0; i<soLuongCDHienTai-1; i++) {
			for(int j=i+1; j<soLuongCDHienTai; j++) {
				if(dsCD[i].getGiaThanh() < dsCD[j].getGiaThanh()) {
					temp = dsCD[j];
					dsCD[j] = dsCD[i];
					dsCD[i] = temp;
				}
			}
		}
	}
	
	public CD xuatCDLonHonX(double soTien)
	{
		CD temp[] = new CD[soLuongCDHienTai];
		for(int i=0; i<soLuongCDHienTai; i++)
		{
			if(dsCD[i].getGiaThanh() <= soTien)
			{
				temp[dem] = dsCD[i];
				dem++;
			}
		}
		return temp[dem];
	}
	
	public CD[] getCDBeHonX(double soTien) {
		CD temp[] = new CD[soLuongCDHienTai];
		for(int i = 0; i < soLuongCDHienTai; i++ ) {
			if(dsCD[i].getGiaThanh() <= soTien) {
				int soluongHTofDG = 0;
				temp[soluongHTofDG] = dsCD[i];
				soluongHTofDG++;
			}
		}
		return temp;
	}
	
	
	public CD[] xuatDS() {
		return dsCD;
	}
	
	public CD xuatThongTinCD(int viTri)
	{
		return dsCD[viTri];
	}
}

package nguyenVanPhu.bai11;

public class DanhSachCongNhan {
	private  CongNhan[] congnhan;
	private int count;
	public DanhSachCongNhan(int n) {
		congnhan = new CongNhan[n];
		count = 0;
	}
	public boolean themMotCongNhan(CongNhan n)
	{
		if(count <congnhan.length)
		{
			congnhan[count] = n;
			count ++;
			return true;
		}
		
		else
			return false;
	}
	public boolean themMotCongNhan(String mHo, String mTen, int mSoSP)
	{
		if(count < congnhan.length)
		{
			congnhan[count] = new CongNhan(mHo, mTen, mSoSP);
					count ++;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s+= congnhan[i];
		}
		return String.format("số lượng công nhân: %d \nthông tin công nhân: \n%s\n số công nhân làm trên 200 sản phẩm là: %s", this.laySoLuongCongNhan(),s, this.layDanhSachSanPhamTren200());
	}
	
	public int laySoLuongCongNhan() {
		return count;
	}
	public boolean xoaCongNhanTheoTen(String MATEN)
	{
		for (int i = 0; i < count; i++) 
			if(congnhan[i].getmTen().equals(MATEN))
				{
					for(int j = i; j<count-1; j++)
					
						congnhan[j] = congnhan[j+1];
						count --;
						return true;
					
					
				}
			
		
		return false;
	}
	public String layDanhSachSanPhamTren200()
	{
		String ds = "";
		for (int i = 0; i < count; i++) {
			if(congnhan[i].getmSoSP()>200)
			{
				ds += congnhan[i];
			}
		}
		return ds;
	}
	public void sapXepSanPhamGiamDan()
	{
		CongNhan swap = null;
		for (int i = 0; i < count-1; i++) {
			{
				for (int j = i+1; j < count; j++) {
					if(congnhan[i].getmSoSP()<congnhan[j].getmSoSP())
					{
						swap = congnhan[i];
						congnhan[i] = congnhan[j];
						congnhan[j] = swap;
					}
				}
			}
			
		}
	}
}

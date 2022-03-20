package nguyenVanPhu.bai10;

public class CDList {
	private CD[] cd;
	private int n;
	public CDList(int p) {
		cd = new CD[p];
		n = 0;
	}
	public boolean themMotCD(CD p)
	{
		if(n<cd.length)
		{
			cd[n] = p;
			n++;
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += cd[i]+"\n";
		}
		return String.format("số lượng cd: %d\n tổng giá thành cd: %.3f\n%s ",tinhSoLuongCD(), tinhTongGiaThanh(),s );
	}
	public int tinhSoLuongCD()
	{
		return n;
	}
	public boolean xoaCD(int MACD)
	{	boolean hoantat = true;
		int vitri = timKiemCD(MACD);
		if(vitri != 1)
		{
		for (int i = vitri; i < cd.length-1; i++) {
			cd[i] = cd[i+1];
		}
			n--;
		}
		else
		{
			return false;
		}
		return hoantat;
	}
	public double tinhTongGiaThanh() {
		double count = 0;
		for (int i = 0; i < n; i++) {
			count += cd[i].getGiaThanh();
		}
		return count;
	}
	public int timKiemCD(int MACD)
	{
		int vitri = -1;
		for (int i = 0; i < n; i++) {
				if(cd[i].getMaCD() == MACD)
				{
					vitri = i;
					break;
				}
			}
			
		return vitri;
		}
		
		
	public void sapXepGiamDan()
	{
		CD swap = null; 
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				{
					if(cd[i].getGiaThanh() <= cd[j].getGiaThanh())
					{
						swap = cd[i];
						cd[i] = cd[j];
						cd[j] = swap;
					
					}
					
				}
			}
		}
	
		
	}
	public void sapXepTangDan()
	{
		CD swap = null; 
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				{
					if(cd[i].getGiaThanh() > cd[j].getGiaThanh())
					{
						swap = cd[i];
						cd[i] = cd[j];
						cd[j] = swap;
					}
					
				}
			}
		}
		
		
	}
	
	
}

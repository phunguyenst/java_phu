package bai10;

public class CDList {
	private CD[] cd;
	private int count;
	
	public CDList(int n)
	{
		cd = new CD[n];
		count = 0;
	}
	public boolean themMotCD(CD n) {
		if(count<cd.length)
		{
			cd[count] = n;
			count++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
		 s+= cd[i] +"\n";	
		}
		return String.format("%s", s);
	}
	public boolean xoaCD(int MACD)
	{
		boolean hoantat = true;
		int vitri = timKiemCD(MACD);
		if(vitri!= 1)
		{
			for (int i = vitri; i < cd.length-1; i++) {
				cd[i] =cd[i+1];
			}
			count--;
		}
		else {
			return false;
		}
		return hoantat;
	}
	public double tinhTongGiaThanh(){
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum+= cd[i].getGiaThanh();
		}
		return sum;
	}
	public int timKiemCD(int MACD)
	{
		int vitri = -1;
		for (int i = 0; i < count ; i++) {
			if(cd[i].getMaCD() == MACD)
			{
				vitri = i;
				break;
			}
		}
		return vitri;
	}
		
	public void sapXepGiamDanTheoGia() {
		CD swap = null;
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) {
				if(cd[i].getGiaThanh()<cd[j].getGiaThanh())
				{
					swap = cd[i];
					cd[i] = cd[j];
					cd[j]= swap;
				}
			}
		}
	}
	public void sapXepTangDanTheoTuaCD() {
		CD swap = null;
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) {
				if(cd[i].getTuaCD().compareTo(cd[j].getTuaCD())>0)
				{
					swap = cd[i];
					cd[i] = cd[j];
					cd[j]= swap;
				}
			}
		}
	}
	
}

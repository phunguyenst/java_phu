package nguyenQuangVinh.bai02;

public class List {
	private Sach[] dsSach;
	private int count;
	
	public List(int n) {
		dsSach=new Sach[n];
		count=0;
	}
	public int getSoLuong() {
		return count;
	}
	public boolean themSach(Sach s) {
		if(count<dsSach.length) {
			dsSach[count++]=s;
			return true;
		}
		return false;
	}
	public String getSachGiaoKhoa() {
		String s="";
		for (int i = 0; i < count; i++) 
			if(dsSach[i] instanceof SachGiaoKhoa) 
				s += dsSach[i] + "\n";
		return s;
	}
	public String timNXBSachGiaoKhoa(String NXB) {
		String s="";
		for (int i = 0; i < count; i++) 
			if(dsSach[i] instanceof SachGiaoKhoa) 
				if(dsSach[i].getNXB().toLowerCase().contains(NXB.toLowerCase()))
					s += dsSach[i] + "\n";
		return s;
	}
	public double tinhTrungBinhGiaSachThamKhao() {
		int n = 0;
		for (int i = 0; i < count; i++) 
			if(dsSach[i] instanceof SachThamKhao) 
				n++;
		return tinhTongGiaSachThamKhao()/n;
	}
	public double tinhTongGiaSachThamKhao() {
		double sum = 0;
		for (int i = 0; i < count; i++) 
			if(dsSach[i] instanceof SachThamKhao) 
				sum += dsSach[i].getThanhTien();
		return sum;
	}
	public double tinhTongGiaSachGiaoKhoa() {
		double sum = 0;
		for (int i = 0; i < count; i++) 
			if(dsSach[i] instanceof SachGiaoKhoa) 
				sum += dsSach[i].getThanhTien();
		return sum;
	}

}

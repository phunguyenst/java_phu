package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DanhSachSinhVien {
	private List<SinhVien> list;
	
	
	public DanhSachSinhVien() {
		list = new ArrayList<SinhVien>();
	}
	public boolean themDanhSachSinhVien(SinhVien sv) {
		/*cach 1
		  for (SinhVien st : list) {
		 
			if(st.getMaSV() == sv.getMaSV()) 
				return false;
			}
				list.add(sv);
			return true;
		*/
		//cach 2
		if(list.contains(sv))
			return false;
		list.add(sv);
		return true;
			
			
	}
	public boolean xoaSV(int maSV) {
		/*cach 1
		SinhVien temp = new SinhVien(maSV, "", 0);
		if(list.contains(temp)) {
			
		
		list.remove(temp);
		return true;}
		else 
			return false;
		 */
		/*cach 2
		SinhVien temp = new SinhVien(maSV, "", 0);
		if(list.contains(temp)) {
		list.remove(list.indexOf(temp));
		return true;
		}
		return false;
		*/
		Iterator<SinhVien> it = list.iterator();
		while (it.hasNext()) {
			SinhVien sv = (SinhVien) it.next();
			if(sv.getMaSV() == maSV) {
				it.remove();
				return true;
			}
			
 		}
		return false;
		
	}
		
		
	@Override
	public String toString() {
		//c1
		String s = "";
		for (SinhVien sv : list) {
			s += sv + "\n";
		}
		/*
		for (int i = 0; i < list.size(); i++) {
			s+= list.get(i) + "\n";
		}
		return "DanhSachSinhVien []";
		*/
		
		return s;
	}
	
}

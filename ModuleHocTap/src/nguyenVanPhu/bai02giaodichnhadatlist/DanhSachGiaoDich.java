package nguyenVanPhu.bai02giaodichnhadatlist;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
	private List<GiaoDich> list;
	
	public DanhSachGiaoDich() {
		list = new ArrayList<GiaoDich>();
	}
	public boolean themMotGiaoDich(GiaoDich gd) {
		if(list.contains(gd))
			return false;
		else
		list.add(gd);
		return true;
	}
	public String toString() {
		String s = "";
		for (GiaoDich giaoDich : list) {
			s += giaoDich +"\n";
		}
		return s;
	}
	public String getGiaoDichDat() {
		String s = "";
		for (GiaoDich giaoDich : list) {
			if(giaoDich instanceof GiaoDichDat)
			s += giaoDich +"\n";
		}
		return s;
	}
	public String getGiaoDichNha() {
		String s = "";
		for (GiaoDich giaoDich : list) {
			if(giaoDich instanceof GiaoDichNha)
			s += giaoDich +"\n";
		}
		return s;
	}
}

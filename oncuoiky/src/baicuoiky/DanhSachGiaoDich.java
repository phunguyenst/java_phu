package baicuoiky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DanhSachGiaoDich {
	private List<GiaoDich> dsGiaoDich;
	
	public DanhSachGiaoDich() {
		dsGiaoDich = new ArrayList<GiaoDich>();
	}
	
	public boolean themGiaoDich(GiaoDich gd) {
		if(dsGiaoDich.contains(gd)) {
			
			return false;
		}
		else
			dsGiaoDich.add(gd);
			return true;	
	}
	
	public String toString() {
		String s = "";
		for (GiaoDich giaoDich : dsGiaoDich) {
			s+= giaoDich +"\n";
		}
		return s;
	}
	public String getGiaoDichVang() {
		String s = "";
		for (GiaoDich giaoDich : dsGiaoDich) {
			if(giaoDich instanceof GiaoDichVang)
			s+= giaoDich+"\n";
		}
		return s;
	}
	public String getGiaoDichDaQuy() {
		String s = "";
		for (GiaoDich giaoDich : dsGiaoDich) {
			if(giaoDich instanceof GiaoDichDaQuy) {
				s+= giaoDich +"\n";
			}
		}
		return s;
	}
	public boolean xoaGiaoDich(String maGiaoDich) {
		Iterator<GiaoDich> it = dsGiaoDich.iterator();
		while(it.hasNext()) {
			GiaoDich gd = (GiaoDich)  it.next();
			if(gd.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)) {
				it.remove();
				return true;
			}
		}
			return false;
			
	}
	public void sapXepTangDanTheoMaGiaoDich() {
		Collections.sort(dsGiaoDich, new Comparator<GiaoDich>() {

			@Override
			public int compare(GiaoDich o1, GiaoDich o2) {
				// TODO Auto-generated method stub
				return ((String)o1.getMaGiaoDich()).compareTo((String)o2.getMaGiaoDich());
			}
		});
	}
	public boolean capNhatGiaGiaoDich(String maGiaoDich, double giaMoi) {
		for (GiaoDich giaoDich : dsGiaoDich) {
			if(giaoDich.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)) {
				giaoDich.setDonGia(giaMoi);
				return true;
			}
		}
		return false;
	}
	public ArrayList<GiaoDich> getGiaoDichTrongNgay(int ngay, int thang, int nam){
		ArrayList<GiaoDich> gd = new ArrayList<GiaoDich>();
		for (GiaoDich giaoDich : dsGiaoDich) {
			if(giaoDich.getNgayGiaoDich().getDayOfYear()== ngay && giaoDich.getNgayGiaoDich().getMonthValue()== thang && giaoDich.getNgayGiaoDich().getYear() == nam) {
				gd.add(giaoDich);
			}
		}
		return gd;
	}
	
}

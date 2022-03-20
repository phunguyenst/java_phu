package nguyenQuangVinh.bai04;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		ListGD ds = new ListGD(100);
		ds.themGD(new GiaoDichDat("001", LocalDate.of(2013, 9, 21), 100000, 1000, "A"));
		ds.themGD(new GiaoDichDat("002", LocalDate.of(2015, 8, 31), 200000, 2000, "B"));
		ds.themGD(new GiaoDichDat("003", LocalDate.of(2013, 9, 1), 300000, 3000, "C"));
		ds.themGD(new GiaoDichNha("004", LocalDate.of(2013, 9, 30), 500000, 500, "cao cap", "TPHCM"));
		ds.themGD(new GiaoDichNha("005", LocalDate.of(2020, 10, 23), 500000, 500, "thuong", "Ha Noi"));
		ds.themGD(new GiaoDichNha("006", LocalDate.of(2013, 8, 31), 500000, 500, "cao cap", "Nha Trang"));
		
		System.out.println("So luong giao dich nha: ");
		System.out.println(ds.tinhSoLuongGDNha());
		
		System.out.println("So luong giao dich dat: ");
		System.out.println(ds.tinhSoLuongGDDat());
		
		System.out.println("Trung binh thanh tien giao dich dat: ");
		System.out.printf("%.1f\n",ds.tinhTBThanhTienGDDat());
		
		System.out.println("Danh sach giao dich thang 9 nam 2013");
		System.out.println(ds.giaoDichThang9());
	}
//		GiaoDichNhaDat[] g=new GiaoDichNhaDat[6];
//		g[0]= new GiaoDichDat("001", LocalDate.of(2013, 9, 21), 100000, 1000, "A");
//		g[1]=new GiaoDichDat("002", LocalDate.of(2015, 8, 31), 200000, 2000, "B");
//		g[2]=new GiaoDichDat("003", LocalDate.of(2013, 9, 1), 300000, 3000, "C");
//		g[3]=new GiaoDichNha("004", LocalDate.of(2013, 9, 30), 500000, 500, "cao cap", "TPHCM");
//		g[4]=new GiaoDichNha("005", LocalDate.of(2020, 10, 23), 500000, 500, "thuong", "Ha Noi");
//		g[5]=new GiaoDichNha("006", LocalDate.of(2013, 8, 31), 500000, 500, "cao cap", "Nha Trang");
//		for (int i = 0; i < g.length; i++) {
//			System.out.println(g[i]);
//			//System.out.println("Tong so luong gd Dat:" +tinhTongSoLuongGDDat(g));
//			
//		}
//		System.out.println("Xuat giao dich thang 9\n" +xuatGDThang9(g));
//			
//			
//	}
//	public static int tinhTongSoLuongGDDat(GiaoDichNhaDat[] g) {
//		int tong=0;
//		for (int i = 0; i < g.length; i++) {
//			if(g[i] instanceof GiaoDichDat)
//				tong ++;
//		}
//		return tong;
//		
//	}
//	public static int tinhTongSoLuongGDNha(GiaoDichNhaDat[] g) {
//		int tong=0;
//		for (int i = 0; i < g.length; i++) {
//			if(g[i] instanceof GiaoDichNha)
//				tong ++;
//		}
//		return tong;
//		
//	}
//	public static double tinhTBThanhTienDat(GiaoDichNhaDat[] g) {
//		double tong=0;
//		int n=0;
//		for (int i = 0; i < g.length; i++) {
//			if(g[i] instanceof GiaoDichNhaDat) {
//			tong+=g[i].getThanhTien();
//			n++;
//			
//		}
//		
//	}
//	if (n==0)
//		return 0;
//	return tong/n;
//
//}
//	public static String xuatGDThang9(GiaoDichNhaDat[] g) {
//		
//		String s="";
//		String r="";
//		for (int i = 0; i < g.length; i++) 
//			if (g[i].getNgayGiaoDich().isAfter(LocalDate.of(2013, 8, 31))
//					&& g[i].getNgayGiaoDich().isBefore(LocalDate.of(2013, 10, 1))) {
//				if (g[i] instanceof GiaoDichNha)
//					s += g[i];
//				if (g[i] instanceof GiaoDichDat)
//					r += g[i];
//			}
//		return String.format("%s \n%s \n%s \n%s \n%s \n%s","Giao dich dat",GiaoDichDat.getLayTieuDe(),r,"Giao dich nha",GiaoDichNha.getLayTieuDe(),s);
//	}
//			
//		
	
}

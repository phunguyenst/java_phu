package nguyenQuangVinh.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DanhSachGiaoDich QL = new DanhSachGiaoDich(100);
		QL.themGD(new GiaoDichTienTe("001", LocalDate.now(), 1500000000, 10, 0, "VND"));
		QL.themGD(new GiaoDichTienTe("002", LocalDate.now(), 100000, 15, 22000, "USD"));
		QL.themGD(new GiaoDichVang("003", LocalDate.now(), 2000000000, 5, "9999"));
		QL.themGD(new GiaoDichVang("004", LocalDate.now(), 300000, 5, "SJC"));
		
		System.out.println("Tong so luong giao dich tien te: " + QL.tinhTongSoLuongGDTienTe());
		
		System.out.println("Tong so luong giao dich vang: " + QL.tinhTongSoLuongGDVang());
		
		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.printf("Trung binh thanh tien giao dich tien te: " + df.format(QL.tinhTBThanhTienGDTienTe()));
		
		System.out.println();
		System.out.println(QL.output());
		
		System.out.println("Danh sach giao dich co don gia hon 1 ty: ");
		System.out.println(QL);
//		GiaoDich[] gd= new GiaoDich[4];
//		gd[0]= new GiaoDichTienTe("001", LocalDate.now(), 1500000000, 10, 0, "VND");
//		gd[1]=new GiaoDichTienTe("002", LocalDate.now(), 100000, 15, 22000, "USD");
//		gd[2]= new GiaoDichVang("003", LocalDate.now(), 2000000000, 5, "9999");
//		gd[3]=new GiaoDichVang("004", LocalDate.now(), 300000, 5, "SJC");
//		for (int i = 0; i < gd.length; i++) {
//			System.out.println(gd[i]);
//			//System.out.println("Tống luong giao dich tien te la: " +tinhTongSoLuongGDTienTe(gd));
//			//System.out.println("Tong so giao dich vang la:" +tinhTongSoLuongGDVang(gd));
//			
//			
//			
//		}
//		DecimalFormat df = new DecimalFormat("#,##0.0");
//			System.out.println("Trung binh thanh tien gd tien te la:" +df.format(tinhTBGDTienTe(gd)));
//			
//		System.out.println("Xuat don gia lon hon 1ty");
//			xuatDonGiaLon1ty(gd);
//
//	}
//	public static double tinhTongSoLuongGDTienTe(GiaoDich[] gd) {
//		double tong = 0;
//		for (int i= 0; i< gd.length; i++) {
//			
//		
//			if(gd[i] instanceof GiaoDichTienTe)
//				tong += gd[i].getSoLuong();
//		}
//		return tong;
//	}
//	public static double tinhTongSoLuongGDVang(GiaoDich[] gd) {
//		double tong = 0;
//		for (int i= 0; i< gd.length; i++) {
//			
//		
//			if(gd[i] instanceof GiaoDichVang)
//				tong += gd[i].getSoLuong();
//		}
//		return tong;
//	}
//	public static  double tinhTBGDTienTe(GiaoDich[] gd) {
//		float tong=0;
//		int n=0;
//		for (int i = 0; i < gd.length; i++) {
//			if(gd[i] instanceof GiaoDichTienTe)
//				tong+=gd[i].getThanhTien();
//			n++;
//			
//		}
//		
//		
//	
//		return tong/n;
//	
//}
//	public static void xuatDonGiaLon1ty(GiaoDich[] gd) {
//		for (int i = 0; i < gd.length; i++) {
//			if(gd[i].getDonGia()>1000000)
//				System.out.println(gd[i]);
//			//else
//				//System.out.println("Khong co don gia lon hon 1 ty");
//			
//		}
//		
	}
}

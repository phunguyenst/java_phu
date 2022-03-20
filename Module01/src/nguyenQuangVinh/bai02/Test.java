package nguyenQuangVinh.bai02;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List dm = new List(100);
		dm.themSach(new SachGiaoKhoa("001", "Kim Đồng", 50000, 50, LocalDate.of(2020,2,10), true));
		dm.themSach(new SachThamKhao("002", "Phương Đông", 50000, 20, LocalDate.of(2020, 10, 5), 15000));
		dm.themSach(new SachThamKhao("003", "TPHCM", 105000, 20, LocalDate.of(2019, 3, 31), 25000));
		dm.themSach(new SachThamKhao("004", "TPHCM", 25000, 200, LocalDate.of(2019, 9, 14), 5000));
		dm.themSach(new SachGiaoKhoa("005", "Kim Đồng", 150000, 20, LocalDate.of(2020,10,15), true));
		dm.themSach(new SachGiaoKhoa("006", "Thanh Niên", 5000, 100, LocalDate.of(2018,6,1), false));
		
		System.out.println("Tổng thành tiền sách giáo khoa:");
		System.out.println(dm.tinhTongGiaSachGiaoKhoa());
		
		System.out.println("Tổng thành tiền sách tham khảo:");
		System.out.println(dm.tinhTongGiaSachThamKhao());
		
		System.out.println("Tính giá trung bình sách tham khảo:");
		System.out.println(dm.tinhTrungBinhGiaSachThamKhao());
		
		System.out.println("Danh sách các sách giáo khoa:");
		System.out.println(SachGiaoKhoa.layTieuDe());
		System.out.println(dm.getSachGiaoKhoa());	
				
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập tên nhà xuất bản sgk cần tìm:");
		String tenNXB=nhap.nextLine();
		System.out.println("Danh sách sgk của nxb "+tenNXB+":");
		System.out.println(SachGiaoKhoa.layTieuDe());
		System.out.println(dm.timNXBSachGiaoKhoa(tenNXB));
//		Sach[] s= new Sach[4];
//		s[0]= new SachGiaoKhoa("01","A", 100000, 2, LocalDate.of(2020,1,12), true);
//		s[1]= new SachGiaoKhoa("02","K", 100000, 2, LocalDate.of(2020,1,18), false);
//		s[2]= new SachThamKhao("03", "K", 100000, 2, LocalDate.of(2020,1,18), 10000);
//		s[3]= new SachThamKhao("05","A", 50000, 2, LocalDate.of(2020,1,7), 15000);
//		
//		for (int i = 0; i < s.length; i++) {
//			
//			System.out.println(s[i]);
//			
//			
//		}
//		System.out.println("Tong tien SGK la:" +tinhTongTienSGK(s));
//		System.out.println("Trung binh cong don gia la:" +tinhTBCongSTK(s));
//		System.out.println("Xuat sach tham khao nha xuat ban K\n" +outPutSGK(s));
//		System.out.println("Xuat thanh tien cao nhat\n" +timThanhTienCaoNhat(s));
//			
//		/**
//		 * tổng tien sach gk
//		 */
//	}
//	public static double tinhTongTienSGK(Sach[] s) {
//		double sum=0;
//		for (int i = 0; i < s.length; i++) {
//			if(s[i] instanceof SachGiaoKhoa)
//				sum+=s[i].getThanhTien();
//			
//		}
//		return sum;
//		
//	}
//	/**
//	 * Tong tien sach TK
//	 * @param s
//	 * @return
//	 */
//	public static double tinhTongTienSTK(Sach[] s) {
//		double sum=0;
//		for (int i = 0; i < s.length; i++) {
//			if(s[i] instanceof SachThamKhao)
//				sum+=s[i].getThanhTien();
//			
//		}
//		return sum;
//		
//	}
//	/**
//	 * 
//	 * @param s
//	 * @return
//	 */
//	public static double tinhTBCongSTK(Sach[] s) {
//		double tb=0;
//		for (int i = 0; i < s.length; i++) {
//			if(s[i] instanceof SachThamKhao)
//				tb++;
//			
//		}
//		return tinhTongTienSTK(s)/tb;
//		
//		
//	}
//	
//	/**
//	 * 
//	 * @param s
//	 * @return
//	 */
//	public static String outPutSGK(Sach[] s) {
//		String r="";
//		for (int i = 0; i < s.length; i++) {
//			if(s[i].getNXB().equals("K"))
//			 
//				if(s[i] instanceof SachGiaoKhoa)
//					r += s[i];
//					
//			
//			
//		}
//		return String.format("%s \n%s \n%s","Nha xuat ban K",SachGiaoKhoa.layTieuDe(),r);
//		
//	
//
//	}
//	public static double timThanhTienCaoNhat(Sach[] s) {
//		
//		for (int i = 0; i < s.length; i++) {
//			double max= s[0].getThanhTien();
//			if(max < s[i].getThanhTien()) {
//				max=s[i].getThanhTien();
//		}
//			return max;
//				
//		}
//		return 0;
//		
//	
		
		
		
	
	}
}

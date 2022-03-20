package nguyenVanPhu.bai05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//HangHoa h = new HangHoa("123", "banh mi", 20000.00, 6);
			//System.out.println(HangHoa.getTieuDe());
			//System.out.println(h);
			DanhSachHangHoa hh = new DanhSachHangHoa();
				hh.themHangHoa(new HangDienMay("123", "máy giặt", 12000000.00, 23, 5, 25));
				hh.themHangHoa(new HangSanhSu("456", "bình sứ", 2000000.00, 25, "thuận phát", LocalDate.of(2021, 11, 5)));
				hh.themHangHoa(new HangThucPham("789", "Lương khô", 20000.00, 35,"acer" ,LocalDate.of(2018, 11, 5), LocalDate.of(2017,11, 12)));
				//System.out.println(hh.layThongTinToanBo());
				
				/*
				 * Scanner sc = new Scanner(System.in);
				 * 
				 * 
				 * System.out.print("Nhập mã Hàng  cần tìm:");
				 * 
				 * String maHang = sc.nextLine(); System.out.println("\nhàng cần tìm là: \n");
				 * System.out.println(hh.timKiemHangHoaSanhSu(maHang));
				 * 
				 * System.out.println("Nhập mã hàng hóa cần xóa: "); String maHH =
				 * sc.nextLine(); boolean kq = hh.xoaHangHoa(maHH); if(kq ==true) {
				 * 
				 * System.out.println("mã Hàng hóa sau khi xóa: \n"+ hh.layThongTinToanBo());
				 * 
				 * } else { System.out.println("không xóa được!"); }
				 * System.out.println("nhập mã hàng lại: "); String maHHH = sc.nextLine();
				 * 
				 * System.out.println("nhập đơn giá cần sửa: "); double donGia =
				 * sc.nextDouble();
				 * 
				 * 
				 * hh.suaDonGia(maHHH, donGia);
				 * 
				 * boolean tt = hh.suaDonGia(maHHH, donGia); if(tt == true) {
				 * System.out.println("đơn giá sau khi sửa: \n"+hh.layThongTinToanBo()); } else
				 * { System.out.println("\nkhông sửa được"); }
				 */
				
				 List<HangHoa> temp = hh.getDSHangThucPhamKhoBan();
				for (HangHoa hangHoa : temp) {
					System.out.println(hangHoa.toString());
				}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}

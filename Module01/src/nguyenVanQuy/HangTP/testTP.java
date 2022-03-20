package nguyenVanQuy.HangTP;

import java.util.Scanner;

import nguyenVanQuy.tuan4Account.Account;
import nguyenVanQuy.tuan4Account.DanhSachAccount;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class testTP {
	
	
	public static String xuatTieuDe() {
		return String.format("|%-8s|%-15s|%-13s|%-14s|%-13s|%-12s|\n", "MaHang", "TenHang", "DonGia", "NgaySanXuat",
				"Ngay_Het_Han", "Ghi_Chu");
		///System.out.println("--------------------------------------------------------------------------------");
		
	}
	
	public static void nhapThongTin()
	{
		try {
		TPham TP = new TPham();
		String maHang;
		String tenHang;
		double donGia;
		LocalDate ngaySanXuat;
		LocalDate ngayHetHan;
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Nhập mã hàng ");
			maHang = sc.nextLine();
			//TP.setMaHang(maHang);
			System.out.println("Nhập tên hàng ");
			tenHang = sc.nextLine();
			TP.setTenHang(tenHang);
			System.out.println("Nhập đơn giá ");
			donGia = sc.nextDouble();
			TP.getDonGia();
		
			System.out.println("Nhập ngày sản xuất ");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String ngaySX = dtf.format(TP.getNgaySanXuat());
			
			
		} catch (Exception e) {
			System.out.println("Lỗi" + e.getMessage());
		}
		
	}
	static void xuatDanhSach(TPham dSTP[], int soLuong)
	{
		for (int i = 0; i < soLuong; i++) 
		{
			System.out.println(dSTP[i]);
		}
	}
	static void Menu() {
		System.out.println("\t*************************************************");
		System.out.println("\t*\t Chương trình quản lí Hàng thực phẩm\t*");
		System.out.println("\t*\t 1. Nhập cứng\t\t\t\t*");
		System.out.println("\t*\t 2. Nhập mềm\t\t\t\t*");
		System.out.println("\t*\t 3. Tìm kiếm thực phẩm\t\t*");
		System.out.println("\t*\t 4.  Xóa Hàng Thực Phẩm\t\t\t*");
		System.out.println("\t*\t 5. Tính số ngày hết hạn\t\t\t*");
		System.out.println("\t*\t 6. Thoát\t\t*");
		System.out.println("\t*************************************************");
}
	//public static void main(String[] args) {
		
	static void nhapCung(dsTP dsTP) throws Exception {
		//try {
			TPham TP = new TPham();
			TP = new TPham("001", "Gao", 100000, LocalDate.of(2021, 9, 17), LocalDate.of(2021, 8, 17));
			dsTP.themTP(TP);
			TP= new TPham("002", "Mi", 5000, LocalDate.of(2021, 9, 29), LocalDate.of(2021, 10, 29));
			dsTP.themTP(TP);

			TP = new TPham("003", "Nuoc", 10000, LocalDate.of(2021, 9, 17), LocalDate.now());
			dsTP.themTP(TP);
		
	}
	public static void main(String[] args) throws Exception  {
	//try {
		TPham TP = new TPham();
	//} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	dsTP dsTP = new dsTP(3);
	Scanner scanner = new Scanner(System.in);
	int Chon = -1;
	boolean thoat = true;
	String maHang;
	String tenHang;
	double donGia;
	LocalDate ngaySanXuat;
	LocalDate ngayHetHan;
	//TPham TPTim;
	Menu();
	nhapCung(dsTP);
	do 
	{
		System.out.println("Nhập lựa chọn: ");
		Chon = scanner.nextInt();
		scanner.nextLine();
		switch (Chon) {
		case 1:
			{System.out.println(xuatTieuDe());
			xuatDanhSach(dsTP.xuatDS(), dsTP.soluongTPHienTai);
			break;
		}
		case 2:
			{
				System.out.println("Nhập mã hàng ");
				maHang = scanner.nextLine();
				TP.setMaHang(maHang);
				if(dsTP.timKiem(maHang) != -1) {
					System.out.println("Thực phẩm đã tồn tại");
					break;
				}
				else {
					System.out.println("Nhập tên hàng ");
					tenHang = scanner.nextLine();
					TP.setTenHang(tenHang);
					System.out.println("Nhập đơn giá ");
					donGia = scanner.nextDouble();
					TP.getDonGia();
					
					System.out.println("Nhập ngày sản xuất ");
					System.out.println("Lưu ý nhập 3 số liên tiếp là ngày-tháng-năm!!");
					int ngay = scanner.nextInt();
					int thang = scanner.nextInt();
					int nam = scanner.nextInt();
					//TP.setNgaySanXuat(nam,thang,ngay);
					System.out.println("Nhập ngày hết hạn ");
					System.out.println("Lưu ý nhập 3 số liên tiếp là ngày-tháng-năm!!");
					ngay = scanner.nextInt();
					thang = scanner.nextInt();
					nam = scanner.nextInt();
					//TP.setNgayHetHan(nam,thang,ngay);
					dsTP.themTP(TP);
				}
				
				break;
			}
		case 3:
		{

			// Tìm thực phẩm
			int viTri;
			System.out.println("Nhập loại hàng hóa muốn tìm (mã): ");
			maHang = scanner.nextLine();
			viTri = dsTP.timKiem(maHang);
			if (viTri == -1) 
			{
				System.out.println("Không có loại hàng này trong cửa hàng !!!");
				break;
			} 				
			System.out.println("Vị trí:" + viTri);
			System.out.println(xuatTieuDe());
			System.out.println(dsTP.xuatThongTinTP(viTri));
			break;
			
		}
		case 4:{
			// Xóa thực phẩm
			System.out.println("Nhập loại hàng muốn xóa: ");
			maHang = scanner.nextLine();
			if (dsTP.xoaTP(maHang) == true) {
				System.out.println("Đã xóa xong, nhập 2 để xem !!!");
			}
			else {
				System.out.println("Không có mặt hàng này, không thể xóa !!!");
			}
			break;
			
		}
		case 5: {
			break;
		}
		case 6:{
			//Kết thúc
			System.out.println("Tạm biệt !!!");
			thoat = false;
			break;
		}
			default:
			throw new IllegalArgumentException("Unexpected value: " + Chon);
		}
		
	} while (thoat);
	
}
		
	} 






	
//}
	


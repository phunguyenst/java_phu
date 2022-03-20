package nguyenQuangVinh.bai06;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		DanhSachHoaDon ds= new DanhSachHoaDon(100);
		
		ds.themHoaDon(new HoaDonTheoGio("001",LocalDate.of(2019,7,15),"Nguyễn Văn Châu","V306",40000,10));
		ds.themHoaDon(new HoaDonTheoGio("003",LocalDate.of(2020,9,26),"Trần Văn Vũ","B151",60000,5));
		ds.themHoaDon(new HoaDonTheoGio("005",LocalDate.of(2018,1,15),"Nguyễn Trung","A561",10000,28));
		
		ds.themHoaDon(new HoaDonTheoNgay("002",LocalDate.of(2020,11,23),"Nguyễn Thanh Tùng","A611",100000,7));		
		ds.themHoaDon(new HoaDonTheoNgay("004",LocalDate.of(2019,7,8),"Lê Trung Hiếu","C686",300000,10));	
		ds.themHoaDon(new HoaDonTheoNgay("006",LocalDate.of(2017,12,7),"Phan Văn Đạt","C644",200000,5));
		Scanner sc= new Scanner(System.in);
		int n;
		do {
			System.out.println("1.Them vao don theo gio\n"
					+"2.Them vao don theo ngay\n"
					+"3.Xuat tat ca hoa don\n"
					+"4.Xuat hd theo gio\n"
					+"5.Xuat hoa don theo ngay\n"
					+"6.Tinh so luong hd theo gio\n"
					+"7.Tinh so luong hd theo ngay\n"
					+"8.Tinh tong doanh thu\n"
					+"0.Thoat\n");
			System.out.print("Nhap lua chon : ");
			n=sc.nextInt();
			switch(n) {
			case 1:
				sc.nextLine();
				System.out.print("Nhap ma hoa don: ");
				String maHoaDon= sc.nextLine();
				System.out.print("Nhap ngay");
				int ngay=sc.nextInt();
				System.out.print("Nhap thang");
				int thang=sc.nextInt();
				System.out.print("Nhap nam");
				int nam=sc.nextInt();
				sc.nextLine();
				System.out.print("Nhap ho ten:");
				String hoTen=sc.nextLine();
				System.out.print("Nhap ma phong:");
				String maPhong=sc.nextLine();
				System.out.print("Nhap don gia:");
				double donGia=sc.nextDouble();
				System.out.print("Nhap so gio thue:");
				int soGioThue=sc.nextInt();
				ds.themHoaDon(new HoaDonTheoGio(maHoaDon, LocalDate.of(nam,thang, ngay), hoTen, maPhong, donGia, soGioThue));
				break;
				
			case 2:
				sc.nextLine();
				System.out.print("Nhập mã hóa đơn: ");
				String maHoaDon2=sc.nextLine();
				System.out.print("Nhập ngày: ");
				int ngay2=sc.nextInt();
				System.out.print("Nhập tháng: ");
				int thang2=sc.nextInt();
				System.out.print("Nhập năm: ");
				int nam2=sc.nextInt();
				sc.nextLine();
				System.out.print("Nhập họ tên: ");
				String hoTen2=sc.nextLine();
				System.out.print("Nhập mã phòng: ");
				String maPhong2=sc.nextLine();
				System.out.print("Nhập đơn giá: ");
				double donGia2=sc.nextDouble();
				System.out.print("Nhập số ngày thuê: ");
				int soNgayThue=sc.nextInt();
				ds.themHoaDon(new HoaDonTheoNgay(maHoaDon2,LocalDate.of(nam2,thang2,ngay2),hoTen2,maPhong2,donGia2,soNgayThue));
				break;
				
			case 3:
				System.out.println(HoaDonTheoGio.layTieuDe());
				System.out.println(ds.getHDTheoGio());
				System.out.println(HoaDonTheoNgay.layTieuDe());
				System.out.println(ds.getHDTheoNgay());
				break;
				
			case 4:
				System.out.println(HoaDonTheoNgay.layTieuDe());
				System.out.println(ds.getHDTheoNgay());
				break;
				
			case 5:
				System.out.println(HoaDonTheoGio.layTieuDe());
				System.out.println(ds.getHDTheoGio());
				break;
			case 6:
				System.out.println("Số lượng hóa đơn theo giờ: ");
				System.out.println(ds.thongKeSoLuongHDTheoGio());
				break;
			case 7:
				System.out.println("Số lượng hóa đơn theo ngày: ");
				System.out.println(ds.thongKeSoLuongHDTheoNgay());
				break;
			case 8:
				System.out.print("Nhập tháng cần xuất hóa đơn: ");
				int month=sc.nextInt();
				System.out.print("Nhập năm cần xuất hóa đơn: ");
				int year=sc.nextInt();
				System.out.printf("Tổng thành tiền của tháng %d năm %d: %.2f\n", month,year, ds.tinhTongThanhTien(month, year));
			case 0:
				System.out.println("Kết thúc");
				break;
			default:
				System.out.println("Không hợp lệ! Vui lòng nhập lại.");
				break;
		}
	} while(n!=0);
			}

 }

	



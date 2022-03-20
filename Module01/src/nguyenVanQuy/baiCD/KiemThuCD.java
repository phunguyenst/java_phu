package nguyenVanQuy.baiCD;

import java.util.Scanner;
public class KiemThuCD {

	public static String inTieuDe()
	{
		return String.format("%-10s"+"%-30s"+"%-15s"+"%-20s", "Mã CD","Tựa CD","Số bài hát","Giá thành");
	}
	
	public static CD nhapThongTin()
	{
		CD cd = new CD();
		int maCD;
		String tenCD;
		int soBaiHat;
		float giaThanh;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhập mã CD: ");
			maCD = sc.nextInt();
			cd.setMaCD(maCD);
			System.out.println("Nhập tên của CD: ");
			tenCD = sc.nextLine();
			cd.setTenCD(tenCD);
			System.out.println("Nhập số bài hát: ");
			soBaiHat = sc.nextInt();
			cd.setSoBaiHat(soBaiHat);
			System.out.println("Nhập giá mua CD: ");
			giaThanh = sc.nextFloat();
			cd.setGiaThanh(giaThanh);
		} catch (Exception e) {
			System.out.println("Lỗi" + e.getMessage());
		}
		return cd;
	}
	
	static void nhapCung(dsCD dsCD)
	{
		CD cd = new CD();
		cd = new CD(123,"Ngày Xuân",10,90000);
		dsCD.themCD(cd);
		cd = new CD(333,"Âu-Mĩ",5,100000);
		dsCD.themCD(cd);
		cd = new CD(511,"Ballad",8,125000);
		dsCD.themCD(cd);
	}
	
	static void xuatDanhSach(CD dsCD[], int soLuong)
	{
		for (int i = 0; i < soLuong; i++) 
		{
			System.out.println(dsCD[i]);
		}
	}
	
	static void menu()
	{
		System.out.println("^^^^^^^ Quản lý cửa hàng bán đĩa CD ^^^^^^^");
		System.out.println("1: Xuất danh sách đĩa CD");
		System.out.println("2: Thêm CD vào danh sách");
		System.out.println("3: Xóa CD theo mã");
		System.out.println("5: Tìm kiếm theo mã CD");
		System.out.println("6: In danh sach CD theo giá yêu cầu");
		System.out.println("7: Sắp xếp danh sách theo giá thành");
		System.out.println("8: Xuất danh sách CD có giá lớn hơn số tiền cụ thể");
		System.out.println("0: Thoát");
		System.out.println();
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CD cd = new CD();
		dsCD dsCD = new dsCD(3);
		Scanner scanner = new Scanner(System.in);
		int Chon = -1;
		boolean thoat = true;
		int maCD;
		String tenCD;
		int soBaiHat;
		float giaThanh;
		menu();
		nhapCung(dsCD);
		
		do 
		{
			System.out.println("Nhập lựa chọn: ");
			Chon = scanner.nextInt();
			scanner.nextLine();
			switch (Chon) {
			case 1: 
			{
				// Xuất danh sách 
				//nhapCung(dsCD);
				System.out.println(inTieuDe());
				xuatDanhSach(dsCD.xuatDS(), dsCD.soLuongCDHienTai);
				break;
			}
			case 2:
			{
				// Thêm đĩa CD
				System.out.println("Nhập mã CD muốn thêm: ");
				maCD = scanner.nextInt();
				cd.setMaCD(maCD);
				if (dsCD.timKiem(maCD) != -1) 
				{
					System.out.println("Đĩa CD này đã có !!!");
					break;
				} 
				else 
				{
					System.out.println("Nhập tên tên bài hát muốn thêm: ");
					tenCD = new Scanner(System.in).nextLine();
					cd.setTenCD(tenCD);
					System.out.println("Nhập số bài hát: ");
					soBaiHat = scanner.nextInt();
					try {
						cd.setSoBaiHat(soBaiHat);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Nhập giá bán: ");
					giaThanh = scanner.nextFloat();
					cd.setGiaThanh(giaThanh);
					cd = new CD(maCD,tenCD,soBaiHat,giaThanh);
					try {
						if(dsCD.themCD(cd) == true)
							System.out.println("Hoàn Thành "); 
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Xảy ra lỗi " + e.getMessage());
					}				
				}
				break;
			}
			case 3:
			{
				// Xóa đĩa CD
				System.out.println("Nhập mã CD cần xóa: ");
				maCD = scanner.nextInt();
				//scanner.nextLong();
				if (dsCD.xoaCD(maCD) == true) {
					System.out.println("Xóa thành công");
				}
				else {
					System.out.println("CD không có trong danh sách, xóa thất bại");
				}
				break;
			}
			case 5:
			{
				// Tìm kiếm CD
				int viTri;
				System.out.println("Nhập mã số CD muốn tìm: ");
				maCD = scanner.nextInt();
				viTri = dsCD.timKiem(maCD);
				if (viTri == -1) 
				{
					System.out.println("Đĩa CD không có trong danh sách !!!");
					break;
				} 				
				System.out.println("Vị trí:" + viTri);
				System.out.println(inTieuDe());
				System.out.println(dsCD.xuatThongTinCD(viTri));
				break;
			}
			case 6:
			{
				System.out.println("Nhập số tiền muốn mua đĩa CD: ");
				double soTien = new Scanner(System.in).nextDouble();
				CD temp[] = dsCD.getCDBeHonX(soTien);
				if(dsCD.dem != 0) {
					for(int i =0; i < dsCD.dem; i++) {
						System.out.println(temp[i]);
					}
				}else
						System.out.println("Không tìm thấy");
					break;
				
				
			}
			case 7:
			{
				dsCD.sapXepTheoGia();
				System.out.println("Sắp xếp thành công !!!");
				break;
			}
			case 8:
			{
				double soTien;
				System.out.println("Nhập số tiền muốn kiểm tra: ");
				soTien = scanner.nextDouble();
				//cd.setGiaThanh(giaThanh);
				dsCD.xuatCDLonHonX(soTien);
				System.out.println(inTieuDe());
				xuatDanhSach(dsCD.xuatDS(),dsCD.dem);
				
				//dsCD.xuatCDLonHonX(soTien);
				break;
			}
			case 0:
			{
				System.out.println("Tạm biệt");
				thoat = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + Chon);
			}
			
		} while (thoat);
		
	}

	

}



package nguyenVanQuy.tuan4Account;

import java.util.Scanner;
public class KiemThuAccount {

		
		public static String TieuDe()
		{
			return String.format("%-15s%-30s%-25s","So tai khoan", "Ten khach hang", "So du");
		}
		
		public static Account nhapThongTin()
		{
			Account acc = new Account();
			long soTaiKhoan;
			String tenTaiKhoan;
			double tienDu;
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Nhập số tài khoản: ");
				soTaiKhoan = sc.nextLong();
				acc.setSoTaiKhoan(soTaiKhoan);
				System.out.println("Nhập tên tài khoản: ");
				tenTaiKhoan = sc.nextLine();
				acc.setTenTaiKhoan(tenTaiKhoan);
				System.out.println("Nhập số du trong tài khoản: ");
				tienDu = sc.nextDouble();
				acc.setTienDu(tienDu);
			} catch (Exception e) {
				System.out.println("Lỗi" + e.getMessage());
			}
			return acc;
		}
		
		static void xuatDanhSach(Account dSAcc[], int soLuong)
		{
			for (int i = 0; i < soLuong; i++) 
			{
				System.out.println(dSAcc[i]);
			}
		}
		
		static void menu()
		{
			System.out.println("<<<<<<< Quản lý tài khoản ngân hàng >>>>>>>");
			System.out.println("1: Xuất danh sách tài khoản");
			System.out.println("2: Thêm tài khoản");
			System.out.println("3: Xóa tài khoản");
			System.out.println("4: Sửa tài khoản");
			System.out.println("5: Tìm kiếm tài khoản trong danh sách");
			System.out.println("6: Chuyển tiền");
			System.out.println("7: Nạp tiền");
			System.out.println("8: Rút tiền");
			System.out.println("9: Đáo hạn");
			System.out.println("0: Thoát");
			System.out.println();
		}
		
		static void nhapCung(DanhSachAccount dSAcc)
		{
			Account acc = new Account();
			acc = new Account(72354, "Văn Qúy", 100000);
			dSAcc.themAcc(acc);
			acc = new Account(69713, "Thủy Tiên", 40000);
			dSAcc.themAcc(acc);
			acc = new Account(93757, "Phương Hằng", 700000);
			dSAcc.themAcc(acc);
		}
		
		
		

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
			Account acc = new Account();
			DanhSachAccount dsAcc = new DanhSachAccount(3);
			Scanner scanner = new Scanner(System.in);
			int Chon = -1;
			boolean thoat = true;
			long soTaiKhoan;
			String tenTaiKhoan;
			double tienDu;
			Account accTim;
			menu();
			nhapCung(dsAcc);
			//luaChon = scanner.nextInt();
			do 
			{
				System.out.println("Nhập lựa chọn: ");
				Chon = scanner.nextInt();
				scanner.nextLine();
				switch (Chon) {
				case 1: 
				{
					// Xuất danh sách 
					//nhapCung(dsXe);
					System.out.println(TieuDe());
					xuatDanhSach(dsAcc.xuatDS(), dsAcc.soLuongAccHienTai);
					break;
				}
				case 2:
				{
					// Thêm tài khoản
					System.out.println("Nhập số tài khoản mới: ");
					soTaiKhoan = scanner.nextLong();
					acc.setSoTaiKhoan(soTaiKhoan);
					//scanner.nextLong();
					if (dsAcc.timKiem(soTaiKhoan) != -1) 
					{
						System.out.println("Số tài khoản này đã được đăng kí");
						break;
					} 
					else 
					{
						System.out.println("Nhập tên tài khoản muốn thêm: ");
						tenTaiKhoan = new Scanner(System.in).nextLine();
						acc.setTenTaiKhoan(tenTaiKhoan);
						//tenTaiKhoan = scanner.nextLine();
						//scanner.nextLine();
						System.out.println("Nhập số dư trong tài khoản: ");
						tienDu = scanner.nextDouble();
						acc.setTienDu(tienDu);
						acc = new Account(soTaiKhoan, tenTaiKhoan, tienDu);
						try {
							if(dsAcc.themAcc(acc) == true)
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
					// Xóa tài khoản
					System.out.println("Nhập số tài khoản cần xóa: ");
					soTaiKhoan = scanner.nextLong();
					//scanner.nextLong();
					if (dsAcc.xoaAcc(soTaiKhoan) == true) {
						System.out.println("Xóa thành công");
					}
					else {
						System.out.println("Tài khoản không được đăng kí, xóa thất bại");
					}
					break;
				}
				case 4:
				{
					// Sửa tài khoản
					System.out.println("Nhập vào tài khoản muốn chỉnh sửa: ");
					soTaiKhoan = scanner.nextLong();
					acc = dsAcc.timAcc(soTaiKhoan);
					if(acc != null)
					{
						System.out.println("Thông tin tài khoản trước khi sửa: ");
						System.out.println(acc);
						
						Scanner scn = new Scanner(System.in);
						System.out.println("Tên mới của khách hàng : ");
						tenTaiKhoan = scn.nextLine();
						acc.setTenTaiKhoan(tenTaiKhoan);
						System.out.println("Số tiền mới trong tài khoản: ");
						tienDu = scn.nextDouble();
						acc.setTienDu(tienDu);
						dsAcc.suaAcc(acc);
					}
					else {
						System.out.println("Tài khoản không tồn tại !!!");
					}
					break;
				}
				case 5:
				{
					// Tìm tài khoản
					int viTri;
					System.out.println("Nhập số tài khoản muốn tìm: ");
					soTaiKhoan = scanner.nextLong();
					viTri = dsAcc.timKiem(soTaiKhoan);
					if (viTri == -1) 
					{
						System.out.println("Tài khoản này chưa đăng kí !!!");
						break;
					} 				
					System.out.println("Vị trí:" + viTri);
					System.out.println(TieuDe());
					System.out.println(dsAcc.xuatThongTinAcc(viTri));
					break;
				}
				case 6:
				{
					// Chuyển tiền
					long Chuyen,Nhan;
					System.out.print("Nhập số tài khoản người chuyển:  ");
					Chuyen=scanner.nextLong();
					//System.out.println(TieuDe());
					//System.out.println(dsAcc.xuatThongTinAcc(dsAcc.timKiem(tkChuyen)));
					dsAcc.xuatThongTinAcc(dsAcc.timKiem(Chuyen));
					System.out.print("Nhập số tài khoản người nhận: ");
					Nhan=scanner.nextLong();
					//System.out.println(TieuDe());
					//System.out.println(dsAcc.xuatThongTinAcc(dsAcc.timKiem(tkNhan)));
					dsAcc.xuatThongTinAcc(dsAcc.timKiem(Nhan));

					double tienChuyen;
					System.out.println("Nhập số tiền muốn chuyển: ");
					tienChuyen=scanner.nextDouble();
					acc.chuyenTien(tienChuyen,dsAcc.timAcc(Nhan));
					xuatDanhSach(dsAcc.xuatDS(),dsAcc.soLuongAccHienTai);	
					break;
				}
				case 7:
				{
					// Nạp tiền
					long Nap;
					System.out.print("Nhập số tài khoản muốn nạp tiền: ");
					Nap=scanner.nextLong();
					dsAcc.xuatThongTinAcc(dsAcc.timKiem(Nap));
					double soTienNap;
					System.out.println("Nhập số tiền muốn nạp: ");
					soTienNap=scanner.nextDouble();
					dsAcc.timAcc(Nap).napTien(soTienNap);
					xuatDanhSach(dsAcc.xuatDS(),dsAcc.soLuongAccHienTai);
					break;
				}
				case 8:
				{
					// Rút tiền
					long Rut;
					System.out.print("Nhap so tai khoan can rut  ");
					Rut=scanner.nextLong();
					dsAcc.xuatThongTinAcc(dsAcc.timKiem(Rut));
					double soTienRut;
					System.out.println("Nhap so tien muon rut");
					soTienRut=scanner.nextDouble();
					dsAcc.timAcc(Rut).rutTien(soTienRut);
					xuatDanhSach(dsAcc.xuatDS(),dsAcc.soLuongAccHienTai);
					break;
				}
				case 9:
				{
					// Đáo hạn
					long DH;
					System.out.print("Nhập số tài khoản muốn xem đáo hạn: ");
					DH=scanner.nextLong();
					dsAcc.timAcc(DH).daoHan();
					xuatDanhSach(dsAcc.xuatDS(),dsAcc.soLuongAccHienTai);
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

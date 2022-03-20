package nguyenQuangVinh.bai08;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		DanhSachHangHoa ds= new DanhSachHangHoa(100);
		ds.themHH(new HangThucPham("001", "Gao", 10000, 100, "A", LocalDate.of(2018, 9, 21), LocalDate.of(2020, 12, 21)));
		ds.themHH(new HangThucPham("002", "Mi", 5000, 25, "B", LocalDate.of(2020, 3, 21), LocalDate.of(2020, 2, 12)));
		
		ds.themHH(new HangDienMay("003", "Tu lanh", 2000000, 1, 12, 100));
		ds.themHH(new HangDienMay("004", "May lanh", 5000000, 5, 24, 200));
		
		ds.themHH(new HangSanhSu("005", "Dia", 30000, 7, "C", LocalDate.of(2020, 11, 5)));
		ds.themHH(new HangSanhSu("006", "Noi", 50000, 30, "D", LocalDate.of(2020, 6, 27)));
		
		
		Scanner sc = new Scanner(System.in);
		int k;
		do{
			System.out.println("M�?i lựa ch�?n\n"+
					"1.Thêm hàng hóa điện máy\n"+
					"2.Thông tin toàn bộ danh sách hàng hóa\n"+
					"3.Thông tin từng loại hàng hóa\n"+
					"4.Tìm kiếm hàng hóa với mã cho trước\n"+
					"5.Sắp xếp hàng hóa theo tên hàng tăng dần\n"+
					"6.Sắp xếp hàng hóa theo số lượng tồn giảm dần\n"+
					"7.Thông tin thực phẩm khó bán\n"+
					"8.Xóa hàng hóa với mã hàng cho trước\n"+
					"9.Sửa thông tin đơn giá của hàng hóa với mã cho trước\n"+
					"0.Kết thúc");
			System.out.print("\nNhap lua chon: ");
			k = sc.nextInt();	
			switch(k) {	
				case 1:
					System.out.println("Nhập mã hàng: ");
					sc.nextLine();
					String maHang =sc.nextLine();
					System.out.println("Nhập tên hàng:");
					String tenHang =sc.nextLine();
					System.out.println("Nhập đơn giá:");
					double donGia = sc.nextDouble();
					System.out.println("Nhập số lượng tồn:");
					int soLuongTon = sc.nextInt();
					System.out.println("Nhập th�?i gian bảo hành(tháng):");
					int thoiGianBaoHanh = sc.nextInt();
					System.out.println("Nhập công suất:");
					double congSuat = sc.nextDouble();
					if(ds.themHH(new HangDienMay(maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh, congSuat))){
						System.out.println("Danh sách sau khi thêm");
						System.out.println(HangHoa.getTieuDe());
						System.out.println(ds.layThongTinAllHangHoa());
					}
					else 
						System.out.println("Thêm không thành công");
					break;
				case 2:
					System.out.println(HangHoa.getTieuDe());
					System.out.println(ds.layThongTinAllHangHoa());
					break;
				case 3:
					System.out.println("Thông tin từng loại hàng hóa");
					System.out.println(ds.layThongTinTungLoai());
					break;
				case 4:
					System.out.println("Nhập mã cần tìm");
					sc.nextLine();
					String maCanTim = sc.nextLine();
					if(ds.timKiemTheoMa(maCanTim) != null)
						System.out.println(ds.timKiemTheoMa(maCanTim));
					else 
						System.out.println("Không tìm thấy");
					break;
				case 5:
					System.out.println("Sap xep theo ten hang tang dan");
					ds.sapXepTheoTenHangTangDan();
					System.out.println(HangHoa.getTieuDe());
					System.out.println(ds.layThongTinAllHangHoa());
					break;
				case 6:
					System.out.println("Sap xep theo so luong ton giam dan");
					ds.sapXepTheoSoLuongTonGiamDan();
					System.out.println(HangHoa.getTieuDe());
					System.out.println(ds.layThongTinAllHangHoa());
					break;
				case 7:
					System.out.println("Thong tin hang thuc pham kho ban");
					if(!ds.layThongTinHangThucPhamKhoBan().equals(""))
						System.out.println(ds.layThongTinHangThucPhamKhoBan());
					else 
						System.out.println("Không có hàng thực phẩm khó bán");
					break;
				case 8:
					System.out.println("Nhap ma can xoa: ");
					sc.nextLine();
					String maCanXoa = sc.nextLine();
					if(ds.xoaHangHoaTheoMa(maCanXoa)){
						System.out.println("�?ã xóa thành công");
						System.out.println(HangHoa.getTieuDe());
						System.out.println(ds.layThongTinAllHangHoa());
					}
					else 
						System.out.println("Không tìm thấy mã cần xóa");
					break;
				case 9:
					System.out.println("Nhap ma can sua: ");
					sc.nextLine();
					String maCanSua = sc.nextLine();
					System.out.println("Nhap don gia moi");
					double donGiaMoi = sc.nextDouble();
					if(ds.suaDonGiaTheoMaHang(maCanSua, donGiaMoi)){
						System.out.println("Danh sách sau khi sửa");
						System.out.println(HangHoa.getTieuDe());
						System.out.println(ds.layThongTinAllHangHoa());
					}
					else 
						System.out.println("Không tìm thấy mã cần sửa");
					break;
				default :
					System.out.println("Nhập lại");
					break;			
			}
		}while(k!=0);	
	}

	

}

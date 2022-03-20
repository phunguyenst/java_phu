package nguyenQuangVinh.bai01;



public class Test {

	public static void main(String[] args) {
		
		//System.out.println("Tong doanh thu cac chuyen xe: "+ ds.tongDoanhThu());
		
		//System.out.println("Tong doanh thu cac chuyen xe noi thanh: "+ ds.tongDoanhThuNoiThanh());
		
		//System.out.println("Tong doanh thu cac chuyen xe ngoai thanh: "+ ds.tongDoanhThuNgoaiThanh());
		DanhSachChuyenXe ds = new DanhSachChuyenXe(100);
		ds.themCX(new ChuyenXeNoiThanh("1", "A", "123", 10000, 10, 100));
		ds.themCX(new ChuyenXeNoiThanh("2", "B", "234", 20000, 20, 200));
		ds.themCX(new ChuyenXeNgoaiThanh("3", "C", "345", 30000, "BRVT", 3));
		ds.themCX(new ChuyenXeNgoaiThanh("4", "D"," 456", 40000, "TPHCM", 4));

		System.out.println("Tong doanh thu cac chuyen xe: "+ ds.tongDoanhThu());
		
		System.out.println("Tong doanh thu cac chuyen xe noi thanh: "+ ds.tongDoanhThuNoiThanh());
		
		System.out.println("Tong doanh thu cac chuyen xe ngoai thanh: "+ ds.tongDoanhThuNgoaiThanh());
		
		
		
	}
	
}

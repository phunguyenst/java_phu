package nguyenVanPhu.bai08;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien[] sv = new SinhVien[3];
		sv[0] = new SinhVien("20048881", "NguyenVanPhu");
		sv[1] = new SinhVien("20048882", "NguyenVanan");
		sv[2] = new SinhVien("20048883", "NguyenVanteo");
		LopHocPhan l1 = new LopHocPhan("123456","LT Hướng đối tượng", "Cô Hà", "Thứ 7, tiết 4-6, phòng A1.1",sv );
		System.out.println(l1);
	
	}

}

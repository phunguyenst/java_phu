package vdchuyenxe;

public class Test {

	public static void main(String[] args) {
		//ChuyenXe cx1 = new ChuyenXe("001", "tran teo", "10001", 20000.00);
		ChuyenXeNoiThanh cx1 = new ChuyenXeNoiThanh("001", "teo", "123456", 2000.00, "2 tuyen", 3500.00);
		ChuyenXeNgoaiThanh cx2 = new ChuyenXeNgoaiThanh("002", "to", "1234567", 3000.00, "3 tuyen", 5500);
		System.out.println(cx1);
		System.out.println(cx2);
	}

	

}

package nguyenVanPhu.phan03;

/*
 * Viết chương trình in ra những số lẻ từ 1 đến 99
 */
public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XuatSoLe();
	}

	static void XuatSoLe() {
		System.out.println("Cac so le la: ");
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}

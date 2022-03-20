package nguyenVanPhu.phan03;

/*
 * Viết chương trình in ra bội số của 3 từ 300 đến 3
 */
public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XuatBoiSo();
	}
/**
 * xuất các số chia hết cho 3 chính là bội số của 3 từ 300 giảm dần tới 3
 * 
 */
	static void XuatBoiSo()

	{
		System.out.println("Cac boi so cua 3 la: ");
		for (int i = 300; i >= 3; i--) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

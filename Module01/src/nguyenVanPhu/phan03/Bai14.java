package nguyenVanPhu.phan03;

/*
 * Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)
 */
public class Bai14 {
	public static void main(String[] args) {
		System.out.println("Tong cac boi so cua 7 la: " + TongBoiSoCuaBay());
	}
/**
 * xuất các số chia hết cho 7 chính là bội số của 7
 * @return tổng bội số cua 7 là các số chia hết cho 7 
 */
	static int TongBoiSoCuaBay() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				sum += i;
			}

		}
		return sum;
	}
}

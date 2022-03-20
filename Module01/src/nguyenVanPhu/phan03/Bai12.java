package nguyenVanPhu.phan03;

/*
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 */
public class Bai12 {

	public static void main(String[] args) {
		
		
		System.out.print("Tong muoi so chan dau tien la: " + TongMuoiSoChan());

	}

	static int TongMuoiSoChan() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i * 2;
		}
		return sum;
	}

}

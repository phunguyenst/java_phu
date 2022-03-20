package nguyenVanPhu.phan03;

/*
 * Viết chương trình tìm USCLN của 2 số nhập vào
 */
import java.util.Scanner;

public class Bai05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println("Uoc chung lon nhat la: " + UocSoChungLonNhat(a, b));

	}
/**
 * 
 * @param a
 * @param b
 * neu a= 0 hoặc b = 0 thì UCLN sẽ là tổng hai số cộng lại
 * ngược lại trong khi 2 số a b khác nhau neu a > b thi so a sẽ trừ số b và ngược lại
 * gán UCLN cho 1 trong hai số a b
 * @return UCLN
 */

	static int UocSoChungLonNhat(int a, int b) {
		int UCLN = 0;
		if (a == 0 || b == 0) {
			UCLN = (a + b);
		} else {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}

			}
			UCLN = a;
		}
		return UCLN;

	}

}

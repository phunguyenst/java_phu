package nguyenVanPhu.phan03;

/*
 * Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không
 * 
 */
import java.util.Scanner;

public class Bai06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		sc.close();
		if (KiemTraNguyenTo(n) == true) {
			System.out.println("Day la so nguyen to");
		} else {
			System.out.println("Day ko phai la so nguyen to");
		}
	}

	/**
	 * 
	 * @param n
	 * @return true nếu n là số nguyên tố, ngược lại ko phải là so nguyên tố
	 */

	static boolean KiemTraNguyenTo(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

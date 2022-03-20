package nguyenVanPhu.phan03;

import java.util.Scanner;

/*
 * Tính tổng các số nguyên tố nhỏ hơn N
 */
public class Bai07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("tong cac so nguyen to la: " + TongNguyenTo(n));

	}
/**
 * 
 * @param n
 * @return true nếu n là số nguyên tố, ngược lại ko phải là so nguyên tố
 */
	static boolean KiemTraNguyenTo(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static int TongNguyenTo(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (KiemTraNguyenTo(i))
				sum += i;
		}
		return sum;
	}

}

package nguyenVanPhu.phan03;

import java.util.Scanner;

/*
 * Tính tổng N số nguyên tố đầu tiên.
 */
public class Bai08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("tong cac so nguyen to dau tien la: " + tongsntdautien(n));

	}
/**
 * 
 * @param n
 * @return true nếu n là số nguyên tố, ngược lại ko phải là so nguyên tố
 */
	static boolean kiemtranguyento(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
/**
 * 
 * @param n
 * trong khi i <n
 * nếu là số nguyên tố thì tính tổng số nguyên tố 
 * còn không thoả dk kiểm tra số tiếp theo
 * @return
 */
	static int tongsntdautien(int n) {
		int sum = 0, i = 0, j = 0;
		while (i < n) {
			if (kiemtranguyento(j)) {
				sum += j;
				i++;
			}
			j++;
		}
		return sum;

	}

}

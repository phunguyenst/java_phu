package nguyenVanPhu.phan03;

import java.util.Scanner;

public class Bai03 {

	/*
	 * Viết chương trình in ra tổng 1+3+5 …. +n nếu n là số chẵn, 2+4+6+ …. n nếu n
	 * là số lẻ.
	 * 
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(TongChanLe(n));

	}

	/**
	 * 
	 * @param n
	 * nếu số nhập vào là n chia hết cho 2 thì là số chắn và ngược lại
	 * @return
	 */
	static int TongChanLe(int n) {

		int sum = 0;
		int i;
		if (n % 2 == 0) {
			i = 2;
			while (i <= n) {
				sum += i;
				i += 2;
			}
		} else {
			i = 1;
			while (i <= n) {
				sum += i;
				i += 2;
			}
		}
		return sum;
	}
}

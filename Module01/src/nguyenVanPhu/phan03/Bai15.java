package nguyenVanPhu.phan03;

import java.util.Scanner;

/*
 * Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá trị user đã nhập.
 */

public class Bai15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Nhap cac day so: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("So lon nhat trong day cac gia tri la so: " + TimMax(a, n));
		System.out.println("So nho nhat trong day cac gia tri la so: " + TimMin(a, n));
	}
/**
 * 
 * @param a
 * @param n
 *  
 * @return max kiểm tra nếu các dãy số nếu số nào lớn nhất
 * @return min kiểm tra nếu các dãy số nếu số nào nhỏ nhất
 */
	static int TimMax(int a[], int n) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	static int TimMin(int a[], int n) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
}

package nguyenVanPhu.phan03;

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Cac so fibonacci: ");
		for (int i = 0; i < n; i++) {
			System.out.println(SoFibonacci(i));
		}
	}

	/**
	 * 
	 *
	 * @param n
	 * @return 0 nếu n < 0 thì đó không phải số fibonanci
	 * @return n nếu n = 0 hoặc n = 1 là 2 số fibonanci đầu tiên trong dãy fibonanci
	 * @return đệ quy
	 */
	static int SoFibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return SoFibonacci(n - 1) + SoFibonacci(n - 2);
		}
	}

}

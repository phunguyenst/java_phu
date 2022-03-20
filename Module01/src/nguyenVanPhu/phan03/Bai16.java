package nguyenVanPhu.phan03;

/*
 * Viết chương trình đọc một giá trị nguyên từ bàn phím và in ra số đó là số chẵn, lẻ hoặc zero.
 */
import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (DocGiaTriNguyen(n) == 0) {
			System.out.println("Zero");
		}
		if (DocGiaTriNguyen(n) == 1) {
			System.out.println("Chan");
		}
		if (DocGiaTriNguyen(n) == -1) {
			System.out.println("Le");
		}
	}
/**
 * 
 * @param n
 * 
 * @return 0 nếu số nhập vào là 0
 * @return 1 nếu số nhập vào là số chẵn
 * @return -1 nếu số nhập vào là số lẽ
 */
	static int DocGiaTriNguyen(int n) {
		if (n == 0) {
			return 0;
		} else {
			if (n % 2 == 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
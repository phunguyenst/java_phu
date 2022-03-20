package nguyenVanPhu.phan03;

/*
 * Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi
 */
import java.util.Scanner;

public class Bai09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println("ki tu a xuat hien: " + DemKiTu(s));

	}
/**
 * 
 * @param s
 * đếm xem có bao nhiêu kí tự a trong chuỗi
 * @return 
 */
	static int DemKiTu(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}

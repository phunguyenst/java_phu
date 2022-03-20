package nguyenVanPhu.phan03;

import java.util.Scanner;

/*
 * Viết hàm tách chuỗi gốc thành chuỗi con
 */

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String s1[] = TachChuoi(s);
		sc.close();
		for(String s2: s1) {
			System.out.println(s2);
		}
	}
	static String[] TachChuoi(String s) {
		return s.split(" ");
		}
	}


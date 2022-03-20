package phan01;
/*
 * Viết chương trình nhập vào tên của mình và xuất ra màn hình “Hello + Tên”
 * 
 */
import java.util.Scanner;

public class bai02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap ten minh: ");
		String s1 = sc.nextLine();
		System.out.println("Hello " + s1);
	}

}

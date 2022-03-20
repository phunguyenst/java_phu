package nguyenVanPhu.phan03;

/*
 * Viết chương trình giải phương trình bậc 1
 * 
 */
import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a: ");
		int a = sc.nextInt();
		System.out.println("nhap b: ");
		int b = sc.nextInt();
		sc.close();
		float kq = PhuongTrinhBacMot(a, b);
		if (kq == 1) {
			System.out.println("Phuong trinh co vo so nghiem");
		}
		if (kq == -1) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else{
			System.out.printf("Phuong trinh co 2 nghiem phan biet: %.2f", kq);
		}

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * 
	 * @return 1 nếu a=0 và b= 0 thi pt vo so nghiem
	 * @return -1 nếu a = 0 và b != 0 thì pt vo nghiem
	 * @return 0 nếu a != 0 thì pt có 2 nghiệm phân biệt x = -b/a
	 * @throws Exception 
	 */
	static float PhuongTrinhBacMot(int a, int b) throws Exception {
		float x = 0;
		if (a == 0) {
			if (b == 0) {
				throw new Exception("phuong trinh vo so nghiem");
			} else {
				throw new Exception("phuong trinh vo so nghiem");
			}
		} else {
			x =(float) -b/a;
			return x;
		}
	}

}

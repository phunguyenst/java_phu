package nguyenVanPhu.phan03;

/*
 * Viết hàm để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím. HD: Dùng mã
ASCII để kiểm tra hoặc dùng class Character: Character.isDigit(ký tự) để kiểm ký tự có phải là số hay
không
 */
import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("so luong ki tu trong chuoi s la: " + DemSoTrongChuoi(s));
	}
/**
 * 
 * @param s
 * đếm só lượng kí tự số trong chuỗi s bằng cách dùng lệnh Character.isDigit để kiểm tra
 * @return
 */
	public static int DemSoTrongChuoi(String s) {
		int dem = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				dem++;
			}
		}
		return dem;
	}
}

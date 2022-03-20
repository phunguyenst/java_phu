package bai10;



public class Test {

	public static void main(String[] args) {
		CDList cd1 = new CDList(3);
		cd1.themMotCD(new CD(1, "toan 7",5, 1200.00 ));
		cd1.themMotCD(new CD(2, "toan 8",2, 1400.00 ));
		cd1.themMotCD(new CD(3, "toan 9",8, 1300.00 ));
		System.out.println(cd1);
		int kq = cd1.timKiemCD(2);
		if(kq ==-1)
			System.out.println("khong tim thay");
			
		else {
			System.out.println("tim thay");
			
		}
		cd1.timKiemCD(1);
		cd1.xoaCD(1);
		System.out.println("\ndanh sách sau khi xóa: ");
		System.out.println(cd1);
	}

}

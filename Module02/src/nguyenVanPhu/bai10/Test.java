package nguyenVanPhu.bai10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDList cd1 = new CDList(4);
		cd1.themMotCD(new CD(1, "toan 7",5, 1200.00 ));
		cd1.themMotCD(new CD(2, "toan 8",2, 1400.00 ));
		cd1.themMotCD(new CD(3, "toan 9",8, 1300.00 ));
		cd1.themMotCD(new CD(4, "toan 10",8, 1100.00 ));
		System.out.println(cd1);
		//cd1.timKiemCD(1);
		//cd1.xoaCD(1);
		cd1.sapXepGiamDan();
		
		//cd1.sapXepTangDan();
		System.out.println(cd1);
	}

}

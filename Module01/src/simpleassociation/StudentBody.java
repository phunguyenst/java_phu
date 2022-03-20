package simpleassociation;

public class StudentBody {

	public static void main(String[] args) {
		Address ad1 = new Address("quoclo328", "Ba Ria Vung Tau", "VN", 123456);
		Address ad2 = new Address("Nguyen van bao", "HCM", "VN", 123456);
		
		Student st1 = new Student("Nguyen van", "Phu", ad1, ad2);
		System.out.println(st1);

	}

}

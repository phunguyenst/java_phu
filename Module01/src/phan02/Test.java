package phan02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(5,5);
		System.out.println(p1.distance());
		System.out.println(p1.distance(7,10));
		MyPoint p2 = new MyPoint(7,10);
		System.out.println(p1.distance(p2));
		
	}

}

package carestudy3;

public class Test {

	public static void main(String[] args) {
		Polyline po = new Polyline(5);
		try {
			po.appendPoint(new Point(2,3));
			po.appendPoint(new Point(3,4));
			po.appendPoint(new Point(5,6));
			po.appendPoint(new Point(6,5));
			po.appendPoint(new Point(4,3));
		
			System.out.println(po);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

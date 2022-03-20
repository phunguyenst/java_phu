package carestudy3;

public class Polyline {
	private Point[] points;
	private int count;
	public Polyline(int n) {
		points = new Point[n];
		count = 0;
	}
	//them mot phan tu vao point
	public void appendPoint(Point p) throws Exception
	{
		if(count <points.length)
		{
			points[count] = p;
			count++;
		}
		else throw new Exception("vuot qua kich thuoc mang");
	}
	public int getLength() {
		return count;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += points[i]; 
		}
		return s;		
	}
	
}

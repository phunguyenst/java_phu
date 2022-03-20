package baitu;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestHashSet {

	public static void main(String[] args) {
		//HashSet<Product> myhs = new HashSet<Product>();
		LinkedHashSet<Product> mylhs = new LinkedHashSet<Product>();
		Product p1 = new Product("p1", "Iphone 5", 2, 15);
		//myhs.add(p1);
		mylhs.add(p1);
		Product p2 = new Product("p2", "Samsung sII", 3, 11);
		//myhs.add(p2);
		mylhs.add(p2);
		System.out.println(mylhs);
		Iterator<Product> list = mylhs.iterator();
		while (list.hasNext()) {
			Product x = list.next();
			System.out.println(x);
		}
	}
}

package aggregation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author au1 = new Author("Nguyen van phu", "phu123@gmail.com", 'a');
		Book b1 = new Book("toan", au1, 23000.00, 500);
		System.out.println(b1);
	}

}

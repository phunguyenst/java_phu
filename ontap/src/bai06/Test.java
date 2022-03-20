package bai06;



public class Test {
	public static void main(String[] args) {
		
	
	try {
		Account ac1 = new Account(72354, "Ted Murphy", 100000.00);
		Account ac2 = new Account(69713, "Jane Smith",40000.00);
		Account ac3 = new Account(93757, "Edward Demsey", 700000.00);
		ac1.deposit(250000);
		ac2.deposit(500000);
		ac2.withdraw(430000, 2000);
		ac3.addInterest();
		System.out.println("kiểm tra lần 1:");
		System.out.println(Account.getTieuDe());
		System.out.print(ac1);
		System.out.print(ac2);
		System.out.print(ac3);
		ac1.transfer(ac2, 100000);
		System.out.println("\nKiểm tra lần 2:");
		System.out.println(Account.getTieuDe());
		System.out.print(ac1);
		System.out.print(ac2);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}

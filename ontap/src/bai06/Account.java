package bai06;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class Account {

	
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	public Account() {
		this(999999, "chưa xác định", 50000);
	}
	public Account(long accountNumber, String name, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public Account(long accountNumber, String name) {
		
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
		
	public boolean deposit(double amount) {
		if(amount>0)
		{
			balance += amount;
			return true;
		}
		else 
			return false;
	}
	public boolean withdraw(double amount, double fee)
	{
		if(amount > 0 && amount + fee > balance)
		{
			balance  -= amount + fee;
			return true;
		}
		else
			return false;
	}
	public void addInterest() {
		balance = balance + balance * RATE;
	}
	public boolean transfer(Account acc2, double amount)
	{
		if(balance > amount)
		{
			acc2.balance += amount;
			balance -= amount;
			return true;
		}
		return false;
	}
	public static String getTieuDe() {
		return String.format("%-10s %15s %-10s", "name", "number", "balance");
	}
	@Override
	public String toString() {
		Locale lo = new Locale("vi", "vn");
		NumberFormat nf = NumberFormat.getNumberInstance(lo);
				
		return String.format("%-10s %15d %-10sVND\n", this.name,this.accountNumber,nf.format(balance));
	}
	

}

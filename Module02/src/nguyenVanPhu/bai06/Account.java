package nguyenVanPhu.bai06;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		accountNumber = 999999;
		name = "chưa xác định";
		balance = 50000;
	}

	public Account(long accountNumber, String name, double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}

	public Account(long accountNumber, String name) {
		setAccountNumber(accountNumber);
		setName(name);
	}

	/**
	 * hàm trả về giá trị thuộc tính cho accountNumber
	 * 
	 * @return accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * hàm gán giá trị cho accountNumber
	 * 
	 * @param accountNumber: giá trị muốn gán
	 */
	public void setAccountNumber(long accountNumber) {
		if (accountNumber > 0) {
			this.accountNumber = accountNumber;
		} else
			this.accountNumber = 999999;

	}

	/**
	 * hàm gán giá trị cho name
	 * 
	 * @param name: giá trị muốn gán
	 */
	public void setName(String name) {
		if (!name.equals("")) {
			this.name = name;
		} else
			this.name = "chưa xác định";
	}

	/**
	 * hàm trả về giá trị thuộc tính cho balance
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * hàm gán giá trị cho balance
	 * 
	 * @param balance: giá trị muốn gán
	 */
	public void setBalance(double balance) {
		if (balance >= 50000) {
			this.balance = balance;
		} else
			this.balance = 50000;
	}

	/**
	 * hàm gửi tiền
	 */
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	/**
	 * hàm rút tiền
	 */
	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		}
		return false;
	}

	/**
	 * hàm tính tiền lãi
	 */
	public void addInterest() {
		balance = balance + balance * RATE;
	}

	/**
	 * chuyển tiền từ account này sang account khác
	 */
	public boolean transfer(Account acc2, double amount) {
		if (balance > amount) {
			acc2.balance += amount;
			balance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("{%s, %d, %f}", this.name, this.accountNumber, this.balance);
	}

}

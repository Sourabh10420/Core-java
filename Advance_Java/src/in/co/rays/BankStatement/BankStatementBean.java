package in.co.rays.BankStatement;

public class BankStatementBean {
	
	private int id;
	private String name;
	private String bankname;
	private String accountno;
	private int balance;
	private int deposite;
	
	
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	
}

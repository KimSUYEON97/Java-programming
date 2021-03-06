package ex7;

public abstract class Account implements Valuable{
	private double balance;
	
	public Account(double balance){
		this.balance=balance;
	}
	public void credit (double money){
		balance+=money;
	}
	public void debit (double money) throws Exception{
		balance-=money;
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double money){
		balance=money;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);
	public abstract void passTime();
}

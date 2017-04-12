package ex6;

public class SavingsAccount extends Account{
	private double interest;
	private int month;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		if(month<12)throw new Exception("아직 출금할 수 없습니다.");
		if(money<0) throw new Exception("음수입력!");
		if(month>=12){
			super.debit(money);
		}
		else{
			System.out.println("아직 출금할 수 없습니다.");
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if(month<12){
			return 0.0;
		}else{
			return getBalance();
		}
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",getBalance());
	}
	
	@Override
	public void passTime(int month){
		if(this.month<12){
			double x=getBalance()*Math.pow((1+interest),month);
			setBalance(x);
		}
		this.month+=month;
	}
}
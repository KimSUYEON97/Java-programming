package ex8;


public class SavingAccount extends Account{
	private double interest;
	private int month;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		if(month<12)throw new Exception("���� ����� �� �����ϴ�.");
		if(money<0) throw new Exception("�����Է�!");
		if(month>=12){
			super.debit(money);
		}
		else{
			System.out.println("���� ����� �� �����ϴ�.");
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
	
	@Override
	public void passTime(){
		passTime(1);
	}
	
	@Override
	public double EstimateValue(int month){
		passTime(month);
		return getBalance();
	}
	
	@Override
	public double EstimateValue(){
		passTime(1);
		return getBalance();
	}
}

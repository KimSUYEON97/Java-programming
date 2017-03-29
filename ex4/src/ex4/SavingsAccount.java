package ex4;

import java.util.Scanner;

public class SavingsAccount extends Account{
	private double interest;
	private int month;
	
	public SavingsAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	
	@Override
	public void debit(double money){
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
	
	@Override
	public void passTime(int month){
		this.month+=month;
		double x=getBalance()*Math.pow((1+interest),month);
		setBalance(x);
	}
}

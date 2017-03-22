package ex2;

import java.util.Scanner;

public class Account {
	private double account;
	public final String name;
	
	public double getAccount(){
		return account;
	}
	
	public void balance(){
		System.out.printf("%s balance: $%f\n",name,account);
	}
	
	public void credit(double money){
		account+=money;
	}
	
	public void debit(double money){
		account-=money;
	}
	
	public Account(String name,double money){
		this.name=name;
		account=money;
	}
}

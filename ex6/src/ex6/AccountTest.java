package ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]){
		Account account1=new CheckingAccount(100,50,0.01,0.07);
		Account account2=new SavingsAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		
		try{
			System.out.println("Enter deposit amount for Account1: ");
			double amount1=scan.nextDouble();
			account1.debit(amount1);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			double amount2=scan.nextDouble();
			account2.debit(amount2);
			System.out.println("Account1 balance: $"+account2.getBalance());
			
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n"+e.toString());
		}catch(Exception e){
			System.out.println("예외발생 "+e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+account1.getBalance());
		}
	}
}

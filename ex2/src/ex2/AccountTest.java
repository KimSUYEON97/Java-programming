package ex2;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		System.out.print("account 1 balance: ");
		Scanner input=new Scanner(System.in);
		double num1=input.nextInt();
		System.out.print("account 2 balance: ");
		Scanner input2=new Scanner(System.in);
		double num2=input2.nextInt();
		Account account1 =new Account("account1",num1);
		Account account2 =new Account("account2",num2);

		System.out.print("Enter withdrawal amount for account 1: ");
		Scanner input3=new Scanner(System.in);
		double num3=input3.nextDouble();
		System.out.printf("subtracting %f from account1 balance\n",num3);
		if(num1>0){
			account1.debit(num3);
		}
		else{
			System.out.printf("Debit amount exceeded account balance\n");
		}
		account1.balance();
		account2.balance();
		System.out.print("Enter withdrawal amount for account 2: ");
		Scanner input4=new Scanner(System.in);
		double num4=input4.nextDouble();
		System.out.printf("subtracting %f from account2 balance\n",num4);
		if(num2>0){
			account2.debit(num4);
		}
		else{
			System.out.printf("Debit amount exceeded account balance\n");
		}
		account1.balance();
		account2.balance();
	}
}

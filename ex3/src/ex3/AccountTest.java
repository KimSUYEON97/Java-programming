package ex3;

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		System.out.print("account 1 balance: ");
		Scanner input=new Scanner(System.in);
		double num1=input.nextInt();
		System.out.print("account 2 balance: ");
		Scanner input2=new Scanner(System.in);
		double num2=input2.nextInt();
		CheckingAccount account1 =new CheckingAccount(-100,0.1,0.07,num1);
		CheckingAccount account2 =new CheckingAccount(-100,0.1,0.07,num2);

		System.out.print("Enter deposit amount for account 1: ");
		Scanner input3=new Scanner(System.in);
		double num3=input3.nextDouble();
		account1.credit(num3);
		System.out.printf("\naccount 1 balance: $%f\n",account1.getBalance());
		System.out.printf("account 2 balance: $%f\n",account2.getBalance());
		System.out.print("Enter withdrawal amount for account 2: ");
		Scanner input4=new Scanner(System.in);
		double num4=input4.nextDouble();
		account2.debit(num4);
		System.out.printf("\naccount 1 balance: $%f",account1.getBalance());
		System.out.printf("\naccount 2 balance: $%f",account2.getBalance());
		
		System.out.printf("\nnext month!\n");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("\naccount 1 balance: $%f\n",account1.getBalance());
		System.out.printf("account 2 balance: $%f\n",account2.getBalance());
	}
}

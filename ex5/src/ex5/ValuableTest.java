package ex5;

import java.util.Scanner;

public class ValuableTest {
	public static void main(String args[]){
		CheckingAccount account1=new CheckingAccount(100,50,0.01,0.07);
		SavingsAccount account2=new SavingsAccount(100,0.05);
		Human human=new Human("Mark",20);
		Car newcar=new Car("MyCar",5000);
		Valuable[] objectList=new Valuable[4];
		
		objectList[0]=account1;
		objectList[1]=account2;
		objectList[2]=human;
		objectList[3]=newcar;
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n",objectItem.toString());
			System.out.printf("6month later Valuable : %.2f\n\n",objectItem.EstimateValue(6));
		}
	}
}

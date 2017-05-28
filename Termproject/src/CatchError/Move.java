package CatchError;

import java.util.*;

public class Move {
	public static void main(String[] args){
		int[] axis_x = new int[15];
		int[] axis_y = new int[15];
		
		double random=Math.random();
		int value= (int)(random*10)+1;
		
		String[][] plate = new String[100][100];
		
		int loop=0,i=0;
		while(loop<15){
			
			double random_x=Math.random();
			int x= (int)(random_x*100)+1;
			
			double random_y=Math.random();
			int y= (int)(random_y*100)+1;
			if (x>=100||y>=100){
				loop--;
			}else{
				axis_x[loop]=x;
				axis_y[loop]=y;
			}
			loop++;
		}
		loop=0;
		
		while(loop<value){
			
			loop++;
			i++;
		}
	}
}

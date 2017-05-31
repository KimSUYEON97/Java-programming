package CatchError;

import java.util.*;

public class Move {
	public static void main(String[] args){
		int[] axis_x = new int[15];
		int[] axis_y = new int[15];
		
		double random=Math.random();
		int value= (int)(random*10)+1;
		
		char [][] plate = new char[102][102];
		
		int num=0;
		while(num<value){
			int loop=0;
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
					plate[x][y]='бс';
				}
				loop++;
			}
			loop=0;
			
			while(loop<9){
				for(int i=0;i<100;i++){
					for(int j=0;j<100;j++){
						System.out.print(plate[i][j]);
						if(plate[i][j]!=0){
							plate[i][j]='бр';
						}
					}
					System.out.println();
				}
				System.out.println("---------------------");
				if(loop%4==1){
					for(int i=0;i<15;i++){
						axis_x[i]++;
						axis_y[i]++;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==2){
					for(int i=0;i<15;i++){
						axis_x[i]++;
						axis_y[i]--;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==3){
					for(int i=0;i<15;i++){
						axis_x[i]++;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==0){
					for(int i=0;i<15;i++){
						axis_x[i]-=2;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}
				
				loop++;
			}
			num++;
		}

	}
}

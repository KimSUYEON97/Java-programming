package CatchError;

import java.util.*;

public class cafain {
	private int life;
	private int buffer;
	private int buffer_limit;
	
	public void cafain(){
		life=100;
		buffer=0;
		buffer_limit=25;
	}
	
	public void lifeindecrease(int x){
		if(life<100&&life>0){
			if (x==1){//x==1 �϶� ���׿� �ε�����
				life--;
			}else if (x==0){//x==0 ���׸� �������
				life++;
			}
		}else if (life ==0){
			System.out.println("GameOver");
		}
	}
	
}

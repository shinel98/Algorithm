package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 백준 5585
 1000원을 냈을 때 
 500, 100, 50, 5, 1 의 구성의 최소의 잔돈 갯수  
 1<=지불해야할 돈<1000
*/
public class Change {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int change = 1000-Integer.parseInt(bf.readLine());
		int change_cnt = 0;
		int temp;
		
		while(change != 0) {
			temp = 0;
			if(change>=500) {
				temp = change/500;
				change -= temp*500;
			}
			else if(change>=100) {
				temp = change/100;
				change -= temp*100;
			}
			else if(change>=50) {
				temp = change/50;
				change -= temp*50;
			}
			else if(change>=10) {
				temp = change/10;
				change -= temp*10;
			}	
			else if(change>=5) {
				temp = change/5;
				change -= temp*5;
			}
			else {
				temp = change;
				change -= temp;
			}
			change_cnt += temp;
		}
		System.out.println(change_cnt);
	}

}

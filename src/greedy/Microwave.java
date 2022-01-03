package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 백준 10162
 A,B,C 각각 5분, 1분, 10초 
 주어진 시간 T를 최소의 횟수로 버튼을 눌러 전자레인지 가동해야 한다. 
 이때, 눌러진 버튼의 횟수들 출력  
 세 버튼으로 T초를 맞출 수 없으면 음수 -1을 첫 줄에 출력
 1<=T<=10,000 
 */
public class Microwave {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int A_sec = 5*60;
		int B_sec = 60;
		int C_sec = 10;
		int[] count = new int[3];
		int temp;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		while(T>0) {
			if(T>=A_sec) {
				temp=T/A_sec;
				T-=A_sec*temp;
				count[0]+=temp;
			}
			else if(T>=B_sec) {
				temp=T/B_sec;
				T-=B_sec*temp;
				count[1]+=temp;
			}
			else if(T>=C_sec) {
				temp=T/C_sec;
				T-=C_sec*temp;
				count[2]+=temp;
			}
			else {
				System.out.println(-1);
				break;
			}
			temp=0;	
		}
		if(T==0)
			for(int i=0; i<3; i++) 
				System.out.print(count[i] + " ");
	}

}

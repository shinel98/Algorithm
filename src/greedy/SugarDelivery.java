package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 백준 2839
/*
총 N(3<= N <= 5000)킬로그램의 설탕을 3키로와. 5키로 봉지에 담아 배달을 하되, 가장 적은 봉지로 배달하는 방법은? 
만약 3킬로와 5킬로 봉지로 정확히 배달을 할 수 없다면 -1 출력  
*/


/*	
	5N+1, 5N+3 => N/5 + 1
	5N+2, 5N+4 => N/5 + 2
	5N = N/5
	4, 7 -1
*/

public class SugarDelivery {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		if(N==4 || N==7)
			System.out.println(-1);
		else if(N%5==1 || N%5==3)
			System.out.println(N/5+1);
		else if(N%5==2 || N%5==4)
			System.out.println(N/5+2);
		else if(N%5==0)
			System.out.println(N/5);
	}

}


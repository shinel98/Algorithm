package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 11399 
/*
 ATM 앞에 줄을 서 있는 N명 (1<= N <= 1000)과 각 사람이 돈을 인출하는 데에 걸리는 시간 Pi(1<= Pi <=1000) (이용하는 사람에 따라서 시간 누적)  
 ATM을 이용하는 데에 드는 최소 시간 
 */

public class ATM {
	public static void main(String args[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());	
		
		int[] arr = new int[N];
		int temp=0;
		int total=0;
		int k=1;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<k; j++) {
				temp += arr[j];
			}
			total += temp;
			temp=0;
			k++;
		}
		System.out.println(total);
	}
}

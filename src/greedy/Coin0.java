package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/* 백준 11047 */
/*
 동전의 종류 N개와 총 가치의 합 K, K를 만들기 위한 동전 개수의 최솟값
 첫번째 줄에 N과 K의 값이 주어지고, 두번째 줄부터 N개의 동전의 가치가 주어짐  
 
 1<=N<=10, 1<=K<=100,000,000
 */


public class Coin0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int total=0;
		int temp=0;
		int j=0;
		while(K>0) {
			if(K>=arr[j]) {
				temp=K/arr[j];
				K=K-temp*arr[j];
				total+=temp;
			}
		
			temp=0;
			j++;
		}
		System.out.println(total);
	}
}

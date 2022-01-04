package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/*
 백준 10610 
 제공된 수에 포함된 숫자들을 이용하여 30의 배수를 만드는 문제 
 불가능하면 -1 출력 
 */ 
public class Thirty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		int[] numCount = new int[10];
		long total = 0;
		for(int i=0; i<str.length(); i++) {
			int number = Integer.parseInt(str.substring(i,i+1));
			numCount[number]++;
			total+=number;
		}
		// 각자리의 합이 3의 배수가 아니거나 , 0이 없을 경우 -1 출력 
		if(total%3!=0 || !str.contains("0")) {
			System.out.println("-1");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=9; i>=0; i--) {
			while(numCount[i]>0) {
				sb.append(i);
				numCount[i]--;
			}
		}
		System.out.println(sb.toString());
	}
}

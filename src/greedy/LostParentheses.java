package greedy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 1541번 
 양수, +, - 로 만든 식을 괄호를 이용하여 값이 최소가 되게 하라 
 입력으로 주어지는 식의 길이는 <= 50 이고  각각의 숫자는 5자리의 수가 최대 
 가장 처음과 마지막 문자는 숫자 
 */

public class LostParentheses {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer subtraction = new StringTokenizer(bf.readLine(), "-");
		int total=Integer.MAX_VALUE;
		
		while(subtraction.hasMoreTokens()) {
			int temp=0;
			
			StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
			
			
			while(addition.hasMoreTokens()) {
				temp+=Integer.parseInt(addition.nextToken());
			}
			
			if(total==Integer.MAX_VALUE) 
				total = temp;
			else
				total -= temp;
		}
		System.out.println(total);
	}

}

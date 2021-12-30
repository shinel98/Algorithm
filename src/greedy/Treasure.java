package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
 길이가 N인 정수 배열 A와 B. 
 S=A[0]xB[0] + ... + A[N-1]xB[N-1]
 S의 값을 가장 작게 만들기 위해서 A의 수를 재배열, 단, B에 있는 수는 재배하면 안됨.
 
 첫쨰줄에 N, 둘쨰줄에는 A에 있는 N개의 수, 셋쨰줄에는 B에 있는 N개의 수.
 1<=N<=50,  0<=A,B<=100
 */

public class Treasure {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		LinkedList<Integer> A = new LinkedList<Integer>();
		LinkedList<Integer> B = new LinkedList<Integer>();
		StringTokenizer st;
		int max=0;
		int max_index=0;
		int index=0;
		int total=0;
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<N;i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		// A 정렬 
		Collections.sort(A);
		
		st=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0;i<N;i++) {
			for(Integer j: B) {
				if(j>max) {
					max=j;
					max_index=index;
				}
				index++;
			}
			total = total+A.get(i)*max;
			B.remove(max_index);
			index=0;
			max=0;
			max_index=0;
		}
		
		System.out.println(total);
	}

}

package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/* 백준 1931번 */

/*
 한 개의 회의실에 N개의 회의가 시작하는 시간과 끝나는 시간이 주어짐.
 회의실을 사용할 수 있는 회의의 최대 개수는? 
 첫째줄에 회의 수 N개 제공, 둘째줄부터 N+1 줄까지 각 회의 정보 주어짐 
 (1<= N <= 100,000)  
 */


public class MeetingRoom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		int[][] arr = new int[N][2];
		StringTokenizer st;
		int count=0;
		int prev_end_time=0;
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(bf.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return o1[0]-o2[0];
				return o1[1]-o2[1];
			}			
		});
		
		
		for(int i=0;i<N;i++) {
			if(prev_end_time<= arr[i][0]) {
				count++;
				prev_end_time=arr[i][1];
			}
		}
		System.out.println(count);
	}
}

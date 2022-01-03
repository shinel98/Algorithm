package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 백준 2217번 
  줄의 갯수가 주어지고 각 줄이 감당할 수 있는 무게가 정해짐. 이 줄들을 병렬로 이용하여
  물체를 드는데, 각 줄에 가해지는 힘은 고르게 중량/줄의 개수, 이 로프들을 이용하여 들어올릴 수 있는
  물체의 최대 중량은?   
 */
public class Rope {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int max=0;
		int rope; 
		int temp;
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(list);
		for(int i=0; i<N; i++) {
			rope = list.get(i);
			temp = rope*(N-i);
			if(max < temp) 
				max = temp;
		}
		System.out.println(max);
	}

}

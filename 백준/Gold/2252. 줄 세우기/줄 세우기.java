import java.util.*;
import java.io.*;

public class Main {
	public static int N,M;
	public static ArrayList<Integer> [] arr;
	public static int []result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N =Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N+1];
		result = new int [N+1];
		
		for(int i = 1 ; i <=N;i++) {
			arr[i]=new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			result[b]++;
		}
		Queue <Integer> q = new LinkedList<>();
		for(int i =1 ; i<=N;i++) {
			if(result[i]==0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			for(int next  : arr[now]) {
				result[next]--;
				if(result[next]==0) {
					q.add(next);
				}
			}
		}
	
	}
	
}

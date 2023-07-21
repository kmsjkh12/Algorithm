import java.io.*;
import java.util.*;



class Main {
	
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int arr[]= new int [N];
		int start = 0;
		int end = k;
		int max = 0;
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {
			if(start==N) {
				break;
			}
			int idx= start;
			set.add(c);
			int count =0;
			while(count<k) {
				if(idx==N) {
					idx=0;
				}
				set.add(arr[idx]);
				idx++;
				count++;
			}
			max  = Math.max(set.size(), max);
			set.remove(arr[start]);
			start++;
			
			}
		
		
			System.out.print(max);
			}
		
}	
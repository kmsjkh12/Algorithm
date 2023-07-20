import java.io.*;
import java.util.*;



class Main {
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i <T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());  
			long arr [] = new long [N];
			long max=0;
			long sum =0;
			ArrayList<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());

			for(int j = 0 ; j< N ; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			
			for(int j = N-1  ; j>=0 ; j--) {
				if(arr[j]>max) {
					max=arr[j];
				}
				else {
					sum += (max-arr[j]);
				}
				
			}
			
			sb.append(sum+ "\n");
		}
		System.out.print(sb);
		
	}
	
}	
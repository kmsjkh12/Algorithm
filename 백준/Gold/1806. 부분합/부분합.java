import java.io.*;
import java.util.*;



class Main {
	static int N;
	static int S;
	static int arr [];
	
	public static void main (String[]args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N= Integer.parseInt(st.nextToken());
		S= Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int [N+1];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}	
		
		int left = 0;
		int right = 0;
		int cnt= Integer.MAX_VALUE ;
		
		// 5 1 3 5 10 7 4 9 2 8  
		// 1~10
        		// 5 6 9 14 24
		int result = 0;

		while(left<=N && right <=N) {
			
			if(result>=S &&cnt>right-left) {
				cnt= right-left;
			}
			if(result< S) 
				result += arr[right++];
			else
				result -=arr[left++];
		}
		if(cnt ==Integer.MAX_VALUE) {
			System.out.println("0");
		}
		else {
			System.out.print(cnt);
		}	
		}
}
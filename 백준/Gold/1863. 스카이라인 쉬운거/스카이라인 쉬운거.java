import java.io.*;
import java.util.*;
class Main {
	static int N;
	static int K;
	static int arr [];
	public static void main (String[]args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int count = 0;
		int arr [] =new int [N+1];
		Stack<Integer> stack = new Stack<>();
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int start= Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr[i] =end;
			// 스택이 비어있으면 삽입 
		}
		
		for(int i = 0 ; i <= N ; i++) {
			//스택에값이 들어가있고 stack에 있는 값보다 현재 값이 	작으면  
			while(!stack.isEmpty() && stack.peek() > arr[i]) {
				count+=1;
				stack.pop();
			}
			if(!stack.isEmpty() && stack.peek() == arr[i]) {
				continue;
			}
			stack.push(arr[i]);
		}
		
		System.out.println(count);
	}	
}
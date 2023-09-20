import java.io.*;
import java.util.*;


class Main {
	static int arr[][];
	///arr[i][0]= 비어있는 경우  
	///arr[i][1]= 왼쪽이 비어있는 경우
	///arr[i][2]= 오른쪽이 비어있는 경우
	
	public static void main (String[]args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		arr = new int [N+1][3];
		arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=1;
		
		for(int i = 1 ; i <= N; i++) {
				arr[i][0] = (arr[i-1][0] + arr[i-1][1] + arr[i-1][2]) % 9901;
				arr[i][1] = (arr[i-1][0] + arr[i-1][2]) % 9901;
				arr[i][2] = (arr[i-1][0] + arr[i-1][1]) % 9901; 
		}
		
		
		System.out.println( (arr[N-1][0] + arr[N-1][1] + arr[N-1][2]) % 9901);
	}
}
import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int [] a = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0;i<N; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		int count = 0;
		int i = 0; //a[0]
		int j = N-1;  //a[n-1]
		
		while(i<j) {
			if(a[i]+a[j]<M) {
				i++;
			}
			else if(a[i]+a[j]>M) {
				j--;
			}
			else {
				count++;
				i++;
			}
		}
		System.out.println(count);
	}
}
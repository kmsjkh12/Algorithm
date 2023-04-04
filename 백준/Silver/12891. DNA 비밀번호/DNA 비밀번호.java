import java.io.*;
import java.util.*;
public class Main {
	static int [] myArr;
	static int [] checkArr;
	static int check ;
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int result =0;
		checkArr = new int [4];
		myArr = new int [4];
		char a[] =new char[N];
		check = 0 ;
		
		a = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i<4 ; i++) {
			checkArr[i]= Integer.parseInt(st.nextToken());
			if(checkArr[i]==0) {
				check++;
			}
			
		}
		for(int i = 0 ;i < M; i ++) {
			Add(a[i]);
		}
		if(check==4) {
			result++;
		}
		
		for(int i =M ; i<N; i++) {
			int j = i-M;
			Add(a[i]);
			Remove(a[j]);
			if(check==4) {
				result++;
			}
			
		}
		System.out.println(result);
		br.close();
		
	}

	private static void Remove(char c) {
		// TODO Auto-generated method stub
		switch(c) {
		case 'A':
			if(myArr[0]== checkArr[0])check--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1]== checkArr[1])check--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2]== checkArr[2])check--;
			myArr[2]--;

			break;
		case 'T':
			if(myArr[3]== checkArr[3])check--;			
			myArr[3]--;
			break;
		}
		
	}

	private static void Add(char c) {
		// TODO Auto-generated method stub
		switch(c) {
		case 'A':
			myArr[0]++;
			if(myArr[0]== checkArr[0])check++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1]== checkArr[1])check++;
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2]== checkArr[2])check++;
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3]== checkArr[3])check++;
			break;
		}
	}
}

import java.io.*;
import java.util.*;



class Main {
	static int N;
	static int C;
	static int card [];
	public static void main (String[]args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		card = new int [N];
		for(int i = 0 ; i < N ;i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());

		C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Arrays.sort(card);
		StringBuilder sb= new StringBuilder();
		for(int i = 0 ; i < C ;i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(right(card, key)-left(card,key) + " ");
		}
		
System.out.print(sb);
		
		
	}
	//작은 수 
	private static int left(int arr[] , int key) {
		// TODO Auto-generated method stub
		int low = 0; // 왼쪽 
		int high = arr.length; //오른쪽 
		
		while(low < high) {
			//왼쪽이 오른쪽을 역전하면 종료 
			int mid =( low + high ) / 2;  //중앙값 
		
			if(key <= arr[mid]) {         //구할 값보다 mid값이 같거나 크면 
				high = mid;               //right를 mid로 위치 
			}
			else {						//중앙값보다 key가 더 크면 
				low = mid+1;            //left 를 mid보다 한칸높게 위치 
			}
		}
		return low;
		           
	}
	private static int right(int arr [] ,int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid =( low + high ) / 2;  //중앙값 
		
			if(key < arr[mid]) {
				high = mid;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
}


// 1 2 4 8 9 
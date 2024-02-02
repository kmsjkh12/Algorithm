import java.util.*;
import java.io.*;


public class Main {
	
	static int A,B,C;
	
	static int result;
	
	static int count;
	
	static int arr [][];
	static int white = 0;
	static int blue = 0;
	
	
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		count = Integer.parseInt(st.nextToken());
		
		arr= new int [count][count];
		
		for(int i = 0 ; i < count ;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < count ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
		recursion(0,0,count);
		
		System.out.println(white);
		System.out.println(blue);
	}

	private static void recursion(int x, int y, int c) {
		// TODO Auto-generated method stub
		
		if(colorCheck(x,y,c)) {
			if(arr[x][y]== 0) {
				white++;
				return;
			}
			else {
				blue++;
				return;
			}
		}
		int size = c/2;
		
		recursion(x,y,size);
		recursion(x,y+size,size);
		recursion(x+size,y,size);
		recursion(x+size,y+size,size);

		
		
	}

	private static boolean colorCheck(int x, int y, int c) {
		
		int color = arr[x][y];
		
		for(int i = x ;i< x+c; i++) {
			for(int j = y ; j < y+c ; j++) {
				if(color != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}	
}

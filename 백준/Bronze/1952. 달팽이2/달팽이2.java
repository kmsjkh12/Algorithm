import java.io.*;
import java.util.*;



public class Main {
	static int dx[]= {1,0,-1,0};   //오른, 아래 왼 위 
	static int dy[]= {0,1,0,-1};
	static boolean map[][];
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		int arr [][] = new int[b][a];
		map = new boolean [b][a];
		
		int x = 0;
		int y = 0;
		int sum = 0;
		int count=0;
		int index= 0;
		map[y][x]=true;
		count++;
		while(index<4) {
			int ny = y + dx[index];  //b
			int nx = x + dy[index];  //x
			
			if(count==a*b) {
				System.out.println(sum);
				return;
			}
			
			if(nx>=0 && nx<a && ny>=0 && ny<b && !map[ny][nx]) {
				count++;
				map[ny][nx]=true;
				y=ny;
				x=nx;
			}
			else {
				index++;
				sum++;
			}
			
			if(index>=4) {
				index=0;
			}
			
			
		}
	}
}

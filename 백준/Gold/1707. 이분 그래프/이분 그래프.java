import java.io.*;
import java.util.*;



class Main {
	public class Node {
		int end;
		int cost;
		Node(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}
	}
	static ArrayList<Integer>[] list;
	static boolean visited[];
	static int arr [];
	static boolean isEven;
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		


		for(int i = 0 ; i < test ; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());  //정점의 개수 
			int M = Integer.parseInt(st.nextToken());  //간선 
			visited= new boolean [N+1];
			list =new ArrayList [N+1];
			arr = new int [N+1];
			isEven = true;
			for(int j = 1 ; j <=N; j++) {
				list[j]= new ArrayList<Integer>();
			}
			for(int j = 0 ; j< M;j++) {
				st = new StringTokenizer(br.readLine());

				int start = Integer.parseInt(st.nextToken());  
				int end = Integer.parseInt(st.nextToken());  
				list[start].add(end);
				list[end].add(start);
			}
			
		
			for(int j = 1 ; j <=N; j++) {
				if(isEven) {
				dfs(j);
				}
				else {
					break;
				}
			}
			if(isEven) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");

			}
		}
	}
	private static void dfs(int x) {
		// TODO Auto-generated method stub
		visited[x]= true;
		for(int next : list[x]) {
			if(!visited[next]) {
				arr[next] = (arr[x]+1 ) % 2;
				dfs(next);
			}
			else if(arr[next]==arr[x]) {
				isEven= false;
			}
		}
	}	
}
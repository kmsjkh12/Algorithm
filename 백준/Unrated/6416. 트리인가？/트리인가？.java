import java.io.*;
import java.util.*;

class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> map;
		int cnt = 1;
		
		
		while(true) {
			map = new HashMap<>(); // 해쉬맵 
			int etge = 0; //간선 
			
			while(true) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			
			if(start ==-1 && end ==-1) {
				return;
			}
			else if( start ==0 && end == 0 ) {
				break;
			}
			//6 8  5 3  5 2  6 4
			//5 6  0 0
			map.put(start,map.getOrDefault(start, 0));  //시작점  , 간선 0  
			map.put(end, map.getOrDefault(end,0)+1);    //종점   , 키값에 있으면 간선 + 1  , 간선이 2개이면 트리가 아님  
			etge++;
			
			}
			
			int root=0;
			boolean tree = true;
			
			for(int x : map.keySet()) {
				if(map.get(x)==0) {
					root++;
				}
				
				else if( map.get(x)>1) {
					tree=false;
					break;
				}
			}
			
			
			if(map.size()==0) {
				System.out.println("Case "+cnt+ " is a tree.");
				cnt++;
			}
			else if(tree && root==1 && etge == map.size()-1) {
				System.out.println("Case "+cnt+ " is a tree.");
				cnt++;
			}
			else {
				System.out.println("Case "+cnt+ " is not a tree.");
				cnt++;
			}
		}
	}
}	
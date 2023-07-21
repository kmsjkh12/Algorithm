import java.io.*;
import java.util.*;



class Main {
	static class Road{
		int start, end , width;
		public Road(int start, int end , int width) {
			this.start=start;
			this.end=end;
			this.width=width;
		}
	}
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Road> arr = new ArrayList<>();
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < N ; i++) {
			 st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int fast = Integer.parseInt(st.nextToken());
			if(end>M) {
				continue;
			}
			else if(end-start<fast) {
				continue;
			}
			arr.add(new Road(start,end,fast));
		}
		
		
		Collections.sort(arr, new Comparator<Road>(){
			public int compare(Road o1,Road o2) {
				if(o1.start==o2.start) {
					return o1.end-o2.end;
				}
				return o1.start-o2.start;
				}
		});
		int idx = 0,move= 0;
		
		int [] dist= new int [100001];
		Arrays.fill(dist, 100001);
		dist[0]= 0;
		
		while(move<M) {
			if(idx<arr.size()) {
				Road road = arr.get(idx);
				if(move==road.start) {
					dist[road.end]= Math.min(dist[move]+road.width ,dist[road.end] );	
					idx++;
				}
				else {
					dist[move+1] =  Math.min(dist[move+1], dist[move]+1);
					move++;
				}
				
			}
			else {
				dist[move+1] =  Math.min(dist[move+1], dist[move]+1);
				move++;
			}
		}
		System.out.print(dist[M]);
		}
}	
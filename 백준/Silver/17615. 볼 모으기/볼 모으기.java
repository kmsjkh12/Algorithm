import java.io.*;
import java.util.*;



class Main {

	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		String line = st.nextToken();
		
		int cnt = Integer.MAX_VALUE;
		
		
		//red left sort
		boolean check=false;
		int checkcnt = 0;
		for(int i = 0 ; i < N ; i++) {
			if(check && line.charAt(i)=='R' ) {
				checkcnt++;
				continue;
			}
			if(line.charAt(i)=='B') {
				check=true;
			}
		}
		
		cnt= Math.min(cnt, checkcnt);
		
		//blue left sort
		check=false;
		checkcnt = 0;
		for(int i = 0 ; i < N ; i++) {
			if(check && line.charAt(i)=='B' ) {
				checkcnt++;
				continue;
			}
			if(line.charAt(i)=='R') {
				check=true;
			}
		}
		
		cnt= Math.min(cnt, checkcnt);
		
		
		//red right sort
		check=false;
		checkcnt = 0;
		for(int i = N-1 ; i >=0  ; i--) {
			if(check && line.charAt(i)=='R' ) {
				checkcnt++;
				continue;
			}
			if(line.charAt(i)=='B') {
				check=true;
			}
		}
		
		cnt= Math.min(cnt, checkcnt);
		
		//blue right sort
		check=false;
		checkcnt = 0;
		for(int i = N-1 ; i >= 0 ; i--) {
			if(check && line.charAt(i)=='B' ) {
				checkcnt++;
				continue;
			}
			if(line.charAt(i)=='R') {
				check=true;
			}
		}
		
		cnt= Math.min(cnt, checkcnt);
		System.out.print(cnt);
		}
		
}	
import java.util.*;

public class Main {
	
	//두개를 구함
	
	
	static String word [] ;
	static int L;
	static int C;
	static boolean visit[];
	static String code [];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
       
		L = sc.nextInt();
		C = sc.nextInt();
		word = new String [C];
		visit= new boolean[C];
		code= new String [L];
		for(int i = 0 ; i < C; i++) {
			word[i] = sc.next();
		}
		Arrays.sort(word);
		make(0,0);
	}
	
	static public void make(int x, int index) {
		if(index == L) {
			if( isValid()) {
				for(int i = 0 ; i < code.length;i++) {
					System.out.print(code[i]);
				}
				System.out.println();
				
			}
			return ;
	
		}
		
		for(int i = x; i < C; i++) {
			code[index]= word[i];
			make(i+1, index+1);
		}
	}
	
	static public boolean isValid () {
		int mo = 0;
		int ja= 0;
		
		for(String x: code) {
			if( x.equals("a") ||  x.equals("e")|| 
					x.equals("i")||x.equals("o") || x.equals("u") ) {
				mo++;
			}
			else {
				ja++;
			}
		}
		if(mo >=1 && ja>= 2) {
			return true;
		}
		return false;
	}
}	
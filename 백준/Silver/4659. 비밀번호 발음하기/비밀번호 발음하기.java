import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	
	    	/* 1번 조건 : 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
			   2번 조건 : 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
			   3번 조건 : 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.*/
	    	
	    	char [] m = {'a','e','i','o','u'};
	    	while(true) {
	    		boolean tag = false;        
	    		boolean moja= false;
	    		boolean every = true;
	    		int mo=0;
	    		int ja=0;
	    			//기본값   
	    		String line = st.nextToken();
	    		if(line.equals("end")) {
	    			break;
	    		}
	    		else {
	    			for( int i = 0 ; i < line.length() ; i++ ) {
	    				char num = line.charAt(i);
	    	    		boolean moum= false;
	    				for(int j = 0 ; j<m.length;j++) {	
	    					if(num == m[j]) { //모음 연속 확인 
	    						moum=true;
	    						moja=true;
	    						mo++;
	    						ja=0;
	    						break;
	    					}
	    				}
	    				if (!moum){         //자음 연속 확인 
    						mo=0;
    						ja++;
    					}
	    				
	    			
	    				if (i==line.length()-1) {
	    					if(!moja){//모음이 하나도 없으면 
	    					System.out.println("<"+ line + "> " + "is not acceptable." );
	    					every=false;
	    					break;
	    					}
	    					
	    				}
	    				if( i>=1) {
	    					if(num == line.charAt(i-1) && num !='e' && num !='o') {
		    					System.out.println("<"+ line + "> " + "is not acceptable." );
		    					every=false;
		    					break;

	    					}
	    				}
	    				if(mo >=3 || ja >=3) {
	    					System.out.println("<"+ line + "> " + "is not acceptable." );
	    					every=false;
	    					 break;
	    				}
	    			}
	    		
	    		if(every) {
					System.out.println("<"+ line + "> " + "is acceptable." );

	    		}
	    		st = new StringTokenizer(br.readLine());

	    		}
	    	}
	    	
		}
	    
		
}	
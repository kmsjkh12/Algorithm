
import java.io.*;
import java.util.*;



public class Main 
{
static Integer [] dp ;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		dp = new Integer [N+1];
		
		dp[0]=dp[1]=0;
		
		
		System.out.print(fff(N));
		
		
	}

	private static int fff(int n) {
		// TODO Auto-generated method stub
if(dp[n]==null) {
		if(n%6==0) {
				dp[n]= Math.min(fff(n/3), Math.min(fff(n/2),fff(n-1)))+1;
			}
			else if(n%3==0) {
				dp[n]=Math.min( fff(n/3), fff(n-1))+1;
			}
			else if(n%2==0) {
				dp[n]= Math.min(fff(n/2), fff(n-1))+1;
			}
			else {
				dp[n] = fff(n-1)+1;
			}
		}
return dp[n];
}
}



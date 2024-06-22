import java.util.*;

public class Main {
	//빨간색 C, 파란색 P, 초록색 Z, 노란색 Y
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		int num = sc.nextInt();
		
		int arr [] = new int [num];
		
		for(int i = 0 ; i < num; i++) {
			arr[i]= sc.nextInt();
		}
		int now = 100;
		int minus = a;
		int plus = a;
		
		
		int now_result=0;
		int minus_result = 0;
		int plus_result = 0;
		
		int now_count = 0;
		
		boolean flag= false;
		
		//100에서 이
		while(true) {
			if ( now == a) {
				break;
			}
			else if(now < a ) {
				now_count++;
				now++;
				
			}
			else if(now > a) {
				now_count++;
				now--;
			}
		}
		
		while(true) {
			if(now_count <String.valueOf(minus).length() + a - minus ||  now_count < String.valueOf(plus).length() + plus - a) {
				System.out.print(now_count);
				break;
			}
			else {
				if(a !=0) {
					if(check(arr,minus)) {		
						minus_result = String.valueOf(minus).length() + a - minus;
						System.out.print(minus_result);
						break;
					}
				
					if(check(arr,plus)) {
						plus_result = String.valueOf(plus).length() + plus - a;
						System.out.print(plus_result);
						break;
					}
					minus--;
					plus++;
				}
				else {
					if(check(arr,plus)) {
						plus_result = String.valueOf(plus).length() + plus - a;
						System.out.print(plus_result);
						break;
					}
					plus++;
				}
			}
			
		}
	}
	
	static public boolean check(int [] check_arr, int num) {
		for(int i =0 ; i < check_arr.length; i++) {
			if(String.valueOf(num).contains(String.valueOf(check_arr[i]))) {
				return false;
			}
		}
		return true;
	}
}

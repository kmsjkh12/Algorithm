import java.util.*;

public class Main {
	static int [][] map;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
		int x = sc.nextInt();
		
		int count = 0;
		int plus = 1;
		int num =10;
		
		for(int i = 1; i <= x;i++) {
			if(i % num== 0) {
				plus++;
				num *=10;
			}
			count +=plus;
		}
		System.out.print(count);
	}
	
}	

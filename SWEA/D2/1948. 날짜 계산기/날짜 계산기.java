import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		int[] days= new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
		for (int tc = 1; tc <= T; tc++) {
			int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            
            int sum = 0;
            for (int i = m1; i < m2; i++) {
             	sum += days[i-1];   
            }
            sum = sum - d1 + d2 + 1;
            System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
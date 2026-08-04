import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
			
            int num;
            for (int i = 0; i < 10; i++) {
             	num = sc.nextInt();
                sum += num;
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            
            System.out.println("#" + tc + " " + Math.round((sum - min - max) / 8.0));
		}
	}
}
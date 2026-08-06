import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        
		for (int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc);
            
            int sum = sc.nextInt();
            
            for (int i = 0; i < 8; i++) {
                System.out.print(sum / money[i] + " ");
            	if (sum / money[i] > 0)  sum %= money[i];
            }
            System.out.println();
		}
	}
}
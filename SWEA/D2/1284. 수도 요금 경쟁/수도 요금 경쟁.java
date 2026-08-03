import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++){
			int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            
            int aPrice = P * W;
            int bPrice = (R >= W) ? Q : (Q + (W - R) * S);
            int min = Math.min(aPrice, bPrice);
            
            System.out.println("#" + tc + " " + min);
		}
	}
}
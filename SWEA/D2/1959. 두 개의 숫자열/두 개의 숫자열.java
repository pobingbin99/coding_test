import java.util.Scanner;


class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[] arrShort = new int[N];
            int[] arrLong = new int[M];
            
            for (int i = 0; i < N; i++) {
                arrShort[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                arrLong[i] = sc.nextInt();
            }
            
            if (N > M) {
                int temp = N;
                N = M;
                M = temp;

                int[] tempArr = arrShort;
                arrShort = arrLong;
                arrLong = tempArr;
            }
            
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= (M-N); i++) {
             	int sum = 0;
                for (int j = 0; j < N; j++) {
                	sum += arrShort[j] * arrLong[j + i];
                }
                max = Math.max(max, sum);
            }
            
            System.out.println("#" + tc + " " + max);
		}
	}
}
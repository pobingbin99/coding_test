import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] sumArr = new int[N + 1][N + 1];
            
            for (int i = 1; i <= N; i++) {
             	for (int j = 1; j <= N; j++) {
                    sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + sc.nextInt();
                }
            }
            
            int max = 0;
            
            for (int i = M; i <= N; i++) {
             	for (int j = M; j <= N; j++) {
                	int sum = sumArr[i][j] - sumArr[i-M][j] - sumArr[i][j-M] + sumArr[i-M][j-M];
                    max = Math.max(max, sum);
                }
            }
            
            System.out.println("#" + test_case+ " " + max);
		}
	}
}
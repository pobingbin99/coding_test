import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int[][] arr = new int[100][100];
            
            sc.nextInt();
            for (int i = 0; i < 100; i++) {
            	for (int j = 0; j < 100; j++) {
                 	arr[i][j] = sc.nextInt();   
                }
            }
            
            int max = Integer.MIN_VALUE;
            
            // 행, 열 합
            for (int i = 0; i < 100; i++) {
                int row = 0, col = 0;
                for (int j = 0; j < 100; j++) {
                	row +=arr[i][j];
                    col += arr[j][i];
                }
                max = Math.max(Math.max(max, row), col);
            }
            
            // 대각선 합
            int diagonal1 = 0, diagonal2 = 0;
            for (int i = 0; i < 100; i++) {
            	diagonal1 += arr[i][i];
                diagonal2 += arr[i][99-i];
            }
            max = Math.max(Math.max(max, diagonal1), diagonal2);
            
            System.out.printf("#%d %d\n", tc, max);
		}
	}
}
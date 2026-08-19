import java.util.Scanner;

class Solution  {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(sc.nextLine());
            int[][] arr = new int[N][N];
            
            for (int i = 0; i < N; i++) {
            	String num = sc.nextLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = num.charAt(j) - '0';
                }
            }
            
            int mid = N / 2;
            int sum = 0;
            for (int i = 0; i < N; i++) {
             	int distance = Math.abs(mid - i);
                for (int j = distance; j < (N - distance); j++) {
                 	sum += arr[i][j];   
                }
            }
            
            System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
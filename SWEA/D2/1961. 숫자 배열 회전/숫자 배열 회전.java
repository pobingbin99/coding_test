import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		int[][] arr = new int[7][7];
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
           
            for (int i = 0; i < N; i++) {
             	for (int j = 0; j < N; j++) {
                 	arr[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("#" + tc);
            for (int i = 0; i <N; i++) {
                for (int j = N-1; j >= 0; j--) {
                    System.out.print(arr[j][i]);
                }
                System.out.print(" ");
                
                for (int j = N-1; j >= 0; j--) {
                	System.out.print(arr[N-1-i][j]);
                }
                System.out.print(" ");
                
             	for (int j = 0; j < N; j++) {
                	System.out.print(arr[j][N-1-i]);
                }
                System.out.println();
            }
 		}
	}
}
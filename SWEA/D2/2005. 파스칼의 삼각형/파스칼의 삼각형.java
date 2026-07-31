import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
    int[][] arr = new int[11][11];
    
    arr[1][1] = 1;
        
    for (int i = 2; i <= 10; i++) {
		  for (int j = 1; j <= i; j++) {
		    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
      }
    }

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
      System.out.println("#" + test_case);
      for (int i = 1; i <= N; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
		}
	}
}
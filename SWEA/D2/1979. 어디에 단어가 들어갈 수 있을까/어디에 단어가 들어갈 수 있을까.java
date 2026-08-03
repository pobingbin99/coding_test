import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
      int K = sc.nextInt();
            
      int[][] arr = new int[N][N];
	    for (int i = 0; i < N; i++) {
			  for (int j = 0; j < N; j++) {
		      arr[i][j] = sc.nextInt();
        }
      }
            
      int ans = 0;
            
      for (int i = 0; i < N; i++) {
	      int count = 0;
        for (int j = 0; j < N; j++) {
	        if (arr[i][j] == 1) count++;
          else {
	          if (count == K) ans++;
		          count = 0;
	          }
		      }
	      if (count == K) ans++;
      }
            
      for (int i = 0; i < N; i++) {
		    int count = 0;
	      for (int j = 0; j < N; j++) {
		      if (arr[j][i] == 1) count++;
	        else {
	          if (count == K) ans++;
	            count = 0;
            }
          }
	      if (count == K) ans++;
	    }
	    System.out.println("#" + tc + " " + ans);
		}
	}
}
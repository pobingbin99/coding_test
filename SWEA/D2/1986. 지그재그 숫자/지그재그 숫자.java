import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
        int[] arr = new int[11];
        for (int i = 1; i <= 10; i++) {
         	if (i % 2 == 0) arr[i] = arr[i-1] - i;
            else arr[i] = arr[i-1] + i;
        }
        
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
            System.out.println("#" + tc + " " + arr[N]);
		}
	}
}
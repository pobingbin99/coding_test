import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
            
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
            	arr[i] = sc.nextInt();
            }
            
            int count = 0;
            for (int i = 2; i < (N-2); i++) {
            	int max = Math.max(Math.max(arr[i-2], arr[i-1]), Math.max(arr[i+1], arr[i+2]));
                if (arr[i] > max) count += (arr[i] - max);
            }
            
            System.out.printf("#%d %d\n", tc, count);
		}
	}
}
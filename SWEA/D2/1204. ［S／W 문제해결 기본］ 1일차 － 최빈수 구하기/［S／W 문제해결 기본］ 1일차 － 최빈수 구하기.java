import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
            
            int[] arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                arr[sc.nextInt()]++;
            }
            
            int max = 1;
            for (int i = 1; i <= 100; i++) {
            	if (arr[max] <= arr[i]) max = i;
            }
            
            System.out.println("#" + test_case + " " +  max);
		}
	}
}
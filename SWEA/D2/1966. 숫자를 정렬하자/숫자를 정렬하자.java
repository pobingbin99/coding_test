import java.util.Scanner;
import java.util.Arrays;

class Solution {
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
		for (int tc = 1; tc <= T; tc++) {
			int size = sc.nextInt();
            int[] arr = new int[size];
            
            for (int i = 0; i < size; i++) {
             	arr[i] = sc.nextInt();   
            }
            
            Arrays.sort(arr);
            
            System.out.print("#" + tc + " ");
            for (int n : arr) {
            	System.out.print(n + " ");
            }
            System.out.println();
		}
	}
}
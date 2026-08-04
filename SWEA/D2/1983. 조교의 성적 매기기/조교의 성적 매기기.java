import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        String[] gradeArr = new String[] {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        
		for (int tc= 1; tc <= T; tc++) {
			int N = sc.nextInt();
            int K = sc.nextInt();
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
            	arr[i] = sc.nextInt() * 7 + sc.nextInt() * 9 + sc.nextInt() * 4;
            }
            
            double kNum = arr[K-1];
            
            Arrays.sort(arr);

            int count = 0;
        	for (int i = N-1; i >= 0; i--) {
            	if (arr[i] == kNum) break;
                count++;
            }
            
            System.out.println("#" + tc + " " + gradeArr[count * 10 / N]);
		}  
	}
}
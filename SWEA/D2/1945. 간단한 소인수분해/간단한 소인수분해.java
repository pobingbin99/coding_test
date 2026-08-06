import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        int[] div = {2, 3, 5, 7, 11};
        
		for (int tc = 1; tc <= T; tc++) {
            System.out.print("#" +tc + " ");
            
            int N = sc.nextInt();
      
			for (int i = 0; i < 5; i++) {
                int count = 0;
                
            	while (N % div[i] == 0) {
                    count++;
                    N /= div[i];
                }
                System.out.print(count + " ");
            }
            System.out.println();
		}
	}
}
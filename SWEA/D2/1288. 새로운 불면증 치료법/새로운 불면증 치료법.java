
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
            
            boolean[] visited = new boolean[10];
            int count = 0, multiple = 0;
            
            while (count < 10) {
            	multiple += N;
                
                int temp = multiple;
      			while (temp > 0) {
                    int digit =  temp % 10;
                    if (!visited[digit]) {
                    	visited[digit] = true;
                        count++;
                    }
                    temp /= 10;
                }
            }
            System.out.println("#" + tc + " " + multiple);
		}
	}
}
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int tc = 1; tc <= T; tc++) {
            System.out.println("#" + tc + " ");
            
			int N = sc.nextInt();
            int len = 0;
            
            for (int i = 0; i < N; i++) {
            	char ch = sc.next().charAt(0);
                int num = sc.nextInt();
                
				for (int j = 0; j < num; j++) {
                    System.out.print(ch);
                    len++;

                    if (len == 10) {
                        System.out.println();
                        len = 0;
                    }
                }
            }
            if (len > 0) System.out.println();
		}
	}
}
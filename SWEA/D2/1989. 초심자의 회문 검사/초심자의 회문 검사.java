import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int tc = 1; tc <= T; tc++){
			String str = sc.nextLine();
            int len = str.length();
            
            int ans = 1;
            for (int i = 0; i <(len/2); i++) {
             	if (str.charAt(i) != str.charAt(len -1 -i)) {
                	ans = 0;
                    break;
                }
            }
            
            System.out.println("#" + tc + " " + ans);
		}
	}
}
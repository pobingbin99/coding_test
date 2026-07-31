import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.nextLine();
            
            int len = 1;
            for (int i = 1; i <= 10; i++) {
                String substr1 = str.substring(0, i);
                String substr2 = str.substring(i, 2*i);
                if (substr1.equals(substr2)) {
                    len = i;
                    break;
                }
			}
            System.out.println("#" + test_case + " " + len);
        }
	}
}
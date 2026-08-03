import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int tc = 1; tc <= T; tc++){
			String str = sc.nextLine();
            String reverseStr = new StringBuilder(str).reverse().toString();
            System.out.println("#" + tc + " " + (str.equals(reverseStr) ? 1 : 0));
		}
	}
}
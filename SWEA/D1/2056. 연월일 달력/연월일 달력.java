import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
		for (int test_case = 1; test_case <= T; test_case++) {
			String dateStr = sc.next();
            
            int date = Integer.parseInt(dateStr);
            
            int day = date % 100;
            int month = (date / 100) % 100;
            int year = (date / 10000);
            
            System.out.print("#" + test_case + " " );
            if (month >= 1 && month <= 12) {
                if (day >= 1 && day <= days[month]) {
                    System.out.println(dateStr.substring(0,4) + "/" + dateStr.substring(4,6) + "/" + dateStr.substring(6,8));
                } else {
                   System.out.println(-1);
                }
            } else {
				System.out.println(-1);
            }
		}
	}
}
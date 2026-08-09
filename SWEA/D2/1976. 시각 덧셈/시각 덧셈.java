import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int timeSum= sc.nextInt();
            int minuteSum = sc.nextInt();
            timeSum += sc.nextInt();
            minuteSum += sc.nextInt();
            
            if (minuteSum >= 60) {
            	minuteSum -= 60;
                timeSum += 1;
            }
            if (timeSum >= 13) {
            	timeSum -= 12;    
            }
            
            System.out.printf("#%d %d %d\n", tc, timeSum, minuteSum); 
		}
	}
}
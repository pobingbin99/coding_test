import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
        int num1, num2;
        
		for (int test_case = 1; test_case <= T; test_case++) {
			num1 = sc.nextInt();
            num2 = sc.nextInt();
            
            if (num1 > num2) {
            	System.out.println("#" + test_case + " " + ">");
            } else if (num1 == num2) {
                System.out.println("#" + test_case + " " + "=");
            } else {
                System.out.println("#" + test_case + " " + "<");
            }
		}
	}
}
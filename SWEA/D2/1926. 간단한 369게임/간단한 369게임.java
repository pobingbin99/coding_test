import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        
		for (int n = 1; n <= N; n++) {
			String str = String.valueOf(n);
			int count = 0;
			
			for (int i = 0; i <str.length(); i++) {
				char ch = str.charAt(i);
				if (ch =='3' || ch == '6' || ch == '9') count++;
			}
			
			if (count > 0) {
				for (int j = 0; j < count; j++) {
					System.out.print("-");
				}
			} else {
				System.out.print(str);
			}
			System.out.print(" ");
		}
	}
}
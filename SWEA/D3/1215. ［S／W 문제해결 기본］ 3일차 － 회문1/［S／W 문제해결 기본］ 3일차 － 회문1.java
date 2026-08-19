import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[8][];
        
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(sc.nextLine());
            
            for (int i = 0; i < 8; i++) {
            	arr[i] = sc.nextLine().toCharArray();
            }
            
            int count = 0;
            
            for (int i = 0; i <8; i++) {
                for (int j = 0; j <= (8 - N); j++) {
                	String str1 = "";
                    String str2 = "";
                    
                    for (int k = j; k < (j + N); k++) {
                     	str1 += arr[i][k];   
                        str2 += arr[k][i];
                    }
                    
                    String reverse1 = new StringBuilder(str1).reverse().toString();
                    String reverse2 = new StringBuilder(str2).reverse().toString();
                    if (str1.equals(reverse1)) count++;
                    if (str2.equals(reverse2)) count++;
                }
            }
			System.out.printf("#%d %d\n", tc, count);
		}
	}
}
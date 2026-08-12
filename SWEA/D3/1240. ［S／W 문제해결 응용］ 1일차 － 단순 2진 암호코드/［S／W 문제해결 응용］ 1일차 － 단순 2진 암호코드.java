import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
        
        Map<String, Integer> codeMap = new HashMap<>();

        codeMap.put("0001101", 0);
        codeMap.put("0011001", 1);
        codeMap.put("0010011", 2);
        codeMap.put("0111101", 3);
        codeMap.put("0100011", 4);
        codeMap.put("0110001", 5);
        codeMap.put("0101111", 6);
        codeMap.put("0111011", 7);
        codeMap.put("0110111", 8);
        codeMap.put("0001011", 9);

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
            sc.nextLine();
            
            String code = null;
            for (int i = 0; i < N; i++) {
             	String str = sc.nextLine();
                
                if (str.contains("1")) {
                    int index = str.lastIndexOf("1");
                    code = str.substring(index - 55, index + 1);
                }
            }
            
            int check = 0;
            int[] nums = new int[8];
            for (int i = 0; i < 8; i++) {
                String part = code.substring(i * 7, i * 7 + 7);
   				nums[i] = codeMap.get(part);
                
                if (i % 2 == 0) check += nums[i] * 3;
                else  check += nums[i];
            }
            
            if (check % 10 == 0) System.out.printf("#%d %d\n", tc, Arrays.stream(nums).sum());
            else System.out.printf("#%d 0\n", tc);
		}
		sc.close();
	}
}
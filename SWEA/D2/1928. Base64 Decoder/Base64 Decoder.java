import java.util.Scanner;

class Solution {
    private static final int[] ENCODE = new int[128];
    
    static {
    	for (int i = 0; i < 26; i++) {
        	ENCODE['A' + i] = i; 
        }
        for (int i = 0; i < 26; i++) {
        	ENCODE['a' + i] = (i + 26);
        }
        for (int i = 0; i < 10; i++) {
        	ENCODE['0' + i] = (i + 52);
        }
        ENCODE['+'] = 62;
        ENCODE['/'] = 63;
    }
    
    public static String decode(String str) {
    	StringBuilder sb = new StringBuilder();

    	for (int i = 0; i < str.length(); i += 4) {
        	int num = 0;
			// Base64 4글자를 가져와서
            for (int j = 0; j < 4; j++) {
                num <<= 6;
                num |= ENCODE[str.charAt(i + j)];
            }
			// ASCII 코드 3글자로 변환
            sb.append((char) ((num >> 16) & 0xFF));
            sb.append((char) ((num >> 8) & 0xFF));
            sb.append((char) (num & 0xFF));
		}
		return sb.toString();
    }
    
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
        
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.nextLine();
            System.out.println("#" + tc + " " + decode(str));
		}
	}
}
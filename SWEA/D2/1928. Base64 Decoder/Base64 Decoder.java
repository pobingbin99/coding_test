import java.util.Scanner;
import java.util.Base64;

class Solution {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = sc.nextLine();

            String result = new String(Base64.getDecoder().decode(str));

            System.out.println("#" + tc + " " + result);
        }
    }
}
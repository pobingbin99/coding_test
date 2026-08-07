import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            int speed = 0;
            int distance = 0;

            for (int i = 0; i < N; i++) {
                int command = sc.nextInt();

                if (command == 1) {
                    int x = sc.nextInt();
                    speed += x;
                } else if (command == 2) {
                    int x = sc.nextInt();
                    speed -= x;
                    if (speed < 0) speed = 0;
                }
                distance += speed;
            }
            System.out.println("#" + tc + " " + distance);
        }
    }
}
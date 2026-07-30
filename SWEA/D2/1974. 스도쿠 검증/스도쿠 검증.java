import java.util.Scanner;

class Solution {
    static int[][] arr = new int[9][9];
    
    static int check() {
        for (int i = 0; i < 9; i++) {
            boolean[] visited = new boolean[10];

            for (int j = 0; j < 9; j++) {
                int num = arr[i][j];
                if (visited[num]) return 0;
                visited[num] = true;
            }
        }

        for (int j = 0; j < 9; j++) {
            boolean[] visited = new boolean[10];

            for (int i = 0; i < 9; i++) {
                int num = arr[i][j];
                if (visited[num]) return 0;
                visited[num] = true;
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                boolean[] visited = new boolean[10];

                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {
                        int num = arr[i][j];
                        if (visited[num]) return 0;
                        visited[num] = true;
                    }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + tc + " " + check());
        }
    }
}
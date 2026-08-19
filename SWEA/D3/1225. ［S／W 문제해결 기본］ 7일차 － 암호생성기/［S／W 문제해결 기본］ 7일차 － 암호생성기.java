import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++)  {
			sc.nextInt();
            
            Queue<Integer> queue = new ArrayDeque<>(); 
            for (int i = 0; i < 8; i++) {
             	queue.offer(sc.nextInt());   
            }
            
            int minus = 1;
            while (true) {
            	int num = Math.max(queue.poll() - minus, 0);
                queue.offer(num);
                
                if (num == 0) break;
                
                if (minus == 5) minus = 1;
                else minus++;
            }
            
            System.out.printf("#%d ", tc);
            for (Integer n : queue) {
            	System.out.printf("%d ", n);
            } System.out.println();
		}
	}
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        
		for (int tc = 1; tc <= 10; tc++){
			int N = sc.nextInt();
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < 100; i ++) {
            	list.add(sc.nextInt());
            }
            
            for (int i = 0; i < N; i++ ) {
            	int max = Collections.max(list);
                int min = Collections.min(list);
                
                if (max == min) break;
                
                list.set(list.indexOf(max), max - 1);
				list.set(list.indexOf(min), min + 1);
            }
            System.out.printf("#%d %d\n", tc, Collections.max(list) - Collections.min(list));
		}
	}
}
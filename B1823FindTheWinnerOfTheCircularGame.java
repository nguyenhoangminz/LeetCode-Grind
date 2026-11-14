import java.util.LinkedList;
import java.util.Queue;
public class B1823FindTheWinnerOfTheCircularGame {
    public static void main(String[] args){
        int n = 6;
        int k = 5;
        System.out.println(findTheWinner(n, k));
    }
    public static int findTheWinner(int n, int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }
        while(queue.size() > 1){
            for(int i = 1; i < k; i++){
                queue.offer(queue.poll());
            }
            queue.poll();

        }
        return queue.peek();
    }
}

import java.util.LinkedList;
import java.util.Queue;
public class B933NumberOfRecentCall {
    Queue<Integer> queue;
    public static void main(String[] args){
        
    }
    public B933NumberOfRecentCall(){
        queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.offer(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}

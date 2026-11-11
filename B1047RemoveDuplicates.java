import java.util.Stack;
public class B1047RemoveDuplicates {
    public static void main(String[] args){
        String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

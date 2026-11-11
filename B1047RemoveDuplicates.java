import java.util.Stack;
public class B1047RemoveDuplicates {
    public static void main(String[] args){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        Stack<Character> stack =  new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder ketQua = new StringBuilder();
        while(!stack.isEmpty()){
            ketQua.append(stack.pop());
        }
        return ketQua.reverse().toString();
    }
}

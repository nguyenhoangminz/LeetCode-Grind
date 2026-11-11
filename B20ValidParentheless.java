import java.util.Stack;
public class B20ValidParentheless{
    public static void main(String[] args){
        String s = "([)]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();  i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char t = stack.peek();
                if(c == ')' && t != '(' || c == ']' &&  t != '[' && c == '}' && t != '{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
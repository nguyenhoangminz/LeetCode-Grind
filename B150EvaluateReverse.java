import java.util.Stack;
public class B150EvaluateReverse {
    public static void main(String[] args){
    }
    public static int evalRPN(String[] tokens){
        // Duyệt qua từng mảng trong chuỗi

        Stack<Integer> stack = new Stack<>();
            for(String token : tokens){
                if(token.equals("+")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int total = num2 + num1;
                    stack.push(total);
                }
                else if(token.equals("-")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int minus = num2 - num1;
                    stack.push(minus);
                }
                else if(token.equals("*")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int time = num2 * num1;
                    stack.push(time);
                }
                else if(token.equals("/")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int divide = num2/num1;
                    stack.push(divide);
                }
                else{
                    int num = Integer.parseInt(token);
                    stack.push(num);
                }
            }
        return stack.peek();
    }
}
import java.util.Stack;
public class B844BackspaceString {
    public static void main(String[] args){
        String s = "a##c";
        String t = "c";
        System.out.println(backspaceCompare(s, t));
    }
    public static boolean backspaceCompare(String s, String t){
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#'){
                if(!stackS.isEmpty()){
                    stackS.pop();
                }
            
            }else{
                stackS.push(c);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char a = t.charAt(i);
            if(a == '#'){
                if(!stackT.isEmpty()){
                    stackT.pop();
                }
            }else{
                stackT.push(a);
            }
        }
        StringBuilder ketQua1 = new StringBuilder();
        StringBuilder ketQua2 = new StringBuilder();
        while(!stackS.isEmpty()){
            ketQua1.append(stackS.pop());
        }
        ketQua1.reverse();
        while(!stackT.isEmpty()){
            ketQua2.append(stackT.pop());
        }
        ketQua2.reverse();
        return ketQua1.toString().equals(ketQua2.toString());
    }
}

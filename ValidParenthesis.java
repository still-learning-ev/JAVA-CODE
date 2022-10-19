import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str="(])";
        System.out.println(isValid(str));
    }
    static boolean isValid(String str) {
        Stack <Character> stack=new Stack<>();
        for(char c :str.toCharArray()){
            if(c!=']'&&c!=')'&&c!='}'){
                stack.push(c);
            }
                
            else{
                char top=c;
                if(!stack.isEmpty())
                    top=stack.peek();
                else
                    stack.push(top);
                if(top=='(' && c==')' || top=='[' && c==']' || top=='{' && c=='}')
                 {
                    if(!stack.isEmpty())
                        stack.pop();
                 } 
                 else 
                    stack.push(c); 
                
            }
            System.out.println(stack);
        }
        return stack.isEmpty();
    }
}

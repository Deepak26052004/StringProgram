import java.util.Stack;

public class Check_whether_string_contains_balanced_brackets {
    public static void main(String[] args) {
        String s="((a+b)*[c-d])";
        String opening="({[";
        String closing=")}]";
        Stack<Character> stack=new Stack<>();
        for (char c : s.toCharArray()) {
            if(opening.indexOf(c) != -1) stack.push(c);
            else if (closing.indexOf(c) != -1){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                char top=stack.pop();
                if(opening.indexOf(top) != closing.indexOf(c)){
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(stack.isEmpty()) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
}

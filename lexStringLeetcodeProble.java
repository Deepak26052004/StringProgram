import java.util.Arrays;

public class lexStringLeetcodeProble {
    public static void main(String[] args) {
        String input[]={"flower","flow","flight"};
        System.out.println("Input Array: "+Arrays.toString(input));
        String res=solve(input);
        System.out.println("Result: "+res);
        
    }
    public static String solve(String input[]){
        Arrays.sort(input);
        String s1=input[0];
        String s2=input[input.length-1];
        String res="";
        for(int i=0;i<s1.length() && i<s2.length();i++){
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(a != b) return res;
            else res+=a;
        }
        return res;
    }
}

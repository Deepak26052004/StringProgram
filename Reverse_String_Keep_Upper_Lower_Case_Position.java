import java.util.Arrays;

public class Reverse_String_Keep_Upper_Lower_Case_Position {
    public static void main(String[] args) {
        String s="beDAafNzMc";
        System.out.println("Original String: "+s);
        String res=solve(s);
        System.out.println("Result String: "+res);
    }
    public static String solve(String s){
        char a[]=s.toCharArray();
        Arrays.sort(a);
        int upperCase=0,lowerCase=0;
        for(int i=0;i<a.length;i++){
            if(Character.isLowerCase(a[i])){
                lowerCase=i;
                break;
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)) stringBuilder.append(a[lowerCase++]);
            else if(Character.isUpperCase(c)) stringBuilder.append(a[upperCase++]);
        }
        return stringBuilder.toString();
    }
}

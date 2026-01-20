public class StringProblemEg3 {
    public static void main(String[] args) {
        System.out.println(isRotation("abcde", "deabc"));
        System.out.println(isRotation("abc", "bac"));
    }
    public static boolean isRotation(String s,String n){
        if(s.length() != n.length()) return false;
        return (s+s).contains(n);
    }
}

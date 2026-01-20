public class removeDupElementString {
    public static void main(String[] args) {
        String s="hi how are you";
        String res="";
        for (char c : s.toCharArray()) {
            if(res.indexOf(c) == -1) res+=c;
        }
        System.out.println(res);
    }
}

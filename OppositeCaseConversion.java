public class OppositeCaseConversion {
    public static void main(String[] args) {
        String s="DeEpAk";
        String res="";
        String res1="";
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) res+=Character.toLowerCase(c);
            else if(Character.isLowerCase(c)) res+=Character.toUpperCase(c);
            else res+=c;
        }
        for (char c : s.toCharArray()) {
            if(c>='A' && c<='Z') res1+=(char)(c+32);
            else if(c>='a' && c<='z') res1+=(char)(c-32);
            else res1+=c;
        }
        System.out.println(s);
        System.out.println(res);
        System.out.println(res1);
    }
}

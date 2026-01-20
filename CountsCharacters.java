public class CountsCharacters {
    public static void main(String[] args) {
        String s="AbcBRd83k$#@45";
        int uc=0,lc=0,sc=0,d=0;
        char a[]=s.toCharArray();
        for (char c : a) {
            if(Character.isUpperCase(c)) uc++;
            else if(Character.isLowerCase(c)) lc++;
            else if(Character.isDigit(c)) d++;
            else sc++;
        }
        System.out.println("Upper Case Count: "+uc);
        System.out.println("Lower Case Count: "+lc);
        System.out.println("Special Case Count: "+sc);
        System.out.println("Digit Count: "+d);
    }
}

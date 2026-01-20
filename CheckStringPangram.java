public class CheckStringPangram{

    public static void main(String[] args) {
        String s="The quick rown fox jumps over the lazy dog";
        if(checkPangram(s)) System.out.println(s+" is a \"Pangram \"String");
        else System.out.println(s+" is \"Not a Pangram\" String");
    }

    public static boolean checkPangram(String s){
        s=s.toLowerCase();
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1) return false;
        }
        return true;
    
    }
}
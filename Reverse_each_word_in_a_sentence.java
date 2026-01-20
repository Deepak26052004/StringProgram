public class Reverse_each_word_in_a_sentence {
    public static void main(String[] args) {
        String s="hi how";
        String a[]=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<a.length;i++){
            stringBuilder.append(revMyStr(a[i])).append(" ");
        }
        System.out.println(s);
        System.out.println(stringBuilder.toString().trim());
    }
    public static String revMyStr(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}

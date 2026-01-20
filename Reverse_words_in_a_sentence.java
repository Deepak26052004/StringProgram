public class Reverse_words_in_a_sentence {
    public static void main(String[] args) {
        String s="hi how are you";
        String a[]=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            stringBuilder.append(a[i]).append(" ");
        }
        System.out.println(s);
        System.out.println(stringBuilder.toString().trim());
    }
}

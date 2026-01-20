public class Find_longest_word_in_a_sentence {
    public static void main(String[] args) {
        String s="Deepak is preparing for interviews";
        String a[]=s.split(" ");
        String longestWord=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i].length()>longestWord.length()){
                longestWord=a[i];
            }
        }
        System.out.println(longestWord);
    }
}

public class Replace_every_vowel_with_start {
    public static void main(String[] args) {
        String s="deepakiou";
        s=s.toLowerCase();
        String vowel="aeiou";
        for (char c : s.toCharArray()) {
            if(vowel.indexOf(c) != -1) s=s.replace(c, '*');
        }
        System.out.println(s);
        String s1="deepakiou";
        String vowels="aeiouAEIOU";
        StringBuilder stringBuilder=new StringBuilder(s);
        for(int i=0;i<stringBuilder.length();i++){
            if(vowels.indexOf(stringBuilder.charAt(i)) != -1) stringBuilder.setCharAt(i, '*');
        }
        System.out.println(stringBuilder);

    }
}

public class StringProblemEg2 {
    public static void main(String[] args) {
        String s="Apple Banana Kiwi Mango Papaya Grapes Strawberry";
        StringBuilder answer=new StringBuilder();
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if(i%2==0){
                answer.append(revString(removeDuplicate(a[i]))).append(" ");
            }
            else{
                answer.append(removeDuplicate(a[i])).append(" ");
            }
        }
        System.out.println(s);
        System.out.println(answer.toString().trim());
    }
    public static String removeDuplicate(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(res.indexOf(c)==-1) res+=c;
        }
        return res;
    }

    public static String revString(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--) res+=s.charAt(i);
        return res;
    }
}

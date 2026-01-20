public class StringProblemEg {
    public static void main(String[] args) {
        String s="aaaabbaaccdddeee";
        System.out.println(s);
        String res=solve(s);
        System.out.println(res);
    }
    public static String solve(String s){
        char a[]=s.toCharArray();
        int count=1;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]) count++;
            else{
                res.append(a[i]).append(count);
                count=1;
            }
        }
        res.append(a[a.length-1]).append(count);
        return res.toString();
    }
}

public class SumOnlyDigits {
    public static void main(String[] args) {
        String s="ab12abc34c";
        int sum=0;
        char a[]=s.toCharArray();
        for (char c : a) {
            if(c>='0' && c<='9') sum+=c-48;
        }
        System.out.println("Sum: "+sum);
    }
    
}

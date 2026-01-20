public class RevStringKeepSpecialCharacters {
    public static void main(String[] args) {
        String s="Hi@how#are&you";
        System.out.println(s);
        String res=solve(s);
        System.out.println(res);
    }
    public static String solve(String s){
        char a[]=s.toCharArray();
        int l=0,r=a.length-1;
        while (l<r) {
            if(!Character.isLetter(a[l])) l++;
            else if(!Character.isLetter(a[r])) r--;
            else{
                char temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
        return new String(a);

    }
}

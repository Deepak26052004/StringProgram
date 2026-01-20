public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s = "Java    is   very    easy";
        String result = "";
        boolean space = false;
        for (char c : s.toCharArray()) {
            if(c != ' '){
                result+=c;
                space=false;
            }
            else if(!space){
                result+=c;
                space=true;
            }
        }
        System.out.println(s);
        System.out.println(result);
    }
    
}

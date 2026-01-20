import java.util.LinkedHashMap;

public class Check_whether_string_has_all_unique_characters {
   public static void main(String[] args) {
    String s="abcdefdd";
    LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
    for (char c : s.toCharArray()) {
        if(lhm.containsKey(c)){
            lhm.put(c, lhm.get(c)+1);
        }
        else{
            lhm.put(c,1);
        }
    }
    if(check(lhm)) System.out.println("All characters are unique");
    else System.out.println("Not all characters are unique");
   }
   public static boolean check(LinkedHashMap<Character,Integer> lhm){
    for (int count : lhm.values()) {
        if(count>1) return false;
    }
    return true;

   }
}

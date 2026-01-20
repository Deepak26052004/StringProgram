import java.util.LinkedHashMap;

public class Print_duplicate_characters_and_their_count {
    public static void main(String[] args) {
        String s="abcdeefdd";
        LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if(lhm.containsKey(c)){
                lhm.put(c, lhm.get(c)+1);
            }
            else{
                lhm.put(c,1);
            }
        }
        printDup(lhm);
    }
    public static void printDup(LinkedHashMap<Character,Integer> lhm){
        for(var entry:lhm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" -> "+entry.getValue());
            }
        }
    }
}

import java.util.LinkedHashMap;
public class StringCharactersCountApproach2 {
    public static void main(String[] args) {
        String s="Hello";
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c,hashMap.get(c)+1); 
            }
            else{
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);
    }
}

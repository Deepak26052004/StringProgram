public class GetDigitOnlyAndRevDigit {
    public static void main(String[] args) {
        String s = "De12ep34ak56rajesh";
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                res.append(s.charAt(i));
            }
        }

        System.out.println(Long.parseLong(res.toString()));
    }
}

public class ExpandStringProblemEg {
    public static void main(String[] args) {
        String s = "a10b3c12d4e6";
        System.out.println("Original String: " + s);
        System.out.println("===== Result =====");
        solve(s);
    }

    public static void solve(String s) {
        char[] a = s.toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        letters.append(a[0]);

        for (int i = 1; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                digits.append(a[i]);
            } else {
                letters.append(a[i]);
                digits.append(" ");
            }
        }

        String[] b = digits.toString().split(" ");

        for (int i = 0; i < letters.length(); i++) {
            int count = Integer.parseInt(b[i]);
            for (int j = 0; j < count; j++) {
                System.out.print(letters.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}

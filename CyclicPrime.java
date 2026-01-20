public class CyclicPrime {
    public static void main(String[] args) {
        String s = "991";
        if (isCyclicPrime(s)) {
            System.out.println(s + " is a Cyclic Prime");
        } else {
            System.out.println(s + " is not a Cyclic Prime");
        }
    }

    public static boolean isCyclicPrime(String s) {
        int length = s.length();
        String rotated = s;

        for (int i = 0; i < length; i++) {
            int number = Integer.parseInt(rotated);
            if (!isPrime(number)) return false;
            rotated = rotated.substring(1) + rotated.charAt(0);
        }

        return true;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

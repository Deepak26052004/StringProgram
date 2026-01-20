public class Validate_email_format_using_string_method {
    public static void main(String[] args) {
        String email = "rb.deepak06@gmail.com";
        System.out.println(checkValidEmail(email) ? "Valid Email" : "Invalid Email");
    }

    public static boolean checkValidEmail(String email) {
        if(email.contains(" ")) return false;
        if(email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@')) return false;

        String[] parts = email.split("@");
        String left = parts[0];
        String right = parts[1];

        if(right.indexOf('.') == -1 || right.charAt(right.length() - 1) == '.') return false;
        return left.length() > 0 && right.length() > 0;
    }
}

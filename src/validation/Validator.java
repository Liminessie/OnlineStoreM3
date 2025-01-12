package validation;

public class Validator {
    public static boolean validatePrice(int price) {
        if (price > 0) {
            return true;
        }
        return false;
    }

    public static boolean validateDate(String date) {
        if (date.matches("\\d{4}-\\d{2}-\\d{2}") || date.matches("\\d{2}-\\d{2}-\\d{4}")) {
            return true;
        }
        return false;
    }

    public static boolean validatePhone(String phone) {
        if (phone.matches("\\d{10}")) {
            return true;
        }
        return false;
    }

    public static boolean validateDNI(String Dni) {
        if (Dni.matches("\\d{8}[A-Z]")) {
            return true;
        }
        return false;
    }
}

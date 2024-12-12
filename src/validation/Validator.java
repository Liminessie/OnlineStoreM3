package validation;

import java.time.LocalDate;

public class Validator {
    
    public static boolean validateEmail(String email) {
        return email.contains("@") && (email.contains(".com") || email.contains(".es"));
    }

    public static boolean validatePhone(String phone) {
        return phone.length() == 9;
    }

    public static boolean validateDate(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

    public static boolean validateDateOfUnion(String date) {
        try {
            String[] parts = date.split("/");
            if (parts.length != 3) {
                return false;
            }
            
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            
            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900) {
                return false;
            }
            
            LocalDate dateToValidate = LocalDate.of(year, month, day);
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkId(int typeDoc, String Id) {
        
        String validation = Integer.toString(typeDoc);
        char[] arrayDni = validation.toCharArray();
        int lDni = typeDoc % 23;
        
        char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        if (arrayDni.length != 8) {
            return false;
        } else if (Id.equals(letraDni[lDni])) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkPrice(float price) {
        if (price > 0) {
            return true;
        }
        return false;
    }
}

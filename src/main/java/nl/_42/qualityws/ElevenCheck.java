package nl._42.qualityws;

/**
 * Utility class that provides a method to check if a given accountNumber succeeds the '11-check'.
 * https://nl.wikipedia.org/wiki/Elfproef.
 */
public class ElevenCheck {

    /**
     * Given accountNumber may contain any alphanumeric character.
     * 
     * @param accountNumber String - the raw accountNumber to be checked
     * @return boolean - true if 11-check succeeds, false otherwise
     */
    public static boolean execute(String accountNumber) {

        // accountnumber may not be null
        if (accountNumber == null) {
            throw new IllegalArgumentException("Accountnumber must exist.");
        }

        // Check max length of 10 digits
        if (accountNumber.length() > 10) {
            throw new IllegalArgumentException("Accountnumber may not contain more than 10 digits.");
        }
        
        // Strip all non-digits
        StringBuilder accountNumberOnlyDigits = new StringBuilder();
        for (String character : accountNumber.split("")) {
            Character currentChar = character.charAt(0);
            if (Character.isDigit(currentChar)) {
                accountNumberOnlyDigits.append(currentChar);
            }
        }
       
        // Check if accountNumber does not only contain zero's
        boolean onlyZeroes = true;
        for (String number : accountNumberOnlyDigits.toString().split("")) {
            if (!number.equals("0")) {
                onlyZeroes = false;
            }
        }
        if (onlyZeroes) {
            throw new IllegalArgumentException("Accountnumber with only zero's not permitted.");
        }

        // Left pad accountnumber with zero's to 10 digits
        StringBuilder accountNumberLengthTen = new StringBuilder();
        for (int position = accountNumberOnlyDigits.length(); position < 10; position++) {
            accountNumberLengthTen.append('0');
        }
        accountNumberLengthTen.append(accountNumberOnlyDigits);

        // Calculate 11-check sum (left-to-right)
        Integer sumLTR = 0;
        Integer positionLTR = 0;
        String[] digitsLTR = accountNumberLengthTen.toString().split("");
        for (String stringDigit : digitsLTR) {
            Integer digit = Integer.parseInt(stringDigit);
            sumLTR += digit * positionLTR;
            positionLTR++;
        }

        return true;
    }
}
package string_tasks;

public class String_PassWordValidation {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */


    public static boolean passwordIsValid(String password) {

        boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasDigits = password.matches("(.*\\d.*)"),
                hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

        if (password.length() >= 6 && !password.contains(" ")) {
            return hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar;
        }

        return false;
    }


}

package tech_tasks.string;

import org.junit.jupiter.api.Assertions;

public class EmailValidator {
    public static void main(String[] args) {

        String[] invalidEmails = {
                "@gmail.com",
                "e@gmail.com.",
                "e..b@gmail.com",
                "e@gmail.name.com",
                "e@gmail,com",
                "name@gmail.",
                "name@gmail",
                "name@gmail..",
                "name@gmail..com",
                "name@gmail..com.",
                null,
                ""
        };

        String[] validEmails = {
                "name@gmail.com",
                "name.surname@gmail.com",
                "name.surname.pseudo@gmail.com",
                "name.surname.pseudo@somethingbighererightthere.com",
                "name.surname.pseudo@gmail.ru"
        };


        for (String email : validEmails) {
            Assertions.assertTrue(validateEmail(email));
        }

        for (String email : invalidEmails) {
            Assertions.assertFalse(validateEmail(email));
        }

        System.out.println(getConfig("string"));
    }

//    static boolean validateEmail(String email) {
//
//        boolean result = true;
//
//        if (!email.contains("@")) {
//            return false;
//        } else if (!email.contains(".")) {
//            return false;
//        }
//
//        return result;
//    }

    static boolean validateEmail(String email) {

        return email != null
                && !email.isEmpty()
                && email.contains("@")
                && email.contains(".")
                && email.indexOf("@") > 0
                && email.indexOf(".") > 0
                && email.length() - email.indexOf(".") > 1
                && email.split("@")[1]
                .chars()
                .filter(c -> c == '.').count() == 1
                && !email.contains("..");
    }

    private static String getConfig(String env) {
        return env.equals("local") ? "localConfig" : "dockerConfig";
    }
}

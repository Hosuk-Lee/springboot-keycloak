package hs.example.keycloak.oidc.infra.utility;

import java.util.Arrays;

public class StringUtil {

    public static void nullValidation(String... args) {
        if ( Arrays.stream(args).anyMatch(arg-> StringUtil.isEmpty(arg)) ) {
            throw new IllegalArgumentException();
        }
    }
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }

    public static boolean contains(String value, String... args) {
        return Arrays.asList(args).contains(value);
    }

    public static boolean containsNot(String value, String... args) {
        return !contains(value, args);
    }

    public static String nvl(String expr1, String expr2) {
        return isEmpty(expr1) ? expr2 : expr1;
    }
}

package hs.example.keycloak.oidc.infra.utility;

import java.math.BigDecimal;

public class BigDecimalUtil {
  public static boolean isNullOrValueOfBigDecimal(String value) {
    if (value == null || value.length() == 0) {
      return true;
    }

    try {
      new BigDecimal(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static boolean isValueOfBigDecimal(String value) {
    try {
      new BigDecimal(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

}

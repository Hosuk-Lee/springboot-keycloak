package hs.example.keycloak.oidc.infra.utility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateUtil {

    public static String getTodayByFormat(String format) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }

    public static String getTodayByFormatOld(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    public static String getNowByFormat(String format) {
      return OffsetDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }

    public static String getNowTimestampToString(){
      return OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSXXX"));
    }

}

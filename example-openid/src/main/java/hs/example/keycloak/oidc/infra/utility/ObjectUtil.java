package hs.example.keycloak.oidc.infra.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class ObjectUtil {
    public static void logObjectToJson(Object obj) {
        try {
            Logger logger = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
            ObjectMapper om = new ObjectMapper();
            om.registerModule(new JavaTimeModule());
            logger.info("{} >> {}",
                    Thread.currentThread().getStackTrace()[2].getLineNumber(),
                    om.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
    }
}

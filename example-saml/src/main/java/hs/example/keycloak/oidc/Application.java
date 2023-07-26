package hs.example.keycloak.oidc;

import static java.nio.charset.Charset.defaultCharset;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Locale.US;
import static java.util.TimeZone.getTimeZone;

import jakarta.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.TimeZone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
//@SpringBootApplication(exclude = { ServiceRegistryAutoConfiguration.class } , scanBasePackages = { "hs.example.*" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private static final TimeZone UTC = getTimeZone("UTC");

	@PostConstruct
	public void postConstruct() {
		if (!UTC.hasSameRules(TimeZone.getDefault())) {
			log.warn("Expecting {} as default timezone [current={}]", UTC.getDisplayName(),
					TimeZone.getDefault().getDisplayName());
		}
		if (!UTF_8.equals(Charset.defaultCharset())) {
			log.warn("Expecting {} as default charset [current={}]", UTF_8.name(), defaultCharset());
		}
		if (!US.equals(Locale.getDefault())) {
			log.warn("Expecting {} as default locale [current={}]", US.getDisplayName(),
					Locale.getDefault().getDisplayName());
		}
	}

}

package hs.example.keycloak.oidc.infra.config;

//import de.knowis.cp.common.security.autoconfiguration.HttpSecurityConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

//@Configuration
public class SecurityAutoConfigurationEx {

  private static final Logger log = LoggerFactory.getLogger(SecurityAutoConfigurationEx.class);

    @Bean
    @Primary // 반드시 추가해야 함. FSW Framework이 정의한 Security Bean보다 우선해서 적용하게 함
    @Autowired
    public HttpSecurityConfigurer httpSecurityConfigureEx() {
      log.info("Creating bean httpSecurityConfigurerEx");
      return http -> {

      };
    }
}

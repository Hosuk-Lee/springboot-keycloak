package hs.example.keycloak.oidc.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {
//    @Bean
//    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .saml2Login((s) -> s.relyingPartyRegistrationRepository())
//                .csrf(AbstractHttpConfigurer::disable)
//                .sessionManagement((sessionManagement) ->
//                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                )
//                .authorizeHttpRequests((authorizeRequests) ->
//                        authorizeRequests.anyRequest().permitAll()
//                );
//
//        return http.build();
//    }
}
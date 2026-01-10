package calling.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            // desabilita CSRF (necessário pro H2)
	            .csrf(csrf -> csrf.disable())

	            // permite H2 Console
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/h2-console/**").permitAll()
	                .anyRequest().permitAll()
	            )

	            // libera iframe (H2 usa iframe)
	            .headers(headers ->
	                headers.frameOptions(frame -> frame.disable())
	            );

	        return http.build();
	    }
	
}

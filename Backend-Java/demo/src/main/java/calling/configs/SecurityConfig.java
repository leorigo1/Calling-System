package calling.configs;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
	            
	            //permite acesso global do CORS
	            .cors(cors -> {})

	            // libera iframe (H2 usa iframe)
	            .headers(headers ->
	                headers.frameOptions(frame -> frame.disable())
	            );
	        return http.build();
	    }
	 
	 @Bean
	 CorsConfigurationSource corsConfigurationSource() {
		 
		 CorsConfiguration config = new CorsConfiguration();
		 
		 config.setAllowedOrigins(List.of("http://localhost:4200"));
		 config.setAllowedMethods(List.of("GET","POST","PUT","DELETE"));
		 config.setAllowedHeaders(List.of("*"));
		 config.setAllowCredentials(true);
		 
		 UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		 source.registerCorsConfiguration("/**", config);
		 
		 return source;
	 }
}

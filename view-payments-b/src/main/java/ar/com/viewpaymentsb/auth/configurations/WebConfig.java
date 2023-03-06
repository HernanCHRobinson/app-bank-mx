package ar.com.viewpaymentsb.auth.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedOrigins(
        				"http://192.168.1.171:*",
        				"http://192.168.1.171:9093",
        				"http://localhost",
        				"http://localhost:*",
        				"http://localhost:3000",
        				"http://192.168.1.171:3000",
        				"http://190.189.109.242:3000")
        		.allowedHeaders("Authorization", "Cache-Control", "Content-Type")
        		.exposedHeaders("Authorization","Location")
        		.allowCredentials(true)
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }

}

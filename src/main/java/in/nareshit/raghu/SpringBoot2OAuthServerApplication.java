package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringBoot2OAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2OAuthServerApplication.class, args);
	}

}

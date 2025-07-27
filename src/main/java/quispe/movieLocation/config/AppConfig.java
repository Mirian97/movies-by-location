package quispe.movieLocation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

	@Bean
	WebClient webClient() {
		return WebClient.builder().baseUrl("https://data.sfgov.org/resource/yitu-d5am.json").build();
	}
}

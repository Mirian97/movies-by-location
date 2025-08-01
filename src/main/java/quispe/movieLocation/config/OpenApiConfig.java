package quispe.movieLocation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(
				new Info()
						.version("1.0.0")
						.title("Movies from location")
						.description("Uber Challenge to get movies from specific location. API built in Java and Spring boot"));
	}
}

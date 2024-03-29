package com.infosys.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@SpringBootApplication
public class MockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockApplication.class, args);
	}
	@Bean
    public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)
			.groupName("mockApi")
			.apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.infosys.mock.controller"))
            .paths(PathSelectors.any())
            .build();
    }
private ApiInfo apiInfo() {
	return new ApiInfoBuilder()
			   .title("Mock API")
			   .description("Api for mock related Queries")
			   .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
			   .version("2.0")
			   .build();
}

   
}

	



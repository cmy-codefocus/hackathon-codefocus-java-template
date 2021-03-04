package io.cloudmobility.codefocus.configuration;

import io.cloudmobility.codefocus.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("api")
                .select()
                .apis(RequestHandlerSelectors.basePackage(Application.class.getPackageName()))
                .build();
    }

    @Bean
    public Docket actuators() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo()).groupName("management")
                .select()
                .paths(PathSelectors.regex(".*/actuator.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("API").version("1.0").build();
    }

}

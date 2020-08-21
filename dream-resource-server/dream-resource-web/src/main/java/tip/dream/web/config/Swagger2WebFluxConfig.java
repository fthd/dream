package tip.dream.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

/**
 * @author tangjx
 * @date 2020/8/19 9:29
 */
@Configuration
@EnableSwagger2WebFlux
@ConditionalOnProperty(prefix = "dream.webflux", name = "enable", havingValue = "true")
public class Swagger2WebFluxConfig {

    @Value("${server.servlet.context-path}")
    private String pathPrefix;

    @Value("${swagger2.enable}")
    private boolean enable;

    @Bean("首页模块")
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("首页模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("tip.dream.web.controller"))
                .paths(PathSelectors.regex(pathPrefix + "/index/.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(enable);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Dream 系统平台接口文档")
                .description("提供子模块1/子模块2/子模块3的文档")
                .termsOfServiceUrl("www.baidu.com")
                .version("1.0")
                .contact(new Contact("tangjx","blog.csdn.net","xxx@mail.com"))
                .license("The Apache License")
                .licenseUrl("http://www.baidu.com")
                .build();
    }
}
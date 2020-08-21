package tip.dream.web.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * 使用注解@EnableWebFlux
 *
 * @author tangjx
 * @date 2020/8/19 10:01
 */
@Configuration
@ConditionalOnProperty(prefix = "dream.webflux", name = "enable", havingValue = "true")
public class WebFluxConfig implements WebFluxConfigurer {

    /**
     * 配置静态资源
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");

        /**
         * Swagger请求资源
         */
        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    // TODO 配置拦截器
    // TODO 配置编解码
}


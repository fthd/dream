package tip.dream.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tip.dream.dao.DaoPackage;
import tip.dream.order.OrderServicePackage;
import tip.dream.sso.SsoServicePackage;

/**
 * web层启动类
 *
 * @author tangjx
 * @date 2020/8/19 9:22
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = {
        DaoPackage.class,
        SsoServicePackage.class,
        OrderServicePackage.class,
        WebPackage.class
})
@MapperScan(basePackages = {"tip.dream.dao.mapper.schema"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

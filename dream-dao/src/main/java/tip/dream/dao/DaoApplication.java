package tip.dream.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Dao层启动类
 *
 * @author tangjx
 * @date 2020/8/18 16:25
 */
@SpringBootApplication
@MapperScan(basePackages = {"tip.dream.dao.mapper.schema"})
public class DaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }
}

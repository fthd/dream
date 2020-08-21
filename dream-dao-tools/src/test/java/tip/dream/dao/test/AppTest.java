package tip.dream.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tip.dream.dao.DaoApplication;
import tip.dream.dao.mapper.schema.TbUserOldMapper;
import tip.dream.dao.po.TbUserOld;

import java.util.Date;

/**
 * Dao层测试
 *
 * @author tangjx
 * @date 2020/8/18 16:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DaoApplication.class)
public class AppTest {

    @Autowired
    private TbUserOldMapper tbUserOldMapper;

    @Before
    public void before() {
        System.out.println("开始测试... ...");
    }

    @Test
    public void selectOne() {
        TbUserOld result = tbUserOldMapper.selectByPrimaryKey("11111");
        System.out.println(result);
    }

}

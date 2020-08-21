package tip.dream.dao.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Mapper接口通用接口
 * MyBatis3Simple使用类 目前不适合这个项目
 *
 * @author tangjx
 * @date 2020/8/18 15:22
 */
public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

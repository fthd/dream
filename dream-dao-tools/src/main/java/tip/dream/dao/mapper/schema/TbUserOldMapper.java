package tip.dream.dao.mapper.schema;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tip.dream.dao.po.TbUserOld;
import tip.dream.dao.po.TbUserOldExample;

public interface TbUserOldMapper {
    int countByExample(TbUserOldExample example);

    int deleteByExample(TbUserOldExample example);

    int deleteByPrimaryKey(String USER_ID);

    int insert(TbUserOld record);

    int insertSelective(TbUserOld record);

    List<TbUserOld> selectByExampleWithBLOBs(TbUserOldExample example);

    List<TbUserOld> selectByExample(TbUserOldExample example);

    TbUserOld selectByPrimaryKey(String USER_ID);

    int updateByExampleSelective(@Param("record") TbUserOld record, @Param("example") TbUserOldExample example);

    int updateByExampleWithBLOBs(@Param("record") TbUserOld record, @Param("example") TbUserOldExample example);

    int updateByExample(@Param("record") TbUserOld record, @Param("example") TbUserOldExample example);

    int updateByPrimaryKeySelective(TbUserOld record);

    int updateByPrimaryKeyWithBLOBs(TbUserOld record);

    int updateByPrimaryKey(TbUserOld record);
}
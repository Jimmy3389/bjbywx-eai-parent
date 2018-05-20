package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.Vid;
import com.bjbywx.eai.entity.netbar.ids.domain.VidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VidMapper {
    long countByExample(VidExample example);

    int deleteByExample(VidExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Vid record);

    int insertSelective(Vid record);

    List<Vid> selectByExample(VidExample example);

    Vid selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Vid record, @Param("example") VidExample example);

    int updateByExample(@Param("record") Vid record, @Param("example") VidExample example);

    int updateByPrimaryKeySelective(Vid record);

    int updateByPrimaryKey(Vid record);
}
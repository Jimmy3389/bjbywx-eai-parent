package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.Areacode;
import com.bjbywx.eai.entity.netbar.bmc.domain.AreacodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreacodeMapper {
    long countByExample(AreacodeExample example);

    int deleteByExample(AreacodeExample example);

    int insert(Areacode record);

    int insertSelective(Areacode record);

    List<Areacode> selectByExample(AreacodeExample example);

    int updateByExampleSelective(@Param("record") Areacode record, @Param("example") AreacodeExample example);

    int updateByExample(@Param("record") Areacode record, @Param("example") AreacodeExample example);
}
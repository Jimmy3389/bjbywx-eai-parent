package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.Libs;
import com.bjbywx.eai.entity.netbar.ids.domain.LibsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibsMapper {
    long countByExample(LibsExample example);

    int deleteByExample(LibsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Libs record);

    int insertSelective(Libs record);

    List<Libs> selectByExample(LibsExample example);

    Libs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Libs record, @Param("example") LibsExample example);

    int updateByExample(@Param("record") Libs record, @Param("example") LibsExample example);

    int updateByPrimaryKeySelective(Libs record);

    int updateByPrimaryKey(Libs record);
}
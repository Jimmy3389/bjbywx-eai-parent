package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.IdType;
import com.bjbywx.eai.entity.netbar.bmc.domain.IdTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdTypeMapper {
    long countByExample(IdTypeExample example);

    int deleteByExample(IdTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IdType record);

    int insertSelective(IdType record);

    List<IdType> selectByExample(IdTypeExample example);

    IdType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IdType record, @Param("example") IdTypeExample example);

    int updateByExample(@Param("record") IdType record, @Param("example") IdTypeExample example);

    int updateByPrimaryKeySelective(IdType record);

    int updateByPrimaryKey(IdType record);
}
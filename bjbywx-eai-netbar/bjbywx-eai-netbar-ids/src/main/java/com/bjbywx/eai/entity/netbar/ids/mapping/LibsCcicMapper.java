package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.LibsCcic;
import com.bjbywx.eai.entity.netbar.ids.domain.LibsCcicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibsCcicMapper {
    long countByExample(LibsCcicExample example);

    int deleteByExample(LibsCcicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LibsCcic record);

    int insertSelective(LibsCcic record);

    List<LibsCcic> selectByExample(LibsCcicExample example);

    LibsCcic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LibsCcic record, @Param("example") LibsCcicExample example);

    int updateByExample(@Param("record") LibsCcic record, @Param("example") LibsCcicExample example);

    int updateByPrimaryKeySelective(LibsCcic record);

    int updateByPrimaryKey(LibsCcic record);
}
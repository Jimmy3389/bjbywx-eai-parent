package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.Trace;
import com.bjbywx.eai.entity.netbar.ids.domain.TraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraceMapper {
    long countByExample(TraceExample example);

    int deleteByExample(TraceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trace record);

    int insertSelective(Trace record);

    List<Trace> selectByExample(TraceExample example);

    Trace selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trace record, @Param("example") TraceExample example);

    int updateByExample(@Param("record") Trace record, @Param("example") TraceExample example);

    int updateByPrimaryKeySelective(Trace record);

    int updateByPrimaryKey(Trace record);
}
package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.TraceVid;
import com.bjbywx.eai.entity.netbar.ids.domain.TraceVidExample;
import com.bjbywx.eai.entity.netbar.ids.domain.TraceVidKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraceVidMapper {
    long countByExample(TraceVidExample example);

    int deleteByExample(TraceVidExample example);

    int deleteByPrimaryKey(TraceVidKey key);

    int insert(TraceVid record);

    int insertSelective(TraceVid record);

    List<TraceVid> selectByExample(TraceVidExample example);

    TraceVid selectByPrimaryKey(TraceVidKey key);

    int updateByExampleSelective(@Param("record") TraceVid record, @Param("example") TraceVidExample example);

    int updateByExample(@Param("record") TraceVid record, @Param("example") TraceVidExample example);

    int updateByPrimaryKeySelective(TraceVid record);

    int updateByPrimaryKey(TraceVid record);
}
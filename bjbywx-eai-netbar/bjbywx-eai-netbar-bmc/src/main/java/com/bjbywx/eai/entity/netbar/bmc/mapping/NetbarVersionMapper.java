package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarVersion;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarVersionMapper {
    long countByExample(NetbarVersionExample example);

    int deleteByExample(NetbarVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NetbarVersion record);

    int insertSelective(NetbarVersion record);

    List<NetbarVersion> selectByExample(NetbarVersionExample example);

    NetbarVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NetbarVersion record, @Param("example") NetbarVersionExample example);

    int updateByExample(@Param("record") NetbarVersion record, @Param("example") NetbarVersionExample example);

    int updateByPrimaryKeySelective(NetbarVersion record);

    int updateByPrimaryKey(NetbarVersion record);
}
package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarServerInfo;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarServerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarServerInfoMapper {
    long countByExample(NetbarServerInfoExample example);

    int deleteByExample(NetbarServerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NetbarServerInfo record);

    int insertSelective(NetbarServerInfo record);

    List<NetbarServerInfo> selectByExample(NetbarServerInfoExample example);

    NetbarServerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NetbarServerInfo record, @Param("example") NetbarServerInfoExample example);

    int updateByExample(@Param("record") NetbarServerInfo record, @Param("example") NetbarServerInfoExample example);

    int updateByPrimaryKeySelective(NetbarServerInfo record);

    int updateByPrimaryKey(NetbarServerInfo record);
}
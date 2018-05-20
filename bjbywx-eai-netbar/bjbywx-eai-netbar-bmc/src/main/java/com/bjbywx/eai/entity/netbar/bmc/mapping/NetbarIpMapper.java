package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarIp;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarIpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarIpMapper {
    long countByExample(NetbarIpExample example);

    int deleteByExample(NetbarIpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NetbarIp record);

    int insertSelective(NetbarIp record);

    List<NetbarIp> selectByExample(NetbarIpExample example);

    NetbarIp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NetbarIp record, @Param("example") NetbarIpExample example);

    int updateByExample(@Param("record") NetbarIp record, @Param("example") NetbarIpExample example);

    int updateByPrimaryKeySelective(NetbarIp record);

    int updateByPrimaryKey(NetbarIp record);
}
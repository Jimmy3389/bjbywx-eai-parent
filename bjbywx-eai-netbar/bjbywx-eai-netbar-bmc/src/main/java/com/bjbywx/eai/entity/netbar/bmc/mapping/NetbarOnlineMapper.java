package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarOnline;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarOnlineMapper {
    long countByExample(NetbarOnlineExample example);

    int deleteByExample(NetbarOnlineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NetbarOnline record);

    int insertSelective(NetbarOnline record);

    List<NetbarOnline> selectByExample(NetbarOnlineExample example);

    NetbarOnline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NetbarOnline record, @Param("example") NetbarOnlineExample example);

    int updateByExample(@Param("record") NetbarOnline record, @Param("example") NetbarOnlineExample example);

    int updateByPrimaryKeySelective(NetbarOnline record);

    int updateByPrimaryKey(NetbarOnline record);
}
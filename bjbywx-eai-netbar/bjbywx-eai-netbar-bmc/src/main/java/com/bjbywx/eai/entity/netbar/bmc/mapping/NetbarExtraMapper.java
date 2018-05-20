package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarExtra;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarExtraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarExtraMapper {
    long countByExample(NetbarExtraExample example);

    int deleteByExample(NetbarExtraExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NetbarExtra record);

    int insertSelective(NetbarExtra record);

    List<NetbarExtra> selectByExample(NetbarExtraExample example);

    NetbarExtra selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NetbarExtra record, @Param("example") NetbarExtraExample example);

    int updateByExample(@Param("record") NetbarExtra record, @Param("example") NetbarExtraExample example);

    int updateByPrimaryKeySelective(NetbarExtra record);

    int updateByPrimaryKey(NetbarExtra record);
}
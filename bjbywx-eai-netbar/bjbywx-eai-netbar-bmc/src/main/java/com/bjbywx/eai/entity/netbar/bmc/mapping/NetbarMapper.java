package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.Netbar;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarMapper {
    long countByExample(NetbarExample example);

    int deleteByExample(NetbarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Netbar record);

    int insertSelective(Netbar record);

    List<Netbar> selectByExample(NetbarExample example);

    Netbar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Netbar record, @Param("example") NetbarExample example);

    int updateByExample(@Param("record") Netbar record, @Param("example") NetbarExample example);

    int updateByPrimaryKeySelective(Netbar record);

    int updateByPrimaryKey(Netbar record);
}
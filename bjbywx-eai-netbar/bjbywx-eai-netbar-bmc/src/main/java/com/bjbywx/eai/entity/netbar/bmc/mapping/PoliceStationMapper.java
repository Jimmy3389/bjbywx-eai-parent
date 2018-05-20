package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.PoliceStation;
import com.bjbywx.eai.entity.netbar.bmc.domain.PoliceStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoliceStationMapper {
    long countByExample(PoliceStationExample example);

    int deleteByExample(PoliceStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoliceStation record);

    int insertSelective(PoliceStation record);

    List<PoliceStation> selectByExample(PoliceStationExample example);

    PoliceStation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoliceStation record, @Param("example") PoliceStationExample example);

    int updateByExample(@Param("record") PoliceStation record, @Param("example") PoliceStationExample example);

    int updateByPrimaryKeySelective(PoliceStation record);

    int updateByPrimaryKey(PoliceStation record);
}
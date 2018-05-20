package com.bjbywx.eai.entity.netbar.bmc.mapping;

import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarSetting;
import com.bjbywx.eai.entity.netbar.bmc.domain.NetbarSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetbarSettingMapper {
    long countByExample(NetbarSettingExample example);

    int deleteByExample(NetbarSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NetbarSetting record);

    int insertSelective(NetbarSetting record);

    List<NetbarSetting> selectByExample(NetbarSettingExample example);

    NetbarSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NetbarSetting record, @Param("example") NetbarSettingExample example);

    int updateByExample(@Param("record") NetbarSetting record, @Param("example") NetbarSettingExample example);

    int updateByPrimaryKeySelective(NetbarSetting record);

    int updateByPrimaryKey(NetbarSetting record);
}
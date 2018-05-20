package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.MobileUser;
import com.bjbywx.eai.entity.netbar.ids.domain.MobileUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileUserMapper {
    long countByExample(MobileUserExample example);

    int deleteByExample(MobileUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MobileUser record);

    int insertSelective(MobileUser record);

    List<MobileUser> selectByExample(MobileUserExample example);

    MobileUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MobileUser record, @Param("example") MobileUserExample example);

    int updateByExample(@Param("record") MobileUser record, @Param("example") MobileUserExample example);

    int updateByPrimaryKeySelective(MobileUser record);

    int updateByPrimaryKey(MobileUser record);
}
package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.LogoutAccount;
import com.bjbywx.eai.entity.netbar.ids.domain.LogoutAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogoutAccountMapper {
    long countByExample(LogoutAccountExample example);

    int deleteByExample(LogoutAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogoutAccount record);

    int insertSelective(LogoutAccount record);

    List<LogoutAccount> selectByExample(LogoutAccountExample example);

    LogoutAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogoutAccount record, @Param("example") LogoutAccountExample example);

    int updateByExample(@Param("record") LogoutAccount record, @Param("example") LogoutAccountExample example);

    int updateByPrimaryKeySelective(LogoutAccount record);

    int updateByPrimaryKey(LogoutAccount record);
}
package com.bjbywx.eai.entity.netbar.ids.mapping;

import com.bjbywx.eai.entity.netbar.ids.domain.UdpUrl;
import com.bjbywx.eai.entity.netbar.ids.domain.UdpUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UdpUrlMapper {
    long countByExample(UdpUrlExample example);

    int deleteByExample(UdpUrlExample example);

    int insert(UdpUrl record);

    int insertSelective(UdpUrl record);

    List<UdpUrl> selectByExample(UdpUrlExample example);

    int updateByExampleSelective(@Param("record") UdpUrl record, @Param("example") UdpUrlExample example);

    int updateByExample(@Param("record") UdpUrl record, @Param("example") UdpUrlExample example);
}
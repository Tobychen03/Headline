package com.java.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.java.pojo.Headline;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.pojo.vo.PortalVo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author DELL
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2024-03-17 09:20:14
* @Entity com.java.pojo.Headline
*/
public interface HeadlineMapper extends BaseMapper<Headline> {

    IPage<Map> selectMyPage(IPage iPage, @Param("portalVo")PortalVo portalVo);

    Map queryDetailMap(Integer hid);
}





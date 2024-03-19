package com.java.service;

import com.java.pojo.Headline;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.pojo.vo.PortalVo;
import com.java.utils.Result;

/**
* @author DELL
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2024-03-17 09:20:14
*/
public interface HeadlineService extends IService<Headline> {

    Result findNewsPage(PortalVo portalVo);

    Result showHeadlineDetail(Integer hid);

    Result publish(Headline headline, String token);

    Result updateDate(Headline headline);
}

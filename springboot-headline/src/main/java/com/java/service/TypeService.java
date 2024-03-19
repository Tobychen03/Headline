package com.java.service;

import com.java.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.utils.Result;

/**
* @author DELL
* @description 针对表【news_type】的数据库操作Service
* @createDate 2024-03-17 09:20:14
*/
public interface TypeService extends IService<Type> {

    Result findAllTypes();
}

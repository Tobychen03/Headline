package com.java.service;

import com.java.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.utils.Result;

/**
* @author DELL
* @description 针对表【news_user】的数据库操作Service
* @createDate 2024-03-17 09:20:14
*/
public interface UserService extends IService<User> {


    Result login(User user);

    Result getUserInfo(String token);

    Result checkUserName(String username);

    Result regist(User user);
}

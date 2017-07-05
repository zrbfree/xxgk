package com.rick.app.service.impl;

import com.rick.app.dao.UserMapper;
import com.rick.app.entity.User;
import com.rick.app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RICK on 2017/7/4.
 */
@Service
public class UserService  implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertData(User record) throws Exception {
        return userMapper.insertSelective(record);
    }
}

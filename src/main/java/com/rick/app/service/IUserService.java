package com.rick.app.service;

import com.rick.app.entity.User;

/**
 * Created by RICK on 2017/7/4.
 */
public interface IUserService {

    /**
     * 新增加用户
     * @param record
     * @return
     * @throws Exception
     */
    public int insertData(User record) throws  Exception;
}

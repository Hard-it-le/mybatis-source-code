package com.mybatis.mapper;

import com.mybatis.entity.User;

/***

 */
public interface UserMapper {

    User selectById(int id);

    void updateForName(int id,String username);
}

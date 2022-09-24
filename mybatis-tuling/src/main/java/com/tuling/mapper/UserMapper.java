package com.tuling.mapper;

import com.tuling.entity.User;
import java.util.List;

/***

 */
public interface UserMapper {

    User selectById(Integer id);

    void updateForName(String id,String username);
}

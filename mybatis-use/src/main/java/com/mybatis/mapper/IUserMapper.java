package com.mybatis.mapper;

import com.mybatis.entity.User;
import java.util.List;

public interface IUserMapper {

  List<User> selectAllUser();

  User selectByUserName(String userName);

  List<User> selectListUser();

  void insertUser(User user);

}

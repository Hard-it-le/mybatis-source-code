package com.mybatis.mapper;

import com.mybatis.entity.User;

import java.util.List;

/**
 * @Author yujiale
 * @Date 2022/7/31 17:21
 * @Description TODO
 **/
public interface IUserMapper {
    List<User> selectAllUser();

    User selectByUserName(String userName);

    List<User> selectListUser();

    void insertUser(User user);

//    /**
//     * 查询所有用户
//     *
//     * @return
//     * @throws IOException
//     */
//    public List<User> findAll() throws IOException;
//
//    /**
//     * 多条件组合查询：演示if
//     *
//     * @param user
//     * @return
//     */
//    public List<User> findByCondition(User user);
//
//
//    /**
//     * 多值查询：演示foreach
//     *
//     * @param ids
//     * @return
//     */
//    public List<User> findByIds(int[] ids);


}

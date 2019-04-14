package com.itliyue.dao;

import com.itliyue.domain.Quervo;
import com.itliyue.domain.User;


import java.util.List;

public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
 //   @Select("select  *from  user")
    List<User>  findAll();

    /**
     * 保存方法
     * @param user
     */
    void  saveUser(User user);

    /**
     * 修改用户
     * @param user
     */
    void  updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUser(Integer   id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User  findUser(Integer id);

    /**
     *模糊查询
     * @param name
     * @return
     */
    List<User>  findByname(String name);
    /**
     * 查询总数
     * @return
     */
    int  findTotal();


    /**
     * 条件查询
     * @return
     */
    List<User>  findUserByvo(Quervo vo);




}

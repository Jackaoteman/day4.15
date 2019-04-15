package com.liyue.test;

import com.itliyue.dao.IUserDao;
import com.itliyue.domain.Quervo;
import com.itliyue.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class mybatisTest {
        private InputStream  in;
        private SqlSession  sqlSession;
        private IUserDao  userDao;

    @Before
    public  void init() throws IOException {
    //用于测试方法之前的操作
        //读取配置文件，生成字节输入流
         in = Resources.getResourceAsStream("sqlMapConfig.xml");
         //获取sqlsessionFactory
        SqlSessionFactory  factory=new SqlSessionFactoryBuilder().build(in);
        //获取sqlSession对象
         sqlSession = factory.openSession();
         //获取代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    /**
     * 查找所有用户
     */
    @Test
    public  void findAll(){
        List<User> list= userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }

    }

    /**
     * 保存用户
     */
    @Test
    public  void  testSave(){


    }

    /**
     * 修改用户
     */
    @Test
    public  void testUpdate(){
        User user=new User();
        user.setId(48);
        user.setUsername("迪丽热巴");
        user.setAddress("北京市东城区");
        userDao.updateUser(user);

    }

    /**
     * 根据id删除用户
     */
    @Test
    public  void  deleteUser(){
        userDao.deleteUser(52);
    }

    /**
     * 模糊查询
     */
    @Test
    public   void  findByname(){
        List<User> list = userDao.findByname("%张%");
        for (User user : list) {
            System.out.println(user);
        }

    }

    /**
     * 查询总数
     */
    @Test
    public  void findTotal() {
        int num = userDao.findTotal();
        System.out.println(num);
    }

    /**
     * 根据id查找用户
     */
    @Test
    public  void   findUser(){
        User user = userDao.findUser(48);
        System.out.println(user);


    }

    /**
     * 根据Quervo条件查询用户
     */
    @Test
    public  void  findvo(){
        Quervo vo=new Quervo();
        User user=new User();
        user.setUsername("%张%");
        vo.setUser(user);
        List<User> list = userDao.findUserByvo(vo);
        for (User u : list) {
            System.out.println(u);
        }


    }


    @After//用户在测试方法执行之后执行
    public  void  destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();

    }


}

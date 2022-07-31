package com.mybatis;

/**
 * @Author yujiale
 * @Date 2022/7/31 17:26
 * @Description TODO
 **/
public class MybatisOneTest {
//    @Test
//    public void testSelectEmployee() throws IOException {
//        // 1.创建SqlSessionFactory对象
//        // ①声明Mybatis全局配置文件的路径
//        String mybatisConfigFilePath = "mybatis-config.xml";
//        // ②以输入流的形式加载Mybatis配置文件
//        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
//        // ③基于读取Mybatis配置文件的输入流创建SqlSessionFactory对象
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        // 2.使用SqlSessionFactory对象开启一个会话，默认开启一级缓存
//        SqlSession session = sessionFactory.openSession();
//        // 3.根据Mapper配置文件的名称空间+SQL语句的id找到具体的SQL语句
//        // 格式是：名称空间.SQL语句的id
//        String statement = "com.mybatis.mapper.UserMapper.findAll";
//
//        // 要传入SQL语句的参数
//        Integer emp_id = 1;
//
//        // 执行SQL语句
//        Object result = session.selectOne(statement, emp_id);
//
//        System.out.println("o = " + result);
//        // 4.关闭SqlSession
//        session.close();
//    }
//
//    @Test
//    public void testHelloWorld() throws IOException {
//        //1.借助Mybatis的Resources类将Mybatis全局配置文件读取到内存中
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//        //2.创建sqlSessionFactorBuilder对象
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        //3.调用builder对象的build（）方法来创建SqlSessionFactory，此时需要读取到全局文件的输入留
//        SqlSessionFactory factory = builder.build(inputStream);
//        //4.调用工厂对象的方法开启一个绘画
//        SqlSession sqlSession = factory.openSession();
//        //5.执行mapper配置文件中准备好的sql语句
//        /**
//         *   备注： 此时执行的查找操作已经不是xml配置文件中去找，
//         *   因为xml配置文件中的信息已经被读取到内存汇中封装成对象。
//         *   所以此时其实要到已封装的对象中查找，查找的依据是：mapper配置文件的namespace值（命名空间），
//         *   Sql语句标签的id
//         */
//        String statement = "com.mybatis.mapper.EmployeeMapper.selectEmpById";
//        Long emp_id = 1L;
//        Object selectOne = sqlSession.selectOne(statement, emp_id);
//        //6.打印查询结果
//        System.out.println("0=:" + selectOne);
//        //7.提交事务
//        sqlSession.commit();
//        //8。关闭会话
//        sqlSession.close();
//    }
//}
}
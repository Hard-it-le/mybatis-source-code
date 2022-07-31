import com.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {



  /**
   * mybatis二级缓存效果测试
   */
  @Test
  public void test3() throws IOException {

    InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession1 = factory.openSession();
    SqlSession sqlSession2 = factory.openSession();

    User user1 = sqlSession1.selectOne("com.mybatis.mapper.IUserMapper.findById", 1);
    System.out.println(user1);

    sqlSession1.commit();

    User user = new User();
    user.setId(1);
    user.setUsername("jack");
    // 增删改会清空二级缓存
    sqlSession1.update("com.mybatis.mapper.IUserMapper.updateById",user);


    User user2 = sqlSession2.selectOne("com.mybatis.mapper.IUserMapper.findById", 1);
    System.out.println(user2);

  }


  /**
   * mybatis嵌套效果测试
   */
  @Test
  public void test4() throws IOException {

    InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = factory.openSession();

    User user = sqlSession.selectOne("com.mybatis.mapper.IUserMapper.findById", 1);

    System.out.println(user.getUsername());
    System.out.println(user.getOrderList());

  }





}








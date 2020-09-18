import com.damu.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDemo {
    @Test
    public void testDemo1() throws IOException {
        //初始化mybatis配置环境
        String resources = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resources);            //ibatis
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //打开和数据库之间的会话
        SqlSession session = factory.openSession();
       //增
//        Users user = new Users(4, "地方");
//        session.insert("insertUsers", user);
        //删
//        session.delete("deleteUsers",1);
        //改

        Users updateUser = new Users(3, "tianlu");
        session.update("updateUsers", updateUser);
        //查全部
        List<Users> users = session.selectList("selectAllUsers");
        for (Users u :
                users) {
            System.out.println(u);
        }
//        //查一个
//        Users user= session.selectOne("selectUsers",1);
//        System.out.println(user);
//        session.commit();
    }
}

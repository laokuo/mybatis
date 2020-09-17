import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestDemo {
    @Test
    public void testDemo1() throws IOException {
        //初始化mybatis配置环境
        String resources = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resources);            //ibatis
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //打开和数据库之间的会话
    }
}

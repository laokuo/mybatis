package jdbcTest;

import java.sql.*;

public class TraSql {
    public static void main(String[] args) {

        // 加载数据库驱动  com.mysql.jdbc.Driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // 获取mysql连接地址
        String url = "jdbc:mysql://localhost/school?&useSSL=false&serverTimezone=UTC";
        // 数据名称
        String username = "root";
        // 数据库密码
        String password = "123..321";
        // 获取一个数据的连接
        Connection conn = null;
        // 获取连接的一个状态
        try{
            Class.forName(driver);
            //getConnection()方法，连接MySQL数据库！
            conn=DriverManager.getConnection(url,username,password);
            if(!conn.isClosed())
                System.out.println("数据库连接成功！");
            //创建statement类对象，用来执行SQL语句！
            Statement Statement=conn.createStatement();
            //要执行的SQL语句
            String sql="select * from student" ;
            //ResultSet类，用来存放获取的结果集！
            ResultSet rs=Statement.executeQuery(sql);
            String id=null;
            String name=null;
            while(rs.next()){
                id=rs.getString("id");
                name=rs.getString("name");
                System.out.println(id+"\t"+name+"\t");
            }
            rs.close();
            conn.close();
        }
        catch(ClassNotFoundException e){
            //数据库驱动类异常处理
            System.out.println("数据库驱动加载失败！");
            e.printStackTrace();
        }
        catch(SQLException e1){
            //数据库连接失败异常处理
            e1.printStackTrace();
        }
        catch(Exception e2){
            e2.printStackTrace();
        }
        finally{
            System.out.println("-------------------------------");
            System.out.println("数据库数据获取成功！");
        }
    }
}

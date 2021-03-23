package cn.xym.test;

import cn.xym.dao.AccountDao;
import cn.xym.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/3/23 15:44
 * @author: 1931559710@qq.com
 * ClassName: TestMyBatis
 * Description:
 */
public class TestMyBatis {

    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = build.openSession();
        //获取代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);

        //查询所有数据
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

        //关闭资源
        session.close();
        in.close();
    }

    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("老师");
        account.setMoney(500d);

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = build.openSession();
        //获取代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);

        //保存
        mapper.saveAccount(account);
        //提交事务
        session.commit();

        //关闭资源
        session.close();
        in.close();
    }
}

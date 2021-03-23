package cn.xym.test;

import cn.xym.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @user: Hasee
 * @date: 2021/3/23 13:29
 * @author: 1931559710@qq.com
 * ClassName: TestSpring
 * Description:
 */
public class TestSpring {

    @Test
    public void run1() {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();
    }
}

package cn.xym;

/**
 * @user: Hasee
 * @date: 2021/3/20 11:50
 * @author: 1931559710@qq.com
 * ClassName: controller
 * Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器的类
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello StringMVC");
        return "success";   //这个success要和success.jsp同名
    }

    /**
     * RequestMapping注解
     *
     * @return
     */
    @RequestMapping(path = "/testRequestMapping", params = {"username=heihei"}, headers = {"Accept"})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解");
        return "success";
    }
}

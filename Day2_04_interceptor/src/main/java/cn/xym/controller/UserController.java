package cn.xym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @user: Hasee
 * @date: 2021/3/22 16:10
 * @author: 1931559710@qq.com
 * ClassName: UserController
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 跨服务器文件上传
     *
     * @return
     */
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("testInterceptor方法执行了...");
        return "success";
    }
}

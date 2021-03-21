package cn.xym.controller;

/**
 * @user: Hasee
 * @date: 2021/3/21 10:38
 * @author: 1931559710@qq.com
 * ClassName: AnnoController
 * Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam() {
        System.out.println("执行了");
        return "success";
    }
}

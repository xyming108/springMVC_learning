package cn.xym.controller;

import cn.xym.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user: Hasee
 * @date: 2021/3/21 16:28
 * @author: 1931559710@qq.com
 * ClassName: UserController
 * Description:
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString方法执行了");

        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(20);

        //model对象
        model.addAttribute("user", user);

        return "success";
    }

}

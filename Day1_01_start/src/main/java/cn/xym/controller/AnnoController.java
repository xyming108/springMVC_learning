package cn.xym.controller;

/**
 * @user: Hasee
 * @date: 2021/3/21 10:38
 * @author: 1931559710@qq.com
 * ClassName: AnnoController
 * Description:
 */

import cn.xym.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg=美美存入到session域中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    //把name的值传递给username
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     *
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}", method = RequestMethod.POST)
    //把sid的值传递给id
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("执行了");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取到请求头的值
     *
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("执行了");
        System.out.println(header);
        return "success";
    }

    /**
     * 获取Cookie的值
     *
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@RequestHeader(value = "Accept") String cookieValue) {
        System.out.println("执行了");
        System.out.println(cookieValue);
        return "success";
    }


    //*****************************************

    /**
     * testModelAttribute注解
     *
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String name, Map<String, User> map) {
        System.out.println("showUser执行了");
        //通过用户名查询数据库
        User user = new User();
        user.setName(name);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }

//    @RequestMapping("/testModelAttribute")
//    public String testModelAttribute(User user) {
//        System.out.println("执行了");
//        System.out.println(user);
//        return "success";
//    }

    /**
     * 该方法会先执行
     */
//    @ModelAttribute
//    public User showUser(String name) {
//        System.out.println("showUser执行了");
//        //通过用户名查询数据库
//        User user = new User();
//        user.setName(name);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }
    //*******************************************

    /**
     * SessionAttributes的注解
     *
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("执行了");
        //底层会存储到request域中
        model.addAttribute("msg", "美美");
        return "success";
    }

    /**
     * 从session获取值
     *
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap model) {
        System.out.println("执行了");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 从session清除值
     *
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("执行了");
        status.setComplete();
        return "success";
    }
}

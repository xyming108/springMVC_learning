package cn.xym.controller;

import cn.xym.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


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
    @RequestMapping("/testException")
    public String testException() throws Exception {
        System.out.println("testException方法执行了...");

        try {
            //模拟异常
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有的用户出现错误");
        }


        return "success";
    }
}

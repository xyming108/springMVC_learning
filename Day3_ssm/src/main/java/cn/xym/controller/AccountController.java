package cn.xym.controller;

/**
 * @user: Hasee
 * @date: 2021/3/23 11:19
 * @author: 1931559710@qq.com
 * ClassName: AccountController
 * Description:
 */

import cn.xym.domain.Account;
import cn.xym.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有的账户信息");
        //调用service的方法
        List<Account> all = accountService.findAll();
        model.addAttribute("all", all);
        return "list";
    }

    /**
     * 保存
     *
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

}

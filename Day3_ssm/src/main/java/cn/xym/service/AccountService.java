package cn.xym.service;

import cn.xym.domain.Account;

import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/3/23 11:17
 * @author: 1931559710@qq.com
 * ClassName: AccountService
 * Description:
 */
public interface AccountService {

    /**
     * 查询所有账户信息
     *
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账信息
     *
     * @param account
     */
    public void saveAccount(Account account);

}

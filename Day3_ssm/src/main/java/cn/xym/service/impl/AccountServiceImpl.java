package cn.xym.service.impl;

import cn.xym.dao.AccountDao;
import cn.xym.domain.Account;
import cn.xym.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/3/23 11:17
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户");
        accountDao.saveAccount(account);
    }
}

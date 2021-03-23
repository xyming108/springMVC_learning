package cn.xym.dao;

/**
 * @user: Hasee
 * @date: 2021/3/23 11:15
 * @author: 1931559710@qq.com
 * ClassName: AccountDao
 * Description:
 */

import cn.xym.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户接口
 */
@Repository
public interface AccountDao {

    /**
     * 查询所有账户信息
     *
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账信息
     *
     * @param account
     */
    @Insert("insert into account (name, money) values(#{name}, #{money})")
    void saveAccount(Account account);

}

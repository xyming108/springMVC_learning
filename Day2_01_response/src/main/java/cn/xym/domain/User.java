package cn.xym.domain;

import java.io.Serializable;

/**
 * @user: Hasee
 * @date: 2021/3/21 16:39
 * @author: 1931559710@qq.com
 * ClassName: User
 * Description:
 */
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}

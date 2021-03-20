package cn.xym.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @user: Hasee
 * @date: 2021/3/20 20:06
 * @author: 1931559710@qq.com
 * ClassName: User
 * Description:
 */
public class User implements Serializable {
    private String name;
    private Integer age;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}

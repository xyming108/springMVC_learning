package cn.xym.exception;

/**
 * @user: Hasee
 * @date: 2021/3/22 20:37
 * @author: 1931559710@qq.com
 * ClassName: SysException
 * Description:
 */

/**
 * 自定义
 */
public class SysException extends Exception {

    //存储提示信息的
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SysException{" +
                "message='" + message + '\'' +
                '}';
    }
}

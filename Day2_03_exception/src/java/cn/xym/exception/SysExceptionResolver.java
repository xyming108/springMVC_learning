package cn.xym.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理异常业务逻辑
 *
 * @user: Hasee
 * @date: 2021/3/22 21:18
 * @author: 1931559710@qq.com
 * ClassName: SysExceptionResolver
 * Description:
 */

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取异常对象
        SysException exception = null;
        if (e instanceof SysException) {
            exception = (SysException) e;
        } else {
            exception = new SysException("系统正在维护...");
        }

        //创建ModeAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", exception.getMessage());
        mv.setViewName("error");

        return mv;
    }
}

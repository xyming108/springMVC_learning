package cn.xym.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @user: Hasee
 * @date: 2021/3/22 22:40
 * @author: 1931559710@qq.com
 * ClassName: MyInterceptor
 * Description:
 */

/**
 * 自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 预处理，controller方法执行前
     * return true：放行，执行下一个拦截器，如果没有执行controller中的方法
     * return false：不放行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor执行了_前111");
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
//        return false;
        return true;
    }

    /**
     * 后处理方法，controller方法 执行之后，success.jsp执行之前
     *
     * @param request
     * @param response
     * @param handler
     * @param
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor执行了_后111");
    }

    /**
     * success.jsp页面执行后，该方法会执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor执行了_终111");
    }
}

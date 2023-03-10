package com.example.demo.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class Logininterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //session 得到用户信息{如果从session 中得到了userinfo对象,说明用户已经登录了,如果没得到userinfo对象,说明未登录}
        HttpSession session =request.getSession(false);
        if(session !=null && session.getAttribute(Constant.SESSION_USEINFO_KEY) != null){
            //当前用户已经登录了
            return true;
        }
        response.setStatus(401);
        response.sendRedirect("/login.html " +
                "");
        return false;
    }
}
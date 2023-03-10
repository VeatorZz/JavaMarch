package com.example.demo.controller;

import com.example.demo.common.AjaxResult;
import com.example.demo.common.Constant;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/reg")
    public Object reg(String username,String password) {
        //1.非空效验
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return AjaxResult.fail(-1, "非法的差参数请求");
        }
        //2.进行添加操作
        int result = userService.add(username, password);
        if (result == 1) {
            return AjaxResult.success("注册成功!", 1);
        } else {
            return AjaxResult.fail(-1,"数据库添加出错");
        }
    }
    @RequestMapping("/login")
        public int login(HttpServletRequest request , String username, String password){
        //1.非空效验
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return 0;
        }
        //2.进行添加操作
        UserInfo userInfo = userService.login(username,password);
        if(userInfo ==null||userInfo.getId()<=0) {
            //用户名或密码错误
            return -1;
        }else {
            //用户名和密码正确
            //将userinfo报错到session中
            HttpSession session =request.getSession();
            session.setAttribute(Constant.SESSION_USEINFO_KEY,userInfo);
            return 1;
        }

    }

    /**
     *
     * @return
     */
    @RequestMapping("/logout")
    public boolean logout(HttpServletRequest request){
     HttpSession session = request.getSession(false);
     if (session != null && session.getAttribute(Constant.SESSION_USEINFO_KEY) !=null ){
         session.removeAttribute(Constant.SESSION_USEINFO_KEY);
     }
     return true;
    }
    @RequestMapping("/hi")
    public String sayhi(){
        return "Hi,Blog.";
    }
}

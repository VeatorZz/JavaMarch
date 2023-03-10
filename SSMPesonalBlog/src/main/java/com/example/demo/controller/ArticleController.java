package com.example.demo.controller;

import com.example.demo.common.Constant;
import com.example.demo.model.ArticleInfo;
import com.example.demo.model.UserInfo;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/*
   文章控制器
 */
@RestController
@RequestMapping("/art")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @RequestMapping("/mylist")
    public List<ArticleInfo> myList(HttpServletRequest request){
        HttpSession session =request.getSession(false);
        if(session != null && session.getAttribute(Constant.SESSION_USEINFO_KEY)!= null){
            UserInfo userInfo = (UserInfo) session.getAttribute(Constant.SESSION_USEINFO_KEY);
            return articleService.getMyList(userInfo.getId());
        }
        return  null;
    }
}

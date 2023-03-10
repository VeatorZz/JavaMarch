package com.example.demo.service;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.ArticleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章服务层
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public List<ArticleInfo> getMyList(Integer uid) {
        return articleMapper.getMyList(uid);
    }

}

package com.example.demo.mapper;

import com.example.demo.model.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章表的mapper
 */
@Mapper

public interface ArticleMapper {
    public List<ArticleInfo> getMyList(@Param("uid") Integer uid);
}

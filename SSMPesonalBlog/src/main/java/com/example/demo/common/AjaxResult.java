package com.example.demo.common;

import java.sql.PreparedStatement;
import java.util.HashMap;

/*
自定义的统一返回对象
 */
public class AjaxResult {
    public  static HashMap<String,Object> success(Object data){
        HashMap<String,Object> result =new HashMap<>();
        result.put("code", 200);
        result.put("msg", "");
        result.put("data", data);
        return result;
    }
    public  static  HashMap<String,Object> success(String msg,Object data) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", "");
        result.put("data", data);
        return result;
    }
//失败时返回的数据格式
    public static HashMap<String,Object> fail(int code,String msg){
        HashMap<String,Object> result =new HashMap<>();
        result.put("code",code);
        result.put("msg", msg);
        result.put("data","");
        return result;

    }
    public static HashMap<String,Object> fail(int code,String msg,Object data){
        HashMap<String,Object> result =new HashMap<>();
        result.put("code",code);
        result.put("msg", msg);
        result.put("data","");
        return result;

    }

}

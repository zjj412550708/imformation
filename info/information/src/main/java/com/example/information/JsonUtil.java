package com.example.information;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonUtil {
    public JSONObject  getMap(){
        Map<String , Object> result = new HashMap<String , Object>();
        result.put("reason","成功的返回");
       // result.put("stat","1");

        Person p=new Person();
        p.setUsercode("123");
        p.setUsername("张三");
        p.setDepartment("技术部");
        Person p1=new Person();
        p1.setUsercode("456");
        p1.setUsername("李四");
        p1.setDepartment("远程交付中心");

        JSONObject jb = new JSONObject();
        jb.put("usercode",p.getUsercode());
        jb.put("username",p.getUsername());
        jb.put("department",p.getDepartment());
        JSONObject jb1= new JSONObject();
        jb1.put("usercode",p1.getUsercode());
        jb1.put("username",p1.getUsername());
        jb1.put("department",p1.getDepartment());
        JSONArray ja = new JSONArray();
        ja.add(jb);
        ja.add(jb1);
       // result.put("data",ja);
        JSONObject jb3 = new JSONObject();
        jb3.put("stat","1");
        jb3.put("data",ja);
        result.put("result",jb3);
        JSONObject jsonObject = JSONObject.fromObject(result);

        return jsonObject;

    }
}

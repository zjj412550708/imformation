package com.example.information;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class FindJson {

    public   JSONObject findData(String code){
        Map<String , Object> outdata = new HashMap<String , Object>();
        int ucode=Integer.parseInt(code);

        JsonUtil ju=new JsonUtil();
        String result=ju.getMap().toString();
        if(result!=null){
            JSONObject obj = JSONObject.fromObject(result);
            result = obj.getString("result");
            obj = JSONObject.fromObject(result);
            result = obj.getString("data");
            JSONArray jsonArray=obj.getJSONArray("data");
            for (int j=0;j<jsonArray.size();j++){
                JSONObject jso=jsonArray.getJSONObject(j);
                String usercode=jso.getString("usercode");
                int scode=Integer.parseInt(usercode);
                if(scode==ucode){
                    outdata.put("usercode",jso.getString("usercode"));
                    outdata.put("username",jso.getString("username"));
                    outdata.put("department",jso.getString("department"));




                }


            }





        }
        JSONObject jsonObject = JSONObject.fromObject(outdata);
        return jsonObject;
    }
  /*public static void main(String[] args) {
        JSONObject str = findData("123");
        System.out.println(str);

    }*/
}

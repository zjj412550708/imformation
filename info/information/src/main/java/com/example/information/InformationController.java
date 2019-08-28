package com.example.information;



import net.sf.json.JSONObject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;





@CrossOrigin
@RestController

public class InformationController {


    @ResponseBody
    @RequestMapping(value = "/getJson",method = RequestMethod.POST)
    public JSONObject getJson(@RequestBody JSONObject jsonObject){
        String code= jsonObject.getString("usercode");
        FindJson fj=new FindJson();
        return fj.findData(code);

}







}

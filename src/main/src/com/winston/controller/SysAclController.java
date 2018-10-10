package com.winston.controller;

import com.sun.media.sound.ModelMappedInstrument;
import com.winston.common.JsonData;
import com.winston.param.AclModelParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: 于新泽
 * @Date: Created in 8:10 2018/10/9.
 * @site :
 */

@Controller
@RequestMapping("/sys/aclModel")
@Slf4j
public class SysAclController {

    @RequestMapping("/acl.page")
    public ModelAndView page(){
        return new ModelAndView("acl");
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveAclModel(AclModelParam param){
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateAclModel(AclModelParam param){

        return JsonData.success();
    }
}

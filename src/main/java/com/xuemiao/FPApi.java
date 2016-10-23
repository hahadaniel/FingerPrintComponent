package com.xuemiao;

import com.xuemiao.lib.FPComDll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 16-10-23.
 */
@Controller
@RequestMapping("/FPCom")
public class FPApi {
    @Autowired
    FPComDll fpComDll;

    @RequestMapping(value = "/process",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public boolean process(FPRequestJson fpRequestJson){
        return fpComDll.Process_java(fpRequestJson.getRegStr(),fpRequestJson.getLogStr());
    }

}

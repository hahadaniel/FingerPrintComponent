package com.xuemiao;

import com.xuemiao.lib.FPComDll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by root on 16-10-23.
 */
@Component
@Path("/FPCom")
public class FPApi {
    @Autowired
    FPComDll fpComDll;

    @GET
    @Path("/processing")
    public boolean process(@QueryParam("regStr")String regStr,@QueryParam("logStr")String logStr){
        return fpComDll.Process_java(regStr,logStr);
    }

}

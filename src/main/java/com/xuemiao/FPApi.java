package com.xuemiao;

import com.xuemiao.lib.Match;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by root on 16-10-23.
 */
@Component
@Path("/FPCom")
public class FPApi {

    @GET
    @Path("/processing")
    public boolean process(@QueryParam("regStr")String regStr,@QueryParam("logStr")String logStr){
        return Match.Instance.process(regStr,logStr);
    }

}

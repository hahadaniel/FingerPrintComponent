package com.xuemiao;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


/**
 * Created by root on 16-10-23.
 */
@Configuration
public class JerseyConfiguration extends ResourceConfig{
    public JerseyConfiguration() {
        packages(true, "com.xuemiao");
    }
}

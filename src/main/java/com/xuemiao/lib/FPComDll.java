package com.xuemiao.lib;

import org.springframework.stereotype.Component;

/**
 * Created by root on 16-10-18.
 */
@Component
public class FPComDll {
    static {
        //System.loadLibrary("FPCom_jni");
    }

    private native boolean Process(String a, String b);

    public boolean Process_java(String a, String b) {
        return this.Process(a, b);
    }

}

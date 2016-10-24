package com.xuemiao.lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import org.springframework.stereotype.Component;

/**
 * Created by root on 16-10-24.
 */
@Component
public interface FPCom extends Library{
    FPCom Instance = (FPCom) Native.loadLibrary((Platform.isWindows() ? "FPCom" : "c"), FPCom.class);
    boolean Process(String a, String b);
}

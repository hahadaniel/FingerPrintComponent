package com.xuemiao.lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import org.springframework.stereotype.Component;

/**
 * Created by root on 16-10-24.
 */
@Component
public interface Match extends Library{
    Match Instance = (Match) Native.loadLibrary((Platform.isWindows() ? "Match.dll" : "c"), Match.class);
    boolean process(String a, String b);
}

package org.jud.plugin.example;

import com.alibaba.jud.plugin.annotation.JudModule;
import com.taobao.jud.annotation.JSMethod;
import com.taobao.jud.bridge.JSCallback;
import com.taobao.jud.common.WXModule;

@JudModule(name = "testPlugin")
public class TestPluginModule extends WXModule {
    @JSMethod
    public String syncRet(String param) {
        return param;
    }

    @JSMethod
    public void asyncRet(String param, JSCallback callback) {
        callback.invoke(param);
    }
}

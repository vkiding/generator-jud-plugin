package org.jud.plugin.example;


import com.alibaba.jud.plugin.annotation.JudAdapter;
import com.taobao.jud.adapter.IWXHttpAdapter;
import com.taobao.jud.common.WXRequest;


@JudAdapter(type = IWXHttpAdapter.class)
public class FooHttpAdapter implements IWXHttpAdapter {
    @Override
    public void sendRequest(WXRequest request, OnHttpListener listener) {

    }
}

package org.jud.plugin.example;


import android.view.View;

import com.alibaba.jud.plugin.annotation.JudComponent;
import com.taobao.jud.WXSDKInstance;
import com.taobao.jud.dom.WXDomObject;
import com.taobao.jud.ui.component.WXComponent;
import com.taobao.jud.ui.component.WXVContainer;


@JudComponent(names = {"awesome","amazing"})
public class AwesomeComponent extends WXComponent<View> {
    public AwesomeComponent(WXSDKInstance instance, WXDomObject dom, WXVContainer parent) {
        super(instance, dom, parent);
    }
}

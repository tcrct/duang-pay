package com.duangframework.pay.plugins;

import com.duangframework.kit.ToolsKit;
import com.duangframework.mvc.plugin.IPlugin;
import com.duangframework.pay.alipay.AliPayApiConfig;
import com.duangframework.pay.alipay.AliPayApiConfigKit;
import com.duangframework.pay.common.AbstractPayConfig;

/**
 * 支付插件
 * @author laotang
 * @date 20019-05-18
 */
public class PayPlugin implements IPlugin {

    private AbstractPayConfig payConfig;

    public PayPlugin(AbstractPayConfig payConfig) {
        this.payConfig = payConfig;
    }

    @Override
    public void start() throws Exception {
        startAlipay(payConfig.getAliPayApiConfig());
    }

    private void startAlipay(AliPayApiConfig payConfig) {
        if(ToolsKit.isEmpty(payConfig)) {
            return;
        }
        // 设置到ThreadLocal里
        AliPayApiConfigKit.setThreadLocalAliPayApiConfig(payConfig);
    }

    @Override
    public void stop() throws Exception {

    }
}

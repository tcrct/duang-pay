package com.duangframework.pay.plugins;

import com.duangframework.kit.ToolsKit;
import com.duangframework.mvc.plugin.IPlugin;
import com.duangframework.pay.alipay.AliPayApiConfig;
import com.duangframework.pay.alipay.AliPayApiConfigKit;
import com.duangframework.pay.common.IPayConfig;

/**
 * 支付插件
 * @author laotang
 * @date 20019-05-18
 */
public class PayPlugin implements IPlugin {

    private IPayConfig payConfig;

    public PayPlugin(IPayConfig payConfig) {
        this.payConfig = payConfig;
    }

    @Override
    public void start() throws Exception {
        startAlipay(payConfig.getAliPayConfig());
    }

    private void startAlipay(AliPayApiConfig aliPayApiConfig) {
        if(ToolsKit.isEmpty(aliPayApiConfig)) {
            return;
        }
        // 设置到ThreadLocal里
        AliPayApiConfigKit.setThreadLocalAliPayApiConfig(aliPayApiConfig);
    }

    @Override
    public void stop() throws Exception {

    }
}

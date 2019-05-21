package com.duangframework.pay;

import com.duangframework.pay.alipay.AliPayApiConfig;
import com.duangframework.pay.common.AbstractPayConfig;

/**
 * 设置支付配置参数
 */
public class PayConfig extends AbstractPayConfig {

    @Override
    protected AliPayApiConfig builderAliPayConfig(AliPayApiConfig aliPayApiConfig) {
        System.out.println("############: " + aliPayApiConfig);
        aliPayApiConfig.setAppId("");
        return aliPayApiConfig;
    }
}

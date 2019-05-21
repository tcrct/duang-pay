package com.duangframework.pay.common;

import com.duangframework.pay.alipay.AliPayApiConfig;

/**
 * 支付配置接口
 * @author laotang
 */
public abstract class AbstractPayConfig {

    AliPayApiConfig aliPayApiConfig;

    public AbstractPayConfig() {
        aliPayApiConfig = builderAliPayConfig(AliPayApiConfig.Builder());
    }

    public AliPayApiConfig getAliPayApiConfig() {
        return aliPayApiConfig;
    }

    /**
     *
     * @param aliPayApiConfig
     * @return AliPayApiConfig
     */
    protected  abstract AliPayApiConfig builderAliPayConfig(AliPayApiConfig aliPayApiConfig);

}

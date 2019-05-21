package com.duangframework.pay.alipay;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.duangframework.kit.ToolsKit;
import java.io.Serializable;

/**
 * @author Javen 2017年5月20日
 */
public class AliPayApiConfig implements Serializable {
	private static final long serialVersionUID = -4736760736935998953L;

	private String privateKey;
	private String publicKey;
	private String appId;
	private String serviceUrl;
	private String charset;
	private String signType;
	private String format;
	private AlipayClient alipayClient;

	private AliPayApiConfig() {
	}

	public static AliPayApiConfig Builder() {
		return new AliPayApiConfig();
	}

	public AliPayApiConfig build() {
		this.alipayClient = new DefaultAlipayClient(getServiceUrl(), getAppId(), getPrivateKey(), getFormat(),
				getCharset(), getPublicKey(), getSignType());
		return this;
	}

	public String getPrivateKey() {
		if (ToolsKit.isEmpty(privateKey)) {
			throw new IllegalStateException("privateKey 未被赋值");
		}
		return privateKey;
	}

	public AliPayApiConfig setPrivateKey(String privateKey) {
		if (ToolsKit.isEmpty(privateKey)) {
			throw new IllegalArgumentException("privateKey 值不能为 null");
		}
		this.privateKey = privateKey;
		return this;
	}

	public String getPublicKey() {
		if (ToolsKit.isEmpty(publicKey)) {
			throw new IllegalStateException("publicKey 未被赋值");
		}
		return publicKey;
	}

	public AliPayApiConfig setPublicKey(String publicKey) {
		if (ToolsKit.isEmpty(publicKey)) {
			throw new IllegalArgumentException("publicKey 值不能为 null");
		}
		this.publicKey = publicKey;
		return this;
	}

	public String getAppId() {
		if (ToolsKit.isEmpty(appId)) {
			throw new IllegalStateException("appId 未被赋值");
		}
		return appId;
	}

	public AliPayApiConfig setAppId(String appId) {
		if (ToolsKit.isEmpty(appId)) {
			throw new IllegalArgumentException("appId 值不能为 null");
		}
		this.appId = appId;
		return this;
	}

	public String getServiceUrl() {
		if (ToolsKit.isEmpty(serviceUrl)) {
			throw new IllegalStateException("serviceUrl 未被赋值");
		}
		return serviceUrl;
	}

	public AliPayApiConfig setServiceUrl(String serviceUrl) {
		if (ToolsKit.isEmpty(serviceUrl)) {
			serviceUrl = "https://openapi.alipay.com/gateway.do";
		}
		this.serviceUrl = serviceUrl;
		return this;
	}

	public String getCharset() {
		if (ToolsKit.isEmpty(charset)) {
			charset = "UTF-8";
		}
		return charset;
	}

	public AliPayApiConfig setCharset(String charset) {
		if (ToolsKit.isEmpty(charset)) {
			charset = "UTF-8";
		}
		this.charset = charset;
		return this;
	}

	public String getSignType() {
		if (ToolsKit.isEmpty(signType)) {
			signType = "RSA2";
		}
		return signType;
	}

	public AliPayApiConfig setSignType(String signType) {
		if (ToolsKit.isEmpty(signType)) {
			signType = "RSA2";
		}
		this.signType = signType;
		return this;
	}

	public String getFormat() {
		if (ToolsKit.isEmpty(format)) {
			format = "json";
		}
		return format;
	}

	public AlipayClient getAlipayClient() {
		if (alipayClient == null) {
			throw new IllegalStateException("alipayClient 未被初始化");
		}
		return alipayClient;
	}

}

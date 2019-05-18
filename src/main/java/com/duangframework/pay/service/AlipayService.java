package com.duangframework.pay.service;

import com.duangframework.mvc.annotation.Service;

/**
 * 支付宝处理业务层
 * @author laotang
 * @date 2019-05-18
 */
@Service
public class AlipayService {

    public String createPage() {
        return "<html><body><h1 onclick=\"aa("+System.currentTimeMillis()+")\">Hello,Laotang["+ System.currentTimeMillis()+"]!</h1></body><script>function aa(msg){alert(msg);}</script></html>";
    }

}

package com.duangframework.pay.controller;

import com.duangframework.db.enums.LevelEnums;
import com.duangframework.mvc.annotation.Controller;
import com.duangframework.mvc.annotation.Import;
import com.duangframework.mvc.annotation.Mapping;
import com.duangframework.mvc.core.BaseController;
import com.duangframework.pay.service.AlipayService;

@Controller
@Mapping(desc = "支付宝管理", level = LevelEnums.DIR)
public class AlipayController extends BaseController {

    @Import
    private AlipayService alipayService;

    public void createPage() {
        try {

            returnHtml(alipayService.createPage());

        } catch (Exception e) {

        }
    }

}

package com.duangframework.pay;

import com.duangframework.mvc.http.enums.EnvEnum;
import com.duangframework.mvc.plugin.IPlugin;
import com.duangframework.mvc.plugin.PluginChain;
import com.duangframework.pay.plugins.PayPlugin;
import com.duangframework.server.Application;

import java.util.List;

public class Duang {

    public static void main(String[] args) {
        Application.duang().port(9494)
                .plugins(new PluginChain(){
                    @Override
                    public void addPlugin(List<IPlugin> pluginList) throws Exception {
                        pluginList.add(new PayPlugin(new PayConfig()));
                    }
                })
                .env(EnvEnum.DEV)
                .run();
    }
}

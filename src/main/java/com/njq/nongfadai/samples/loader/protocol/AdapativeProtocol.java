package com.njq.nongfadai.samples.loader.protocol;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Copyright 2018/2/9 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.samples.loader.protocol
 * @author: Jerrik
 * @date: 2018/2/9 15:06
 */
@Adaptive
public class AdapativeProtocol implements Protocol {
    @Override
    public int getDefaultPort() {
        return 0;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }
}

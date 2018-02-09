/*
package com.njq.nongfadai.samples.loader.gencode;

*/
/**
 * Copyright 2018/2/9 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.samples.loader.gencode
 * @author: Jerrik
 * @date: 2018/2/9 15:02
 *//*


import com.njq.nongfadai.samples.loader.ExtensionLoaders;

public class Protocol$Adpative2 implements com.njq.nongfadai.samples.loader.protocol.Protocol {
    public int getDefaultPort() {
        throw new UnsupportedOperationException("method public abstract int com.njq.nongfadai.samples.loader.protocol.Protocol.getDefaultPort() of interface com.njq.nongfadai.samples.loader.protocol.Protocol is not adaptive method!");
    }

    public void destroy() {
        throw new UnsupportedOperationException("method public abstract void com.njq.nongfadai.samples.loader.protocol.Protocol.destroy() of interface com.njq.nongfadai.samples.loader.protocol.Protocol is not adaptive method!");
    }

    public com.alibaba.dubbo.rpc.Exporter export(com.alibaba.dubbo.rpc.Invoker arg0) throws com.alibaba.dubbo.rpc.Invoker {
        if (arg0 == null) throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument == null");
        if (arg0.getUrl() == null)
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument getUrl() == null");
        com.alibaba.dubbo.common.URL url = arg0.getUrl();
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.njq.nongfadai.samples.loader.protocol.Protocol) name from url(" + url.toString() + ") use keys([protocol])");
        com.njq.nongfadai.samples.loader.protocol.Protocol extension = (com.njq.nongfadai.samples.loader.protocol.Protocol) ExtensionLoaders.getExtensionLoader(com.njq.nongfadai.samples.loader.protocol.Protocol.class).getExtension(extName);
        return extension.export(arg0);
    }

    public com.alibaba.dubbo.rpc.Invoker refer(java.lang.Class arg0, com.alibaba.dubbo.common.URL arg1) throws java.lang.Class {
        throw new UnsupportedOperationException("method public abstract com.alibaba.dubbo.rpc.Invoker com.njq.nongfadai.samples.loader.protocol.Protocol.refer(java.lang.Class,com.alibaba.dubbo.common.URL) throws com.alibaba.dubbo.rpc.RpcException of interface com.njq.nongfadai.samples.loader.protocol.Protocol is not adaptive method!");
    }
}*/

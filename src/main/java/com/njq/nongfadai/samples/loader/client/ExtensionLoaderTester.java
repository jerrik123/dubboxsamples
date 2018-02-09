package com.njq.nongfadai.samples.loader.client;

import com.njq.nongfadai.samples.loader.ExtensionLoaders;
import com.njq.nongfadai.samples.loader.protocol.Protocol;

/**
 * Copyright 2018/2/9 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.samples.loader.client
 * @author: Jerrik
 * @date: 2018/2/9 14:47
 */
public class ExtensionLoaderTester {
    public static void main(String[] args) {
        ExtensionLoaders.getExtensionLoader(Protocol.class).getExtension("dubbo");
        System.out.println("getExtension---> " + ExtensionLoaders.getExtensionLoader(Protocol.class).getExtension("dubbo"));
        System.out.println("getAdaptiveExtension---> " + ExtensionLoaders.getExtensionLoader(Protocol.class).getAdaptiveExtension());
        System.out.println("getDefaultExtensionName---> " + ExtensionLoaders.getExtensionLoader(Protocol.class).getDefaultExtensionName());//dubbo
        System.out.println("getDefaultExtension---> " + ExtensionLoaders.getExtensionLoader(Protocol.class).getDefaultExtension());//ProtocolFilterWrapper
    }
}

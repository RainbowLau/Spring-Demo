package cn.spring.netty.handler;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-6
 * 通道组池，管理所有websocket连接
 *
 */
public class MyChannelHandlerPool {
    public MyChannelHandlerPool(){}

    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}

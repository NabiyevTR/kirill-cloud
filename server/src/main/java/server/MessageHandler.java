package server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import client.common.messages.GetFilesMessage;
import client.common.messages.Message;


public class MessageHandler extends SimpleChannelInboundHandler<Message> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Message msg) throws Exception {

        if (msg instanceof GetFilesMessage) {
            // TODO ВЗЯТЬ СПИСОК ФАЙЛОВ И НАПРАВИТЬ КЛИЕНТУ
        }


    }
}

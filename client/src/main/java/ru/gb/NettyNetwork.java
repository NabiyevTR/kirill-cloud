package ru.gb;

import java.io.IOException;
import java.net.Socket;
import io.netty.handler.codec.serialization.ObjectDecoderInputStream;
import io.netty.handler.codec.serialization.ObjectEncoderOutputStream;
import ru.gb.cloud.common.messages.Message;


public class NettyNetwork {

    private Socket socket;
    private String host = "localhost";
    private int port = 8080;
    private ObjectEncoderOutputStream out;
    private ObjectDecoderInputStream in;

    public NettyNetwork() {

        try {
            socket = new Socket(host, port);
            out = new ObjectEncoderOutputStream(socket.getOutputStream());
            in = new ObjectDecoderInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Message readMessage() {
        try {
            Message message =  (Message) in.readObject();
            return message;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean sendMessage(Message message) {
        try {
            out.writeObject(message);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void terminate() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}

package dji.thirdparty.org.java_websocket.client;

import dji.thirdparty.org.java_websocket.SSLSocketChannel2;
import dji.thirdparty.org.java_websocket.WebSocketAdapter;
import dji.thirdparty.org.java_websocket.WebSocketImpl;
import dji.thirdparty.org.java_websocket.client.WebSocketClient;
import dji.thirdparty.org.java_websocket.drafts.Draft;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class DefaultSSLWebSocketClientFactory implements WebSocketClient.WebSocketClientFactory {
    protected ExecutorService exec;
    protected SSLContext sslcontext;

    public DefaultSSLWebSocketClientFactory(SSLContext sslContext) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor());
    }

    public DefaultSSLWebSocketClientFactory(SSLContext sslContext, ExecutorService exec2) {
        if (sslContext == null || exec2 == null) {
            throw new IllegalArgumentException();
        }
        this.sslcontext = sslContext;
        this.exec = exec2;
    }

    public ByteChannel wrapChannel(SocketChannel channel, SelectionKey key, String host, int port) throws IOException {
        SSLEngine e = this.sslcontext.createSSLEngine(host, port);
        e.setUseClientMode(true);
        return new SSLSocketChannel2(channel, e, this.exec, key);
    }

    public WebSocketImpl createWebSocket(WebSocketAdapter a, Draft d, Socket c) {
        return new WebSocketImpl(a, d, c);
    }

    public WebSocketImpl createWebSocket(WebSocketAdapter a, List<Draft> d, Socket s) {
        return new WebSocketImpl(a, d, s);
    }
}

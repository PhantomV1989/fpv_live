package dji.thirdparty.org.java_websocket;

import dji.thirdparty.org.java_websocket.drafts.Draft;
import dji.thirdparty.org.java_websocket.exceptions.InvalidDataException;
import dji.thirdparty.org.java_websocket.framing.Framedata;
import dji.thirdparty.org.java_websocket.handshake.ClientHandshake;
import dji.thirdparty.org.java_websocket.handshake.Handshakedata;
import dji.thirdparty.org.java_websocket.handshake.ServerHandshake;
import dji.thirdparty.org.java_websocket.handshake.ServerHandshakeBuilder;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public interface WebSocketListener {
    String getFlashPolicy(WebSocket webSocket);

    InetSocketAddress getLocalSocketAddress(WebSocket webSocket);

    InetSocketAddress getRemoteSocketAddress(WebSocket webSocket);

    void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z);

    void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str);

    void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z);

    void onWebsocketError(WebSocket webSocket, Exception exc);

    void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidDataException;

    ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, ClientHandshake clientHandshake) throws InvalidDataException;

    void onWebsocketHandshakeSentAsClient(WebSocket webSocket, ClientHandshake clientHandshake) throws InvalidDataException;

    void onWebsocketMessage(WebSocket webSocket, String str);

    void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer);

    void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata);

    void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata);

    void onWebsocketPing(WebSocket webSocket, Framedata framedata);

    void onWebsocketPong(WebSocket webSocket, Framedata framedata);

    void onWriteDemand(WebSocket webSocket);
}

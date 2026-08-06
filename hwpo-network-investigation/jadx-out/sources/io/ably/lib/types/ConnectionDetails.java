package io.ably.lib.types;

import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Log;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionDetails {
    private static final String TAG = "io.ably.lib.types.ConnectionDetails";
    public String clientId;
    public String connectionKey;
    public Long maxFrameSize;
    public Long maxInboundRate;
    public int maxMessageSize;
    public Long maxOutboundRate;
    public Long objectsGCGracePeriod;
    public String serverId;
    public String siteCode;
    public Long maxIdleInterval = Long.valueOf(Defaults.maxIdleInterval);
    public Long connectionStateTtl = Long.valueOf(Defaults.connectionStateTtl);

    public static ConnectionDetails fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ConnectionDetails().readMsgpack(messageUnpacker);
    }

    public ConnectionDetails readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "maxIdleInterval":
                        this.maxIdleInterval = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxFrameSize":
                        this.maxFrameSize = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "objectsGCGracePeriod":
                        this.objectsGCGracePeriod = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "connectionKey":
                        this.connectionKey = messageUnpacker.unpackString();
                        break;
                    case "siteCode":
                        this.siteCode = messageUnpacker.unpackString();
                        break;
                    case "clientId":
                        this.clientId = messageUnpacker.unpackString();
                        break;
                    case "maxInboundRate":
                        this.maxInboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "serverId":
                        this.serverId = messageUnpacker.unpackString();
                        break;
                    case "maxMessageSize":
                        this.maxMessageSize = messageUnpacker.unpackInt();
                        break;
                    case "connectionStateTtl":
                        this.connectionStateTtl = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "maxOutboundRate":
                        this.maxOutboundRate = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }
}

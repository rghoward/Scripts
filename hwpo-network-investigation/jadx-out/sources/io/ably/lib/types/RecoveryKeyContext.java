package io.ably.lib.types;

import com.google.gson.JsonSyntaxException;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class RecoveryKeyContext {
    private static final String TAG = "RecoveryKeyContext";
    private final Map<String, String> channelSerials;
    private final String connectionKey;
    private final long msgSerial;

    public RecoveryKeyContext(String str, long j, Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.channelSerials = map2;
        this.connectionKey = str;
        this.msgSerial = j;
        map2.putAll(map);
    }

    public static RecoveryKeyContext decode(String str) {
        try {
            return (RecoveryKeyContext) Serialisation.gson.fromJson(str, RecoveryKeyContext.class);
        } catch (JsonSyntaxException e) {
            Log.e(TAG, "Cannot create recovery key from json: " + e.getMessage());
            return null;
        }
    }

    public String encode() {
        return Serialisation.gson.toJson(this);
    }

    public Map<String, String> getChannelSerials() {
        return this.channelSerials;
    }

    public String getConnectionKey() {
        return this.connectionKey;
    }

    public long getMsgSerial() {
        return this.msgSerial;
    }
}

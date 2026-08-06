package io.ably.lib.objects;

import com.google.gson.JsonArray;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ObjectsSerializer {
    JsonArray asJsonArray(Object[] objArr);

    Object[] readFromJsonArray(JsonArray jsonArray);

    Object[] readMsgpackArray(MessageUnpacker messageUnpacker);

    void writeMsgpackArray(Object[] objArr, MessagePacker messagePacker);
}

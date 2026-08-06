package io.ably.lib.objects;

import io.ably.lib.objects.state.ObjectsStateChange;
import io.ably.lib.objects.type.counter.LiveCounter;
import io.ably.lib.objects.type.map.LiveMap;
import io.ably.lib.objects.type.map.LiveMapValue;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface RealtimeObjects extends ObjectsStateChange {
    LiveCounter createCounter();

    LiveCounter createCounter(Number number);

    void createCounterAsync(ObjectsCallback<LiveCounter> objectsCallback);

    void createCounterAsync(Number number, ObjectsCallback<LiveCounter> objectsCallback);

    LiveMap createMap();

    LiveMap createMap(Map<String, LiveMapValue> map);

    void createMapAsync(ObjectsCallback<LiveMap> objectsCallback);

    void createMapAsync(Map<String, LiveMapValue> map, ObjectsCallback<LiveMap> objectsCallback);

    LiveMap getRoot();

    void getRootAsync(ObjectsCallback<LiveMap> objectsCallback);
}

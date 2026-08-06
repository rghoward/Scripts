package io.ably.lib.objects.state;

import io.ably.lib.objects.ObjectsSubscription;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ObjectsStateChange {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Listener {
        void onStateChanged(ObjectsStateEvent objectsStateEvent);
    }

    void off(Listener listener);

    void offAll();

    ObjectsSubscription on(ObjectsStateEvent objectsStateEvent, Listener listener);
}

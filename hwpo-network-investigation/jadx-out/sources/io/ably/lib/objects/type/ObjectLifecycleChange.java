package io.ably.lib.objects.type;

import io.ably.lib.objects.ObjectsSubscription;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ObjectLifecycleChange {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @FunctionalInterface
    public interface Listener {
        void onLifecycleEvent(ObjectLifecycleEvent objectLifecycleEvent);
    }

    void off(Listener listener);

    void offAll();

    ObjectsSubscription on(ObjectLifecycleEvent objectLifecycleEvent, Listener listener);
}

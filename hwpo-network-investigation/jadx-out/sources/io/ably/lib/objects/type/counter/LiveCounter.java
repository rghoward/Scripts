package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.ObjectsCallback;
import io.ably.lib.objects.type.ObjectLifecycleChange;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LiveCounter extends LiveCounterChange, ObjectLifecycleChange {
    void decrement(Number number);

    void decrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    void increment(Number number);

    void incrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    Double value();
}

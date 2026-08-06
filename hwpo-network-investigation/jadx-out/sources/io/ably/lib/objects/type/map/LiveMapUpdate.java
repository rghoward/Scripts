package io.ably.lib.objects.type.map;

import io.ably.lib.objects.type.ObjectUpdate;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LiveMapUpdate extends ObjectUpdate {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Change {
        UPDATED,
        REMOVED
    }

    public LiveMapUpdate() {
        super(null);
    }

    public Map<String, Change> getUpdate() {
        return (Map) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveMapUpdate{no change}";
        }
        return "LiveMapUpdate{changes=" + getUpdate() + "}";
    }

    public LiveMapUpdate(Map<String, Change> map) {
        super(map);
    }
}

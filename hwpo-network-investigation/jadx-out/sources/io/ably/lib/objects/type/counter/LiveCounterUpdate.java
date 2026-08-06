package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.type.ObjectUpdate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LiveCounterUpdate extends ObjectUpdate {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Update {
        private final Double amount;

        public Update(Double d) {
            this.amount = d;
        }

        public Double getAmount() {
            return this.amount;
        }
    }

    public LiveCounterUpdate(Double d) {
        super(new Update(d));
    }

    public Update getUpdate() {
        return (Update) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveCounterUpdate{no change}";
        }
        return "LiveCounterUpdate{amount=" + getUpdate().getAmount() + "}";
    }

    public LiveCounterUpdate() {
        super(null);
    }
}

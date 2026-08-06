package io.intercom.android.sdk.m5.home.states;

import defpackage.e44;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface HomeItemBadge {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class IconWithIndicator implements HomeItemBadge {
        public static final int $stable = 0;
        public static final IconWithIndicator INSTANCE = new IconWithIndicator();

        private IconWithIndicator() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class IndicatorWithCount implements HomeItemBadge {
        public static final int $stable = 0;
        private final int count;

        public IndicatorWithCount(int i) {
            this.count = i;
        }

        public static /* synthetic */ IndicatorWithCount copy$default(IndicatorWithCount indicatorWithCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indicatorWithCount.count;
            }
            return indicatorWithCount.copy(i);
        }

        public final int component1() {
            return this.count;
        }

        public final IndicatorWithCount copy(int i) {
            return new IndicatorWithCount(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IndicatorWithCount) && this.count == ((IndicatorWithCount) obj).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return e44.a(new StringBuilder("IndicatorWithCount(count="), this.count, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class None implements HomeItemBadge {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}

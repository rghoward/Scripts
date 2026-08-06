package io.intercom.android.sdk.m5.conversation;

import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
interface SearchQuery {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class None implements SearchQuery {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Query implements SearchQuery {
        public static final int $stable = 0;
        private final String value;

        public Query(String str) {
            str.getClass();
            this.value = str;
        }

        public static /* synthetic */ Query copy$default(Query query, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = query.value;
            }
            return query.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Query copy(String str) {
            str.getClass();
            return new Query(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Query) && xj5.a(this.value, ((Query) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Query(value="), this.value, ')');
        }
    }
}

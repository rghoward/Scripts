package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface xl9 {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final NativeSharedCounter b;

        static {
            System.loadLibrary("datastore_shared_counter");
            b = new NativeSharedCounter();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements xl9 {
        public final NativeSharedCounter b;
        public final long c;

        public b(NativeSharedCounter nativeSharedCounter, long j) {
            nativeSharedCounter.getClass();
            this.b = nativeSharedCounter;
            this.c = j;
        }

        @Override // defpackage.xl9
        public final int a() {
            return this.b.nativeIncrementAndGetCounterValue(this.c);
        }

        @Override // defpackage.xl9
        public final int getValue() {
            return this.b.nativeGetCounterValue(this.c);
        }
    }

    int a();

    int getValue();
}

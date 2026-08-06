package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tra {
    public static final long a = a.b(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final int a(int i, long j) {
            int i2 = tra.b;
            return ((int) (j >> (i * 15))) & 32767;
        }

        public static long b(int i, int i2, int i3, int i4) {
            return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
        }
    }
}

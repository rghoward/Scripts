package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hdb {
    public static final int[] a = new int[0];
    public static final float[] b = new float[0];
    public static final v20 c = new v20(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long a(idb<?> idbVar, long j) {
        long jF = j - ((long) idbVar.f());
        long jC = idbVar.c();
        if (jF < 0) {
            jF = 0;
        }
        return jF > jC ? jC : jF;
    }
}

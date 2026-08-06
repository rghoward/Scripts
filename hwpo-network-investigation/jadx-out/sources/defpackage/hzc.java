package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hzc {
    public final lzc a;
    public int b = 1;
    public long c = a();

    public hzc(lzc lzcVar) {
        this.a = lzcVar;
    }

    public final long a() {
        lzc lzcVar = this.a;
        a78.g(lzcVar);
        long jLongValue = ((Long) wfc.v.a(null)).longValue();
        long jLongValue2 = ((Long) wfc.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        lzcVar.c().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}

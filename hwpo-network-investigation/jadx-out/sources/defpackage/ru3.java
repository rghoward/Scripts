package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru3 implements ns3 {
    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static /* synthetic */ void d(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void e(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void f(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // defpackage.ns3
    public js3[] a() {
        apa apaVar = new apa(0L);
        k95.b bVar = k95.u;
        return new js3[]{new oya(1, 1, z4a.a.a, apaVar, new fv2(0, ul8.x))};
    }
}

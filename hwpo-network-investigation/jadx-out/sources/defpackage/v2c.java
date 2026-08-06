package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v2c {
    public final u2c a;

    public v2c(p4c p4cVar, p4c p4cVar2, Object obj) {
        this.a = new u2c(p4cVar, p4cVar2, obj);
    }

    public static void a(b1c b1cVar, u2c u2cVar, Object obj, Object obj2) {
        k1c.d(b1cVar, u2cVar.a, 1, obj);
        k1c.d(b1cVar, u2cVar.b, 2, obj2);
    }

    public static int b(u2c u2cVar, Object obj, Object obj2) {
        p4c p4cVar = u2cVar.a;
        p4c p4cVar2 = u2cVar.b;
        return k1c.e(p4cVar2, 2, obj2) + k1c.e(p4cVar, 1, obj);
    }

    public final u2c c() {
        return this.a;
    }
}

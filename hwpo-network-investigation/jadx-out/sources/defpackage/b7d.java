package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b7d extends c7d {
    public static final c7d e;
    public static final c7d f;

    static {
        c7d c7dVarB = new b7d(null, new ep9(0)).b();
        e = c7dVarB;
        b7d b7dVar = new b7d(c7dVarB, new ep9());
        boolean z = !b7dVar.c;
        Boolean bool = Boolean.TRUE;
        xl7.q("Can't mutate after handing to trace", z);
        a7d a7dVar = c7d.d;
        xl7.q("Key already present", !b7dVar.c(a7dVar));
        b7dVar.b.put(a7dVar, bool);
        f = b7dVar.b();
    }
}

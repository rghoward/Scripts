package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0a {
    public long a;
    public o0a b;

    public o0a() {
        this(qu9.j().g());
    }

    public abstract void a(o0a o0aVar);

    public abstract o0a b();

    public o0a c(long j) {
        o0a o0aVarB = b();
        o0aVarB.a = j;
        return o0aVarB;
    }

    public o0a(long j) {
        this.a = j;
    }
}

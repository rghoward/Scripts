package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dy5 implements rv5.a {
    public final oh4<Integer, Object> a;
    public final oh4<Integer, Object> b;
    public final fr1 c;

    public dy5(oh4 oh4Var, oh4 oh4Var2, fr1 fr1Var) {
        this.a = oh4Var;
        this.b = oh4Var2;
        this.c = fr1Var;
    }

    @Override // rv5.a
    public final oh4<Integer, Object> d() {
        return this.b;
    }

    @Override // rv5.a
    public final oh4<Integer, Object> getKey() {
        return this.a;
    }
}

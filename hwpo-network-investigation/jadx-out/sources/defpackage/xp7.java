package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xp7 implements rv5.a {
    public final oh4<Integer, Object> a;
    public final fi4<qq7, Integer, jt1, Integer, g2b> b;

    /* JADX WARN: Multi-variable type inference failed */
    public xp7(oh4<? super Integer, ? extends Object> oh4Var, fi4<? super qq7, ? super Integer, ? super jt1, ? super Integer, g2b> fi4Var) {
        this.a = oh4Var;
        this.b = fi4Var;
    }

    @Override // rv5.a
    public final oh4<Integer, Object> getKey() {
        return this.a;
    }
}

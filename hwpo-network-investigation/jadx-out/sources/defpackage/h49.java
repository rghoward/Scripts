package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h49 implements g49 {
    public final i49 a;
    public final r54<dl2> b;

    public h49(i49 i49Var) {
        i49Var.getClass();
        this.a = i49Var;
        this.b = i49Var.a();
    }

    @Override // defpackage.g49
    public final r54<dl2> a() {
        return this.b;
    }

    @Override // defpackage.g49
    public final Object b(dl2 dl2Var, tc9 tc9Var) {
        Object objB = this.a.b(dl2Var, tc9Var);
        return objB == v72.t ? objB : g2b.a;
    }
}

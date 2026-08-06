package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j49 implements i49 {
    public final am9 a;
    public final ji8 b;

    public j49() {
        am9 am9VarB = ty1.b(7, null);
        this.a = am9VarB;
        this.b = yk2.a(am9VarB);
    }

    @Override // defpackage.i49
    public final ji8 a() {
        return this.b;
    }

    @Override // defpackage.i49
    public final Object b(dl2 dl2Var, tc9 tc9Var) throws Throwable {
        Object objEmit = this.a.emit(dl2Var, tc9Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }
}

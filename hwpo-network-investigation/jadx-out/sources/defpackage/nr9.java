package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr9 implements mr9 {
    public final ci4<kg5, kg5, a04<kg5>> a;

    public nr9(ci4 ci4Var) {
        this.a = ci4Var;
    }

    @Override // defpackage.mr9
    public final a04<kg5> a(long j, long j2) {
        return this.a.invoke(new kg5(j), new kg5(j2));
    }

    @Override // defpackage.mr9
    public final boolean b() {
        return true;
    }
}

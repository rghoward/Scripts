package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hb8 implements oh4<String, g2b> {
    public final /* synthetic */ db8 t;

    public hb8(db8 db8Var) {
        this.t = db8Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        String str2 = str;
        ho5<Object>[] ho5VarArr = db8.D;
        mf4 mf4VarP = this.t.p();
        int i = 1;
        if (str2 == null) {
            xgb.c(mf4VarP.m, true);
        }
        xgb.f(mf4VarP.b, str2, new u62(i, mf4VarP));
        return g2b.a;
    }
}

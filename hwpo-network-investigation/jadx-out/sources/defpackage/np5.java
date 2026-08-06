package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class np5 implements u21<Object> {
    public final /* synthetic */ e41 a;

    public np5(e41 e41Var) {
        this.a = e41Var;
    }

    @Override // defpackage.u21
    public final void onFailure(p21<Object> p21Var, Throwable th) {
        this.a.resumeWith(new av8.a(th));
    }

    @Override // defpackage.u21
    public final void onResponse(p21<Object> p21Var, ru8<Object> ru8Var) {
        p21Var.getClass();
        this.a.resumeWith(ru8Var);
    }
}

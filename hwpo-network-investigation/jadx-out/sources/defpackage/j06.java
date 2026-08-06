package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j06 implements b33 {
    public final /* synthetic */ k06 a;
    public final /* synthetic */ Object b;

    public j06(k06 k06Var, Object obj) {
        this.a = k06Var;
        this.b = obj;
    }

    @Override // defpackage.b33
    public final void dispose() {
        this.a.v.k(this.b);
    }
}

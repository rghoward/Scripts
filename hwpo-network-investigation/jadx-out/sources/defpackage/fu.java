package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fu implements b33 {
    public final /* synthetic */ fv9 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ su c;

    public fu(fv9 fv9Var, Object obj, su suVar) {
        this.a = fv9Var;
        this.b = obj;
        this.c = suVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.b33
    public final void dispose() {
        fv9 fv9Var = this.a;
        Object obj = this.b;
        fv9Var.remove(obj);
        this.c.d.k((S) obj);
    }
}

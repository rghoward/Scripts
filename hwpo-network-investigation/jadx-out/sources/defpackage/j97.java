package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j97 extends wp5 implements oh4<Object, Boolean> {
    public final /* synthetic */ gl8<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j97(gl8<Object> gl8Var) {
        super(1);
        this.u = gl8Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, dw2, txa] */
    @Override // defpackage.oh4
    public final Boolean invoke(Object obj) {
        boolean z;
        ?? r2 = (txa) obj;
        if (r2.q().G) {
            this.u.t = r2;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
public final class j62 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fw0 u;
    public final /* synthetic */ kha v;
    public final /* synthetic */ u56 w;
    public final /* synthetic */ sia x;
    public final /* synthetic */ ag7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j62(fw0 fw0Var, kha khaVar, u56 u56Var, sia siaVar, ag7 ag7Var, r02<? super j62> r02Var) {
        super(2, r02Var);
        this.u = fw0Var;
        this.v = khaVar;
        this.w = u56Var;
        this.x = siaVar;
        this.y = ag7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j62(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j62) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        sk8 sk8VarB;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            hda hdaVar = this.w.a;
            ria riaVar = this.x.a;
            this.t = 1;
            int iB = this.y.b(lja.e(this.v.b));
            if (iB < riaVar.a.a.u.length()) {
                sk8VarB = riaVar.b(iB);
            } else {
                sk8VarB = iB != 0 ? riaVar.b(iB - 1) : new sk8(0.0f, 0.0f, 1.0f, (int) (bea.a(hdaVar.b, hdaVar.g, hdaVar.h, bea.a, 1) & 4294967295L));
            }
            Object objA = this.u.a(sk8VarB, this);
            v72 v72Var = v72.t;
            if (objA != v72Var) {
                objA = g2b.a;
            }
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}

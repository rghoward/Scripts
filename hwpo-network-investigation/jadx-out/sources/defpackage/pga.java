package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
public final class pga extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ j18 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ lja x;
    public final /* synthetic */ qga y;
    public final /* synthetic */ ag7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga(j18 j18Var, String str, long j, lja ljaVar, qga qgaVar, ag7 ag7Var, r02<? super pga> r02Var) {
        super(2, r02Var);
        this.u = j18Var;
        this.v = str;
        this.w = j;
        this.x = ljaVar;
        this.y = qgaVar;
        this.z = ag7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new pga(this.u, this.v, this.w, this.x, this.y, this.z, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((pga) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        String str = this.v;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            obj = this.u.c(str, this.w, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        lja ljaVar = (lja) obj;
        if (ljaVar == null) {
            return g2b.a;
        }
        long j = ljaVar.a;
        ag7 ag7Var = this.z;
        long jC = ay.c(ag7Var.a((int) (j >> 32)), ag7Var.a((int) (j & 4294967295L)));
        if (!lja.a(jC, this.x)) {
            qga qgaVar = this.y;
            if (xj5.a(qgaVar.n().a.u, str) && ag7Var == qgaVar.b) {
                qgaVar.c.invoke(qga.e(qgaVar.n().a, jC));
                qgaVar.w = new lja(jC);
            }
        }
        return g2b.a;
    }
}

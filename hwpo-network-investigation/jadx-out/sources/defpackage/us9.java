package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
public final class us9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ms9 u;
    public final /* synthetic */ u3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us9(ms9 ms9Var, u3 u3Var, r02<? super us9> r02Var) {
        super(2, r02Var);
        this.u = ms9Var;
        this.v = u3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new us9(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((us9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jA;
        int i = this.t;
        ms9 ms9Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            if (ms9Var != null) {
                ns9 duration = ms9Var.b().getDuration();
                boolean z = ms9Var.b().b() != null;
                int iOrdinal = duration.ordinal();
                if (iOrdinal == 0) {
                    jA = 4000;
                } else if (iOrdinal == 1) {
                    jA = 10000;
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    jA = Long.MAX_VALUE;
                }
                u3 u3Var = this.v;
                if (u3Var != null) {
                    jA = u3Var.a(jA, z);
                }
                this.t = 1;
                Object objB = bw2.b(jA, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        ms9Var.dismiss();
        return g2b.a;
    }
}

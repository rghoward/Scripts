package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
public final class bq extends p6a implements ci4<pd5, r02<?>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ cq v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ pd5 u;
        public final /* synthetic */ cq v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd5 pd5Var, cq cqVar) {
            super(1);
            this.u = pd5Var;
            this.v = cqVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            pd5 pd5Var = this.u;
            synchronized (pd5Var.c) {
                try {
                    pd5Var.e = true;
                    k37<mkb<sd7>> k37Var = pd5Var.d;
                    mkb<sd7>[] mkbVarArr = k37Var.t;
                    int i = k37Var.v;
                    for (int i2 = 0; i2 < i; i2++) {
                        sd7 sd7Var = mkbVarArr[i2].get();
                        if (sd7Var != null) {
                            sd7Var.a();
                        }
                    }
                    pd5Var.d.k();
                    g2b g2bVar = g2b.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            xha xhaVar = this.v.u;
            xhaVar.b.set(null);
            xhaVar.a.d();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(cq cqVar, r02<? super bq> r02Var) {
        super(2, r02Var);
        this.v = cqVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bq bqVar = new bq(this.v, r02Var);
        bqVar.u = obj;
        return bqVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(pd5 pd5Var, r02<?> r02Var) throws Throwable {
        ((bq) create(pd5Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            pd5 pd5Var = (pd5) this.u;
            this.u = pd5Var;
            this.t = 1;
            e41 e41Var = new e41(1, th0.e(this));
            e41Var.t();
            cq cqVar = this.v;
            xha xhaVar = cqVar.u;
            y18 y18Var = xhaVar.a;
            y18Var.a();
            xhaVar.b.set(new gia(xhaVar, y18Var));
            e41Var.v(new a(pd5Var, cqVar));
            Object objR = e41Var.r();
            v72 v72Var = v72.t;
            if (objR == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}

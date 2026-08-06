package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rhb implements jac {
    public static final kr5 t = new kr5();
    public static final /* synthetic */ rhb u = new rhb();

    public static final eg1 b(mhb mhbVar) {
        eg1 eg1Var;
        mhbVar.getClass();
        synchronized (t) {
            eg1Var = (eg1) mhbVar.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (eg1Var == null) {
                h72 h72VarX0 = ff3.t;
                try {
                    et2 et2Var = i23.a;
                    h72VarX0 = ag6.a.x0();
                } catch (IllegalStateException | lc7 unused) {
                }
                eg1 eg1Var2 = new eg1(h72VarX0.c0(od3.b()));
                mhbVar.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", eg1Var2);
                eg1Var = eg1Var2;
            }
        }
        return eg1Var;
    }

    public static final String c(String str) {
        if (str == null || z2a.w(str)) {
            return null;
        }
        return sk0.c("<body>", w2a.l(z2a.D(z2a.C(z2a.P(z2a.L(str, "<body>", str), "</body>"), "\n"), "\n"), "class='benchmark'", "style=\"color:#AF986C;\""), "</body>");
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((j6c) f6c.u.t.t).a());
    }
}

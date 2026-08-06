package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zr1 {
    public static final fr1 a = new fr1(false, 984817901, a.t);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public static final a t = new a();

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                n85 n85VarB = o65.a;
                if (n85VarB == null) {
                    n85.a aVar = new n85.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i = zcb.a;
                    aw9 aw9Var = new aw9(uh1.b);
                    fu7 fu7Var = new fu7();
                    fu7Var.f(19.0f, 6.41f);
                    fu7Var.d(17.59f, 5.0f);
                    fu7Var.d(12.0f, 10.59f);
                    fu7Var.d(6.41f, 5.0f);
                    fu7Var.d(5.0f, 6.41f);
                    fu7Var.d(10.59f, 12.0f);
                    fu7Var.d(5.0f, 17.59f);
                    fu7Var.d(6.41f, 19.0f);
                    fu7Var.d(12.0f, 13.41f);
                    fu7Var.d(17.59f, 19.0f);
                    fu7Var.d(19.0f, 17.59f);
                    fu7Var.d(13.41f, 12.0f);
                    fu7Var.a();
                    n85.a.a(aVar, fu7Var.a, aw9Var);
                    n85VarB = aVar.b();
                    o65.a = n85VarB;
                }
                m65.a(n85VarB, ws3.b(jt1Var2, R.string.m3c_snackbar_dismiss), null, 0L, jt1Var2, 0, 12);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }
}

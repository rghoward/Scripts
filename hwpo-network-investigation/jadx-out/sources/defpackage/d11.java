package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d11 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ d11(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        lja ljaVar;
        int i = this.t;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (i) {
            case 0:
                ((e11) obj4).c((f11) obj3, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            default:
                qga qgaVar = (qga) obj4;
                t72 t72Var = (t72) obj3;
                cca ccaVar = (cca) obj;
                Context context = (Context) obj2;
                boolean zJ = qgaVar.j();
                iw iwVarM = qgaVar.m();
                String str = iwVarM != null ? iwVarM.u : null;
                lja ljaVar2 = qgaVar.w;
                if (ljaVar2 != null) {
                    long j = ljaVar2.a;
                    ag7 ag7Var = qgaVar.b;
                    ljaVar = new lja(ay.c(ag7Var.b((int) (j >> 32)), ag7Var.b((int) (j & 4294967295L))));
                } else {
                    ljaVar = null;
                }
                j18 j18Var = qgaVar.i;
                xga xgaVar = new xga(qgaVar, t72Var, context);
                y0a y0aVar = q18.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || ljaVar == null || j18Var == null || !(j18Var instanceof o18)) {
                    xgaVar.invoke(ccaVar);
                    if (str != null && ljaVar != null) {
                        ma8.a(ccaVar, context, zJ, str, ljaVar.a);
                    }
                } else {
                    String str2 = str;
                    ((o18) j18Var).e(ccaVar, str2, ljaVar.a, xgaVar);
                    ma8.a(ccaVar, context, zJ, str2, ljaVar.a);
                }
                break;
        }
        return g2b.a;
    }
}

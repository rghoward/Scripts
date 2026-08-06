package defpackage;

import android.widget.LinearLayout;
import androidx.fragment.app.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v62 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ v62(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                a72 a72Var = (a72) obj2;
                List list = (List) obj;
                if (a72Var.L.d() != null) {
                    sia siaVarD = a72Var.L.d();
                    siaVarD.getClass();
                    list.add(siaVarD.a);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                db8 db8Var = (db8) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = db8.D;
                gm3Var.getClass();
                if (gm3Var instanceof ab8) {
                    db8Var.m(((ab8) gm3Var).b);
                } else if (gm3Var instanceof za8) {
                    g gVarRequireActivity = db8Var.requireActivity();
                    gVarRequireActivity.getClass();
                    nr1.d(gVarRequireActivity, xp5.MAIN_TABS);
                }
                return g2b.a;
            default:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                ca6 ca6Var = (ca6) yaVar.u;
                LinearLayout linearLayout = ca6Var.a;
                linearLayout.getClass();
                xgb.a(linearLayout, new peb((vo6.c) obj2, yaVar, null));
                hr5 hr5VarBind = hr5.bind(ca6Var.c.a);
                hr5VarBind.getClass();
                yaVar.s(new r67(2, yaVar, hr5VarBind));
                return g2b.a;
        }
    }
}

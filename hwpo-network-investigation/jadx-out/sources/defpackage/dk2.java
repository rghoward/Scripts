package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dk2 implements ei4<oy8, jt1, Integer, g2b> {
    public final /* synthetic */ fr1 t;
    public final /* synthetic */ boolean u;

    public dk2(fr1 fr1Var, boolean z) {
        this.t = fr1Var;
        this.u = z;
    }

    @Override // defpackage.ei4
    public final g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
        String strB;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.t.invoke(jt1Var2, 0);
            float f = zy0.e;
            ox6.a aVar = ox6.a.t;
            b47.b(jt1Var2, ir9.j(aVar, f));
            n85 n85VarB = o65.d;
            if (n85VarB == null) {
                n85.a aVar2 = new n85.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i = zcb.a;
                aw9 aw9Var = new aw9(uh1.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new ju7.f(7.0f, 10.0f));
                arrayList.add(new ju7.m(5.0f, 5.0f));
                arrayList.add(new ju7.m(5.0f, -5.0f));
                arrayList.add(ju7.b.c);
                n85.a.a(aVar2, arrayList, aw9Var);
                n85VarB = aVar2.b();
                o65.d = n85VarB;
            }
            boolean z = this.u;
            if (z) {
                jt1Var2.K(1509384391);
                strB = ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_day_selection);
                jt1Var2.B();
            } else {
                jt1Var2.K(1509478662);
                strB = ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_year_selection);
                jt1Var2.B();
            }
            m65.a(n85VarB, strB, ux8.a(aVar, z ? 180.0f : 0.0f), 0L, jt1Var2, 0, 8);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}

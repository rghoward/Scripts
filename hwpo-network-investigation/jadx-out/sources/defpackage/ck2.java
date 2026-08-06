package defpackage;

import com.hwpo_training_app.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ck2 implements fi4<st5, Integer, jt1, Integer, g2b> {
    public final /* synthetic */ fg5 t;
    public final /* synthetic */ i21 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ oh4<Integer, g2b> x;
    public final /* synthetic */ s99 y;
    public final /* synthetic */ lh2 z;

    /* JADX WARN: Multi-variable type inference failed */
    public ck2(fg5 fg5Var, i21 i21Var, int i, int i2, oh4<? super Integer, g2b> oh4Var, s99 s99Var, lh2 lh2Var) {
        this.t = fg5Var;
        this.u = i21Var;
        this.v = i;
        this.w = i2;
        this.x = oh4Var;
        this.y = s99Var;
        this.z = lh2Var;
    }

    @Override // defpackage.fi4
    public final g2b invoke(st5 st5Var, Integer num, jt1 jt1Var, Integer num2) {
        int iIntValue = num.intValue();
        jt1 jt1Var2 = jt1Var;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= jt1Var2.h(iIntValue) ? 32 : 16;
        }
        if (jt1Var2.A(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            final int i = iIntValue + this.t.t;
            String strA = h21.a(i, this.u.a, 7);
            ox6 ox6VarG = ir9.g(fk2.z, fk2.y);
            boolean z = i == this.v;
            boolean z2 = i == this.w;
            final oh4<Integer, g2b> oh4Var = this.x;
            boolean zJ = jt1Var2.J(oh4Var) | jt1Var2.h(i);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: bk2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oh4Var.invoke(Integer.valueOf(i));
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF);
            }
            this.y.getClass();
            lj2.m(strA, ox6VarG, z, z2, (mh4) objF, true, String.format(ws3.b(jt1Var2, R.string.m3c_date_picker_navigate_to_year_description), Arrays.copyOf(new Object[]{strA}, 1)), this.z, jt1Var2, 48);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}

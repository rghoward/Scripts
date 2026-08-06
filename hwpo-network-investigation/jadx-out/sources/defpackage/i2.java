package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ i2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Collection) obj2).contains(obj));
            case 1:
                final eb5 eb5Var = (eb5) obj2;
                s01 s01Var = (s01) obj;
                float density = s01Var.getDensity() * eb5Var.T.d().t;
                vp vpVarA = xp.a();
                jl9 jl9VarA = eb5Var.S;
                if (jl9VarA == null) {
                    jl9VarA = wl9.a((ul9) ku1.a(eb5Var, wl9.a), gz3.d);
                }
                em7.a(vpVarA, jl9VarA.mo0createOutlinePq9zytI(s01Var.t.c(), s01Var.t.getLayoutDirection(), s01Var));
                vp vpVarA2 = xp.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)) - density;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s01Var.t.c() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3)) {
                    xp.b("Invalid rectangle, make sure no value is NaN");
                }
                if (vpVarA2.b == null) {
                    vpVarA2.b = new RectF();
                }
                RectF rectF = vpVarA2.b;
                rectF.getClass();
                rectF.set(0.0f, fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3);
                Path path = vpVarA2.a;
                RectF rectF2 = vpVarA2.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                final vp vpVarA3 = xp.a();
                vpVarA3.r(vpVarA2, vpVarA, 1);
                return s01Var.e(new oh4() { // from class: db5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        cz1 cz1Var = (cz1) obj3;
                        cz1Var.K1();
                        qt<uh1, ew> qtVar = eb5Var.R;
                        qtVar.getClass();
                        d73.c1(cz1Var, vpVarA3, new aw9(qtVar.d().a), 0.0f, null, null, 60);
                        return g2b.a;
                    }
                });
            case 2:
                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$7$lambda$6((oh4) obj2, (String) obj);
            default:
                hc9 hc9Var = (hc9) obj;
                ec9.e(hc9Var, 3);
                ec9.b((String) obj2, hc9Var);
                return g2b.a;
        }
    }
}

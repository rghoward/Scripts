package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 implements fl6 {
    public static final yi0 a = new yi0();

    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, List<? extends cl6> list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cl6 cl6Var = list.get(i);
            if (xj5.a(yq5.c(cl6Var), MetricTracker.Object.BADGE)) {
                final jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, 0, 0, 11, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cl6 cl6Var2 = list.get(i2);
                    if (xj5.a(yq5.c(cl6Var2), "anchor")) {
                        final jz7 jz7VarE2 = cl6Var2.E(j);
                        e15 e15Var = fi.a;
                        int iR = jz7VarE2.R(e15Var);
                        e15 e15Var2 = fi.b;
                        return hl6Var.y0(jz7VarE2.t, jz7VarE2.u, qi6.i(new js7(e15Var, Integer.valueOf(iR)), new js7(e15Var2, Integer.valueOf(jz7VarE2.R(e15Var2)))), new oh4() { // from class: xi0
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                jz7.a aVar = (jz7.a) obj;
                                jz7 jz7Var = jz7VarE;
                                int i3 = jz7Var.t;
                                float f = aj0.x;
                                hl6 hl6Var2 = hl6Var;
                                boolean z = i3 > hl6Var2.n1(f);
                                float f2 = z ? 12.0f : 6.0f;
                                float f3 = z ? 14.0f : 6.0f;
                                jz7 jz7Var2 = jz7VarE2;
                                jz7.a.t(aVar, jz7Var2, 0, 0);
                                jz7.a.t(aVar, jz7Var, Math.min(jz7Var2.t - hl6Var2.n1(f2), ((int) aVar.f(wi0.b, Float.POSITIVE_INFINITY)) - jz7Var.t), Math.max(hl6Var2.n1(f3) + (-jz7Var.u), (int) aVar.f(wi0.a, Float.NEGATIVE_INFINITY)));
                                return g2b.a;
                            }
                        });
                    }
                }
                ab6.b("Collection contains no element matching the predicate.");
                fl.a();
                return null;
            }
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return null;
    }
}

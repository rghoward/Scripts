package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r66 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        String a(Context context);
    }

    public static qp1<?> a(String str, String str2) {
        ke0 ke0Var = new ke0(str, str2);
        qp1.a aVarB = qp1.b(p66.class);
        aVarB.e = 1;
        aVarB.f = new op1(ke0Var);
        return aVarB.b();
    }

    public static qp1<?> b(final String str, final a<Context> aVar) {
        qp1.a aVarB = qp1.b(p66.class);
        aVarB.e = 1;
        aVarB.a(ay2.c(Context.class));
        aVarB.f = new qq1() { // from class: q66
            @Override // defpackage.qq1
            public final Object a(xu8 xu8Var) {
                return new ke0(str, aVar.a((Context) xu8Var.a(Context.class)));
            }
        };
        return aVarB.b();
    }
}

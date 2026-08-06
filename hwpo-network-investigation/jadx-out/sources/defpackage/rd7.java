package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rd7 {
    public static final k7a a = new k7a("NULL");
    public static final k7a b = new k7a("UNINITIALIZED");
    public static final k7a c = new k7a("DONE");

    public static final fn a(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new fn(setSingleton);
    }

    public static final String[] b(pz1 pz1Var) {
        pz1Var.getClass();
        return (String[]) ((fn) pz1Var).b.toArray(new String[0]);
    }

    public static final void c(jt1 jt1Var, final oh4 oh4Var) {
        jt1Var.b(new ci4() { // from class: b4b
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                oh4Var.invoke(obj);
                return g2b.a;
            }
        }, g2b.a);
    }

    public static final void d(jt1 jt1Var, ci4 ci4Var, Object obj) {
        if (jt1Var.l() || !xj5.a(jt1Var.f(), obj)) {
            jt1Var.C(obj);
            jt1Var.b(ci4Var, obj);
        }
    }
}

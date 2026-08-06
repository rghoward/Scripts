package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class th0 implements jac {
    public static final /* synthetic */ th0 t = new th0();

    public static final void b(final boolean z, final mh4 mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1339183247);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            rh0.b(z, mh4Var, bj4VarO, i2 & 126);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sh0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    th0.b(z, mh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final h2a c(sl5 sl5Var, String str) {
        sl5Var.getClass();
        str.getClass();
        return new h2a(str, sl5Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r02 d(r02 r02Var, r02 r02Var2, ci4 ci4Var) {
        ci4Var.getClass();
        if (ci4Var instanceof ak0) {
            return ((ak0) ci4Var).create(r02Var, r02Var2);
        }
        h72 context = r02Var2.getContext();
        return context == ff3.t ? new yj5(r02Var2, r02Var, ci4Var) : new zj5(r02Var2, context, ci4Var, r02Var);
    }

    public static r02 e(r02 r02Var) {
        r02<Object> r02VarIntercepted;
        r02Var.getClass();
        u02 u02Var = r02Var instanceof u02 ? (u02) r02Var : null;
        return (u02Var == null || (r02VarIntercepted = u02Var.intercepted()) == null) ? r02Var : r02VarIntercepted;
    }

    public static Object f(ci4 ci4Var, Object obj, r02 r02Var) {
        ci4Var.getClass();
        h72 context = r02Var.getContext();
        w72 ak5Var = context == ff3.t ? new ak5(r02Var) : new bk5(r02Var, context);
        fza.b(2, ci4Var);
        return ci4Var.invoke(obj, ak5Var);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((u5c) t5c.u.t.t).d());
    }
}

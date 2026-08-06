package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b47 implements jac {
    public static final k7a t = new k7a("NO_OWNER");
    public static final /* synthetic */ b47 u = new b47();

    public static final void b(jt1 jt1Var, ox6 ox6Var) {
        int iHashCode = Long.hashCode(jt1Var.v());
        ox6 ox6VarC = it1.c(jt1Var, ox6Var);
        kw7 kw7VarY = jt1Var.y();
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, uw9.a);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        jt1Var.I();
    }

    public static final jt8 c(ria riaVar, int i) {
        qia qiaVar = riaVar.a;
        l07 l07Var = riaVar.b;
        if (qiaVar.a.u.length() != 0) {
            int iD = l07Var.d(i);
            if ((i != 0 && iD == l07Var.d(i - 1)) || (i != qiaVar.a.u.length() && iD == l07Var.d(i + 1))) {
                return riaVar.a(i);
            }
        }
        return riaVar.h(i);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(l6c.u.get().e());
    }
}

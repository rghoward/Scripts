package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ow {
    public static final js7<List<iw.c<mz7>>, List<iw.c<ei4<String, jt1, Integer, g2b>>>> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements fl6 {
        public static final a a = new a();

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).E(j));
            }
            return hl6Var.y0(xx1.h(j), xx1.g(j), if3.t, new nw(0, arrayList));
        }
    }

    static {
        hf3 hf3Var = hf3.t;
        a = new js7<>(hf3Var, hf3Var);
    }

    public static final void a(final iw iwVar, final List<iw.c<ei4<String, jt1, Integer, g2b>>> list, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1794596951);
        int i2 = (i & 6) == 0 ? (bj4VarO.J(iwVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(list) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                iw.c<ei4<String, jt1, Integer, g2b>> cVar = list.get(i3);
                ei4<String, jt1, Integer, g2b> ei4Var = cVar.a;
                int i4 = cVar.b;
                int i5 = cVar.c;
                Object objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = a.a;
                    bj4VarO.C(objF);
                }
                fl6 fl6Var = (fl6) objF;
                int iHashCode = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP = bj4VarO.P();
                ox6 ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6Var);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ei4Var.invoke(iwVar.subSequence(i4, i5).u, bj4VarO, 0);
                bj4VarO.U(true);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mw
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    ow.a(iwVar, list, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}

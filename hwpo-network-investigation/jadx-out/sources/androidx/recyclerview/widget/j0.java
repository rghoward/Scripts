package androidx.recyclerview.widget;

import defpackage.ep9;
import defpackage.i03;
import defpackage.we6;
import defpackage.x58;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final ep9<RecyclerView.e0, a> a = new ep9<>();
    public final we6<RecyclerView.e0> b = new we6<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static final x58 d = new x58(20);
        public int a;
        public RecyclerView.l.b b;
        public RecyclerView.l.b c;

        public static a a() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.e0 e0Var, RecyclerView.l.b bVar) {
        ep9<RecyclerView.e0, a> ep9Var = this.a;
        a aVarA = ep9Var.get(e0Var);
        if (aVarA == null) {
            aVarA = a.a();
            ep9Var.put(e0Var, aVarA);
        }
        aVarA.c = bVar;
        aVarA.a |= 8;
    }

    public final RecyclerView.l.b b(RecyclerView.e0 e0Var, int i) {
        a aVarJ;
        RecyclerView.l.b bVar;
        ep9<RecyclerView.e0, a> ep9Var = this.a;
        int iD = ep9Var.d(e0Var);
        if (iD >= 0 && (aVarJ = ep9Var.j(iD)) != null) {
            int i2 = aVarJ.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarJ.a = i3;
                if (i == 4) {
                    bVar = aVarJ.b;
                } else if (i == 8) {
                    bVar = aVarJ.c;
                } else {
                    z90.a("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ep9Var.h(iD);
                    aVarJ.a = 0;
                    aVarJ.b = null;
                    aVarJ.c = null;
                    a.d.a(aVarJ);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public final void d(RecyclerView.e0 e0Var) {
        we6<RecyclerView.e0> we6Var = this.b;
        for (int iH = we6Var.h() - 1; iH >= 0; iH--) {
            if (e0Var == we6Var.i(iH)) {
                Object[] objArr = we6Var.v;
                Object obj = objArr[iH];
                Object obj2 = i03.B;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                we6Var.t = true;
                break;
            }
        }
        a aVarRemove = this.a.remove(e0Var);
        if (aVarRemove != null) {
            aVarRemove.a = 0;
            aVarRemove.b = null;
            aVarRemove.c = null;
            a.d.a(aVarRemove);
        }
    }
}

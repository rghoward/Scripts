package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n5b {
    public final List<id4> a;
    public final hsa[] b;
    public final pn8 c;

    public n5b(List list) {
        this.a = list;
        this.b = new hsa[list.size()];
        pn8 pn8Var = new pn8(new pn8.b() { // from class: m5b
            @Override // pn8.b
            public final void a(long j, pt7 pt7Var) {
                y51.b(j, pt7Var, this.a.b);
            }
        });
        this.c = pn8Var;
        pn8Var.c(3);
    }

    public final void a(long j, pt7 pt7Var) {
        if (pt7Var.a() < 9) {
            return;
        }
        int iM = pt7Var.m();
        int iM2 = pt7Var.m();
        int iZ = pt7Var.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            this.c.a(j, pt7Var);
        }
    }

    public final void b(ls3 ls3Var, pya.c cVar) {
        int i = 0;
        while (true) {
            hsa[] hsaVarArr = this.b;
            if (i >= hsaVarArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            hsa hsaVarP = ls3Var.p(cVar.d, 3);
            id4 id4Var = this.a.get(i);
            String str = id4Var.o;
            xl7.i("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            id4.a aVar = new id4.a();
            cVar.b();
            aVar.a = cVar.e;
            aVar.m = fv6.n("video/mp2t");
            aVar.n = fv6.n(str);
            aVar.e = id4Var.e;
            aVar.d = id4Var.d;
            aVar.K = id4Var.L;
            aVar.q = id4Var.r;
            hy1.b(aVar, hsaVarP);
            hsaVarArr[i] = hsaVarP;
            i++;
        }
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s93 implements ce3 {
    public final List<pya.a> a;
    public final hsa[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public s93(List list) {
        this.a = list;
        this.b = new hsa[list.size()];
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (pt7Var.a() == 0) {
                    z2 = false;
                } else {
                    if (pt7Var.z() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (pt7Var.a() == 0) {
                    z = false;
                } else {
                    if (pt7Var.z() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = pt7Var.b;
            int iA = pt7Var.a();
            for (hsa hsaVar : this.b) {
                pt7Var.M(i);
                hsaVar.e(iA, pt7Var);
            }
            this.e += iA;
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
        if (this.c) {
            xl7.r(this.f != -9223372036854775807L);
            for (hsa hsaVar : this.b) {
                hsaVar.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        int i = 0;
        while (true) {
            hsa[] hsaVarArr = this.b;
            if (i >= hsaVarArr.length) {
                return;
            }
            pya.a aVar = this.a.get(i);
            cVar.a();
            cVar.b();
            hsa hsaVarP = ls3Var.p(cVar.d, 3);
            id4.a aVar2 = new id4.a();
            cVar.b();
            aVar2.a = cVar.e;
            aVar2.m = fv6.n("video/mp2t");
            aVar2.n = fv6.n("application/dvbsubs");
            aVar2.q = Collections.singletonList(aVar.b);
            aVar2.d = aVar.a;
            hy1.b(aVar2, hsaVarP);
            hsaVarArr[i] = hsaVarP;
            i++;
        }
    }
}

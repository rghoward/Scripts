package defpackage;

import kla.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 extends vx6<a> {
    public a t;
    public bp1 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends ox6.c {
        public kla.a H;

        public a() {
        }

        @Override // ox6.c
        public final void U1() {
            xg0 xg0Var = xg0.this;
            xg0Var.t = this;
            if (xg0Var.u != null) {
                c2();
            }
        }

        @Override // ox6.c
        public final void V1() {
            xg0 xg0Var = xg0.this;
            if (xg0Var.t == this) {
                xg0Var.t = null;
            }
            kla.a aVar = this.H;
            if (aVar != null) {
                aVar.b();
            }
            this.H = null;
        }

        public final void c2() {
            wg0 wg0Var = new wg0(0, this, xg0.this);
            qr5 qr5VarF = ew2.f(this);
            int i = qr5VarF.u;
            xk8 rectManager = ur5.a(qr5VarF).getRectManager();
            kla klaVar = rectManager.c;
            klaVar.getClass();
            e27<kla.a> e27Var = klaVar.a;
            kla.a aVar = klaVar.new a(i, this, wg0Var);
            kla.a aVarB = e27Var.b(i);
            if (aVarB == null) {
                e27Var.i(i, aVar);
                aVarB = aVar;
            }
            kla.a aVar2 = aVarB;
            if (aVar2 != aVar) {
                while (true) {
                    kla.a aVar3 = aVar2.d;
                    if (aVar3 == null) {
                        break;
                    } else {
                        aVar2 = aVar3;
                    }
                }
                aVar2.d = aVar;
            }
            if (ew2.f(this.t).z) {
                rectManager.b.c(i, true);
            }
            rectManager.e = true;
            rectManager.h();
            this.H = aVar;
        }
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new a();
    }

    @Override // defpackage.vx6
    public final /* bridge */ /* synthetic */ void b(ox6.c cVar) {
    }

    public final Object c(u02 u02Var) throws Throwable {
        bp1 bp1VarA = this.u;
        if (bp1VarA == null) {
            bp1VarA = cp1.a();
            this.u = bp1VarA;
            a aVar = this.t;
            if (aVar != null && aVar.G) {
                aVar.c2();
            }
        }
        Object objW = bp1VarA.w(u02Var);
        return objW == v72.t ? objW : g2b.a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }
}

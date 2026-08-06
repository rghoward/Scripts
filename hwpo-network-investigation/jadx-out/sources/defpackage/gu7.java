package defpackage;

import android.graphics.PathMeasure;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gu7 extends k7b {
    public fx0 b;
    public float c = 1.0f;
    public List<? extends ju7> d;
    public float e;
    public float f;
    public fx0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public b3a q;
    public final vp r;
    public vp s;
    public vp t;
    public final ss5 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<iu7> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final iu7 invoke() {
            return new wp(new PathMeasure());
        }
    }

    public gu7() {
        int i = zcb.a;
        this.d = hf3.t;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        vp vpVarA = xp.a();
        this.r = vpVarA;
        this.s = vpVarA;
        this.u = hv5.c(j26.u, a.u);
    }

    @Override // defpackage.k7b
    public final void a(d73 d73Var) {
        b3a b3aVar;
        if (this.n) {
            mu7.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        fx0 fx0Var = this.b;
        if (fx0Var != null) {
            d73.c1(d73Var, this.s, fx0Var, this.c, null, null, 56);
        }
        fx0 fx0Var2 = this.g;
        if (fx0Var2 != null) {
            b3a b3aVar2 = this.q;
            if (this.o || b3aVar2 == null) {
                b3a b3aVar3 = new b3a(this.f, this.j, this.h, this.i, 16);
                this.q = b3aVar3;
                this.o = false;
                b3aVar = b3aVar3;
            } else {
                b3aVar = b3aVar2;
            }
            d73.c1(d73Var, this.s, fx0Var2, this.e, b3aVar, null, 48);
        }
    }

    public final void e() {
        float f = this.k;
        vp vpVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = vpVar;
            return;
        }
        if (xj5.a(this.s, vpVar)) {
            this.s = xp.a();
        } else {
            int iH = this.s.h();
            this.s.k();
            this.s.f(iH);
        }
        ss5 ss5Var = this.u;
        ((iu7) ss5Var.getValue()).c(vpVar);
        float fA = ((iu7) ss5Var.getValue()).a();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * fA;
        float f5 = ((this.l + f3) % 1.0f) * fA;
        if (f4 <= f5) {
            ((iu7) ss5Var.getValue()).b(f4, f5, this.s);
            return;
        }
        vp vpVarA = this.t;
        if (vpVarA == null) {
            vpVarA = xp.a();
            this.t = vpVarA;
        }
        vpVarA.reset();
        ((iu7) ss5Var.getValue()).b(f4, fA, vpVarA);
        this.s.o(vpVarA, 0L);
        vpVarA.reset();
        ((iu7) ss5Var.getValue()).b(0.0f, f5, vpVarA);
        this.s.o(vpVarA, 0L);
    }

    public final String toString() {
        return this.r.toString();
    }
}

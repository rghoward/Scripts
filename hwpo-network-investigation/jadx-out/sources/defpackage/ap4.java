package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ap4 extends k7b {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = uh1.k;
    public List<? extends ju7> f;
    public boolean g;
    public vp h;
    public oh4<? super k7b, g2b> i;
    public final a j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<k7b, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(k7b k7bVar) {
            k7b k7bVar2 = k7bVar;
            ap4 ap4Var = ap4.this;
            ap4Var.g(k7bVar2);
            oh4<? super k7b, g2b> oh4Var = ap4Var.i;
            if (oh4Var != null) {
                oh4Var.invoke(k7bVar2);
            }
            return g2b.a;
        }
    }

    public ap4() {
        int i = zcb.a;
        this.f = hf3.t;
        this.g = true;
        this.j = new a();
        this.k = BuildConfig.FLAVOR;
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.k7b
    public final void a(d73 d73Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = xk6.a();
                this.b = fArrA;
            } else {
                xk6.d(fArrA);
            }
            xk6.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            xk6.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                vp vpVarA = this.h;
                if (vpVarA == null) {
                    vpVarA = xp.a();
                    this.h = vpVarA;
                }
                mu7.b(this.f, vpVarA);
            }
            this.g = false;
        }
        s41.b bVarY0 = d73Var.Y0();
        long jD = bVarY0.d();
        bVarY0.a().f();
        try {
            t41 t41Var = bVarY0.a;
            float[] fArr = this.b;
            if (fArr != null) {
                t41Var.a.a().k(fArr);
            }
            vp vpVar = this.h;
            if (!this.f.isEmpty() && vpVar != null) {
                t41Var.a(vpVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((k7b) arrayList.get(i)).a(d73Var);
            }
        } finally {
            x3.b(bVarY0, jD);
        }
    }

    @Override // defpackage.k7b
    public final oh4<k7b, g2b> b() {
        return this.i;
    }

    @Override // defpackage.k7b
    public final void d(a aVar) {
        this.i = aVar;
    }

    public final void e(int i, k7b k7bVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, k7bVar);
        } else {
            arrayList.add(k7bVar);
        }
        g(k7bVar);
        k7bVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = zcb.a;
            if (uh1.h(j2) == uh1.h(j) && uh1.g(j2) == uh1.g(j) && uh1.e(j2) == uh1.e(j)) {
                return;
            }
            this.d = false;
            this.e = uh1.k;
        }
    }

    public final void g(k7b k7bVar) {
        if (!(k7bVar instanceof gu7)) {
            if (k7bVar instanceof ap4) {
                ap4 ap4Var = (ap4) k7bVar;
                if (ap4Var.d && this.d) {
                    f(ap4Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = uh1.k;
                    return;
                }
            }
            return;
        }
        gu7 gu7Var = (gu7) k7bVar;
        fx0 fx0Var = gu7Var.b;
        if (this.d && fx0Var != null) {
            if (fx0Var instanceof aw9) {
                f(((aw9) fx0Var).a);
            } else {
                this.d = false;
                this.e = uh1.k;
            }
        }
        fx0 fx0Var2 = gu7Var.g;
        if (this.d && fx0Var2 != null) {
            if (fx0Var2 instanceof aw9) {
                f(((aw9) fx0Var2).a);
            } else {
                this.d = false;
                this.e = uh1.k;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k7b k7bVar = (k7b) arrayList.get(i);
            sb.append("\t");
            sb.append(k7bVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

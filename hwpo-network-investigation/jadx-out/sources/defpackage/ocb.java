package defpackage;

import android.graphics.Bitmap;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ocb extends k7b {
    public final ap4 b;
    public String c;
    public boolean d;
    public final t63 e;
    public mh4<g2b> f;
    public final dt7 g;
    public wq0 h;
    public final dt7 i;
    public long j;
    public float k;
    public float l;
    public final b m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<k7b, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(k7b k7bVar) {
            ocb ocbVar = ocb.this;
            ocbVar.d = true;
            ocbVar.f.invoke();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<d73, g2b> {
        public b() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(d73 d73Var) {
            d73 d73Var2 = d73Var;
            ocb ocbVar = ocb.this;
            ap4 ap4Var = ocbVar.b;
            float f = ocbVar.k;
            float f2 = ocbVar.l;
            s41.b bVarY0 = d73Var2.Y0();
            long jD = bVarY0.d();
            bVarY0.a().f();
            try {
                bVarY0.a.e(f, f2, 0L);
                ap4Var.a(d73Var2);
                return g2b.a;
            } finally {
                x3.b(bVarY0, jD);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public static final c u = new c(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ g2b invoke() {
            return g2b.a;
        }
    }

    public ocb(ap4 ap4Var) {
        this.b = ap4Var;
        ap4Var.i = new a();
        this.c = BuildConfig.FLAVOR;
        this.d = true;
        this.e = new t63();
        this.f = c.u;
        this.g = bl7.i(null);
        this.i = bl7.i(new cr9(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new b();
    }

    @Override // defpackage.k7b
    public final void a(d73 d73Var) {
        e(d73Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(d73 d73Var, float f, wh1 wh1Var) {
        int i;
        wq0 wq0Var;
        long jCeil;
        po poVarA;
        ol olVar;
        ol olVarB;
        long jB;
        wh1 wh1Var2;
        int i2;
        int i3;
        ap4 ap4Var = this.b;
        boolean z = ap4Var.d;
        dt7 dt7Var = this.g;
        if (!z || ap4Var.e == 16) {
            i = 0;
        } else {
            wh1 wh1Var3 = (wh1) dt7Var.getValue();
            int i4 = zcb.a;
            if (!(wh1Var3 instanceof wq0) ? wh1Var3 == null : (i3 = ((wq0) wh1Var3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(wh1Var instanceof wq0) ? wh1Var == null : (i2 = ((wq0) wh1Var).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        t63 t63Var = this.e;
        if (z2 || !cr9.a(this.j, d73Var.c())) {
            if (i == 1) {
                jB = ap4Var.e;
                int i5 = zcb.a;
                if (uh1.d(jB) != 1.0f) {
                    jB = uh1.b(1.0f, jB);
                }
                wq0Var = new wq0(5, jB);
            } else {
                wq0Var = null;
            }
            this.h = wq0Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32));
            dt7 dt7Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((cr9) dt7Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) / Float.intBitsToFloat((int) (((cr9) dt7Var2.getValue()).a & 4294967295L));
            jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (d73Var.c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (d73Var.c() & 4294967295L))))) & 4294967295L);
            tq5 layoutDirection = d73Var.getLayoutDirection();
            t63Var.c = d73Var;
            poVarA = t63Var.a;
            olVar = t63Var.b;
            if (poVarA != null) {
                Bitmap bitmap = poVarA.a;
                if (olVar != null || ((int) (jCeil >> 32)) > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || t63Var.e != i) {
                    poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    olVarB = ml5.b(poVarA);
                    t63Var.a = poVarA;
                    t63Var.b = olVarB;
                    t63Var.e = i;
                } else {
                    olVarB = olVar;
                }
            } else {
                poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                olVarB = ml5.b(poVarA);
                t63Var.a = poVarA;
                t63Var.b = olVarB;
                t63Var.e = i;
            }
            t63Var.d = jCeil;
            s41 s41Var = t63Var.f;
            long jC = c43.c(jCeil);
            s41.a aVar = s41Var.t;
            tx2 tx2Var = aVar.a;
            tq5 tq5Var = aVar.b;
            n41 n41Var = aVar.c;
            long j = aVar.d;
            aVar.a = d73Var;
            aVar.b = layoutDirection;
            aVar.c = olVarB;
            aVar.d = jC;
            olVarB.f();
            d73.W0(s41Var, uh1.b, 0L, 0L, 0.0f, 62);
            this.m.invoke(s41Var);
            olVarB.o();
            s41.a aVar2 = s41Var.t;
            aVar2.a = tx2Var;
            aVar2.b = tq5Var;
            aVar2.c = n41Var;
            aVar2.d = j;
            poVarA.b();
            this.d = false;
            this.j = d73Var.c();
        } else {
            po poVar = t63Var.a;
            if (i != (poVar != null ? poVar.a() : 0)) {
                if (i == 1) {
                    jB = ap4Var.e;
                    int i6 = zcb.a;
                    if (uh1.d(jB) != 1.0f) {
                        jB = uh1.b(1.0f, jB);
                    }
                    wq0Var = new wq0(5, jB);
                } else {
                    wq0Var = null;
                }
                this.h = wq0Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d73Var.c() >> 32));
                dt7 dt7Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((cr9) dt7Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) / Float.intBitsToFloat((int) (((cr9) dt7Var3.getValue()).a & 4294967295L));
                jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (d73Var.c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (d73Var.c() & 4294967295L))))) & 4294967295L);
                tq5 layoutDirection2 = d73Var.getLayoutDirection();
                t63Var.c = d73Var;
                poVarA = t63Var.a;
                olVar = t63Var.b;
                if (poVarA != null) {
                    Bitmap bitmap2 = poVarA.a;
                    if (olVar != null) {
                        poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        olVarB = ml5.b(poVarA);
                        t63Var.a = poVarA;
                        t63Var.b = olVarB;
                        t63Var.e = i;
                    } else {
                        poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        olVarB = ml5.b(poVarA);
                        t63Var.a = poVarA;
                        t63Var.b = olVarB;
                        t63Var.e = i;
                    }
                } else {
                    poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    olVarB = ml5.b(poVarA);
                    t63Var.a = poVarA;
                    t63Var.b = olVarB;
                    t63Var.e = i;
                }
                t63Var.d = jCeil;
                s41 s41Var2 = t63Var.f;
                long jC2 = c43.c(jCeil);
                s41.a aVar3 = s41Var2.t;
                tx2 tx2Var2 = aVar3.a;
                tq5 tq5Var2 = aVar3.b;
                n41 n41Var2 = aVar3.c;
                long j2 = aVar3.d;
                aVar3.a = d73Var;
                aVar3.b = layoutDirection2;
                aVar3.c = olVarB;
                aVar3.d = jC2;
                olVarB.f();
                d73.W0(s41Var2, uh1.b, 0L, 0L, 0.0f, 62);
                this.m.invoke(s41Var2);
                olVarB.o();
                s41.a aVar4 = s41Var2.t;
                aVar4.a = tx2Var2;
                aVar4.b = tq5Var2;
                aVar4.c = n41Var2;
                aVar4.d = j2;
                poVarA.b();
                this.d = false;
                this.j = d73Var.c();
            }
        }
        if (wh1Var != null) {
            wh1Var2 = wh1Var;
        } else {
            wh1Var2 = ((wh1) dt7Var.getValue()) != null ? (wh1) dt7Var.getValue() : this.h;
        }
        po poVar2 = t63Var.a;
        if (poVar2 == null) {
            uc5.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        d73.b1(d73Var, poVar2, 0L, t63Var.d, 0L, 0L, f, null, wh1Var2, 0, 0, 858);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        dt7 dt7Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((cr9) dt7Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((cr9) dt7Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}

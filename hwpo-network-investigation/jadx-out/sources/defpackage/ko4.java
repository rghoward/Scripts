package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ko4 {
    public final no4 a;
    public Outline f;
    public float j;
    public dm7 k;
    public cu7 l;
    public vp m;
    public boolean n;
    public s41 o;
    public np p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public tx2 b = x63.a;
    public tq5 c = tq5.t;
    public oh4<? super d73, g2b> d = b.u;
    public final a e = new a();
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final cc1 r = new cc1();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<d73, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(d73 d73Var) {
            d73 d73Var2 = d73Var;
            ko4 ko4Var = ko4.this;
            cu7 cu7Var = ko4Var.l;
            if (ko4Var.n && ko4Var.w && cu7Var != null) {
                s41.b bVarY0 = d73Var2.Y0();
                long jD = bVarY0.d();
                bVarY0.a().f();
                try {
                    bVarY0.a.a(cu7Var);
                    ko4Var.c(d73Var2);
                } finally {
                    x3.b(bVarY0, jD);
                }
            } else {
                ko4Var.c(d73Var2);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<d73, g2b> {
        public static final b u = new b(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(d73 d73Var) {
            return g2b.a;
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public ko4(no4 no4Var) {
        this.a = no4Var;
        no4Var.s(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            no4 no4Var = this.a;
            if (z || no4Var.T() > 0.0f) {
                cu7 cu7Var = this.l;
                if (cu7Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = cu7Var instanceof vp;
                    if (!z2) {
                        ru3.f("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ((vp) cu7Var).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            fm7.a(outline, cu7Var);
                        } else {
                            if (!z2) {
                                ru3.f("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = cu7Var;
                    if (outline != null) {
                        outline.setAlpha(no4Var.a());
                        outline2 = outline;
                    }
                    no4Var.y(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        no4Var.s(false);
                        no4Var.z();
                    } else {
                        no4Var.s(this.w);
                    }
                } else {
                    no4Var.s(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jC = c43.c(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jC = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jC >> 32);
                    int i5 = (int) (jC & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(no4Var.a());
                    no4Var.y(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                no4Var.s(false);
                no4Var.y(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[LOOP:0: B:14:0x0029->B:24:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[EDGE_INSN: B:29:0x0069->B:25:0x0069 BREAK  A[LOOP:0: B:14:0x0029->B:24:0x0066], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            cc1 cc1Var = this.r;
            ko4 ko4Var = cc1Var.a;
            if (ko4Var != null) {
                ko4Var.q--;
                ko4Var.b();
                cc1Var.a = null;
            }
            d37<ko4> d37Var = cc1Var.c;
            if (d37Var != null) {
                Object[] objArr = d37Var.b;
                long[] jArr = d37Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ko4 ko4Var2 = (ko4) objArr[(i << 3) + i3];
                                    ko4Var2.q--;
                                    ko4Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                d37Var.b();
            }
            this.a.z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[LOOP:0: B:20:0x004c->B:30:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[EDGE_INSN: B:34:0x008c->B:31:0x008c BREAK  A[LOOP:0: B:20:0x004c->B:30:0x0089], SYNTHETIC] */
    public final void c(d73 d73Var) {
        cc1 cc1Var = this.r;
        cc1Var.b = cc1Var.a;
        d37<ko4> d37Var = cc1Var.c;
        if (d37Var != null && d37Var.h()) {
            d37<ko4> d37VarA = cc1Var.d;
            if (d37VarA == null) {
                d37VarA = a49.a();
                cc1Var.d = d37VarA;
            }
            d37VarA.j(d37Var);
            d37Var.b();
        }
        cc1Var.e = true;
        this.d.invoke(d73Var);
        cc1Var.e = false;
        ko4 ko4Var = cc1Var.b;
        if (ko4Var != null) {
            ko4Var.q--;
            ko4Var.b();
        }
        d37<ko4> d37Var2 = cc1Var.d;
        if (d37Var2 == null || !d37Var2.h()) {
            return;
        }
        Object[] objArr = d37Var2.b;
        long[] jArr = d37Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ko4 ko4Var2 = (ko4) objArr[(i << 3) + i3];
                            ko4Var2.q--;
                            ko4Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        d37Var2.b();
    }

    public final dm7 d() {
        dm7 bVar;
        dm7 dm7Var = this.k;
        cu7 cu7Var = this.l;
        if (dm7Var != null) {
            return dm7Var;
        }
        if (cu7Var != null) {
            dm7.a aVar = new dm7.a(cu7Var);
            this.k = aVar;
            return aVar;
        }
        long jC = c43.c(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jC = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            bVar = new dm7.c(dc4.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            bVar = new dm7.b(new sk8(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = bVar;
        return bVar;
    }

    public final void e(float f) {
        no4 no4Var = this.a;
        if (no4Var.a() == f) {
            return;
        }
        no4Var.b(f);
    }

    public final void f(float f, long j, long j2) {
        if (vf7.b(this.h, j) && cr9.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}

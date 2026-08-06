package defpackage;

import android.os.Build;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qo4 implements ln7 {
    public float[] B;
    public boolean C;
    public int G;
    public dm7 I;
    public boolean J;
    public boolean K;
    public boolean M;
    public ko4 t;
    public final jo4 u;
    public final cm v;
    public ci4<? super n41, ? super ko4, g2b> w;
    public mh4<g2b> x;
    public boolean z;
    public long y = 9223372034707292159L;
    public final float[] A = xk6.a();
    public tx2 D = yx2.a();
    public tq5 E = tq5.t;
    public final s41 F = new s41();
    public long H = ava.b;
    public boolean L = true;
    public final a N = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<d73, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(d73 d73Var) {
            d73 d73Var2 = d73Var;
            n41 n41VarA = d73Var2.Y0().a();
            ci4<? super n41, ? super ko4, g2b> ci4Var = qo4.this.w;
            if (ci4Var != null) {
                ci4Var.invoke(n41VarA, d73Var2.Y0().b);
            }
            return g2b.a;
        }
    }

    public qo4(ko4 ko4Var, jo4 jo4Var, cm cmVar, ci4<? super n41, ? super ko4, g2b> ci4Var, mh4<g2b> mh4Var) {
        this.t = ko4Var;
        this.u = jo4Var;
        this.v = cmVar;
        this.w = ci4Var;
        this.x = mh4Var;
    }

    @Override // defpackage.ln7
    public final void a(float[] fArr) {
        xk6.e(fArr, m());
    }

    @Override // defpackage.ln7
    public final void b(b37 b37Var, boolean z) {
        float[] fArrL = z ? l() : m();
        if (this.L) {
            return;
        }
        if (fArrL != null) {
            xk6.c(fArrL, b37Var);
            return;
        }
        b37Var.a = 0.0f;
        b37Var.b = 0.0f;
        b37Var.c = 0.0f;
        b37Var.d = 0.0f;
    }

    @Override // defpackage.ln7
    public final boolean c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        ko4 ko4Var = this.t;
        if (!ko4Var.w) {
            return true;
        }
        dm7 dm7VarD = ko4Var.d();
        if (dm7VarD instanceof dm7.b) {
            sk8 sk8Var = ((dm7.b) dm7VarD).a;
            if (sk8Var.a <= fIntBitsToFloat && fIntBitsToFloat < sk8Var.c && sk8Var.b <= fIntBitsToFloat2 && fIntBitsToFloat2 < sk8Var.d) {
                return true;
            }
        } else {
            if (!(dm7VarD instanceof dm7.c)) {
                if (dm7VarD instanceof dm7.a) {
                    return nl9.a(((dm7.a) dm7VarD).a, fIntBitsToFloat, fIntBitsToFloat2);
                }
                u.b();
                return false;
            }
            vx8 vx8Var = ((dm7.c) dm7VarD).a;
            float f = vx8Var.a;
            long j2 = vx8Var.f;
            long j3 = vx8Var.h;
            long j4 = vx8Var.g;
            float f2 = vx8Var.d;
            float f3 = vx8Var.b;
            float f4 = vx8Var.c;
            long j5 = vx8Var.e;
            if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                int i = (int) (j5 >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                int i2 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= vx8Var.b()) {
                    int i3 = (int) (j3 >> 32);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                    int i4 = (int) (j4 >> 32);
                    if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= vx8Var.b()) {
                        int i5 = (int) (j5 & 4294967295L);
                        int i6 = (int) (j3 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= vx8Var.a()) {
                            int i7 = (int) (j2 & 4294967295L);
                            int i8 = (int) (j4 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= vx8Var.a()) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f;
                                float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                                float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                                float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                                if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                    return nl9.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, vx8Var.e);
                                }
                                if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                    return nl9.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, vx8Var.h);
                                }
                                if (fIntBitsToFloat > fIntBitsToFloat7 && fIntBitsToFloat2 < fIntBitsToFloat8) {
                                    return nl9.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, vx8Var.f);
                                }
                                if (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) {
                                    return true;
                                }
                                return nl9.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, vx8Var.g);
                            }
                        }
                    }
                }
                vp vpVarA = xp.a();
                vpVarA.q(vx8Var);
                return nl9.a(vpVarA, fIntBitsToFloat, fIntBitsToFloat2);
            }
        }
        return false;
    }

    @Override // defpackage.ln7
    public final void d(sv8 sv8Var) {
        long j;
        mh4<g2b> mh4Var;
        mh4<g2b> mh4Var2;
        int i = sv8Var.t | this.G;
        this.E = sv8Var.H;
        this.D = sv8Var.G;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.H = sv8Var.C;
        }
        if ((i & 1) != 0) {
            ko4 ko4Var = this.t;
            float f = sv8Var.u;
            no4 no4Var = ko4Var.a;
            if (no4Var.x() != f) {
                no4Var.r(f);
            }
        }
        if ((i & 2) != 0) {
            ko4 ko4Var2 = this.t;
            float f2 = sv8Var.v;
            no4 no4Var2 = ko4Var2.a;
            if (no4Var2.U() != f2) {
                no4Var2.k(f2);
            }
        }
        if ((i & 4) != 0) {
            this.t.e(sv8Var.w);
        }
        if ((i & 8) != 0) {
            no4 no4Var3 = this.t.a;
            if (no4Var3.O() != 0.0f) {
                no4Var3.P();
            }
        }
        if ((i & 16) != 0) {
            no4 no4Var4 = this.t.a;
            if (no4Var4.H() != 0.0f) {
                no4Var4.I();
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            ko4 ko4Var3 = this.t;
            float f3 = sv8Var.x;
            no4 no4Var5 = ko4Var3.a;
            if (no4Var5.T() != f3) {
                no4Var5.d(f3);
                ko4Var3.g = true;
                ko4Var3.a();
            }
            if (sv8Var.x > 0.0f && !this.M && (mh4Var2 = this.x) != null) {
                mh4Var2.invoke();
            }
        }
        if ((i & 64) != 0) {
            ko4 ko4Var4 = this.t;
            long j2 = sv8Var.y;
            no4 no4Var6 = ko4Var4.a;
            if (!uh1.c(j2, no4Var6.G())) {
                no4Var6.p(j2);
            }
        }
        if ((i & 128) != 0) {
            ko4 ko4Var5 = this.t;
            long j3 = sv8Var.z;
            no4 no4Var7 = ko4Var5.a;
            if (!uh1.c(j3, no4Var7.J())) {
                no4Var7.u(j3);
            }
        }
        if ((i & 1024) != 0) {
            ko4 ko4Var6 = this.t;
            float f4 = sv8Var.A;
            no4 no4Var8 = ko4Var6.a;
            if (no4Var8.E() != f4) {
                no4Var8.h(f4);
            }
        }
        if ((i & 256) != 0) {
            no4 no4Var9 = this.t.a;
            if (no4Var9.Q() != 0.0f) {
                no4Var9.m();
            }
        }
        if ((i & 512) != 0) {
            no4 no4Var10 = this.t.a;
            if (no4Var10.C() != 0.0f) {
                no4Var10.n();
            }
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
            ko4 ko4Var7 = this.t;
            float f5 = sv8Var.B;
            no4 no4Var11 = ko4Var7.a;
            if (no4Var11.L() != f5) {
                no4Var11.w(f5);
            }
        }
        if (i2 != 0) {
            boolean zA = ava.a(this.H, ava.b);
            ko4 ko4Var8 = this.t;
            if (zA) {
                if (!vf7.b(ko4Var8.v, 9205357640488583168L)) {
                    ko4Var8.v = 9205357640488583168L;
                    ko4Var8.a.F(9205357640488583168L);
                }
                j = 4294967295L;
            } else {
                j = 4294967295L;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.H & 4294967295L)) * ((int) (this.y & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.H >> 32)) * ((int) (this.y >> 32)))) << 32);
                if (!vf7.b(ko4Var8.v, jFloatToRawIntBits)) {
                    ko4Var8.v = jFloatToRawIntBits;
                    ko4Var8.a.F(jFloatToRawIntBits);
                }
            }
        } else {
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            ko4 ko4Var9 = this.t;
            boolean z2 = sv8Var.E;
            if (ko4Var9.w != z2) {
                ko4Var9.w = z2;
                ko4Var9.g = true;
                ko4Var9.a();
            }
        }
        if ((131072 & i) != 0) {
            no4 no4Var12 = this.t.a;
        }
        if ((262144 & i) != 0) {
            no4 no4Var13 = this.t.a;
            if (!xj5.a(no4Var13.j(), null)) {
                no4Var13.K();
            }
        }
        if ((524288 & i) != 0) {
            ko4 ko4Var10 = this.t;
            int i3 = sv8Var.I;
            no4 no4Var14 = ko4Var10.a;
            if (no4Var14.V() != i3) {
                no4Var14.i(i3);
            }
        }
        if ((32768 & i) != 0) {
            no4 no4Var15 = this.t.a;
            if (no4Var15.B() != 0) {
                no4Var15.R(0);
            }
        }
        if ((i & 7963) != 0) {
            this.J = true;
            this.K = true;
        }
        if (xj5.a(this.I, sv8Var.J)) {
            z = false;
        } else {
            dm7 dm7Var = sv8Var.J;
            this.I = dm7Var;
            if (dm7Var != null) {
                ko4 ko4Var11 = this.t;
                if (dm7Var instanceof dm7.b) {
                    sk8 sk8Var = ((dm7.b) dm7Var).a;
                    float f6 = sk8Var.a;
                    float f7 = sk8Var.b;
                    ko4Var11.f(0.0f, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & j), (((long) Float.floatToRawIntBits(sk8Var.c - sk8Var.a)) << 32) | (((long) Float.floatToRawIntBits(sk8Var.d - f7)) & j));
                } else if (dm7Var instanceof dm7.a) {
                    cu7 cu7Var = ((dm7.a) dm7Var).a;
                    ko4Var11.k = null;
                    ko4Var11.i = 9205357640488583168L;
                    ko4Var11.h = 0L;
                    ko4Var11.j = 0.0f;
                    ko4Var11.g = true;
                    ko4Var11.n = false;
                    ko4Var11.l = cu7Var;
                    ko4Var11.a();
                } else {
                    if (!(dm7Var instanceof dm7.c)) {
                        u.b();
                        return;
                    }
                    dm7.c cVar = (dm7.c) dm7Var;
                    vp vpVar = cVar.b;
                    if (vpVar != null) {
                        ko4Var11.k = null;
                        ko4Var11.i = 9205357640488583168L;
                        ko4Var11.h = 0L;
                        ko4Var11.j = 0.0f;
                        ko4Var11.g = true;
                        ko4Var11.n = false;
                        ko4Var11.l = vpVar;
                        ko4Var11.a();
                    } else {
                        vx8 vx8Var = cVar.a;
                        ko4Var11.f(Float.intBitsToFloat((int) (vx8Var.h >> 32)), (((long) Float.floatToRawIntBits(vx8Var.a)) << 32) | (((long) Float.floatToRawIntBits(vx8Var.b)) & j), (((long) Float.floatToRawIntBits(vx8Var.b())) << 32) | (((long) Float.floatToRawIntBits(vx8Var.a())) & j));
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((dm7Var instanceof dm7.a) || ((dm7Var instanceof dm7.c) && !dc4.c(((dm7.c) dm7Var).a))) && (mh4Var = this.x) != null)) {
                    mh4Var.invoke();
                }
            }
        }
        this.G = sv8Var.t;
        if (i != 0 || z) {
            int i4 = Build.VERSION.SDK_INT;
            cm cmVar = this.v;
            if (i4 >= 26) {
                sqb.a(cmVar);
            } else {
                cmVar.invalidate();
            }
            if (cm.W()) {
                cmVar.k(0.0f);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.ln7
    public final void destroy() {
        k37<Reference<T>> k37Var;
        Object objPoll;
        this.w = null;
        this.x = null;
        this.z = true;
        n(false);
        jo4 jo4Var = this.u;
        if (jo4Var != null) {
            jo4Var.a(this.t);
            cm cmVar = this.v;
            kkb<ln7> kkbVar = cmVar.R0;
            do {
                ReferenceQueue<ln7> referenceQueue = kkbVar.b;
                k37Var = kkbVar.a;
                objPoll = referenceQueue.poll();
                if (objPoll != null) {
                    k37Var.n((Reference<T>) objPoll);
                }
            } while (objPoll != null);
            k37Var.d(new WeakReference(this, kkbVar.b));
            cmVar.a0.k(this);
        }
    }

    @Override // defpackage.ln7
    public final long e(long j, boolean z) {
        float[] fArrM;
        if (z) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.L ? j : xk6.b(j, fArrM);
    }

    @Override // defpackage.ln7
    public final void f(long j) {
        if (kg5.b(j, this.y)) {
            return;
        }
        boolean zW = cm.W();
        cm cmVar = this.v;
        if (zW) {
            cmVar.k(-4.0f);
        }
        this.y = j;
        if (this.C || this.z) {
            return;
        }
        cmVar.invalidate();
        n(true);
    }

    @Override // defpackage.ln7
    public final void g(ci4<? super n41, ? super ko4, g2b> ci4Var, mh4<g2b> mh4Var) {
        jo4 jo4Var = this.u;
        if (jo4Var == null) {
            throw ik.a("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.t.s) {
            uc5.a("layer should have been released before reuse");
        }
        this.t = jo4Var.b();
        this.z = false;
        this.w = ci4Var;
        this.x = mh4Var;
        this.J = false;
        this.K = false;
        this.L = true;
        xk6.d(this.A);
        float[] fArr = this.B;
        if (fArr != null) {
            xk6.d(fArr);
        }
        this.H = ava.b;
        this.M = false;
        this.y = 9223372034707292159L;
        this.I = null;
        this.G = 0;
    }

    @Override // defpackage.ln7
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo880getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // defpackage.ln7
    public final void h(n41 n41Var, ko4 ko4Var) {
        k();
        this.M = this.t.a.T() > 0.0f;
        s41 s41Var = this.F;
        s41.b bVar = s41Var.u;
        bVar.e(n41Var);
        bVar.b = ko4Var;
        oo4.a(s41Var, this.t);
    }

    @Override // defpackage.ln7
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            xk6.e(fArr, fArrL);
        }
    }

    @Override // defpackage.ln7
    public final void invalidate() {
        if (this.C || this.z) {
            return;
        }
        this.v.invalidate();
        n(true);
    }

    @Override // defpackage.ln7
    public final void j(long j) {
        boolean zW = cm.W();
        cm cmVar = this.v;
        if (zW) {
            cmVar.k(-4.0f);
        }
        ko4 ko4Var = this.t;
        if (!bg5.b(ko4Var.t, j)) {
            ko4Var.t = j;
            ko4Var.a.N(ko4Var.u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            sqb.a(cmVar);
        } else {
            cmVar.invalidate();
        }
    }

    @Override // defpackage.ln7
    public final void k() {
        cm.W();
        if (this.C) {
            if (!ava.a(this.H, ava.b) && !kg5.b(this.t.u, this.y)) {
                ko4 ko4Var = this.t;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.H >> 32)) * ((int) (this.y >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.H & 4294967295L)) * ((int) (this.y & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!vf7.b(ko4Var.v, jFloatToRawIntBits)) {
                    ko4Var.v = jFloatToRawIntBits;
                    ko4Var.a.F(jFloatToRawIntBits);
                }
            }
            ko4 ko4Var2 = this.t;
            tx2 tx2Var = this.D;
            tq5 tq5Var = this.E;
            long j = this.y;
            long j2 = ko4Var2.u;
            no4 no4Var = ko4Var2.a;
            if (!kg5.b(j2, j)) {
                ko4Var2.u = j;
                long j3 = ko4Var2.t;
                no4Var.N(j, (int) (j3 >> 32), (int) (4294967295L & j3));
                if (ko4Var2.i == 9205357640488583168L) {
                    ko4Var2.g = true;
                    ko4Var2.a();
                }
            }
            ko4Var2.b = tx2Var;
            ko4Var2.c = tq5Var;
            ko4Var2.d = this.N;
            no4Var.M(tx2Var, tq5Var, ko4Var2, ko4Var2.e);
            n(false);
        }
    }

    public final float[] l() {
        float[] fArrA = this.B;
        if (fArrA == null) {
            fArrA = xk6.a();
            this.B = fArrA;
        }
        if (this.K) {
            this.K = false;
            float[] fArrM = m();
            if (this.L) {
                return fArrM;
            }
            if (!gi0.d(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z = this.J;
        float[] fArr = this.A;
        if (z) {
            ko4 ko4Var = this.t;
            long jC = ko4Var.v;
            no4 no4Var = ko4Var.a;
            if ((9223372034707292159L & jC) == 9205357640488583168L) {
                jC = p50.c(c43.c(this.y));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L));
            float fO = no4Var.O();
            float fH = no4Var.H();
            float fQ = no4Var.Q();
            float fC = no4Var.C();
            float fE = no4Var.E();
            float fX = no4Var.x();
            float fU = no4Var.U();
            double d = ((double) fQ) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fH * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fH * fSin);
            double d2 = ((double) fC) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fO * fCos2);
            float f10 = (f3 * fCos2) + ((-fO) * fSin2);
            double d3 = ((double) fE) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fX;
            float f16 = f14 * fX;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fX;
            float f18 = f12 * fU;
            float f19 = fCos * fCos3 * fU;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fU;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.J = false;
            this.L = z63.f(fArr);
        }
        return fArr;
    }

    public final void n(boolean z) {
        if (z != this.C) {
            this.C = z;
            cm cmVar = this.v;
            t27<ln7> t27Var = cmVar.a0;
            boolean z2 = cmVar.c0;
            if (!z) {
                if (z2) {
                    return;
                }
                t27Var.k(this);
                t27<ln7> t27Var2 = cmVar.b0;
                if (t27Var2 != null) {
                    t27Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                t27Var.g(this);
                return;
            }
            t27<ln7> t27Var3 = cmVar.b0;
            if (t27Var3 == null) {
                t27Var3 = new t27<>((Object) null);
                cmVar.b0 = t27Var3;
            }
            t27Var3.g(this);
        }
    }
}

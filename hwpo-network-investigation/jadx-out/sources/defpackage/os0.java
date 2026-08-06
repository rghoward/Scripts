package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ os0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd  */
    /* JADX WARN: Type inference failed for: r41v0, types: [T, po] */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        float fCeil;
        int i;
        wq0 wq0Var;
        boolean z;
        fx0 fx0Var;
        int i2 = this.t;
        Object obj2 = this.u;
        switch (i2) {
            case 0:
                ts0 ts0Var = (ts0) obj2;
                s01 s01Var = (s01) obj;
                if (s01Var.getDensity() * ts0Var.K < 0.0f || cr9.c(s01Var.t.c()) <= 0.0f) {
                    return s01Var.e(new ms0(0));
                }
                if (y43.e(ts0Var.K, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(s01Var.getDensity() * ts0Var.K);
                }
                final float fMin = Math.min(fCeil, (float) Math.ceil(cr9.c(s01Var.t.c()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (s01Var.t.c() >> 32)) - fMin)) << 32);
                float f2 = fMin * 2.0f;
                boolean z2 = f2 > cr9.c(s01Var.t.c());
                dm7 dm7VarMo0createOutlinePq9zytI = ts0Var.M.mo0createOutlinePq9zytI(s01Var.t.c(), s01Var.t.getLayoutDirection(), s01Var);
                if (!(dm7VarMo0createOutlinePq9zytI instanceof dm7.a)) {
                    if (!(dm7VarMo0createOutlinePq9zytI instanceof dm7.c)) {
                        boolean z3 = z2;
                        if (!(dm7VarMo0createOutlinePq9zytI instanceof dm7.b)) {
                            u.b();
                            return null;
                        }
                        final fx0 fx0Var2 = ts0Var.L;
                        final long j = z3 ? 0L : jFloatToRawIntBits;
                        final long jC = z3 ? s01Var.t.c() : jFloatToRawIntBits2;
                        final e73 b3aVar = z3 ? zy3.a : new b3a(fMin, 0.0f, 0, 0, 30);
                        return s01Var.e(new oh4() { // from class: ls0
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) {
                                cz1 cz1Var = (cz1) obj3;
                                cz1Var.K1();
                                d73.Q(cz1Var, fx0Var2, j, jC, 0.0f, b3aVar, null, 104);
                                return g2b.a;
                            }
                        });
                    }
                    final fx0 fx0Var3 = ts0Var.L;
                    vx8 vx8Var = ((dm7.c) dm7VarMo0createOutlinePq9zytI).a;
                    if (dc4.c(vx8Var)) {
                        final long j2 = vx8Var.e;
                        final b3a b3aVar2 = new b3a(fMin, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return s01Var.e(new oh4() { // from class: ps0
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) throws Throwable {
                                long j3;
                                cz1 cz1Var = (cz1) obj3;
                                cz1Var.K1();
                                boolean z5 = z4;
                                fx0 fx0Var4 = fx0Var3;
                                long j4 = j2;
                                if (z5) {
                                    d73.F1(cz1Var, fx0Var4, 0L, 0L, j4, 0.0f, null, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat < f3) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cz1Var.c() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat2 - f4;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L)) - f4;
                                        s41.b bVarY0 = cz1Var.Y0();
                                        long jD = bVarY0.d();
                                        bVarY0.a().f();
                                        try {
                                            bVarY0.a.b(f4, f4, f5, fIntBitsToFloat3, 0);
                                            j3 = jD;
                                            try {
                                                d73.F1(cz1Var, fx0Var4, 0L, 0L, j4, 0.0f, null, null, 246);
                                                x3.b(bVarY0, j3);
                                            } catch (Throwable th) {
                                                th = th;
                                                x3.b(bVarY0, j3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j3 = jD;
                                        }
                                    } else {
                                        d73.F1(cz1Var, fx0Var4, jFloatToRawIntBits, jFloatToRawIntBits2, ns0.c(f3, j4), 0.0f, b3aVar2, null, 208);
                                    }
                                }
                                return g2b.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    if (ts0Var.J == null) {
                        ts0Var.J = new js0(0);
                    }
                    js0 js0Var = ts0Var.J;
                    js0Var.getClass();
                    vp vpVar = js0Var.d;
                    final vp vpVar2 = vpVar;
                    if (vpVar == null) {
                        vp vpVarA = xp.a();
                        js0Var.d = vpVarA;
                        vpVar2 = vpVarA;
                    }
                    vpVar2.reset();
                    vpVar2.q(vx8Var);
                    if (!z5) {
                        vp vpVarA2 = xp.a();
                        vpVarA2.q(new vx8(fMin, fMin, vx8Var.b() - fMin, vx8Var.a() - fMin, ns0.c(fMin, vx8Var.e), ns0.c(fMin, vx8Var.f), ns0.c(fMin, vx8Var.g), ns0.c(fMin, vx8Var.h)));
                        vpVar2.r(vpVar2, vpVarA2, 0);
                    }
                    return s01Var.e(new oh4() { // from class: qs0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            cz1 cz1Var = (cz1) obj3;
                            cz1Var.K1();
                            d73.c1(cz1Var, vpVar2, fx0Var3, 0.0f, null, null, 60);
                            return g2b.a;
                        }
                    });
                }
                final fx0 fx0Var4 = ts0Var.L;
                final dm7.a aVar = (dm7.a) dm7VarMo0createOutlinePq9zytI;
                cu7 cu7Var = aVar.a;
                if (z2) {
                    return s01Var.e(new oh4() { // from class: rs0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            cz1 cz1Var = (cz1) obj3;
                            cz1Var.K1();
                            d73.c1(cz1Var, aVar.a, fx0Var4, 0.0f, null, null, 60);
                            return g2b.a;
                        }
                    });
                }
                if (fx0Var4 instanceof aw9) {
                    wq0Var = new wq0(5, uh1.b(1.0f, ((aw9) fx0Var4).a));
                    i = 1;
                } else {
                    i = 0;
                    wq0Var = null;
                }
                final sk8 bounds = cu7Var.getBounds();
                if (ts0Var.J == null) {
                    ts0Var.J = new js0(0);
                }
                js0 js0Var2 = ts0Var.J;
                js0Var2.getClass();
                vp vpVar3 = js0Var2.d;
                vp vpVar4 = vpVar3;
                if (vpVar3 == null) {
                    vp vpVarA3 = xp.a();
                    js0Var2.d = vpVarA3;
                    vpVar4 = vpVarA3;
                }
                vpVar4.reset();
                vpVar4.p(bounds);
                vpVar4.r(vpVar4, cu7Var, 0);
                final gl8 gl8Var = new gl8();
                float f3 = bounds.c;
                float f4 = bounds.b;
                float f5 = bounds.a;
                vp vpVar5 = vpVar4;
                final long jCeil = (((long) ((int) Math.ceil(bounds.d - f4))) & 4294967295L) | (((long) ((int) Math.ceil(f3 - f5))) << 32);
                js0 js0Var3 = ts0Var.J;
                js0Var3.getClass();
                po poVarA = js0Var3.a;
                ol olVarB = js0Var3.b;
                m75 m75Var = poVarA != null ? new m75(poVarA.a()) : null;
                if (m75Var != null && m75Var.a == 0) {
                    z = true;
                } else {
                    m75 m75Var2 = poVarA != null ? new m75(poVarA.a()) : null;
                    if (m75Var2 != null && i == m75Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (poVarA != null) {
                    Bitmap bitmap = poVarA.a;
                    if (olVarB != null) {
                        boolean z6 = z;
                        fx0Var = fx0Var4;
                        if (Float.intBitsToFloat((int) (s01Var.t.c() >> 32)) > bitmap.getWidth() || Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)) > bitmap.getHeight() || !z6) {
                        }
                    } else {
                        fx0Var = fx0Var4;
                    }
                    poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    js0Var3.a = poVarA;
                    olVarB = ml5.b(poVarA);
                    js0Var3.b = olVarB;
                } else {
                    fx0Var = fx0Var4;
                    poVarA = yq5.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    js0Var3.a = poVarA;
                    olVarB = ml5.b(poVarA);
                    js0Var3.b = olVarB;
                }
                s41 s41Var = js0Var3.c;
                if (s41Var == null) {
                    s41Var = new s41();
                    js0Var3.c = s41Var;
                }
                s41.b bVar = s41Var.u;
                s41.a aVar2 = s41Var.t;
                long jC2 = c43.c(jCeil);
                tq5 layoutDirection = s01Var.t.getLayoutDirection();
                s41 s41Var2 = s41Var;
                tx2 tx2Var = aVar2.a;
                final wq0 wq0Var2 = wq0Var;
                tq5 tq5Var = aVar2.b;
                n41 n41Var = aVar2.c;
                ?? r41 = poVarA;
                long j3 = aVar2.d;
                aVar2.a = s01Var;
                aVar2.b = layoutDirection;
                aVar2.c = olVarB;
                aVar2.d = jC2;
                olVarB.f();
                d73.W0(s41Var2, uh1.b, 0L, jC2, 0.0f, 58);
                float f6 = -f5;
                float f7 = -f4;
                bVar.a.f(f6, f7);
                try {
                    fx0 fx0Var5 = fx0Var;
                    d73.c1(s41Var2, aVar.a, fx0Var5, 0.0f, new b3a(f2, 0.0f, 0, 0, 30), null, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (s41Var2.c() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (s41Var2.c() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (s41Var2.c() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (s41Var2.c() & 4294967295L));
                    long jU1 = s41Var2.u1();
                    long jD = bVar.d();
                    bVar.a().f();
                    ol olVar = olVarB;
                    try {
                        bVar.a.e(fIntBitsToFloat, fIntBitsToFloat2, jU1);
                        d73.c1(s41Var2, vpVar5, fx0Var5, 0.0f, null, null, 28);
                        bVar.a().o();
                        bVar.h(jD);
                        bVar.a.f(-f6, -f7);
                        olVar.o();
                        aVar2.a = tx2Var;
                        aVar2.b = tq5Var;
                        aVar2.c = n41Var;
                        aVar2.d = j3;
                        r41.b();
                        gl8Var.t = r41;
                        return s01Var.e(new oh4() { // from class: ss0
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) throws Throwable {
                                float f8;
                                float f9;
                                gl8 gl8Var2 = gl8Var;
                                long j4 = jCeil;
                                wh1 wh1Var = wq0Var2;
                                cz1 cz1Var = (cz1) obj3;
                                cz1Var.K1();
                                sk8 sk8Var = bounds;
                                float f10 = sk8Var.a;
                                float f11 = sk8Var.b;
                                cz1Var.Y0().a.f(f10, f11);
                                try {
                                    l75 l75Var = (l75) gl8Var2.t;
                                    f8 = f10;
                                    try {
                                        d73.b1(cz1Var, l75Var, 0L, j4, 0L, 0L, 0.0f, null, wh1Var, 0, 0, 890);
                                        cz1Var.Y0().a.f(-f8, -f11);
                                        return g2b.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        f9 = f11;
                                        cz1Var.Y0().a.f(-f8, -f9);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f8 = f10;
                                    f9 = f11;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        bVar.a().o();
                        bVar.h(jD);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar.a.f(-f6, -f7);
                    throw th2;
                }
            default:
                jz7.a.t((jz7.a) obj, (jz7) obj2, 0, 0);
                return g2b.a;
        }
    }
}

package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xda {
    public static final xda a = new xda();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements di1, mi4 {
        public final /* synthetic */ me8 t;

        public a(me8 me8Var) {
            this.t = me8Var;
        }

        @Override // defpackage.di1
        public final long a() {
            return ((uh1) this.t.get()).a;
        }

        @Override // defpackage.mi4
        public final di4<?> b() {
            return this.t;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof di1) && (obj instanceof mi4)) {
                return xj5.a(b(), ((mi4) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static pda c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, jt1 jt1Var, int i) {
        long j11 = (i & 1) != 0 ? uh1.k : j;
        long j12 = (i & 2) != 0 ? uh1.k : j2;
        long j13 = (i & 4) != 0 ? uh1.k : j3;
        long j14 = uh1.k;
        return d((fi1) jt1Var.F(hi1.a), (qja) jt1Var.F(rja.a)).a(j11, j12, j13, j14, j4, j5, (i & 64) != 0 ? j14 : j6, j14, (i & 256) != 0 ? j14 : j7, j14, null, j8, j9, (i & 8192) != 0 ? j14 : j10, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14, j14);
    }

    public static pda d(fi1 fi1Var, qja qjaVar) {
        pda pdaVar = fi1Var.f0;
        if (pdaVar != null) {
            if (xj5.a(pdaVar.k, qjaVar)) {
                return pdaVar;
            }
            pda pdaVarA = pdaVar.a(((-14837) & 1) != 0 ? pdaVar.a : 0L, ((-14837) & 2) != 0 ? pdaVar.b : 0L, ((-14837) & 4) != 0 ? pdaVar.c : 0L, pdaVar.d, ((-14837) & 16) != 0 ? pdaVar.e : 0L, ((-14837) & 32) != 0 ? pdaVar.f : 0L, ((-14837) & 64) != 0 ? pdaVar.g : 0L, ((-14837) & 128) != 0 ? pdaVar.h : 0L, ((-14837) & 256) != 0 ? pdaVar.i : 0L, pdaVar.j, ((-14837) & 1024) != 0 ? pdaVar.k : qjaVar, ((-14837) & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? pdaVar.l : 0L, ((-14837) & 4096) != 0 ? pdaVar.m : 0L, ((-14837) & 8192) != 0 ? pdaVar.n : 0L, pdaVar.o, pdaVar.p, pdaVar.q, pdaVar.r, pdaVar.s, pdaVar.t, pdaVar.u, pdaVar.v, pdaVar.w, pdaVar.x, pdaVar.y, pdaVar.z, pdaVar.A, pdaVar.B, pdaVar.C, pdaVar.D, pdaVar.E, pdaVar.F, pdaVar.G, pdaVar.H, pdaVar.I, pdaVar.J, pdaVar.K, pdaVar.L, pdaVar.M, pdaVar.N, pdaVar.O, pdaVar.P, pdaVar.Q);
            fi1Var.f0 = pdaVarA;
            return pdaVarA;
        }
        long jC = hi1.c(fi1Var, gz3.y);
        long jC2 = hi1.c(fi1Var, gz3.D);
        gi1 gi1Var = gz3.g;
        long jC3 = hi1.c(fi1Var, gi1Var);
        float f = gz3.h;
        long jB = uh1.b(f, jC3);
        long jC4 = hi1.c(fi1Var, gz3.s);
        gi1 gi1Var2 = gz3.c;
        long jC5 = hi1.c(fi1Var, gi1Var2);
        long jC6 = hi1.c(fi1Var, gi1Var2);
        long jC7 = hi1.c(fi1Var, gi1Var2);
        long jC8 = hi1.c(fi1Var, gi1Var2);
        long jC9 = hi1.c(fi1Var, gz3.b);
        long jC10 = hi1.c(fi1Var, gz3.r);
        long jC11 = hi1.c(fi1Var, gz3.x);
        long jC12 = hi1.c(fi1Var, gz3.a);
        long jB2 = uh1.b(gz3.f, hi1.c(fi1Var, gz3.e));
        long jC13 = hi1.c(fi1Var, gz3.q);
        long jC14 = hi1.c(fi1Var, gz3.A);
        long jC15 = hi1.c(fi1Var, gz3.I);
        long jB3 = uh1.b(gz3.l, hi1.c(fi1Var, gz3.k));
        long jC16 = hi1.c(fi1Var, gz3.u);
        long jC17 = hi1.c(fi1Var, gz3.C);
        long jC18 = hi1.c(fi1Var, gz3.K);
        long jB4 = uh1.b(gz3.p, hi1.c(fi1Var, gz3.o));
        long jC19 = hi1.c(fi1Var, gz3.w);
        long jC20 = hi1.c(fi1Var, gz3.z);
        long jC21 = hi1.c(fi1Var, gz3.H);
        long jB5 = uh1.b(gz3.j, hi1.c(fi1Var, gz3.i));
        long jC22 = hi1.c(fi1Var, gz3.t);
        gi1 gi1Var3 = gz3.E;
        long jC23 = hi1.c(fi1Var, gi1Var3);
        long jC24 = hi1.c(fi1Var, gi1Var3);
        long jB6 = uh1.b(f, hi1.c(fi1Var, gi1Var));
        long jC25 = hi1.c(fi1Var, gi1Var3);
        long jC26 = hi1.c(fi1Var, gz3.B);
        long jC27 = hi1.c(fi1Var, gz3.J);
        long jB7 = uh1.b(gz3.n, hi1.c(fi1Var, gz3.m));
        long jC28 = hi1.c(fi1Var, gz3.v);
        gi1 gi1Var4 = gz3.F;
        long jC29 = hi1.c(fi1Var, gi1Var4);
        long jC30 = hi1.c(fi1Var, gi1Var4);
        long jB8 = uh1.b(f, hi1.c(fi1Var, gi1Var4));
        long jC31 = hi1.c(fi1Var, gi1Var4);
        gi1 gi1Var5 = gz3.G;
        pda pdaVar2 = new pda(jC, jC2, jB, jC4, jC5, jC6, jC7, jC8, jC9, jC10, qjaVar, jC11, jC12, jB2, jC13, jC14, jC15, jB3, jC16, jC17, jC18, jB4, jC19, jC20, jC21, jB5, jC22, jC23, jC24, jB6, jC25, jC26, jC27, jB7, jC28, jC29, jC30, jB8, jC31, hi1.c(fi1Var, gi1Var5), hi1.c(fi1Var, gi1Var5), uh1.b(f, hi1.c(fi1Var, gi1Var5)), hi1.c(fi1Var, gi1Var5));
        fi1Var.f0 = pdaVar2;
        return pdaVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z, final boolean z2, final h27 h27Var, final pda pdaVar, final jl9 jl9Var, jt1 jt1Var, final int i) {
        long j;
        bj4 bj4VarO = jt1Var.o(-818661242);
        int i2 = i | (bj4VarO.c(z) ? 4 : 2) | (bj4VarO.c(z2) ? 32 : 16) | (bj4VarO.J(h27Var) ? 256 : 128) | (bj4VarO.J(pdaVar) ? 16384 : 8192) | (bj4VarO.J(jl9Var) ? 131072 : 65536);
        if (bj4VarO.A(i2 & 1, (38347923 & i2) != 38347922)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            boolean zBooleanValue = ((Boolean) y84.a(h27Var, bj4VarO, (i2 >> 6) & 14).getValue()).booleanValue();
            if (!z) {
                j = pdaVar.g;
            } else if (z2) {
                j = pdaVar.h;
            } else {
                j = zBooleanValue ? pdaVar.e : pdaVar.f;
            }
            dv0.a(z63.d(ox6.a.t, new gea(jl9Var, new a(new vda(tq9.a(j, zs4.e(wy6.w, bj4VarO), null, bj4VarO, 0, 12), yz9.class, "value", "getValue()Ljava/lang/Object;", 0)))).H(new cb5(z, z2, h27Var, pdaVar, jl9Var)), bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(z, z2, h27Var, pdaVar, jl9Var, i) { // from class: uda
                public final /* synthetic */ boolean u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ h27 w;
                public final /* synthetic */ pda x;
                public final /* synthetic */ jl9 y;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(114822145);
                    this.t.a(this.u, this.v, this.w, this.x, this.y, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [bj4, jt1] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r32v0, types: [bj4] */
    /* JADX WARN: Type inference failed for: r32v1, types: [bj4] */
    /* JADX WARN: Type inference failed for: r32v2, types: [jt1] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void b(final String str, final ci4 ci4Var, final boolean z, final boolean z2, final ojb ojbVar, final h27 h27Var, final ci4 ci4Var2, ci4 ci4Var3, ci4 ci4Var4, jl9 jl9Var, final pda pdaVar, go7 go7Var, ci4 ci4Var5, jt1 jt1Var, final int i, final int i2, final int i3) {
        int i4;
        ci4 ci4Var6;
        boolean z3;
        boolean z4;
        ci4 ci4Var7;
        final ci4 ci4Var8;
        int i5;
        int i6;
        int i7;
        int i8;
        jl9 jl9Var2;
        final ci4 ci4Var9;
        final go7 go7Var2;
        final ci4 ci4Var10;
        ?? r32;
        jl9 jl9VarB;
        go7 ko7Var;
        int i9;
        go7 go7Var3;
        ci4 ci4VarB;
        ci4 ci4Var11;
        ?? r4;
        ?? O = jt1Var.o(1806980801);
        if ((i & 6) == 0) {
            i4 = (O.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            ci4Var6 = ci4Var;
            i4 |= O.j(ci4Var6) ? 32 : 16;
        } else {
            ci4Var6 = ci4Var;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i4 |= O.c(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        int i10 = i & 3072;
        int i11 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i10 == 0) {
            z4 = z2;
            i4 |= O.c(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        int i12 = 8192;
        if ((i & 24576) == 0) {
            i4 |= O.J(ojbVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= O.J(h27Var) ? 131072 : 65536;
        }
        int i13 = 524288;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= O.c(false) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= O.j(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ci4Var7 = ci4Var2;
            i4 |= O.j(ci4Var7) ? 67108864 : 33554432;
        } else {
            ci4Var7 = ci4Var2;
        }
        int i14 = i3 & 512;
        if (i14 != 0) {
            i4 |= 805306368;
            ci4Var8 = ci4Var3;
        } else {
            ci4Var8 = ci4Var3;
            if ((i & 805306368) == 0) {
                i4 |= O.j(ci4Var8) ? 536870912 : 268435456;
            }
        }
        int i15 = i3 & 1024;
        if (i15 != 0) {
            i5 = i2 | 6;
        } else {
            i5 = i2 | (O.j(ci4Var4) ? 4 : 2);
        }
        if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
            i6 = i5 | 48;
        } else {
            i6 = i5 | (O.j(null) ? 32 : 16);
        }
        if ((i3 & 4096) != 0) {
            i7 = i6 | 384;
        } else {
            i7 = i6 | (O.j(null) ? 256 : 128);
        }
        if ((i3 & 8192) != 0) {
            i8 = i7 | 3072;
        } else {
            if (!O.j(null)) {
                i11 = 1024;
            }
            i8 = i7 | i11;
        }
        if ((i3 & 16384) == 0) {
            jl9Var2 = jl9Var;
            if (O.J(jl9Var2)) {
                i12 = 16384;
            }
        } else {
            jl9Var2 = jl9Var;
        }
        int i16 = i8 | i12 | (O.J(pdaVar) ? 131072 : 65536);
        if ((i2 & 1572864) == 0) {
            if ((i3 & 65536) == 0 && O.J(go7Var)) {
                i13 = 1048576;
            }
            i16 |= i13;
        }
        int i17 = i16 | 12582912;
        if (O.A(i4 & 1, ((i4 & 306783379) == 306783378 && (i17 & 38347923) == 38347922) ? false : true)) {
            O.v0();
            if ((i & 1) == 0 || O.c0()) {
                if (i14 != 0) {
                    ci4Var8 = null;
                }
                ci4 ci4Var12 = i15 != 0 ? null : ci4Var4;
                if ((i3 & 16384) != 0) {
                    i17 &= -57345;
                    jl9VarB = wl9.b(gz3.d, O);
                } else {
                    jl9VarB = jl9Var2;
                }
                if ((i3 & 65536) != 0) {
                    ko7Var = new ko7(16.0f, 16.0f, 16.0f, 16.0f);
                    i9 = i17 & (-3670017);
                } else {
                    ko7Var = go7Var;
                    i9 = i17;
                }
                i17 = i9;
                go7Var3 = ko7Var;
                ci4VarB = gr1.b(417908150, new wda(z3, false, h27Var, pdaVar, jl9VarB), O);
                jl9Var2 = jl9VarB;
                ci4Var11 = ci4Var12;
                r4 = 0;
            } else {
                O.u();
                if ((i3 & 16384) != 0) {
                    i17 &= -57345;
                }
                if ((i3 & 65536) != 0) {
                    i17 &= -3670017;
                }
                go7Var3 = go7Var;
                ci4VarB = ci4Var5;
                r4 = 0;
                ci4Var11 = ci4Var4;
            }
            O.V();
            int i18 = ((i4 & 14) == 4 ? 1 : r4) | ((i4 & 57344) != 16384 ? r4 : 1);
            Object objF = O.f();
            if (i18 != 0 || objF == jt1.a.a) {
                objF = ojbVar.a(new iw(str));
                O.C(objF);
            }
            String str2 = ((mva) objF).a.u;
            jfa.b bVar = new jfa.b(r4);
            O.K(-1353131191);
            O.U(r4);
            int i19 = i4 >> 9;
            int i20 = i17 << 21;
            ?? r33 = O;
            yea.a(iha.t, str2, ci4Var6, bVar, 0, ci4Var7, ci4Var8, ci4Var11, null, z4, z, false, h27Var, go7Var3, pdaVar, ci4VarB, r33, ((i4 << 3) & 896) | 6 | (i19 & 458752) | (i19 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i4 >> 3) & 57344) | ((i17 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i19 & 7168) | ((i17 >> 3) & 458752) | ((i17 << 3) & 3670016) | 12582912);
            ci4Var9 = ci4Var11;
            go7Var2 = go7Var3;
            ci4Var10 = ci4VarB;
            r32 = r33;
        } else {
            ?? r34 = O;
            r34.u();
            ci4Var9 = ci4Var4;
            go7Var2 = go7Var;
            ci4Var10 = ci4Var5;
            r32 = r34;
        }
        final jl9 jl9Var3 = jl9Var2;
        xj8 xj8VarW = r32.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tda
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    this.t.b(str, ci4Var, z, z2, ojbVar, h27Var, ci4Var2, ci4Var8, ci4Var9, jl9Var3, pdaVar, go7Var2, ci4Var10, (jt1) obj, iS, iS2, i3);
                    return g2b.a;
                }
            };
        }
    }
}

package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mt9 {
    public static final void a(final fr1 fr1Var, ci4 ci4Var, ci4 ci4Var2, wja wjaVar, final long j, long j2, jt1 jt1Var, final int i) {
        ci4 ci4Var3;
        long j3;
        wja wjaVar2;
        ci4 ci4Var4;
        boolean z;
        int i2;
        boolean z2;
        bj4 bj4VarO = jt1Var.o(-931325388);
        j1b j1bVar = bj4VarO.a;
        int i3 = i | (bj4VarO.j(fr1Var) ? 4 : 2) | (bj4VarO.j(ci4Var) ? 32 : 16) | (bj4VarO.j(ci4Var2) ? 256 : 128) | (bj4VarO.J(wjaVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.i(j) ? 16384 : 8192) | (bj4VarO.i(j2) ? 131072 : 65536);
        if (bj4VarO.A(i3 & 1, (74899 & i3) != 74898)) {
            float f = ci4Var2 == null ? 8.0f : 0.0f;
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarM = eo7.m(aVar, 16.0f, 0.0f, f, 0.0f, 10);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new et9();
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarM);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6Var);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarK = eo7.k(yq5.d(aVar, AttributeType.TEXT), 0.0f, 6.0f, 1);
            sp0 sp0Var = di.a.a;
            fl6 fl6VarD = dv0.d(sp0Var, false);
            int iD2 = bj4VarO.D();
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarK);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                qh.a(iD2, bj4VarO, iD2, bVar);
            }
            rd7.d(bj4VarO, dVar, ox6VarC2);
            fr1Var.invoke(bj4VarO, Integer.valueOf(i3 & 14));
            bj4VarO.U(true);
            if (ci4Var != null) {
                bj4VarO.K(-1014168049);
                ox6 ox6VarD = yq5.d(aVar, "action");
                fl6 fl6VarD2 = dv0.d(sp0Var, false);
                int iD3 = bj4VarO.D();
                kw7 kw7VarP3 = bj4VarO.P();
                ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarD);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i2 = 8;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD3))) {
                    qh.a(iD3, bj4VarO, iD3, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC3);
                wjaVar2 = wjaVar;
                ci4Var3 = ci4Var;
                nu1.b(new kf8[]{zy1.a.a(new uh1(j)), mia.a.a(wjaVar2)}, ci4Var3, bj4VarO, 8 | (i3 & 112));
                bj4VarO.U(true);
                z = false;
                bj4VarO.U(false);
            } else {
                ci4Var3 = ci4Var;
                wjaVar2 = wjaVar;
                z = false;
                i2 = 8;
                bj4VarO.K(-1013852841);
                bj4VarO.U(false);
            }
            if (ci4Var2 != null) {
                bj4VarO.K(-1013804481);
                ox6 ox6VarD2 = yq5.d(aVar, "dismissAction");
                fl6 fl6VarD3 = dv0.d(sp0Var, z);
                int iD4 = bj4VarO.D();
                kw7 kw7VarP4 = bj4VarO.P();
                ox6 ox6VarC4 = it1.c(bj4VarO, ox6VarD2);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD3);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD4))) {
                    qh.a(iD4, bj4VarO, iD4, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC4);
                j3 = j2;
                ci4Var4 = ci4Var2;
                nu1.a(zy1.a.a(new uh1(j3)), ci4Var4, bj4VarO, i2 | ((i3 >> 3) & 112));
                z2 = true;
                bj4VarO.U(true);
                bj4VarO.U(false);
            } else {
                ci4Var4 = ci4Var2;
                j3 = j2;
                z2 = true;
                bj4VarO.K(-1013535401);
                bj4VarO.U(z);
            }
            bj4VarO.U(z2);
        } else {
            ci4Var3 = ci4Var;
            j3 = j2;
            wjaVar2 = wjaVar;
            ci4Var4 = ci4Var2;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ci4 ci4Var5 = ci4Var4;
            final wja wjaVar3 = wjaVar2;
            final long j4 = j3;
            final ci4 ci4Var6 = ci4Var3;
            xj8VarW.d = new ci4(ci4Var6, ci4Var5, wjaVar3, j, j4, i) { // from class: ct9
                public final /* synthetic */ ci4 u;
                public final /* synthetic */ ci4 v;
                public final /* synthetic */ wja w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    mt9.a(this.t, this.u, this.v, this.w, this.x, this.y, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ox6 ox6Var, final ci4 ci4Var, final ci4 ci4Var2, final jl9 jl9Var, final long j, final long j2, final long j3, final long j4, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        ci4 ci4Var3;
        int i3;
        long j5;
        bj4 bj4VarO = jt1Var.o(-1218779924);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ci4Var3 = ci4Var;
            i2 |= bj4VarO.j(ci4Var3) ? 32 : 16;
        } else {
            ci4Var3 = ci4Var;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(ci4Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.c(false) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.J(jl9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.i(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.i(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.i(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            int i4 = i2;
            j5 = j4;
            i3 = i4 | (bj4VarO.i(j5) ? 67108864 : 33554432);
        } else {
            i3 = i2;
            j5 = j4;
        }
        if ((805306368 & i) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if (bj4VarO.A(i5 & 1, (306783379 & i5) != 306783378)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            int i6 = i5 >> 9;
            v5a.a(ox6Var, jl9Var, j, j2, 0.0f, pt9.w, null, gr1.b(-1343524879, new gt9(ci4Var3, fr1Var, ci4Var2, j3, j5), bj4VarO), bj4VarO, (i5 & 14) | 12779520 | (i6 & 112) | (i6 & 896) | (i6 & 7168), 80);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bt9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    mt9.b(ox6Var, ci4Var, ci4Var2, jl9Var, j, j2, j3, j4, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final ms9 ms9Var, ox6 ox6Var, jl9 jl9Var, long j, long j2, long j3, long j4, long j5, jt1 jt1Var, final int i, final int i2) {
        int i3;
        jl9 jl9VarB;
        long jD;
        bj4 bj4Var;
        final ox6 ox6Var2;
        final long j6;
        final long j7;
        final jl9 jl9Var2;
        final long j8;
        final long j9;
        final long j10;
        int i4;
        ox6 ox6Var3;
        long j11;
        long j12;
        long j13;
        long j14;
        fr1 fr1Var;
        gi1 gi1Var = pt9.t;
        bj4 bj4VarO = jt1Var.o(274621471);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ms9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 432;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jl9VarB = jl9Var;
                int i6 = bj4VarO.J(jl9VarB) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i5 |= i6;
            } else {
                jl9VarB = jl9Var;
            }
            i5 |= i6;
        } else {
            jl9VarB = jl9Var;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jD = j3;
                int i7 = bj4VarO.i(jD) ? 1048576 : 524288;
                i5 |= i7;
            } else {
                jD = j3;
            }
            i5 |= i7;
        } else {
            jD = j3;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        if (bj4VarO.A(i5 & 1, (38347923 & i5) != 38347922)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                if ((i2 & 8) != 0) {
                    jl9VarB = wl9.b(pt9.x, bj4VarO);
                    i5 &= -7169;
                }
                long jD2 = hi1.d(pt9.v, bj4VarO);
                long jD3 = hi1.d(pt9.z, bj4VarO);
                int i8 = i5 & (-516097);
                if ((i2 & 64) != 0) {
                    jD = hi1.d(gi1Var, bj4VarO);
                    i8 = i5 & (-4186113);
                }
                long jD4 = hi1.d(gi1Var, bj4VarO);
                long jD5 = hi1.d(pt9.y, bj4VarO);
                i4 = i8 & (-264241153);
                ox6Var3 = ox6.a.t;
                j11 = jD4;
                j12 = jD2;
                j13 = jD3;
                j14 = jD5;
            } else {
                bj4VarO.u();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                int i9 = i5 & (-516097);
                if ((i2 & 64) != 0) {
                    i9 = i5 & (-4186113);
                }
                i4 = i9 & (-264241153);
                ox6Var3 = ox6Var;
                j12 = j;
                j13 = j2;
                j11 = j4;
                j14 = j5;
            }
            jl9 jl9Var3 = jl9VarB;
            bj4VarO.V();
            String strB = ms9Var.b().b();
            fr1 fr1VarB = null;
            if (strB != null) {
                bj4VarO.K(-663815981);
                fr1 fr1VarB2 = gr1.b(-1378313599, new kt9(jD, ms9Var, strB), bj4VarO);
                bj4VarO.U(false);
                fr1Var = fr1VarB2;
            } else {
                bj4VarO.K(-663517017);
                bj4VarO.U(false);
                fr1Var = null;
            }
            if (ms9Var.b().c()) {
                bj4VarO.K(-663364652);
                fr1VarB = gr1.b(-1812633777, new lt9(ms9Var), bj4VarO);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-662974393);
                bj4VarO.U(false);
            }
            int i10 = i4 << 3;
            bj4Var = bj4VarO;
            b(eo7.i(ox6Var3, 12.0f), fr1Var, fr1VarB, jl9Var3, j12, j13, j11, j14, gr1.b(-1266389126, new ht9(ms9Var), bj4VarO), bj4Var, (i10 & 7168) | 805306368 | (i10 & 57344));
            ox6Var2 = ox6Var3;
            j8 = jD;
            jl9Var2 = jl9Var3;
            j9 = j12;
            j10 = j13;
            j6 = j11;
            j7 = j14;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            ox6Var2 = ox6Var;
            j6 = j4;
            j7 = j5;
            jl9Var2 = jl9VarB;
            j8 = jD;
            j9 = j;
            j10 = j2;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: at9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    mt9.c(ms9Var, ox6Var2, jl9Var2, j9, j10, j8, j6, j7, (jt1) obj, iS, i2);
                    return g2b.a;
                }
            };
        }
    }
}

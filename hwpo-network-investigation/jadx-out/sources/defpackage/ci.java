package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ci {
    public static final ko7 a = new ko7(24.0f, 24.0f, 24.0f, 24.0f);
    public static final ko7 b = eo7.c(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final ko7 c = eo7.c(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final ko7 d = eo7.c(0.0f, 0.0f, 0.0f, 24.0f, 7);
    public static final u93 e = new u93(new oh(0));

    public static final void a(final fr1 fr1Var, ox6 ox6Var, final ci4 ci4Var, final ci4 ci4Var2, final ci4 ci4Var3, final jl9 jl9Var, final long j, final long j2, final long j3, final long j4, final long j5, jt1 jt1Var, final int i) {
        final ox6 ox6Var2;
        bj4 bj4VarO = jt1Var.o(1378716401);
        int i2 = i | 48 | (bj4VarO.j(ci4Var) ? 256 : 128) | (bj4VarO.j(ci4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(ci4Var3) ? 16384 : 8192) | (bj4VarO.J(jl9Var) ? 131072 : 65536) | (bj4VarO.i(j) ? 1048576 : 524288) | (bj4VarO.g(0.0f) ? 8388608 : 4194304) | (bj4VarO.i(j2) ? 67108864 : 33554432) | (bj4VarO.i(j3) ? 536870912 : 268435456);
        if (bj4VarO.A(i2 & 1, ((306783379 & i2) == 306783378 && (((bj4VarO.i(j5) ? ' ' : (char) 16) | (bj4VarO.i(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            int i3 = i2 >> 12;
            ox6.a aVar = ox6.a.t;
            v5a.a(aVar, jl9Var, j, 0L, 0.0f, 0.0f, null, gr1.b(-652798794, new wh(ci4Var, ci4Var2, ci4Var3, j3, j4, j5, j2, fr1Var), bj4VarO), bj4VarO, (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344), 104);
            ox6Var2 = aVar;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var2, ci4Var, ci4Var2, ci4Var3, jl9Var, j, j2, j3, j4, j5, i) { // from class: ph
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ ci4 v;
                public final /* synthetic */ ci4 w;
                public final /* synthetic */ ci4 x;
                public final /* synthetic */ jl9 y;
                public final /* synthetic */ long z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    ci.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-917637668);
        if (bj4VarO.A(i & 1, (i & 147) != 146)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new yh(f, f2);
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6.a.t);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var.invoke(bj4VarO, 6);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(f, f2, fr1Var, i) { // from class: nh
                public final /* synthetic */ float t;
                public final /* synthetic */ float u;
                public final /* synthetic */ fr1 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(439);
                    ci.b(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final mh4 mh4Var, final fr1 fr1Var, final ox6 ox6Var, final ci4 ci4Var, final ci4 ci4Var2, final ci4 ci4Var3, final ci4 ci4Var4, final jl9 jl9Var, final long j, final long j2, final long j3, final long j4, final f03 f03Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        fr1 fr1Var2;
        ci4 ci4Var5;
        int i4;
        bj4 bj4VarO = jt1Var.o(-867616355);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fr1Var2 = fr1Var;
            i3 |= bj4VarO.j(fr1Var2) ? 32 : 16;
        } else {
            fr1Var2 = fr1Var;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ci4Var5 = ci4Var;
            i3 |= bj4VarO.j(ci4Var5) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            ci4Var5 = ci4Var;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(ci4Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bj4VarO.j(ci4Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bj4VarO.j(ci4Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bj4VarO.J(jl9Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bj4VarO.i(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bj4VarO.i(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.i(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.i(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bj4VarO.g(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bj4VarO.J(f03Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i5 = i4;
        if (bj4VarO.A(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(mh4Var, ox6Var, f03Var, gr1.b(527420759, new bi(ci4Var2, ci4Var3, ci4Var4, jl9Var, j, j2, j3, j4, ci4Var5, fr1Var2), bj4VarO), bj4VarO, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lh
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    ci.c(mh4Var, fr1Var, ox6Var, ci4Var, ci4Var2, ci4Var3, ci4Var4, jl9Var, j, j2, j3, j4, f03Var, (jt1) obj, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }

    public static final void d(mh4 mh4Var, ox6 ox6Var, f03 f03Var, fr1 fr1Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(24925658);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(f03Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            ((il0) bj4VarO.F(e)).a(new jl0(mh4Var, ox6Var, f03Var, fr1Var), bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mh(mh4Var, ox6Var, f03Var, fr1Var, i);
        }
    }
}

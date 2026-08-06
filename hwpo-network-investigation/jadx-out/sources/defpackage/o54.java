package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o54 {
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void a(final mh4 mh4Var, final ox6 ox6Var, final jl9 jl9Var, final long j, long j2, e54 e54Var, final ci4 ci4Var, jt1 jt1Var, final int i, final int i2) {
        long jB;
        int i3;
        boolean z;
        final e54 e54Var2;
        final long j3;
        xj8 xj8VarW;
        int i4;
        e54 e54Var3;
        bj4 bj4VarO = jt1Var.o(748201188);
        int i5 = i | (bj4VarO.j(mh4Var) ? 4 : 2) | (bj4VarO.J(jl9Var) ? 256 : 128) | (bj4VarO.i(j) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if ((i2 & 16) == 0) {
            jB = j2;
            int i6 = bj4VarO.i(jB) ? 16384 : 8192;
            i3 = i5 | i6 | 1638400;
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i3 & 1, z)) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    if ((i2 & 16) != 0) {
                        jB = hi1.b(j, bj4VarO);
                        i3 &= -57345;
                    }
                    i4 = i3 & (-458753);
                    e54Var3 = new e54(ws3.t, ws3.w, ws3.u, ws3.v);
                } else {
                    bj4VarO.u();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3 & (-458753);
                    e54Var3 = e54Var;
                }
                long j4 = jB;
                bj4VarO.V();
                int i7 = i4 & 14;
                int i8 = i4 << 9;
                b(mh4Var, j0b.a(f41.u, bj4VarO), us3.t, ox6Var, jl9Var, j, j4, e54Var3, ci4Var, bj4VarO, (i8 & 29360128) | i7 | 28032 | (458752 & i8) | (3670016 & i8) | 805306368, 6);
                j3 = j4;
                e54Var2 = e54Var3;
            } else {
                bj4VarO.u();
                e54Var2 = e54Var;
                j3 = jB;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4(ox6Var, jl9Var, j, j3, e54Var2, ci4Var, i, i2) { // from class: k54
                    public final /* synthetic */ int A;
                    public final /* synthetic */ ox6 u;
                    public final /* synthetic */ jl9 v;
                    public final /* synthetic */ long w;
                    public final /* synthetic */ long x;
                    public final /* synthetic */ e54 y;
                    public final /* synthetic */ ci4 z;

                    {
                        this.A = i2;
                    }

                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iS = gz3.s(12582961);
                        o54.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, (jt1) obj, iS, this.A);
                        return g2b.a;
                    }
                };
            }
        }
        jB = j2;
        i3 = i5 | i6 | 1638400;
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i3 & 1, z)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    jB = hi1.b(j, bj4VarO);
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                e54Var3 = new e54(ws3.t, ws3.w, ws3.u, ws3.v);
            } else {
                if ((i2 & 16) != 0) {
                    jB = hi1.b(j, bj4VarO);
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                e54Var3 = new e54(ws3.t, ws3.w, ws3.u, ws3.v);
            }
            long j5 = jB;
            bj4VarO.V();
            int i9 = i4 & 14;
            int i10 = i4 << 9;
            b(mh4Var, j0b.a(f41.u, bj4VarO), us3.t, ox6Var, jl9Var, j, j5, e54Var3, ci4Var, bj4VarO, (i10 & 29360128) | i9 | 28032 | (458752 & i10) | (3670016 & i10) | 805306368, 6);
            j3 = j5;
            e54Var2 = e54Var3;
        } else {
            bj4VarO.u();
            e54Var2 = e54Var;
            j3 = jB;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, jl9Var, j, j3, e54Var2, ci4Var, i, i2) { // from class: k54
                public final /* synthetic */ int A;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ jl9 v;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ e54 y;
                public final /* synthetic */ ci4 z;

                {
                    this.A = i2;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(12582961);
                    o54.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, (jt1) obj, iS, this.A);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final mh4 mh4Var, final wja wjaVar, final float f, final ox6 ox6Var, final jl9 jl9Var, final long j, final long j2, final e54 e54Var, final ci4 ci4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        jl9 jl9Var2;
        ci4 ci4Var2;
        int i4;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(121669932);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(wjaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.g(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.g(56.0f) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            jl9Var2 = jl9Var;
            i3 |= bj4VarO.J(jl9Var2) ? 131072 : 65536;
        } else {
            jl9Var2 = jl9Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= bj4VarO.i(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bj4VarO.i(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= bj4VarO.J(e54Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= bj4VarO.J(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            ci4Var2 = ci4Var;
            i4 = i2 | (bj4VarO.j(ci4Var2) ? 4 : 2);
        } else {
            ci4Var2 = ci4Var;
            i4 = i2;
        }
        int i5 = i3;
        boolean z = true;
        if (bj4VarO.A(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            bj4VarO.K(-282833393);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new i27();
                bj4VarO.C(objF);
            }
            h27 h27Var = (h27) objF;
            bj4VarO.U(false);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new e7(2);
                bj4VarO.C(objF2);
            }
            ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF2);
            float f2 = e54Var.a;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean zJ = bj4VarO.J(h27Var);
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a) {
                objF3 = new h54(e54Var.a, e54Var.b, e54Var.d, e54Var.c);
                bj4VarO.C(objF3);
            }
            h54 h54Var = (h54) objF3;
            boolean zJ2 = bj4VarO.j(h54Var);
            if (((i7 ^ 48) <= 32 || !bj4VarO.J(e54Var)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean z2 = zJ2 | z;
            Object objF4 = bj4VarO.f();
            if (z2 || objF4 == c0187a) {
                objF4 = new b54(h54Var, e54Var, null);
                bj4VarO.C(objF4);
            }
            wd3.d(bj4VarO, (ci4) objF4, e54Var);
            boolean zJ3 = bj4VarO.J(h27Var) | bj4VarO.j(h54Var);
            Object objF5 = bj4VarO.f();
            if (zJ3 || objF5 == c0187a) {
                objF5 = new d54(h27Var, h54Var, null);
                bj4VarO.C(objF5);
            }
            wd3.d(bj4VarO, (ci4) objF5, h27Var);
            int i8 = i5 >> 6;
            bj4Var = bj4VarO;
            v5a.c(mh4Var, ox6VarB, false, jl9Var2, j, j2, f2, ((y43) h54Var.e.c.u.getValue()).t, null, h27Var, gr1.b(-1779603465, new n54(j2, wjaVar, f, ci4Var2), bj4VarO), bj4Var, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: l54
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    o54.b(mh4Var, wjaVar, f, ox6Var, jl9Var, j, j2, e54Var, ci4Var, (jt1) obj, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }
}

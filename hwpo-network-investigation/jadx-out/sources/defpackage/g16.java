package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g16 {
    public static final void a(final c26 c26Var, final ru5 ru5Var, final ox6 ox6Var, final ko7 ko7Var, final g44 g44Var, final boolean z, final in7 in7Var, final float f, final float f2, final oh4 oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        bj4 bj4Var;
        boolean z2;
        jt1.a.C0187a c0187a;
        c26 c26Var2;
        ox6 ox6VarA;
        bj4 bj4VarO = jt1Var.o(-1904835166);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(c26Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.h(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bj4VarO.J(ru5Var) : bj4VarO.j(ru5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.J(ko7Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bj4VarO.c(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bj4VarO.J(g44Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bj4VarO.c(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bj4VarO.J(in7Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bj4VarO.g(f) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.g(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            int i6 = i5 & 14;
            int i7 = (i4 & 112) | i6;
            h37 h37VarJ = bl7.j(oh4Var, bj4VarO);
            int i8 = i4;
            boolean z3 = (((i7 & 14) ^ 6) > 4 && bj4VarO.J(c26Var)) || (i7 & 6) == 4;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            if (z3 || objF == c0187a2) {
                pl2 pl2Var = new pl2(1, h37VarJ);
                jl8 jl8Var = jl8.u;
                final my2 my2VarG = bl7.g(pl2Var, jl8Var);
                objF = new c16(bl7.g(new mh4() { // from class: b16
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        v06 v06Var = (v06) my2VarG.getValue();
                        c26 c26Var3 = c26Var;
                        return new a16(c26Var3, v06Var, new u87((fg5) c26Var3.c.h.getValue(), v06Var));
                    }
                }, jl8Var), yz9.class, "value", "getValue()Ljava/lang/Object;", 0);
                bj4VarO.C(objF);
            }
            eo5 eo5Var = (eo5) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a2) {
                c33 c33Var = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var = (t72) objF2;
            jo4 jo4Var = (jo4) bj4VarO.F(qu1.g);
            int i9 = i5 >> 6;
            int i10 = i5 >> 12;
            int i11 = (i9 & 7168) | (i9 & 896) | i6 | ((i5 << 9) & 57344) | (i10 & 458752) | ((i8 << 18) & 3670016) | ((i5 << 18) & 234881024);
            boolean zJ = ((((i11 & 896) ^ 384) > 256 && bj4VarO.J(ko7Var)) || (i11 & 384) == 256) | ((((i11 & 14) ^ 6) > 4 && bj4VarO.J(c26Var)) || (i11 & 6) == 4) | bj4VarO.J(eo5Var) | ((((i11 & 7168) ^ 3072) > 2048 && bj4VarO.c(false)) || (i11 & 3072) == 2048) | ((((i11 & 57344) ^ 24576) > 16384 && bj4VarO.h(0)) || (i11 & 24576) == 16384) | ((((i11 & 458752) ^ 196608) > 131072 && bj4VarO.g(f)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && bj4VarO.g(f2)) || (i11 & 1572864) == 1048576) | ((((i11 & 234881024) ^ 100663296) > 67108864 && bj4VarO.J(ru5Var)) || (i11 & 100663296) == 67108864) | bj4VarO.J(jo4Var);
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a2) {
                z2 = true;
                c0187a = c0187a2;
                c26Var2 = c26Var;
                o16 o16Var = new o16(c26Var2, ru5Var, eo5Var, ko7Var, f, t72Var, jo4Var);
                bj4VarO.C(o16Var);
                objF3 = o16Var;
            } else {
                c26Var2 = c26Var;
                c0187a = c0187a2;
                z2 = true;
            }
            rw5 rw5Var = (rw5) objF3;
            int i12 = (i10 & 112) | i6;
            boolean z4 = (((((i12 & 112) ^ 48) <= 32 || !bj4VarO.c(false)) && (i12 & 48) != 32) ? false : z2) | (((((i12 & 14) ^ 6) <= 4 || !bj4VarO.J(c26Var2)) && (i12 & 6) != 4) ? false : z2);
            Object objF4 = bj4VarO.f();
            if (z4 || objF4 == c0187a) {
                objF4 = new v16(c26Var2);
                bj4VarO.C(objF4);
            }
            v16 v16Var = (v16) objF4;
            fl7 fl7Var = fl7.t;
            if (z) {
                bj4VarO.K(-1834596342);
                boolean z5 = (((i6 ^ 6) <= 4 || !bj4VarO.J(c26Var2)) && (i5 & 6) != 4) ? false : z2;
                Object objF5 = bj4VarO.f();
                if (z5 || objF5 == c0187a) {
                    objF5 = new q06(c26Var2);
                    bj4VarO.C(objF5);
                }
                ox6VarA = mv5.a((q06) objF5, c26Var2.k, fl7Var);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1834291488);
                bj4VarO.U(false);
                ox6VarA = ox6.a.t;
            }
            bj4Var = bj4VarO;
            qw5.a(eo5Var, z69.k(wx5.c(ox6Var.H(c26Var2.i).H(c26Var2.j), eo5Var, v16Var, fl7Var, z).H(ox6VarA).H(c26Var2.t.k), c26Var2, fl7Var, in7Var, z, g44Var, c26Var2.r, null), c26Var2.m, rw5Var, bj4Var, 0);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f16
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g16.a(c26Var, ru5Var, ox6Var, ko7Var, g44Var, z, in7Var, f, f2, oh4Var, (jt1) obj, gz3.s(i | 1), gz3.s(i2));
                    return g2b.a;
                }
            };
        }
    }
}

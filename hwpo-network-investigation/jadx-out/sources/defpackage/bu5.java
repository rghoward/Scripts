package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bu5 {
    /* JADX WARN: Code duplicated, block: B:177:0x026e  */
    public static final void a(final ox6 ox6Var, final zu5 zu5Var, final ou5 ou5Var, final go7 go7Var, final g44 g44Var, final boolean z, final in7 in7Var, final c30.l lVar, final c30.e eVar, final oh4 oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        int i4;
        final zu5 zu5Var2;
        bj4 bj4Var;
        boolean z2;
        zu5 zu5Var3;
        boolean z3;
        boolean z4;
        eo5 eo5Var;
        ox6 ox6VarA;
        bj4 bj4VarO = jt1Var.o(708740370);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(zu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bj4VarO.J(ou5Var) : bj4VarO.j(ou5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(go7Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.c(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bj4VarO.c(true) ? 131072 : 65536;
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
            i3 |= bj4VarO.J(lVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.J(eVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            h37 h37VarJ = bl7.j(oh4Var, bj4VarO);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && bj4VarO.J(zu5Var)) || (i7 & 6) == 4;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z5 || objF == c0187a) {
                pt5 pt5Var = new pt5(0, h37VarJ);
                jl8 jl8Var = jl8.u;
                final my2 my2VarG = bl7.g(pt5Var, jl8Var);
                objF = new rt5(bl7.g(new mh4() { // from class: qt5
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        jt5 jt5Var = (jt5) my2VarG.getValue();
                        zu5 zu5Var4 = zu5Var;
                        return new ot5(zu5Var4, jt5Var, new u87((fg5) zu5Var4.d.e.getValue(), jt5Var));
                    }
                }, jl8Var), yz9.class, "value", "getValue()Ljava/lang/Object;", 0);
                bj4VarO.C(objF);
            }
            eo5 eo5Var2 = (eo5) objF;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && bj4VarO.J(zu5Var)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && bj4VarO.c(false)) || (i9 & 48) == 32);
            Object objF2 = bj4VarO.f();
            if (z6 || objF2 == c0187a) {
                objF2 = new o06(zu5Var);
                bj4VarO.C(objF2);
            }
            o06 o06Var = (o06) objF2;
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                c33 c33Var = wd3.a;
                objF3 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var = (t72) objF3;
            jo4 jo4Var = (jo4) bj4VarO.F(qu1.g);
            e1a.a.C0074a c0074a = !((Boolean) bj4VarO.F(qu1.w)).booleanValue() ? e1a.a.a : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && bj4VarO.J(ou5Var)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && bj4VarO.J(zu5Var)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && bj4VarO.J(go7Var)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) > 16384 && bj4VarO.c(false)) {
                z2 = true;
            } else if ((i10 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zJ = z7 | z2 | ((((458752 & i10) ^ 196608) > 131072 && bj4VarO.c(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) > 1048576 && bj4VarO.J(eVar)) || (i10 & 1572864) == 1048576) | ((((i10 & 29360128) ^ 12582912) > 8388608 && bj4VarO.J(lVar)) || (i10 & 12582912) == 8388608) | bj4VarO.J(jo4Var);
            Object objF4 = bj4VarO.f();
            if (zJ || objF4 == c0187a) {
                zu5Var3 = zu5Var;
                z3 = false;
                z4 = true;
                au5 au5Var = new au5(zu5Var3, go7Var, eo5Var2, ou5Var, lVar, eVar, t72Var, jo4Var, c0074a);
                eo5Var = eo5Var2;
                bj4VarO.C(au5Var);
                objF4 = au5Var;
            } else {
                zu5Var3 = zu5Var;
                eo5Var = eo5Var2;
                z3 = false;
                z4 = true;
            }
            rw5 rw5Var = (rw5) objF4;
            fl7 fl7Var = fl7.t;
            if (z) {
                bj4VarO.K(27281635);
                if (((i6 ^ 6) <= 4 || !bj4VarO.J(zu5Var3)) && (i5 & 6) != 4) {
                    z4 = z3;
                }
                Object objF5 = bj4VarO.f();
                if (z4 || objF5 == c0187a) {
                    objF5 = new dt5(zu5Var3);
                    bj4VarO.C(objF5);
                }
                ox6VarA = mv5.a((dt5) objF5, zu5Var3.n, fl7Var);
                bj4VarO.U(z3);
            } else {
                bj4VarO.K(27577840);
                bj4VarO.U(z3);
                ox6VarA = ox6.a.t;
            }
            ox6 ox6VarK = z69.k(wx5.c(ox6Var.H(zu5Var3.k).H(zu5Var3.l), eo5Var, o06Var, fl7Var, z).H(ox6VarA).H(zu5Var3.m.k), zu5Var3, fl7Var, in7Var, z, g44Var, zu5Var3.f, null);
            zu5Var2 = zu5Var3;
            bj4Var = bj4VarO;
            qw5.a(eo5Var, ox6VarK, zu5Var2.o, rw5Var, bj4Var, 0);
        } else {
            zu5Var2 = zu5Var;
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vt5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bu5.a(ox6Var, zu5Var2, ou5Var, go7Var, g44Var, z, in7Var, lVar, eVar, oh4Var, (jt1) obj, gz3.s(i | 1), gz3.s(i2));
                    return g2b.a;
                }
            };
        }
    }
}

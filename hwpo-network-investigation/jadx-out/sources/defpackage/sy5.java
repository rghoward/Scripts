package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sy5 {
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:171:0x0260  */
    /* JADX WARN: Code duplicated, block: B:174:0x0270  */
    /* JADX WARN: Code duplicated, block: B:177:0x0294  */
    /* JADX WARN: Code duplicated, block: B:245:0x038f  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:252:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:268:0x040d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0456  */
    /* JADX WARN: Code duplicated, block: B:273:0x0467  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x016c, please report this as an issue */
    public static final void a(final ox6 ox6Var, nz5 nz5Var, final go7 go7Var, final boolean z, final g44 g44Var, final boolean z2, final in7 in7Var, di.b bVar, c30.l lVar, di.c cVar, c30.e eVar, final oh4 oh4Var, jt1 jt1Var, final int i, final int i2, final int i3) {
        int i4;
        di.b bVar2;
        int i5;
        boolean z3;
        bj4 bj4Var;
        final c30.l lVar2;
        final di.c cVar2;
        final c30.e eVar2;
        final di.b bVar3;
        xj8 xj8VarW;
        int i6;
        c30.l lVar3;
        di.c cVar3;
        c30.e eVar3;
        di.c cVar4;
        int i7;
        final h37 h37VarJ;
        boolean z4;
        Object objF;
        jt1.a.C0187a c0187a;
        eo5 eo5Var;
        boolean z5;
        Object objF2;
        Object objF3;
        t72 t72Var;
        jo4 jo4Var;
        e1a.a.C0074a c0074a;
        boolean zH;
        Object objF4;
        bj4 bj4Var2;
        int i8;
        eo5 eo5Var2;
        c30.l lVar4;
        fl7 fl7Var;
        fl7 fl7Var2;
        ox6 ox6VarA;
        boolean zH2;
        Object objF5;
        final nz5 nz5Var2 = nz5Var;
        bj4 bj4VarO = jt1Var.o(924924659);
        if ((i & 6) == 0) {
            i4 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bj4VarO.J(nz5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bj4VarO.J(go7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bj4VarO.c(false) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bj4VarO.c(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= bj4VarO.J(g44Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bj4VarO.c(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bj4VarO.J(in7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i & 805306368) == 0) {
                i4 |= bj4VarO.J(bVar2) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (bj4VarO.J(lVar) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= bj4VarO.J(cVar) ? 32 : 16;
        }
        int i12 = i5;
        int i13 = i3 & 4096;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                i12 |= bj4VarO.J(eVar) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i12 |= bj4VarO.j(oh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bj4VarO.A(i4 & 1, z3)) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    i6 = i4 & (-234881025);
                    if (i9 != 0) {
                        bVar2 = null;
                    }
                    if (i10 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if (i11 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i13 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                    cVar4 = cVar3;
                } else {
                    bj4VarO.u();
                    i6 = i4 & (-234881025);
                    lVar3 = lVar;
                    i12 = i12;
                    bVar2 = bVar2;
                    cVar4 = cVar;
                    eVar3 = eVar;
                }
                bj4VarO.V();
                i7 = i6 >> 3;
                int i14 = i7 & 14;
                int i15 = i14 | ((i12 >> 6) & 112);
                int i16 = i6;
                h37VarJ = bl7.j(oh4Var, bj4VarO);
                int i17 = i12;
                z4 = (((i15 & 14) ^ 6) <= 4 && bj4VarO.J(nz5Var2)) || (i15 & 6) == 4;
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (z4 || objF == c0187a) {
                    final gv5 gv5Var = new gv5();
                    gv5Var.a = new bt7(Integer.MAX_VALUE);
                    gv5Var.b = new bt7(Integer.MAX_VALUE);
                    mh4 mh4Var = new mh4() { // from class: my5
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new gy5((oh4) h37VarJ.getValue());
                        }
                    };
                    jl8 jl8Var = jl8.u;
                    final my2 my2VarG = bl7.g(mh4Var, jl8Var);
                    objF = new oy5(bl7.g(new mh4() { // from class: ny5
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            gy5 gy5Var = (gy5) my2VarG.getValue();
                            nz5 nz5Var3 = nz5Var2;
                            return new ly5(nz5Var3, gy5Var, gv5Var, new u87((fg5) nz5Var3.e.e.getValue(), gy5Var));
                        }
                    }, jl8Var), yz9.class, "value", "getValue()Ljava/lang/Object;", 0);
                    bj4VarO.C(objF);
                }
                eo5Var = (eo5) objF;
                int i18 = i16 >> 9;
                int i19 = i14 | (i18 & 112);
                z5 = ((((i19 & 112) ^ 48) <= 32 && bj4VarO.c(z)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) <= 4 && bj4VarO.J(nz5Var2)) || (i19 & 6) == 4);
                objF2 = bj4VarO.f();
                if (z5 || objF2 == c0187a) {
                    objF2 = new vx5(nz5Var2, z);
                    bj4VarO.C(objF2);
                }
                sx5 sx5Var = (sx5) objF2;
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    c33 c33Var = wd3.a;
                    objF3 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF3;
                jo4Var = (jo4) bj4VarO.F(qu1.g);
                c0074a = ((Boolean) bj4VarO.F(qu1.w)).booleanValue() ? null : e1a.a.a;
                int i20 = i17 << 18;
                int i21 = (i16 & 65520) | (i18 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | ((i17 << 27) & 1879048192);
                zH = ((((i21 & 896) ^ 384) <= 256 && bj4VarO.J(go7Var)) || (i21 & 384) == 256) | ((((i21 & 112) ^ 48) <= 32 && bj4VarO.J(nz5Var2)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) <= 2048 && bj4VarO.c(false)) || (i21 & 3072) == 2048) | ((((57344 & i21) ^ 24576) <= 16384 && bj4VarO.c(z)) || (i21 & 24576) == 16384) | bj4VarO.h(0) | ((((i21 & 3670016) ^ 1572864) <= 1048576 && bj4VarO.J(bVar2)) || (i21 & 1572864) == 1048576) | ((((i21 & 29360128) ^ 12582912) <= 8388608 && bj4VarO.J(cVar4)) || (i21 & 12582912) == 8388608) | ((((i21 & 234881024) ^ 100663296) <= 67108864 && bj4VarO.J(eVar3)) || (i21 & 100663296) == 67108864) | ((((i21 & 1879048192) ^ 805306368) <= 536870912 && bj4VarO.J(lVar3)) || (i21 & 805306368) == 536870912) | bj4VarO.J(jo4Var) | bj4VarO.J(c0074a);
                objF4 = bj4VarO.f();
                if (!zH || objF4 == c0187a) {
                    nz5Var2 = nz5Var;
                    bj4Var2 = bj4VarO;
                    i8 = 4;
                    c30.l lVar5 = lVar3;
                    ry5 ry5Var = new ry5(nz5Var2, z, go7Var, eo5Var, lVar5, eVar3, t72Var, jo4Var, c0074a, bVar2, cVar4);
                    eo5Var2 = eo5Var;
                    lVar4 = lVar5;
                    bj4Var2.C(ry5Var);
                    objF4 = ry5Var;
                } else {
                    nz5Var2 = nz5Var;
                    eo5Var2 = eo5Var;
                    lVar4 = lVar3;
                    bj4Var2 = bj4VarO;
                    i8 = 4;
                }
                rw5 rw5Var = (rw5) objF4;
                if (z) {
                    fl7Var = fl7.t;
                } else {
                    fl7Var = fl7.u;
                }
                fl7Var2 = fl7Var;
                if (z2) {
                    bj4Var2.K(-2077147368);
                    zH2 = ((((i7 & 14) ^ 6) <= i8 && bj4Var2.J(nz5Var2)) || (i7 & 6) == i8) | bj4Var2.h(0);
                    objF5 = bj4Var2.f();
                    if (zH2 || objF5 == c0187a) {
                        objF5 = new cy5(nz5Var2);
                        bj4Var2.C(objF5);
                    }
                    ox6VarA = mv5.a((cy5) objF5, nz5Var2.p, fl7Var2);
                    bj4Var2.U(false);
                } else {
                    bj4Var2.K(-2076718545);
                    bj4Var2.U(false);
                    ox6VarA = ox6.a.t;
                }
                bj4Var = bj4Var2;
                qw5.a(eo5Var2, z69.k(wx5.c(ox6Var.H(nz5Var2.m).H(nz5Var2.n), eo5Var2, sx5Var, fl7Var2, z2).H(ox6VarA).H(nz5Var2.o.k), nz5Var2, fl7Var2, in7Var, z2, g44Var, nz5Var2.g, null), nz5Var2.q, rw5Var, bj4Var, 0);
                bVar3 = bVar2;
                cVar2 = cVar4;
                eVar2 = eVar3;
                lVar2 = lVar4;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                lVar2 = lVar;
                cVar2 = cVar;
                eVar2 = eVar;
                bVar3 = bVar2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final nz5 nz5Var3 = nz5Var2;
                xj8VarW.d = new ci4() { // from class: py5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iS = gz3.s(i | 1);
                        int iS2 = gz3.s(i2);
                        sy5.a(ox6Var, nz5Var3, go7Var, z, g44Var, z2, in7Var, bVar3, lVar2, cVar2, eVar2, oh4Var, (jt1) obj, iS, iS2, i3);
                        return g2b.a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i2 & 3072) == 0) {
            i12 |= bj4VarO.j(oh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bj4VarO.A(i4 & 1, z3)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                i6 = i4 & (-234881025);
                if (i9 != 0) {
                    bVar2 = null;
                }
                if (i10 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if (i11 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                if (i13 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                cVar4 = cVar3;
            } else {
                i6 = i4 & (-234881025);
                if (i9 != 0) {
                    bVar2 = null;
                }
                if (i10 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if (i11 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                if (i13 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
                cVar4 = cVar3;
            }
            bj4VarO.V();
            i7 = i6 >> 3;
            int i110 = i7 & 14;
            int i111 = i110 | ((i12 >> 6) & 112);
            int i112 = i6;
            h37VarJ = bl7.j(oh4Var, bj4VarO);
            int i113 = i12;
            if (((i111 & 14) ^ 6) <= 4) {
            }
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (z4) {
                final gv5 gv5Var2 = new gv5();
                gv5Var2.a = new bt7(Integer.MAX_VALUE);
                gv5Var2.b = new bt7(Integer.MAX_VALUE);
                mh4 mh4Var2 = new mh4() { // from class: my5
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new gy5((oh4) h37VarJ.getValue());
                    }
                };
                jl8 jl8Var2 = jl8.u;
                final my2 my2VarG2 = bl7.g(mh4Var2, jl8Var2);
                objF = new oy5(bl7.g(new mh4() { // from class: ny5
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        gy5 gy5Var = (gy5) my2VarG2.getValue();
                        nz5 nz5Var4 = nz5Var2;
                        return new ly5(nz5Var4, gy5Var, gv5Var2, new u87((fg5) nz5Var4.e.e.getValue(), gy5Var));
                    }
                }, jl8Var2), yz9.class, "value", "getValue()Ljava/lang/Object;", 0);
                bj4VarO.C(objF);
            } else {
                final gv5 gv5Var3 = new gv5();
                gv5Var3.a = new bt7(Integer.MAX_VALUE);
                gv5Var3.b = new bt7(Integer.MAX_VALUE);
                mh4 mh4Var3 = new mh4() { // from class: my5
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new gy5((oh4) h37VarJ.getValue());
                    }
                };
                jl8 jl8Var3 = jl8.u;
                final my2 my2VarG3 = bl7.g(mh4Var3, jl8Var3);
                objF = new oy5(bl7.g(new mh4() { // from class: ny5
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        gy5 gy5Var = (gy5) my2VarG3.getValue();
                        nz5 nz5Var4 = nz5Var2;
                        return new ly5(nz5Var4, gy5Var, gv5Var3, new u87((fg5) nz5Var4.e.e.getValue(), gy5Var));
                    }
                }, jl8Var3), yz9.class, "value", "getValue()Ljava/lang/Object;", 0);
                bj4VarO.C(objF);
            }
            eo5Var = (eo5) objF;
            int i114 = i112 >> 9;
            int i115 = i110 | (i114 & 112);
            z5 = ((((i115 & 112) ^ 48) <= 32 && bj4VarO.c(z)) || (i115 & 48) == 32) | ((((i115 & 14) ^ 6) <= 4 && bj4VarO.J(nz5Var2)) || (i115 & 6) == 4);
            objF2 = bj4VarO.f();
            if (z5) {
                objF2 = new vx5(nz5Var2, z);
                bj4VarO.C(objF2);
            } else {
                objF2 = new vx5(nz5Var2, z);
                bj4VarO.C(objF2);
            }
            sx5 sx5Var2 = (sx5) objF2;
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                c33 c33Var2 = wd3.a;
                objF3 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF3;
            jo4Var = (jo4) bj4VarO.F(qu1.g);
            c0074a = ((Boolean) bj4VarO.F(qu1.w)).booleanValue() ? null : e1a.a.a;
            int i22 = i113 << 18;
            int i23 = (i112 & 65520) | (i114 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i113 << 27) & 1879048192);
            if (((i23 & 112) ^ 48) <= 32) {
            }
            zH = ((((i23 & 896) ^ 384) <= 256 && bj4VarO.J(go7Var)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) <= 32 && bj4VarO.J(nz5Var2)) || (i23 & 48) == 32) | ((((i23 & 7168) ^ 3072) <= 2048 && bj4VarO.c(false)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) <= 16384 && bj4VarO.c(z)) || (i23 & 24576) == 16384) | bj4VarO.h(0) | ((((i23 & 3670016) ^ 1572864) <= 1048576 && bj4VarO.J(bVar2)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) <= 8388608 && bj4VarO.J(cVar4)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) <= 67108864 && bj4VarO.J(eVar3)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && bj4VarO.J(lVar3)) || (i23 & 805306368) == 536870912) | bj4VarO.J(jo4Var) | bj4VarO.J(c0074a);
            objF4 = bj4VarO.f();
            if (zH) {
                nz5Var2 = nz5Var;
                bj4Var2 = bj4VarO;
                i8 = 4;
                c30.l lVar6 = lVar3;
                ry5 ry5Var2 = new ry5(nz5Var2, z, go7Var, eo5Var, lVar6, eVar3, t72Var, jo4Var, c0074a, bVar2, cVar4);
                eo5Var2 = eo5Var;
                lVar4 = lVar6;
                bj4Var2.C(ry5Var2);
                objF4 = ry5Var2;
            } else {
                nz5Var2 = nz5Var;
                bj4Var2 = bj4VarO;
                i8 = 4;
                c30.l lVar7 = lVar3;
                ry5 ry5Var3 = new ry5(nz5Var2, z, go7Var, eo5Var, lVar7, eVar3, t72Var, jo4Var, c0074a, bVar2, cVar4);
                eo5Var2 = eo5Var;
                lVar4 = lVar7;
                bj4Var2.C(ry5Var3);
                objF4 = ry5Var3;
            }
            rw5 rw5Var2 = (rw5) objF4;
            if (z) {
                fl7Var = fl7.t;
            } else {
                fl7Var = fl7.u;
            }
            fl7Var2 = fl7Var;
            if (z2) {
                bj4Var2.K(-2077147368);
                zH2 = ((((i7 & 14) ^ 6) <= i8 && bj4Var2.J(nz5Var2)) || (i7 & 6) == i8) | bj4Var2.h(0);
                objF5 = bj4Var2.f();
                if (zH2) {
                    objF5 = new cy5(nz5Var2);
                    bj4Var2.C(objF5);
                } else {
                    objF5 = new cy5(nz5Var2);
                    bj4Var2.C(objF5);
                }
                ox6VarA = mv5.a((cy5) objF5, nz5Var2.p, fl7Var2);
                bj4Var2.U(false);
            } else {
                bj4Var2.K(-2076718545);
                bj4Var2.U(false);
                ox6VarA = ox6.a.t;
            }
            bj4Var = bj4Var2;
            qw5.a(eo5Var2, z69.k(wx5.c(ox6Var.H(nz5Var2.m).H(nz5Var2.n), eo5Var2, sx5Var2, fl7Var2, z2).H(ox6VarA).H(nz5Var2.o.k), nz5Var2, fl7Var2, in7Var, z2, g44Var, nz5Var2.g, null), nz5Var2.q, rw5Var2, bj4Var, 0);
            bVar3 = bVar2;
            cVar2 = cVar4;
            eVar2 = eVar3;
            lVar2 = lVar4;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            lVar2 = lVar;
            cVar2 = cVar;
            eVar2 = eVar;
            bVar3 = bVar2;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final nz5 nz5Var4 = nz5Var2;
            xj8VarW.d = new ci4() { // from class: py5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    int iS2 = gz3.s(i2);
                    sy5.a(ox6Var, nz5Var4, go7Var, z, g44Var, z2, in7Var, bVar3, lVar2, cVar2, eVar2, oh4Var, (jt1) obj, iS, iS2, i3);
                    return g2b.a;
                }
            };
        }
    }
}

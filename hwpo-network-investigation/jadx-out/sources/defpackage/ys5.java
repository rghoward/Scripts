package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys5 {
    /* JADX WARN: Code duplicated, block: B:100:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    public static final void a(ox6 ox6Var, nz5 nz5Var, go7 go7Var, c30.l lVar, di.b bVar, g44 g44Var, boolean z, in7 in7Var, final oh4 oh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        nz5 nz5VarA;
        go7 ko7Var;
        int i4;
        c30.l lVar2;
        int i5;
        di.b bVar2;
        int i6;
        int i7;
        oh4 oh4Var2;
        boolean z2;
        bj4 bj4Var;
        final in7 in7Var2;
        final ox6 ox6Var3;
        final nz5 nz5Var2;
        final go7 go7Var2;
        final c30.l lVar3;
        final di.b bVar3;
        final g44 g44Var2;
        final boolean z3;
        xj8 xj8VarW;
        ox6 ox6Var4;
        an2 an2VarA;
        boolean zJ;
        Object objF;
        in7 in7VarA;
        di.b bVar4;
        boolean z4;
        ox6 ox6Var5;
        g44 g44Var3;
        int i8;
        int i9;
        bj4 bj4VarO = jt1Var.o(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                nz5VarA = nz5Var;
                int i11 = bj4VarO.J(nz5VarA) ? 32 : 16;
                i3 |= i11;
            } else {
                nz5VarA = nz5Var;
            }
            i3 |= i11;
        } else {
            nz5VarA = nz5Var;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                ko7Var = go7Var;
                i3 |= bj4VarO.J(ko7Var) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.c(false)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    lVar2 = lVar;
                    int i13 = bj4VarO.J(lVar2) ? 16384 : 8192;
                    i3 |= i13;
                } else {
                    lVar2 = lVar;
                }
                i3 |= i13;
            } else {
                lVar2 = lVar;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    bVar2 = bVar;
                    if (bj4VarO.J(bVar2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i3 |= 524288;
                }
                i7 = 12582912 | i3;
                if ((100663296 & i) == 0) {
                    i7 = 46137344 | i3;
                }
                if ((805306368 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                } else {
                    oh4Var2 = oh4Var;
                }
                if ((306783379 & i7) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i7 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i10 != 0) {
                            ox6Var4 = ox6.a.t;
                        } else {
                            ox6Var4 = ox6Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        }
                        if (i12 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i7 &= -57345;
                            lVar2 = c30.c;
                        }
                        if (i5 != 0) {
                            bVar2 = di.a.m;
                        }
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ || objF == jt1.a.a) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        in7VarA = kn7.a(bj4VarO);
                        bVar4 = bVar2;
                        z4 = true;
                        ox6Var5 = ox6Var4;
                        g44Var3 = (fr2) objF;
                        i8 = i7 & (-238551041);
                    } else {
                        bj4VarO.u();
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i7 &= -57345;
                        }
                        i8 = i7 & (-238551041);
                        g44Var3 = g44Var;
                        z4 = z;
                        in7VarA = in7Var;
                        bVar4 = bVar2;
                        ox6Var5 = ox6Var2;
                    }
                    nz5 nz5Var3 = nz5VarA;
                    go7 go7Var3 = ko7Var;
                    c30.l lVar4 = lVar2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var5, nz5Var3, go7Var3, true, g44Var3, z4, in7VarA, bVar4, lVar4, null, null, oh4Var2, bj4Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                    ox6Var3 = ox6Var5;
                    nz5Var2 = nz5Var3;
                    go7Var2 = go7Var3;
                    g44Var2 = g44Var3;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    bVar3 = bVar4;
                    lVar3 = lVar4;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    in7Var2 = in7Var;
                    ox6Var3 = ox6Var2;
                    nz5Var2 = nz5VarA;
                    go7Var2 = ko7Var;
                    lVar3 = lVar2;
                    bVar3 = bVar2;
                    g44Var2 = g44Var;
                    z3 = z;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ws5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.a(ox6Var3, nz5Var2, go7Var2, lVar3, bVar3, g44Var2, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            bVar2 = bVar;
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            i7 = 12582912 | i3;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i3;
            }
            if ((805306368 & i) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            } else {
                oh4Var2 = oh4Var;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i7 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    }
                    if (i12 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                        lVar2 = c30.c;
                    }
                    if (i5 != 0) {
                        bVar2 = di.a.m;
                    }
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    in7VarA = kn7.a(bj4VarO);
                    bVar4 = bVar2;
                    z4 = true;
                    ox6Var5 = ox6Var4;
                    g44Var3 = (fr2) objF;
                    i8 = i7 & (-238551041);
                } else {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    }
                    if (i12 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                        lVar2 = c30.c;
                    }
                    if (i5 != 0) {
                        bVar2 = di.a.m;
                    }
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    in7VarA = kn7.a(bj4VarO);
                    bVar4 = bVar2;
                    z4 = true;
                    ox6Var5 = ox6Var4;
                    g44Var3 = (fr2) objF;
                    i8 = i7 & (-238551041);
                }
                nz5 nz5Var4 = nz5VarA;
                go7 go7Var4 = ko7Var;
                c30.l lVar5 = lVar2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var5, nz5Var4, go7Var4, true, g44Var3, z4, in7VarA, bVar4, lVar5, null, null, oh4Var2, bj4Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                ox6Var3 = ox6Var5;
                nz5Var2 = nz5Var4;
                go7Var2 = go7Var4;
                g44Var2 = g44Var3;
                z3 = z4;
                in7Var2 = in7VarA;
                bVar3 = bVar4;
                lVar3 = lVar5;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                in7Var2 = in7Var;
                ox6Var3 = ox6Var2;
                nz5Var2 = nz5VarA;
                go7Var2 = ko7Var;
                lVar3 = lVar2;
                bVar3 = bVar2;
                g44Var2 = g44Var;
                z3 = z;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ws5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.a(ox6Var3, nz5Var2, go7Var2, lVar3, bVar3, g44Var2, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 384;
        ko7Var = go7Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.c(false)) {
                i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                lVar2 = lVar;
                if (bj4VarO.J(lVar2)) {
                }
                i3 |= i13;
            } else {
                lVar2 = lVar;
            }
            i3 |= i13;
        } else {
            lVar2 = lVar;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                bVar2 = bVar;
                if (bj4VarO.J(bVar2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            i7 = 12582912 | i3;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i3;
            }
            if ((805306368 & i) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            } else {
                oh4Var2 = oh4Var;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i7 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    }
                    if (i12 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                        lVar2 = c30.c;
                    }
                    if (i5 != 0) {
                        bVar2 = di.a.m;
                    }
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    in7VarA = kn7.a(bj4VarO);
                    bVar4 = bVar2;
                    z4 = true;
                    ox6Var5 = ox6Var4;
                    g44Var3 = (fr2) objF;
                    i8 = i7 & (-238551041);
                } else {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    }
                    if (i12 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                        lVar2 = c30.c;
                    }
                    if (i5 != 0) {
                        bVar2 = di.a.m;
                    }
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    in7VarA = kn7.a(bj4VarO);
                    bVar4 = bVar2;
                    z4 = true;
                    ox6Var5 = ox6Var4;
                    g44Var3 = (fr2) objF;
                    i8 = i7 & (-238551041);
                }
                nz5 nz5Var5 = nz5VarA;
                go7 go7Var5 = ko7Var;
                c30.l lVar6 = lVar2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var5, nz5Var5, go7Var5, true, g44Var3, z4, in7VarA, bVar4, lVar6, null, null, oh4Var2, bj4Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                ox6Var3 = ox6Var5;
                nz5Var2 = nz5Var5;
                go7Var2 = go7Var5;
                g44Var2 = g44Var3;
                z3 = z4;
                in7Var2 = in7VarA;
                bVar3 = bVar4;
                lVar3 = lVar6;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                in7Var2 = in7Var;
                ox6Var3 = ox6Var2;
                nz5Var2 = nz5VarA;
                go7Var2 = ko7Var;
                lVar3 = lVar2;
                bVar3 = bVar2;
                g44Var2 = g44Var;
                z3 = z;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ws5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.a(ox6Var3, nz5Var2, go7Var2, lVar3, bVar3, g44Var2, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 196608;
        bVar2 = bVar;
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        i7 = 12582912 | i3;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i3;
        }
        if ((805306368 & i) == 0) {
            oh4Var2 = oh4Var;
            if (bj4VarO.j(oh4Var2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i7 |= i9;
        } else {
            oh4Var2 = oh4Var;
        }
        if ((306783379 & i7) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bj4VarO.A(i7 & 1, z2)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                }
                if (i12 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i7 &= -57345;
                    lVar2 = c30.c;
                }
                if (i5 != 0) {
                    bVar2 = di.a.m;
                }
                an2VarA = ky9.a(bj4VarO);
                zJ = bj4VarO.J(an2VarA);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new fr2(an2VarA);
                    bj4VarO.C(objF);
                } else {
                    objF = new fr2(an2VarA);
                    bj4VarO.C(objF);
                }
                in7VarA = kn7.a(bj4VarO);
                bVar4 = bVar2;
                z4 = true;
                ox6Var5 = ox6Var4;
                g44Var3 = (fr2) objF;
                i8 = i7 & (-238551041);
            } else {
                if (i10 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                }
                if (i12 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i7 &= -57345;
                    lVar2 = c30.c;
                }
                if (i5 != 0) {
                    bVar2 = di.a.m;
                }
                an2VarA = ky9.a(bj4VarO);
                zJ = bj4VarO.J(an2VarA);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new fr2(an2VarA);
                    bj4VarO.C(objF);
                } else {
                    objF = new fr2(an2VarA);
                    bj4VarO.C(objF);
                }
                in7VarA = kn7.a(bj4VarO);
                bVar4 = bVar2;
                z4 = true;
                ox6Var5 = ox6Var4;
                g44Var3 = (fr2) objF;
                i8 = i7 & (-238551041);
            }
            nz5 nz5Var6 = nz5VarA;
            go7 go7Var6 = ko7Var;
            c30.l lVar7 = lVar2;
            bj4VarO.V();
            bj4Var = bj4VarO;
            sy5.a(ox6Var5, nz5Var6, go7Var6, true, g44Var3, z4, in7VarA, bVar4, lVar7, null, null, oh4Var2, bj4Var, (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
            ox6Var3 = ox6Var5;
            nz5Var2 = nz5Var6;
            go7Var2 = go7Var6;
            g44Var2 = g44Var3;
            z3 = z4;
            in7Var2 = in7VarA;
            bVar3 = bVar4;
            lVar3 = lVar7;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            in7Var2 = in7Var;
            ox6Var3 = ox6Var2;
            nz5Var2 = nz5VarA;
            go7Var2 = ko7Var;
            lVar3 = lVar2;
            bVar3 = bVar2;
            g44Var2 = g44Var;
            z3 = z;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ws5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ys5.a(ox6Var3, nz5Var2, go7Var2, lVar3, bVar3, g44Var2, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:106:0x019d  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static final void b(final ox6 ox6Var, nz5 nz5Var, go7 go7Var, c30.e eVar, di.c cVar, g44 g44Var, boolean z, in7 in7Var, final oh4 oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final nz5 nz5VarA;
        int i4;
        int i5;
        go7 ko7Var;
        int i6;
        int i7;
        c30.e eVar2;
        int i8;
        di.c cVar2;
        int i9;
        g44 g44Var2;
        int i10;
        int i11;
        boolean z2;
        bj4 bj4Var;
        final go7 go7Var2;
        final c30.e eVar3;
        final di.c cVar3;
        final g44 g44Var3;
        final boolean z3;
        final in7 in7Var2;
        xj8 xj8VarW;
        int i12;
        in7 in7VarA;
        boolean z4;
        an2 an2VarA;
        boolean zJ;
        Object objF;
        bj4 bj4VarO = jt1Var.o(-1884325601);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            nz5VarA = nz5Var;
            int i13 = bj4VarO.J(nz5VarA) ? 32 : 16;
            i4 = i3 | i13;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    ko7Var = go7Var;
                    if (bj4VarO.J(ko7Var)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        eVar2 = eVar;
                        int i14 = bj4VarO.J(eVar2) ? 16384 : 8192;
                        i7 |= i14;
                    } else {
                        eVar2 = eVar;
                    }
                    i7 |= i14;
                } else {
                    eVar2 = eVar;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        cVar2 = cVar;
                        if (bj4VarO.J(cVar2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i7 |= i9;
                    }
                    if ((i2 & 64) == 0) {
                        g44Var2 = g44Var;
                        int i15 = bj4VarO.J(g44Var2) ? 1048576 : 524288;
                        int i16 = i7 | i15 | 46137344;
                        if (bj4VarO.j(oh4Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i11 = i16 | i10;
                        if ((306783379 & i11) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bj4VarO.A(i11 & 1, z2)) {
                            bj4VarO.v0();
                            if ((i & 1) != 0 || bj4VarO.c0()) {
                                if ((i2 & 2) != 0) {
                                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                    i11 &= -113;
                                }
                                if (i5 != 0) {
                                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                if ((i2 & 16) != 0) {
                                    i11 &= -57345;
                                    eVar2 = c30.a;
                                }
                                if (i8 != 0) {
                                    cVar2 = di.a.j;
                                }
                                if ((i2 & 64) != 0) {
                                    an2VarA = ky9.a(bj4VarO);
                                    zJ = bj4VarO.J(an2VarA);
                                    objF = bj4VarO.f();
                                    if (zJ || objF == jt1.a.a) {
                                        objF = new fr2(an2VarA);
                                        bj4VarO.C(objF);
                                    }
                                    i11 &= -3670017;
                                    g44Var2 = (fr2) objF;
                                }
                                i12 = i11 & (-234881025);
                                in7VarA = kn7.a(bj4VarO);
                                z4 = true;
                            } else {
                                bj4VarO.u();
                                if ((i2 & 2) != 0) {
                                    i11 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i11 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i11 &= -3670017;
                                }
                                i12 = i11 & (-234881025);
                                z4 = z;
                                in7VarA = in7Var;
                            }
                            nz5 nz5Var2 = nz5VarA;
                            go7 go7Var3 = ko7Var;
                            c30.e eVar4 = eVar2;
                            di.c cVar4 = cVar2;
                            g44 g44Var4 = g44Var2;
                            bj4VarO.V();
                            bj4Var = bj4VarO;
                            sy5.a(ox6Var, nz5Var2, go7Var3, false, g44Var4, z4, in7VarA, null, null, cVar4, eVar4, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                            nz5VarA = nz5Var2;
                            go7Var2 = go7Var3;
                            g44Var3 = g44Var4;
                            z3 = z4;
                            in7Var2 = in7VarA;
                            cVar3 = cVar4;
                            eVar3 = eVar4;
                        } else {
                            bj4Var = bj4VarO;
                            bj4Var.u();
                            go7Var2 = ko7Var;
                            eVar3 = eVar2;
                            cVar3 = cVar2;
                            g44Var3 = g44Var2;
                            z3 = z;
                            in7Var2 = in7Var;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: xs5
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                                    return g2b.a;
                                }
                            };
                        }
                    }
                    g44Var2 = g44Var;
                    int i17 = i7 | i15 | 46137344;
                    if (bj4VarO.j(oh4Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i11 = i17 | i10;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i11 & 1, z2)) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        } else {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        }
                        nz5 nz5Var3 = nz5VarA;
                        go7 go7Var4 = ko7Var;
                        c30.e eVar5 = eVar2;
                        di.c cVar5 = cVar2;
                        g44 g44Var5 = g44Var2;
                        bj4VarO.V();
                        bj4Var = bj4VarO;
                        sy5.a(ox6Var, nz5Var3, go7Var4, false, g44Var5, z4, in7VarA, null, null, cVar5, eVar5, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                        nz5VarA = nz5Var3;
                        go7Var2 = go7Var4;
                        g44Var3 = g44Var5;
                        z3 = z4;
                        in7Var2 = in7VarA;
                        cVar3 = cVar5;
                        eVar3 = eVar5;
                    } else {
                        bj4Var = bj4VarO;
                        bj4Var.u();
                        go7Var2 = ko7Var;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        g44Var3 = g44Var2;
                        z3 = z;
                        in7Var2 = in7Var;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: xs5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                cVar2 = cVar;
                if ((i2 & 64) == 0) {
                    g44Var2 = g44Var;
                    if (bj4VarO.J(g44Var2)) {
                    }
                    int i18 = i7 | i15 | 46137344;
                    if (bj4VarO.j(oh4Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i11 = i18 | i10;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i11 & 1, z2)) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        } else {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        }
                        nz5 nz5Var4 = nz5VarA;
                        go7 go7Var5 = ko7Var;
                        c30.e eVar6 = eVar2;
                        di.c cVar6 = cVar2;
                        g44 g44Var6 = g44Var2;
                        bj4VarO.V();
                        bj4Var = bj4VarO;
                        sy5.a(ox6Var, nz5Var4, go7Var5, false, g44Var6, z4, in7VarA, null, null, cVar6, eVar6, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                        nz5VarA = nz5Var4;
                        go7Var2 = go7Var5;
                        g44Var3 = g44Var6;
                        z3 = z4;
                        in7Var2 = in7VarA;
                        cVar3 = cVar6;
                        eVar3 = eVar6;
                    } else {
                        bj4Var = bj4VarO;
                        bj4Var.u();
                        go7Var2 = ko7Var;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        g44Var3 = g44Var2;
                        z3 = z;
                        in7Var2 = in7Var;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: xs5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                g44Var2 = g44Var;
                int i19 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i19 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var5 = nz5VarA;
                    go7 go7Var6 = ko7Var;
                    c30.e eVar7 = eVar2;
                    di.c cVar7 = cVar2;
                    g44 g44Var7 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var5, go7Var6, false, g44Var7, z4, in7VarA, null, null, cVar7, eVar7, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var5;
                    go7Var2 = go7Var6;
                    g44Var3 = g44Var7;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar7;
                    eVar3 = eVar7;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i4 |= 384;
            ko7Var = go7Var;
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (bj4VarO.J(eVar2)) {
                    }
                    i7 |= i14;
                } else {
                    eVar2 = eVar;
                }
                i7 |= i14;
            } else {
                eVar2 = eVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    cVar2 = cVar;
                    if (bj4VarO.J(cVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                if ((i2 & 64) == 0) {
                    g44Var2 = g44Var;
                    if (bj4VarO.J(g44Var2)) {
                    }
                    int i110 = i7 | i15 | 46137344;
                    if (bj4VarO.j(oh4Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i11 = i110 | i10;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i11 & 1, z2)) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        } else {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        }
                        nz5 nz5Var6 = nz5VarA;
                        go7 go7Var7 = ko7Var;
                        c30.e eVar8 = eVar2;
                        di.c cVar8 = cVar2;
                        g44 g44Var8 = g44Var2;
                        bj4VarO.V();
                        bj4Var = bj4VarO;
                        sy5.a(ox6Var, nz5Var6, go7Var7, false, g44Var8, z4, in7VarA, null, null, cVar8, eVar8, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                        nz5VarA = nz5Var6;
                        go7Var2 = go7Var7;
                        g44Var3 = g44Var8;
                        z3 = z4;
                        in7Var2 = in7VarA;
                        cVar3 = cVar8;
                        eVar3 = eVar8;
                    } else {
                        bj4Var = bj4VarO;
                        bj4Var.u();
                        go7Var2 = ko7Var;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        g44Var3 = g44Var2;
                        z3 = z;
                        in7Var2 = in7Var;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: xs5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                g44Var2 = g44Var;
                int i111 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i111 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var7 = nz5VarA;
                    go7 go7Var8 = ko7Var;
                    c30.e eVar9 = eVar2;
                    di.c cVar9 = cVar2;
                    g44 g44Var9 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var7, go7Var8, false, g44Var9, z4, in7VarA, null, null, cVar9, eVar9, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var7;
                    go7Var2 = go7Var8;
                    g44Var3 = g44Var9;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar9;
                    eVar3 = eVar9;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            cVar2 = cVar;
            if ((i2 & 64) == 0) {
                g44Var2 = g44Var;
                if (bj4VarO.J(g44Var2)) {
                }
                int i112 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i112 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var8 = nz5VarA;
                    go7 go7Var9 = ko7Var;
                    c30.e eVar10 = eVar2;
                    di.c cVar10 = cVar2;
                    g44 g44Var10 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var8, go7Var9, false, g44Var10, z4, in7VarA, null, null, cVar10, eVar10, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var8;
                    go7Var2 = go7Var9;
                    g44Var3 = g44Var10;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar10;
                    eVar3 = eVar10;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            g44Var2 = g44Var;
            int i113 = i7 | i15 | 46137344;
            if (bj4VarO.j(oh4Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i113 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i11 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                }
                nz5 nz5Var9 = nz5VarA;
                go7 go7Var10 = ko7Var;
                c30.e eVar11 = eVar2;
                di.c cVar11 = cVar2;
                g44 g44Var11 = g44Var2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var, nz5Var9, go7Var10, false, g44Var11, z4, in7VarA, null, null, cVar11, eVar11, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                nz5VarA = nz5Var9;
                go7Var2 = go7Var10;
                g44Var3 = g44Var11;
                z3 = z4;
                in7Var2 = in7VarA;
                cVar3 = cVar11;
                eVar3 = eVar11;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                go7Var2 = ko7Var;
                eVar3 = eVar2;
                cVar3 = cVar2;
                g44Var3 = g44Var2;
                z3 = z;
                in7Var2 = in7Var;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xs5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        nz5VarA = nz5Var;
        i4 = i3 | i13;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                ko7Var = go7Var;
                if (bj4VarO.J(ko7Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (bj4VarO.J(eVar2)) {
                    }
                    i7 |= i14;
                } else {
                    eVar2 = eVar;
                }
                i7 |= i14;
            } else {
                eVar2 = eVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    cVar2 = cVar;
                    if (bj4VarO.J(cVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                if ((i2 & 64) == 0) {
                    g44Var2 = g44Var;
                    if (bj4VarO.J(g44Var2)) {
                    }
                    int i114 = i7 | i15 | 46137344;
                    if (bj4VarO.j(oh4Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i11 = i114 | i10;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i11 & 1, z2)) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        } else {
                            if ((i2 & 2) != 0) {
                                nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                                i11 &= -113;
                            }
                            if (i5 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                eVar2 = c30.a;
                            }
                            if (i8 != 0) {
                                cVar2 = di.a.j;
                            }
                            if ((i2 & 64) != 0) {
                                an2VarA = ky9.a(bj4VarO);
                                zJ = bj4VarO.J(an2VarA);
                                objF = bj4VarO.f();
                                if (zJ) {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                } else {
                                    objF = new fr2(an2VarA);
                                    bj4VarO.C(objF);
                                }
                                i11 &= -3670017;
                                g44Var2 = (fr2) objF;
                            }
                            i12 = i11 & (-234881025);
                            in7VarA = kn7.a(bj4VarO);
                            z4 = true;
                        }
                        nz5 nz5Var10 = nz5VarA;
                        go7 go7Var11 = ko7Var;
                        c30.e eVar12 = eVar2;
                        di.c cVar12 = cVar2;
                        g44 g44Var12 = g44Var2;
                        bj4VarO.V();
                        bj4Var = bj4VarO;
                        sy5.a(ox6Var, nz5Var10, go7Var11, false, g44Var12, z4, in7VarA, null, null, cVar12, eVar12, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                        nz5VarA = nz5Var10;
                        go7Var2 = go7Var11;
                        g44Var3 = g44Var12;
                        z3 = z4;
                        in7Var2 = in7VarA;
                        cVar3 = cVar12;
                        eVar3 = eVar12;
                    } else {
                        bj4Var = bj4VarO;
                        bj4Var.u();
                        go7Var2 = ko7Var;
                        eVar3 = eVar2;
                        cVar3 = cVar2;
                        g44Var3 = g44Var2;
                        z3 = z;
                        in7Var2 = in7Var;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: xs5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                g44Var2 = g44Var;
                int i115 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i115 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var11 = nz5VarA;
                    go7 go7Var12 = ko7Var;
                    c30.e eVar13 = eVar2;
                    di.c cVar13 = cVar2;
                    g44 g44Var13 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var11, go7Var12, false, g44Var13, z4, in7VarA, null, null, cVar13, eVar13, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var11;
                    go7Var2 = go7Var12;
                    g44Var3 = g44Var13;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar13;
                    eVar3 = eVar13;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            cVar2 = cVar;
            if ((i2 & 64) == 0) {
                g44Var2 = g44Var;
                if (bj4VarO.J(g44Var2)) {
                }
                int i116 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i116 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var12 = nz5VarA;
                    go7 go7Var13 = ko7Var;
                    c30.e eVar14 = eVar2;
                    di.c cVar14 = cVar2;
                    g44 g44Var14 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var12, go7Var13, false, g44Var14, z4, in7VarA, null, null, cVar14, eVar14, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var12;
                    go7Var2 = go7Var13;
                    g44Var3 = g44Var14;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar14;
                    eVar3 = eVar14;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            g44Var2 = g44Var;
            int i117 = i7 | i15 | 46137344;
            if (bj4VarO.j(oh4Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i117 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i11 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                }
                nz5 nz5Var13 = nz5VarA;
                go7 go7Var14 = ko7Var;
                c30.e eVar15 = eVar2;
                di.c cVar15 = cVar2;
                g44 g44Var15 = g44Var2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var, nz5Var13, go7Var14, false, g44Var15, z4, in7VarA, null, null, cVar15, eVar15, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                nz5VarA = nz5Var13;
                go7Var2 = go7Var14;
                g44Var3 = g44Var15;
                z3 = z4;
                in7Var2 = in7VarA;
                cVar3 = cVar15;
                eVar3 = eVar15;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                go7Var2 = ko7Var;
                eVar3 = eVar2;
                cVar3 = cVar2;
                g44Var3 = g44Var2;
                z3 = z;
                in7Var2 = in7Var;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xs5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i4 |= 384;
        ko7Var = go7Var;
        i7 = i4 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                eVar2 = eVar;
                if (bj4VarO.J(eVar2)) {
                }
                i7 |= i14;
            } else {
                eVar2 = eVar;
            }
            i7 |= i14;
        } else {
            eVar2 = eVar;
        }
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                cVar2 = cVar;
                if (bj4VarO.J(cVar2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            if ((i2 & 64) == 0) {
                g44Var2 = g44Var;
                if (bj4VarO.J(g44Var2)) {
                }
                int i118 = i7 | i15 | 46137344;
                if (bj4VarO.j(oh4Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i118 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i11 & 1, z2)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    } else {
                        if ((i2 & 2) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i11 &= -113;
                        }
                        if (i5 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            eVar2 = c30.a;
                        }
                        if (i8 != 0) {
                            cVar2 = di.a.j;
                        }
                        if ((i2 & 64) != 0) {
                            an2VarA = ky9.a(bj4VarO);
                            zJ = bj4VarO.J(an2VarA);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            } else {
                                objF = new fr2(an2VarA);
                                bj4VarO.C(objF);
                            }
                            i11 &= -3670017;
                            g44Var2 = (fr2) objF;
                        }
                        i12 = i11 & (-234881025);
                        in7VarA = kn7.a(bj4VarO);
                        z4 = true;
                    }
                    nz5 nz5Var14 = nz5VarA;
                    go7 go7Var15 = ko7Var;
                    c30.e eVar16 = eVar2;
                    di.c cVar16 = cVar2;
                    g44 g44Var16 = g44Var2;
                    bj4VarO.V();
                    bj4Var = bj4VarO;
                    sy5.a(ox6Var, nz5Var14, go7Var15, false, g44Var16, z4, in7VarA, null, null, cVar16, eVar16, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    nz5VarA = nz5Var14;
                    go7Var2 = go7Var15;
                    g44Var3 = g44Var16;
                    z3 = z4;
                    in7Var2 = in7VarA;
                    cVar3 = cVar16;
                    eVar3 = eVar16;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    go7Var2 = ko7Var;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    g44Var3 = g44Var2;
                    z3 = z;
                    in7Var2 = in7Var;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: xs5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            g44Var2 = g44Var;
            int i119 = i7 | i15 | 46137344;
            if (bj4VarO.j(oh4Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i119 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i11 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                }
                nz5 nz5Var15 = nz5VarA;
                go7 go7Var16 = ko7Var;
                c30.e eVar17 = eVar2;
                di.c cVar17 = cVar2;
                g44 g44Var17 = g44Var2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var, nz5Var15, go7Var16, false, g44Var17, z4, in7VarA, null, null, cVar17, eVar17, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                nz5VarA = nz5Var15;
                go7Var2 = go7Var16;
                g44Var3 = g44Var17;
                z3 = z4;
                in7Var2 = in7VarA;
                cVar3 = cVar17;
                eVar3 = eVar17;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                go7Var2 = ko7Var;
                eVar3 = eVar2;
                cVar3 = cVar2;
                g44Var3 = g44Var2;
                z3 = z;
                in7Var2 = in7Var;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xs5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i7 |= 196608;
        cVar2 = cVar;
        if ((i2 & 64) == 0) {
            g44Var2 = g44Var;
            if (bj4VarO.J(g44Var2)) {
            }
            int i1110 = i7 | i15 | 46137344;
            if (bj4VarO.j(oh4Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i1110 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i11 & 1, z2)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i11 &= -113;
                    }
                    if (i5 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        eVar2 = c30.a;
                    }
                    if (i8 != 0) {
                        cVar2 = di.a.j;
                    }
                    if ((i2 & 64) != 0) {
                        an2VarA = ky9.a(bj4VarO);
                        zJ = bj4VarO.J(an2VarA);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        } else {
                            objF = new fr2(an2VarA);
                            bj4VarO.C(objF);
                        }
                        i11 &= -3670017;
                        g44Var2 = (fr2) objF;
                    }
                    i12 = i11 & (-234881025);
                    in7VarA = kn7.a(bj4VarO);
                    z4 = true;
                }
                nz5 nz5Var16 = nz5VarA;
                go7 go7Var17 = ko7Var;
                c30.e eVar18 = eVar2;
                di.c cVar18 = cVar2;
                g44 g44Var18 = g44Var2;
                bj4VarO.V();
                bj4Var = bj4VarO;
                sy5.a(ox6Var, nz5Var16, go7Var17, false, g44Var18, z4, in7VarA, null, null, cVar18, eVar18, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                nz5VarA = nz5Var16;
                go7Var2 = go7Var17;
                g44Var3 = g44Var18;
                z3 = z4;
                in7Var2 = in7VarA;
                cVar3 = cVar18;
                eVar3 = eVar18;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                go7Var2 = ko7Var;
                eVar3 = eVar2;
                cVar3 = cVar2;
                g44Var3 = g44Var2;
                z3 = z;
                in7Var2 = in7Var;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xs5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        g44Var2 = g44Var;
        int i1111 = i7 | i15 | 46137344;
        if (bj4VarO.j(oh4Var)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        i11 = i1111 | i10;
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bj4VarO.A(i11 & 1, z2)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i11 &= -113;
                }
                if (i5 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    eVar2 = c30.a;
                }
                if (i8 != 0) {
                    cVar2 = di.a.j;
                }
                if ((i2 & 64) != 0) {
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    i11 &= -3670017;
                    g44Var2 = (fr2) objF;
                }
                i12 = i11 & (-234881025);
                in7VarA = kn7.a(bj4VarO);
                z4 = true;
            } else {
                if ((i2 & 2) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i11 &= -113;
                }
                if (i5 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    eVar2 = c30.a;
                }
                if (i8 != 0) {
                    cVar2 = di.a.j;
                }
                if ((i2 & 64) != 0) {
                    an2VarA = ky9.a(bj4VarO);
                    zJ = bj4VarO.J(an2VarA);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    } else {
                        objF = new fr2(an2VarA);
                        bj4VarO.C(objF);
                    }
                    i11 &= -3670017;
                    g44Var2 = (fr2) objF;
                }
                i12 = i11 & (-234881025);
                in7VarA = kn7.a(bj4VarO);
                z4 = true;
            }
            nz5 nz5Var17 = nz5VarA;
            go7 go7Var18 = ko7Var;
            c30.e eVar19 = eVar2;
            di.c cVar19 = cVar2;
            g44 g44Var19 = g44Var2;
            bj4VarO.V();
            bj4Var = bj4VarO;
            sy5.a(ox6Var, nz5Var17, go7Var18, false, g44Var19, z4, in7VarA, null, null, cVar19, eVar19, oh4Var, bj4Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 3072 | ((i12 >> 3) & 458752) | 1572864, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
            nz5VarA = nz5Var17;
            go7Var2 = go7Var18;
            g44Var3 = g44Var19;
            z3 = z4;
            in7Var2 = in7VarA;
            cVar3 = cVar19;
            eVar3 = eVar19;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            go7Var2 = ko7Var;
            eVar3 = eVar2;
            cVar3 = cVar2;
            g44Var3 = g44Var2;
            z3 = z;
            in7Var2 = in7Var;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xs5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ys5.b(ox6Var, nz5VarA, go7Var2, eVar3, cVar3, g44Var3, z3, in7Var2, oh4Var, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }
}

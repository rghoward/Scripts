package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z75 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements fl6 {
        public static final a a = new a();

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            return hl6Var.y0(xx1.j(j), xx1.i(j), if3.t, new y75(0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0186  */
    /* JADX WARN: Code duplicated, block: B:114:0x018a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0197  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void a(final es7 es7Var, final String str, final ox6 ox6Var, di diVar, nz1 nz1Var, float f, wh1 wh1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final di diVar2;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        wh1 wh1Var2;
        int i9;
        int i10;
        boolean z;
        final nz1 nz1Var2;
        final float f3;
        final wh1 wh1Var3;
        xj8 xj8VarW;
        di diVar3;
        nz1 nz1Var3;
        float f4;
        wh1 wh1Var4;
        ox6 ox6VarB;
        jt1.a.C0187a c0187a;
        Object objF;
        fl6 fl6Var;
        int iHashCode;
        ox6 ox6VarC;
        kw7 kw7VarP;
        qr5.a aVar;
        boolean z2;
        Object objF2;
        bj4 bj4VarO = jt1Var.o(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bj4VarO.J(es7Var) : bj4VarO.j(es7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                diVar2 = diVar;
                i3 |= bj4VarO.J(diVar2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(nz1Var)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (bj4VarO.g(f2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            wh1Var2 = wh1Var;
                            if (bj4VarO.J(wh1Var2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i3;
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bj4VarO.A(i10 & 1, z)) {
                            if (i11 != 0) {
                                diVar3 = di.a.e;
                            } else {
                                diVar3 = diVar2;
                            }
                            if (i4 != 0) {
                                nz1Var3 = nz1.a.b;
                            } else {
                                nz1Var3 = nz1Var;
                            }
                            if (i6 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i8 != 0) {
                                wh1Var4 = null;
                            } else {
                                wh1Var4 = wh1Var2;
                            }
                            ox6VarB = ox6.a.t;
                            c0187a = jt1.a.a;
                            if (str != null) {
                                bj4VarO.K(1899222916);
                                if ((i10 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF2 = bj4VarO.f();
                                if (z2 || objF2 == c0187a) {
                                    objF2 = new no0(1, str);
                                    bj4VarO.C(objF2);
                                }
                                ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(1899381698);
                                bj4VarO.U(false);
                            }
                            ox6 ox6VarA = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = a.a;
                                bj4VarO.C(objF);
                            }
                            fl6Var = (fl6) objF;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            ox6VarC = it1.c(bj4VarO, ox6VarA);
                            kw7VarP = bj4VarO.P();
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a != null) {
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
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            bj4VarO.U(true);
                            f3 = f4;
                            wh1Var3 = wh1Var4;
                            diVar2 = diVar3;
                            nz1Var2 = nz1Var3;
                        } else {
                            bj4VarO.u();
                            nz1Var2 = nz1Var;
                            f3 = f2;
                            wh1Var3 = wh1Var2;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: x75
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                                    return g2b.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    wh1Var2 = wh1Var;
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bj4VarO.A(i10 & 1, z)) {
                        if (i11 != 0) {
                            diVar3 = di.a.e;
                        } else {
                            diVar3 = diVar2;
                        }
                        if (i4 != 0) {
                            nz1Var3 = nz1.a.b;
                        } else {
                            nz1Var3 = nz1Var;
                        }
                        if (i6 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i8 != 0) {
                            wh1Var4 = null;
                        } else {
                            wh1Var4 = wh1Var2;
                        }
                        ox6VarB = ox6.a.t;
                        c0187a = jt1.a.a;
                        if (str != null) {
                            bj4VarO.K(1899222916);
                            if ((i10 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF2 = bj4VarO.f();
                            if (z2) {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            }
                            ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1899381698);
                            bj4VarO.U(false);
                        }
                        ox6 ox6VarA2 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = a.a;
                            bj4VarO.C(objF);
                        }
                        fl6Var = (fl6) objF;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarA2);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
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
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(true);
                        f3 = f4;
                        wh1Var3 = wh1Var4;
                        diVar2 = diVar3;
                        nz1Var2 = nz1Var3;
                    } else {
                        bj4VarO.u();
                        nz1Var2 = nz1Var;
                        f3 = f2;
                        wh1Var3 = wh1Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        wh1Var2 = wh1Var;
                        if (bj4VarO.J(wh1Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bj4VarO.A(i10 & 1, z)) {
                        if (i11 != 0) {
                            diVar3 = di.a.e;
                        } else {
                            diVar3 = diVar2;
                        }
                        if (i4 != 0) {
                            nz1Var3 = nz1.a.b;
                        } else {
                            nz1Var3 = nz1Var;
                        }
                        if (i6 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i8 != 0) {
                            wh1Var4 = null;
                        } else {
                            wh1Var4 = wh1Var2;
                        }
                        ox6VarB = ox6.a.t;
                        c0187a = jt1.a.a;
                        if (str != null) {
                            bj4VarO.K(1899222916);
                            if ((i10 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF2 = bj4VarO.f();
                            if (z2) {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            }
                            ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1899381698);
                            bj4VarO.U(false);
                        }
                        ox6 ox6VarA3 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = a.a;
                            bj4VarO.C(objF);
                        }
                        fl6Var = (fl6) objF;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarA3);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
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
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(true);
                        f3 = f4;
                        wh1Var3 = wh1Var4;
                        diVar2 = diVar3;
                        nz1Var2 = nz1Var3;
                    } else {
                        bj4VarO.u();
                        nz1Var2 = nz1Var;
                        f3 = f2;
                        wh1Var3 = wh1Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                wh1Var2 = wh1Var;
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA4 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA4);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        wh1Var2 = wh1Var;
                        if (bj4VarO.J(wh1Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bj4VarO.A(i10 & 1, z)) {
                        if (i11 != 0) {
                            diVar3 = di.a.e;
                        } else {
                            diVar3 = diVar2;
                        }
                        if (i4 != 0) {
                            nz1Var3 = nz1.a.b;
                        } else {
                            nz1Var3 = nz1Var;
                        }
                        if (i6 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i8 != 0) {
                            wh1Var4 = null;
                        } else {
                            wh1Var4 = wh1Var2;
                        }
                        ox6VarB = ox6.a.t;
                        c0187a = jt1.a.a;
                        if (str != null) {
                            bj4VarO.K(1899222916);
                            if ((i10 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF2 = bj4VarO.f();
                            if (z2) {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            }
                            ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1899381698);
                            bj4VarO.U(false);
                        }
                        ox6 ox6VarA5 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = a.a;
                            bj4VarO.C(objF);
                        }
                        fl6Var = (fl6) objF;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarA5);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
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
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(true);
                        f3 = f4;
                        wh1Var3 = wh1Var4;
                        diVar2 = diVar3;
                        nz1Var2 = nz1Var3;
                    } else {
                        bj4VarO.u();
                        nz1Var2 = nz1Var;
                        f3 = f2;
                        wh1Var3 = wh1Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                wh1Var2 = wh1Var;
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA6 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA6);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    wh1Var2 = wh1Var;
                    if (bj4VarO.J(wh1Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA7 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA7);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            wh1Var2 = wh1Var;
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i10 & 1, z)) {
                if (i11 != 0) {
                    diVar3 = di.a.e;
                } else {
                    diVar3 = diVar2;
                }
                if (i4 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var;
                }
                if (i6 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i8 != 0) {
                    wh1Var4 = null;
                } else {
                    wh1Var4 = wh1Var2;
                }
                ox6VarB = ox6.a.t;
                c0187a = jt1.a.a;
                if (str != null) {
                    bj4VarO.K(1899222916);
                    if ((i10 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    }
                    ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1899381698);
                    bj4VarO.U(false);
                }
                ox6 ox6VarA8 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = a.a;
                    bj4VarO.C(objF);
                }
                fl6Var = (fl6) objF;
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarA8);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
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
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(true);
                f3 = f4;
                wh1Var3 = wh1Var4;
                diVar2 = diVar3;
                nz1Var2 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var2 = nz1Var;
                f3 = f2;
                wh1Var3 = wh1Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 3072;
        diVar2 = diVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                if (bj4VarO.J(nz1Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        wh1Var2 = wh1Var;
                        if (bj4VarO.J(wh1Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bj4VarO.A(i10 & 1, z)) {
                        if (i11 != 0) {
                            diVar3 = di.a.e;
                        } else {
                            diVar3 = diVar2;
                        }
                        if (i4 != 0) {
                            nz1Var3 = nz1.a.b;
                        } else {
                            nz1Var3 = nz1Var;
                        }
                        if (i6 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i8 != 0) {
                            wh1Var4 = null;
                        } else {
                            wh1Var4 = wh1Var2;
                        }
                        ox6VarB = ox6.a.t;
                        c0187a = jt1.a.a;
                        if (str != null) {
                            bj4VarO.K(1899222916);
                            if ((i10 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF2 = bj4VarO.f();
                            if (z2) {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new no0(1, str);
                                bj4VarO.C(objF2);
                            }
                            ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1899381698);
                            bj4VarO.U(false);
                        }
                        ox6 ox6VarA9 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = a.a;
                            bj4VarO.C(objF);
                        }
                        fl6Var = (fl6) objF;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarA9);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
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
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(true);
                        f3 = f4;
                        wh1Var3 = wh1Var4;
                        diVar2 = diVar3;
                        nz1Var2 = nz1Var3;
                    } else {
                        bj4VarO.u();
                        nz1Var2 = nz1Var;
                        f3 = f2;
                        wh1Var3 = wh1Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: x75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                                return g2b.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                wh1Var2 = wh1Var;
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA10 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA10);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    wh1Var2 = wh1Var;
                    if (bj4VarO.J(wh1Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA11 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA11);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            wh1Var2 = wh1Var;
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i10 & 1, z)) {
                if (i11 != 0) {
                    diVar3 = di.a.e;
                } else {
                    diVar3 = diVar2;
                }
                if (i4 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var;
                }
                if (i6 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i8 != 0) {
                    wh1Var4 = null;
                } else {
                    wh1Var4 = wh1Var2;
                }
                ox6VarB = ox6.a.t;
                c0187a = jt1.a.a;
                if (str != null) {
                    bj4VarO.K(1899222916);
                    if ((i10 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    }
                    ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1899381698);
                    bj4VarO.U(false);
                }
                ox6 ox6VarA12 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = a.a;
                    bj4VarO.C(objF);
                }
                fl6Var = (fl6) objF;
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarA12);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
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
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(true);
                f3 = f4;
                wh1Var3 = wh1Var4;
                diVar2 = diVar3;
                nz1Var2 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var2 = nz1Var;
                f3 = f2;
                wh1Var3 = wh1Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 24576;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    wh1Var2 = wh1Var;
                    if (bj4VarO.J(wh1Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bj4VarO.A(i10 & 1, z)) {
                    if (i11 != 0) {
                        diVar3 = di.a.e;
                    } else {
                        diVar3 = diVar2;
                    }
                    if (i4 != 0) {
                        nz1Var3 = nz1.a.b;
                    } else {
                        nz1Var3 = nz1Var;
                    }
                    if (i6 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i8 != 0) {
                        wh1Var4 = null;
                    } else {
                        wh1Var4 = wh1Var2;
                    }
                    ox6VarB = ox6.a.t;
                    c0187a = jt1.a.a;
                    if (str != null) {
                        bj4VarO.K(1899222916);
                        if ((i10 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF2 = bj4VarO.f();
                        if (z2) {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new no0(1, str);
                            bj4VarO.C(objF2);
                        }
                        ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1899381698);
                        bj4VarO.U(false);
                    }
                    ox6 ox6VarA13 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = a.a;
                        bj4VarO.C(objF);
                    }
                    fl6Var = (fl6) objF;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarA13);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
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
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(true);
                    f3 = f4;
                    wh1Var3 = wh1Var4;
                    diVar2 = diVar3;
                    nz1Var2 = nz1Var3;
                } else {
                    bj4VarO.u();
                    nz1Var2 = nz1Var;
                    f3 = f2;
                    wh1Var3 = wh1Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: x75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            wh1Var2 = wh1Var;
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i10 & 1, z)) {
                if (i11 != 0) {
                    diVar3 = di.a.e;
                } else {
                    diVar3 = diVar2;
                }
                if (i4 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var;
                }
                if (i6 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i8 != 0) {
                    wh1Var4 = null;
                } else {
                    wh1Var4 = wh1Var2;
                }
                ox6VarB = ox6.a.t;
                c0187a = jt1.a.a;
                if (str != null) {
                    bj4VarO.K(1899222916);
                    if ((i10 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    }
                    ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1899381698);
                    bj4VarO.U(false);
                }
                ox6 ox6VarA14 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = a.a;
                    bj4VarO.C(objF);
                }
                fl6Var = (fl6) objF;
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarA14);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
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
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(true);
                f3 = f4;
                wh1Var3 = wh1Var4;
                diVar2 = diVar3;
                nz1Var2 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var2 = nz1Var;
                f3 = f2;
                wh1Var3 = wh1Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 196608;
        f2 = f;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                wh1Var2 = wh1Var;
                if (bj4VarO.J(wh1Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i10 & 1, z)) {
                if (i11 != 0) {
                    diVar3 = di.a.e;
                } else {
                    diVar3 = diVar2;
                }
                if (i4 != 0) {
                    nz1Var3 = nz1.a.b;
                } else {
                    nz1Var3 = nz1Var;
                }
                if (i6 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i8 != 0) {
                    wh1Var4 = null;
                } else {
                    wh1Var4 = wh1Var2;
                }
                ox6VarB = ox6.a.t;
                c0187a = jt1.a.a;
                if (str != null) {
                    bj4VarO.K(1899222916);
                    if ((i10 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new no0(1, str);
                        bj4VarO.C(objF2);
                    }
                    ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1899381698);
                    bj4VarO.U(false);
                }
                ox6 ox6VarA15 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = a.a;
                    bj4VarO.C(objF);
                }
                fl6Var = (fl6) objF;
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarA15);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
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
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(true);
                f3 = f4;
                wh1Var3 = wh1Var4;
                diVar2 = diVar3;
                nz1Var2 = nz1Var3;
            } else {
                bj4VarO.u();
                nz1Var2 = nz1Var;
                f3 = f2;
                wh1Var3 = wh1Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: x75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        wh1Var2 = wh1Var;
        i10 = i3;
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i10 & 1, z)) {
            if (i11 != 0) {
                diVar3 = di.a.e;
            } else {
                diVar3 = diVar2;
            }
            if (i4 != 0) {
                nz1Var3 = nz1.a.b;
            } else {
                nz1Var3 = nz1Var;
            }
            if (i6 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i8 != 0) {
                wh1Var4 = null;
            } else {
                wh1Var4 = wh1Var2;
            }
            ox6VarB = ox6.a.t;
            c0187a = jt1.a.a;
            if (str != null) {
                bj4VarO.K(1899222916);
                if ((i10 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new no0(1, str);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new no0(1, str);
                    bj4VarO.C(objF2);
                }
                ox6VarB = pb9.b(ox6VarB, false, (oh4) objF2);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1899381698);
                bj4VarO.U(false);
            }
            ox6 ox6VarA16 = gs7.a(uma.b(ox6Var.H(ox6VarB)), es7Var, diVar3, nz1Var3, f4, wh1Var4, 2);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = a.a;
                bj4VarO.C(objF);
            }
            fl6Var = (fl6) objF;
            iHashCode = Long.hashCode(bj4VarO.T);
            ox6VarC = it1.c(bj4VarO, ox6VarA16);
            kw7VarP = bj4VarO.P();
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a != null) {
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
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            bj4VarO.U(true);
            f3 = f4;
            wh1Var3 = wh1Var4;
            diVar2 = diVar3;
            nz1Var2 = nz1Var3;
        } else {
            bj4VarO.u();
            nz1Var2 = nz1Var;
            f3 = f2;
            wh1Var3 = wh1Var2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: x75
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z75.a(es7Var, str, ox6Var, diVar2, nz1Var2, f3, wh1Var3, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }
}

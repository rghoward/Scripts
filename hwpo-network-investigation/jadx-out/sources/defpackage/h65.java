package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h65 {
    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, jt1 jt1Var, final mh4 mh4Var, final ci4 ci4Var, final b65 b65Var, final ox6 ox6Var, jl9 jl9Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        final jl9 jl9Var2;
        final boolean z4;
        xj8 xj8VarW;
        int i5;
        jl9 jl9VarB;
        boolean z5;
        int i6;
        int i7;
        bj4 bj4VarO = jt1Var.o(947208840);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= bj4VarO.c(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if (bj4VarO.J(b65Var)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i4 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bj4VarO.A(i4 & 1, z3)) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    boolean z6 = i8 == 0 ? z2 : true;
                    i5 = i4 & (-7169);
                    jl9VarB = wl9.b(zd6.u, bj4VarO);
                    z5 = z6;
                } else {
                    bj4VarO.u();
                    i5 = i4 & (-7169);
                    jl9VarB = jl9Var;
                    z5 = z2;
                }
                bj4VarO.V();
                int i9 = (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (57344 & i5);
                int i10 = i5 << 3;
                d(i9 | (3670016 & i10) | (i10 & 29360128), bj4VarO, mh4Var, ci4Var, b65Var, ox6Var, jl9VarB, z5);
                jl9Var2 = jl9VarB;
                z4 = z5;
            } else {
                bj4VarO.u();
                jl9Var2 = jl9Var;
                z4 = z2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: e65
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h65.a(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var, ox6Var, jl9Var2, z4);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            if (bj4VarO.J(b65Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (bj4VarO.j(ci4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bj4VarO.A(i4 & 1, z3)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                i5 = i4 & (-7169);
                jl9VarB = wl9.b(zd6.u, bj4VarO);
                z5 = z6;
            } else {
                if (i8 == 0) {
                }
                i5 = i4 & (-7169);
                jl9VarB = wl9.b(zd6.u, bj4VarO);
                z5 = z6;
            }
            bj4VarO.V();
            int i11 = (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (57344 & i5);
            int i12 = i5 << 3;
            d(i11 | (3670016 & i12) | (i12 & 29360128), bj4VarO, mh4Var, ci4Var, b65Var, ox6Var, jl9VarB, z5);
            jl9Var2 = jl9VarB;
            z4 = z5;
        } else {
            bj4VarO.u();
            jl9Var2 = jl9Var;
            z4 = z2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: e65
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h65.a(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var, ox6Var, jl9Var2, z4);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void b(final int i, final int i2, jt1 jt1Var, final mh4 mh4Var, final ci4 ci4Var, b65 b65Var, ox6 ox6Var, jl9 jl9Var, boolean z) {
        int i3;
        ox6 ox6Var2;
        int i4;
        boolean z2;
        int i5;
        b65 b65Var2;
        int i6;
        ci4 ci4Var2;
        boolean z3;
        final ox6 ox6Var3;
        final b65 b65Var3;
        final boolean z4;
        final jl9 jl9Var2;
        xj8 xj8VarW;
        ox6 ox6Var4;
        boolean z5;
        ox6 ox6Var5;
        int i7;
        b65 b65Var4;
        jl9 jl9VarB;
        long j;
        fi1 fi1Var;
        b65 b65Var5;
        long j2;
        b65 b65VarA;
        int i8;
        bj4 bj4VarO = jt1Var.o(1413012038);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        b65Var2 = b65Var;
                        int i10 = bj4VarO.J(b65Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                        i3 |= i10;
                    } else {
                        b65Var2 = b65Var;
                    }
                    i3 |= i10;
                } else {
                    b65Var2 = b65Var;
                }
                i6 = i3 | 24576;
                if ((196608 & i) == 0) {
                    i6 = 90112 | i3;
                }
                if ((1572864 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                } else {
                    ci4Var2 = ci4Var;
                }
                if ((599187 & i6) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bj4VarO.A(i6 & 1, z3)) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i9 != 0) {
                            ox6Var4 = ox6.a.t;
                        } else {
                            ox6Var4 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            j = ((uh1) bj4VarO.F(zy1.a)).a;
                            fi1Var = (fi1) bj4VarO.F(hi1.a);
                            b65Var5 = fi1Var.c0;
                            if (b65Var5 == null) {
                                long j3 = uh1.j;
                                b65VarA = new b65(j3, j, j3, uh1.b(0.38f, j));
                                j2 = j;
                                fi1Var.c0 = b65VarA;
                            } else {
                                j2 = j;
                                b65VarA = b65Var5;
                            }
                            if (!uh1.c(b65VarA.b, j2)) {
                                b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                            }
                            i6 &= -7169;
                            b65Var2 = b65VarA;
                        }
                        int i11 = i6 & (-458753);
                        z5 = z2;
                        ox6Var5 = ox6Var4;
                        i7 = i11;
                        b65Var4 = b65Var2;
                        jl9VarB = wl9.b(zd6.u, bj4VarO);
                    } else {
                        bj4VarO.u();
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        i7 = i6 & (-458753);
                        z5 = z2;
                        b65Var4 = b65Var2;
                        jl9VarB = jl9Var;
                        ox6Var5 = ox6Var2;
                    }
                    bj4VarO.V();
                    int i12 = i7 << 3;
                    c((i7 & 3670016) | ((i7 >> 3) & 14) | (i12 & 112) | (i7 & 896) | (57344 & i12) | (i12 & 458752), bj4VarO, mh4Var, ci4Var2, b65Var4, ox6Var5, jl9VarB, z5);
                    b65Var3 = b65Var4;
                    ox6Var3 = ox6Var5;
                    jl9Var2 = jl9VarB;
                    z4 = z5;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    b65Var3 = b65Var2;
                    z4 = z2;
                    jl9Var2 = jl9Var;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: c65
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h65.b(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var3, ox6Var3, jl9Var2, z4);
                            return g2b.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    b65Var2 = b65Var;
                    if (bj4VarO.J(b65Var2)) {
                    }
                    i3 |= i10;
                } else {
                    b65Var2 = b65Var;
                }
                i3 |= i10;
            } else {
                b65Var2 = b65Var;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                i6 = 90112 | i3;
            }
            if ((1572864 & i) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            } else {
                ci4Var2 = ci4Var;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bj4VarO.A(i6 & 1, z3)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        j = ((uh1) bj4VarO.F(zy1.a)).a;
                        fi1Var = (fi1) bj4VarO.F(hi1.a);
                        b65Var5 = fi1Var.c0;
                        if (b65Var5 == null) {
                            long j4 = uh1.j;
                            b65VarA = new b65(j4, j, j4, uh1.b(0.38f, j));
                            j2 = j;
                            fi1Var.c0 = b65VarA;
                        } else {
                            j2 = j;
                            b65VarA = b65Var5;
                        }
                        if (!uh1.c(b65VarA.b, j2)) {
                            b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                        }
                        i6 &= -7169;
                        b65Var2 = b65VarA;
                    }
                    int i13 = i6 & (-458753);
                    z5 = z2;
                    ox6Var5 = ox6Var4;
                    i7 = i13;
                    b65Var4 = b65Var2;
                    jl9VarB = wl9.b(zd6.u, bj4VarO);
                } else {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        j = ((uh1) bj4VarO.F(zy1.a)).a;
                        fi1Var = (fi1) bj4VarO.F(hi1.a);
                        b65Var5 = fi1Var.c0;
                        if (b65Var5 == null) {
                            long j5 = uh1.j;
                            b65VarA = new b65(j5, j, j5, uh1.b(0.38f, j));
                            j2 = j;
                            fi1Var.c0 = b65VarA;
                        } else {
                            j2 = j;
                            b65VarA = b65Var5;
                        }
                        if (!uh1.c(b65VarA.b, j2)) {
                            b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                        }
                        i6 &= -7169;
                        b65Var2 = b65VarA;
                    }
                    int i14 = i6 & (-458753);
                    z5 = z2;
                    ox6Var5 = ox6Var4;
                    i7 = i14;
                    b65Var4 = b65Var2;
                    jl9VarB = wl9.b(zd6.u, bj4VarO);
                }
                bj4VarO.V();
                int i15 = i7 << 3;
                c((i7 & 3670016) | ((i7 >> 3) & 14) | (i15 & 112) | (i7 & 896) | (57344 & i15) | (i15 & 458752), bj4VarO, mh4Var, ci4Var2, b65Var4, ox6Var5, jl9VarB, z5);
                b65Var3 = b65Var4;
                ox6Var3 = ox6Var5;
                jl9Var2 = jl9VarB;
                z4 = z5;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                b65Var3 = b65Var2;
                z4 = z2;
                jl9Var2 = jl9Var;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c65
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h65.b(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var3, ox6Var3, jl9Var2, z4);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    b65Var2 = b65Var;
                    if (bj4VarO.J(b65Var2)) {
                    }
                    i3 |= i10;
                } else {
                    b65Var2 = b65Var;
                }
                i3 |= i10;
            } else {
                b65Var2 = b65Var;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                i6 = 90112 | i3;
            }
            if ((1572864 & i) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            } else {
                ci4Var2 = ci4Var;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bj4VarO.A(i6 & 1, z3)) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        j = ((uh1) bj4VarO.F(zy1.a)).a;
                        fi1Var = (fi1) bj4VarO.F(hi1.a);
                        b65Var5 = fi1Var.c0;
                        if (b65Var5 == null) {
                            long j6 = uh1.j;
                            b65VarA = new b65(j6, j, j6, uh1.b(0.38f, j));
                            j2 = j;
                            fi1Var.c0 = b65VarA;
                        } else {
                            j2 = j;
                            b65VarA = b65Var5;
                        }
                        if (!uh1.c(b65VarA.b, j2)) {
                            b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                        }
                        i6 &= -7169;
                        b65Var2 = b65VarA;
                    }
                    int i16 = i6 & (-458753);
                    z5 = z2;
                    ox6Var5 = ox6Var4;
                    i7 = i16;
                    b65Var4 = b65Var2;
                    jl9VarB = wl9.b(zd6.u, bj4VarO);
                } else {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        j = ((uh1) bj4VarO.F(zy1.a)).a;
                        fi1Var = (fi1) bj4VarO.F(hi1.a);
                        b65Var5 = fi1Var.c0;
                        if (b65Var5 == null) {
                            long j7 = uh1.j;
                            b65VarA = new b65(j7, j, j7, uh1.b(0.38f, j));
                            j2 = j;
                            fi1Var.c0 = b65VarA;
                        } else {
                            j2 = j;
                            b65VarA = b65Var5;
                        }
                        if (!uh1.c(b65VarA.b, j2)) {
                            b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                        }
                        i6 &= -7169;
                        b65Var2 = b65VarA;
                    }
                    int i17 = i6 & (-458753);
                    z5 = z2;
                    ox6Var5 = ox6Var4;
                    i7 = i17;
                    b65Var4 = b65Var2;
                    jl9VarB = wl9.b(zd6.u, bj4VarO);
                }
                bj4VarO.V();
                int i18 = i7 << 3;
                c((i7 & 3670016) | ((i7 >> 3) & 14) | (i18 & 112) | (i7 & 896) | (57344 & i18) | (i18 & 458752), bj4VarO, mh4Var, ci4Var2, b65Var4, ox6Var5, jl9VarB, z5);
                b65Var3 = b65Var4;
                ox6Var3 = ox6Var5;
                jl9Var2 = jl9VarB;
                z4 = z5;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                b65Var3 = b65Var2;
                z4 = z2;
                jl9Var2 = jl9Var;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c65
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h65.b(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var3, ox6Var3, jl9Var2, z4);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                b65Var2 = b65Var;
                if (bj4VarO.J(b65Var2)) {
                }
                i3 |= i10;
            } else {
                b65Var2 = b65Var;
            }
            i3 |= i10;
        } else {
            b65Var2 = b65Var;
        }
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            i6 = 90112 | i3;
        }
        if ((1572864 & i) == 0) {
            ci4Var2 = ci4Var;
            if (bj4VarO.j(ci4Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        } else {
            ci4Var2 = ci4Var;
        }
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bj4VarO.A(i6 & 1, z3)) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    j = ((uh1) bj4VarO.F(zy1.a)).a;
                    fi1Var = (fi1) bj4VarO.F(hi1.a);
                    b65Var5 = fi1Var.c0;
                    if (b65Var5 == null) {
                        long j8 = uh1.j;
                        b65VarA = new b65(j8, j, j8, uh1.b(0.38f, j));
                        j2 = j;
                        fi1Var.c0 = b65VarA;
                    } else {
                        j2 = j;
                        b65VarA = b65Var5;
                    }
                    if (!uh1.c(b65VarA.b, j2)) {
                        b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                    }
                    i6 &= -7169;
                    b65Var2 = b65VarA;
                }
                int i19 = i6 & (-458753);
                z5 = z2;
                ox6Var5 = ox6Var4;
                i7 = i19;
                b65Var4 = b65Var2;
                jl9VarB = wl9.b(zd6.u, bj4VarO);
            } else {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    j = ((uh1) bj4VarO.F(zy1.a)).a;
                    fi1Var = (fi1) bj4VarO.F(hi1.a);
                    b65Var5 = fi1Var.c0;
                    if (b65Var5 == null) {
                        long j9 = uh1.j;
                        b65VarA = new b65(j9, j, j9, uh1.b(0.38f, j));
                        j2 = j;
                        fi1Var.c0 = b65VarA;
                    } else {
                        j2 = j;
                        b65VarA = b65Var5;
                    }
                    if (!uh1.c(b65VarA.b, j2)) {
                        b65VarA = b65VarA.a(b65VarA.a, j2, b65VarA.c, uh1.b(0.38f, j2));
                    }
                    i6 &= -7169;
                    b65Var2 = b65VarA;
                }
                int i110 = i6 & (-458753);
                z5 = z2;
                ox6Var5 = ox6Var4;
                i7 = i110;
                b65Var4 = b65Var2;
                jl9VarB = wl9.b(zd6.u, bj4VarO);
            }
            bj4VarO.V();
            int i111 = i7 << 3;
            c((i7 & 3670016) | ((i7 >> 3) & 14) | (i111 & 112) | (i7 & 896) | (57344 & i111) | (i111 & 458752), bj4VarO, mh4Var, ci4Var2, b65Var4, ox6Var5, jl9VarB, z5);
            b65Var3 = b65Var4;
            ox6Var3 = ox6Var5;
            jl9Var2 = jl9VarB;
            z4 = z5;
        } else {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            b65Var3 = b65Var2;
            z4 = z2;
            jl9Var2 = jl9Var;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: c65
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h65.b(gz3.s(i | 1), i2, (jt1) obj, mh4Var, ci4Var, b65Var3, ox6Var3, jl9Var2, z4);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final int i, jt1 jt1Var, final mh4 mh4Var, final ci4 ci4Var, final b65 b65Var, final ox6 ox6Var, final jl9 jl9Var, final boolean z) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1134296466);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(jl9Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.J(b65Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.J(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 1048576 : 524288;
        }
        if (bj4VarO.A(i2 & 1, (599187 & i2) != 599186)) {
            bj4VarO.K(977045485);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new i27();
                bj4VarO.C(objF);
            }
            h27 h27Var = (h27) objF;
            bj4VarO.U(false);
            e15 e15Var = tg5.a;
            ox6 ox6VarH = ox6Var.H(iv6.t);
            float f = zd6.v;
            long jA = a53.a(zd6.w + f + f, 40.0f);
            az3 az3Var = ir9.a;
            ox6 ox6VarA = ec1.a(we1.b(gi0.c(uma.a(ir9.k(c53.b(jA), c53.a(jA), ox6VarH), jl9Var), z ? b65Var.a : b65Var.c, jl9Var), h27Var, zw8.a(7), z, new ex8(0), mh4Var, 8));
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            nu1.a(zy1.a.a(new uh1(z ? b65Var.b : b65Var.d)), ci4Var, bj4VarO, ((i2 >> 15) & 112) | 8);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d65
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h65.c(gz3.s(i | 1), (jt1) obj, mh4Var, ci4Var, b65Var, ox6Var, jl9Var, z);
                    return g2b.a;
                }
            };
        }
    }

    public static final void d(final int i, jt1 jt1Var, final mh4 mh4Var, final ci4 ci4Var, final b65 b65Var, final ox6 ox6Var, final jl9 jl9Var, final boolean z) {
        mh4 mh4Var2;
        int i2;
        jl9 jl9Var2;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-171935091);
        int i3 = 2;
        if ((i & 6) == 0) {
            mh4Var2 = mh4Var;
            i2 = (bj4VarO.j(mh4Var2) ? 4 : 2) | i;
        } else {
            mh4Var2 = mh4Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jl9Var2 = jl9Var;
            i2 |= bj4VarO.J(jl9Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            jl9Var2 = jl9Var;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.J(b65Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.J(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.J(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 8388608 : 4194304;
        }
        if (bj4VarO.A(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new q00(i3);
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            long j = z ? b65Var.a : b65Var.c;
            int i4 = i2 & 8078;
            int i5 = i2 << 9;
            bj4Var = bj4VarO;
            mh4 mh4Var3 = mh4Var2;
            v5a.c(mh4Var3, ox6VarB, z, jl9Var2, j, z ? b65Var.b : b65Var.d, 0.0f, 0.0f, null, null, gr1.b(669231714, new g65(ci4Var), bj4VarO), bj4Var, i4 | (234881024 & i5) | (i5 & 1879048192), 192);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f65
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h65.d(gz3.s(i | 1), (jt1) obj, mh4Var, ci4Var, b65Var, ox6Var, jl9Var, z);
                    return g2b.a;
                }
            };
        }
    }
}

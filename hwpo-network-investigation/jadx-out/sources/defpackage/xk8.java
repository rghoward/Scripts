package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xk8 {
    public final cm a;
    public final uk8 b;
    public final kla c;
    public final t27<mh4<g2b>> d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Object h;
    public long i;
    public final wk8 j;
    public final b37 k;

    public xk8(cm cmVar) {
        this.a = cmVar;
        uk8 uk8Var = new uk8();
        uk8Var.a = new long[192];
        uk8Var.b = new long[192];
        this.b = uk8Var;
        this.c = new kla();
        this.d = new t27<>((Object) null);
        this.i = -1L;
        this.j = new wk8(this);
        this.k = new b37();
    }

    public static long d(qr5 qr5Var) {
        kb7 kb7Var = qr5Var.Y;
        mb7 mb7Var = kb7Var.d;
        long jD = 0;
        for (mb7 mb7Var2 = kb7Var.c; mb7Var2 != null && mb7Var2 != mb7Var; mb7Var2 = mb7Var2.L) {
            ln7 ln7Var = mb7Var2.g0;
            if (ln7Var != null && !z63.f(ln7Var.mo880getUnderlyingMatrixsQKQjiQ())) {
                return 9223372034707292159L;
            }
            jD = bg5.d(jD, mb7Var2.U);
        }
        return jD;
    }

    public static void g(qr5 qr5Var) {
        if (qr5Var.v) {
            ln7 ln7Var = qr5Var.Y.d.g0;
            if (ln7Var == null || z63.f(ln7Var.mo880getUnderlyingMatrixsQKQjiQ())) {
                qr5Var.v = false;
                if (qr5Var.x) {
                    qr5Var.w = d(qr5Var);
                    qr5Var.x = false;
                }
                if (bg5.b(qr5Var.w, 9223372034707292159L)) {
                    return;
                }
                k37<qr5> k37VarL = qr5Var.L();
                qr5[] qr5VarArr = k37VarL.t;
                int i = k37VarL.v;
                for (int i2 = 0; i2 < i; i2++) {
                    g(qr5VarArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0238  */
    /* JADX WARN: Code duplicated, block: B:103:0x0241 A[LOOP:11: B:102:0x023f->B:103:0x0241, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x024c A[LOOP:9: B:95:0x021b->B:107:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0253 A[ADDED_TO_REGION, LOOP:12: B:110:0x0253->B:111:0x0255, LOOP_START, PHI: r1
      0x0253: PHI (r1v9 kla$a) = (r1v8 kla$a), (r1v10 kla$a) binds: [B:109:0x0251, B:111:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0255 A[LOOP:12: B:110:0x0253->B:111:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x024f A[EDGE_INSN: B:136:0x024f->B:108:0x024f BREAK  A[LOOP:9: B:95:0x021b->B:107:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x024f A[EDGE_INSN: B:137:0x024f->B:108:0x024f BREAK  A[LOOP:9: B:95:0x021b->B:107:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185 A[ADDED_TO_REGION, LOOP:7: B:73:0x0185->B:74:0x0187, LOOP_START, PHI: r3
      0x0185: PHI (r3v7 kla$a) = (r3v6 kla$a), (r3v8 kla$a) binds: [B:72:0x0183, B:74:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0187 A[LOOP:7: B:73:0x0185->B:74:0x0187, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:92:0x020f  */
    /* JADX WARN: Code duplicated, block: B:94:0x021a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0227  */
    /* JADX WARN: Code duplicated, block: B:99:0x0232  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        Object[] objArr;
        long[] jArr;
        int length;
        kla.a aVar;
        int i3;
        long j4;
        int i4;
        long j5;
        int i5;
        kla.a aVar2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        float[] fArr;
        kla.a aVar3;
        long[] jArr4;
        long j8;
        long j9;
        Object obj = this.h;
        if (obj != null) {
            this.a.d0(obj);
            this.h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        uk8 uk8Var = this.b;
        boolean z4 = true;
        kla klaVar = this.c;
        if (z2) {
            this.e = false;
            t27<mh4<g2b>> t27Var = this.d;
            Object[] objArr2 = t27Var.a;
            int i9 = t27Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((mh4) objArr2[i10]).invoke();
            }
            long[] jArr5 = uk8Var.a;
            int i11 = uk8Var.c;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j10 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr5[i12];
                    long j12 = jArr5[i12 + 1];
                    kla.a aVarB = klaVar.a.b(((int) j10) & 33554431);
                    while (aVarB != null) {
                        kla.a aVar4 = aVarB.d;
                        boolean z6 = z3;
                        long j13 = aVarB.g;
                        boolean z7 = (jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE) ? z5 : false;
                        aVarB.e = j11;
                        aVarB.f = j12;
                        if (z7) {
                            aVarB.g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            aVarB.a(j8, j9, klaVar.d, klaVar.e, klaVar.g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        aVarB = aVar4;
                        j11 = j8;
                        j12 = j9;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = uk8Var.a;
            int i14 = uk8Var.c;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j14 = klaVar.d;
            long j15 = klaVar.e;
            float[] fArr2 = klaVar.g;
            e27<kla.a> e27Var = klaVar.a;
            j2 = 128;
            Object[] objArr3 = e27Var.c;
            long[] jArr7 = e27Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j16 = j14;
                    long j17 = jArr7[i17];
                    int i19 = i18;
                    uk8Var = uk8Var;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j18 = j17;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j18 & 255) < 128) {
                                kla.a aVar5 = (kla.a) objArr3[(i17 << 3) + i21];
                                while (aVar5 != null) {
                                    klaVar.a(aVar5, j16, j15, fArr2, jCurrentTimeMillis);
                                    aVar5 = aVar5.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j18 >>= i22;
                            i21++;
                            j16 = j16;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    uk8Var = uk8Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j6 = klaVar.d;
                j7 = klaVar.e;
                fArr = klaVar.g;
                aVar3 = klaVar.b;
                if (aVar3 != null) {
                    while (aVar3 != null) {
                        qr5 qr5VarF = ew2.f(aVar3.b);
                        long jB = ur5.a(qr5VarF).getRectManager().b(qr5VarF);
                        aVar3.e = jB;
                        el6 el6Var = qr5VarF.Z.p;
                        aVar3.f = (((long) (el6Var.t + ((int) (jB >> 32)))) << 32) | (((long) (el6Var.u + ((int) (jB & 4294967295L)))) & 4294967295L);
                        klaVar.a(aVar3, j6, j7, fArr, jCurrentTimeMillis);
                        aVar3 = aVar3.d;
                    }
                }
            }
            if (this.g) {
                i2 = 0;
                this.g = false;
                uk8 uk8Var2 = uk8Var;
                jArr2 = uk8Var2.a;
                int i23 = uk8Var2.c;
                jArr3 = uk8Var2.b;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != vk8.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                uk8Var2.c = i7;
                uk8Var2.a = jArr3;
                uk8Var2.b = jArr2;
            } else {
                i2 = 0;
            }
            if (klaVar.c <= jCurrentTimeMillis) {
                e27<kla.a> e27Var2 = klaVar.a;
                objArr = e27Var2.c;
                jArr = e27Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j4 = jArr[i3];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j5 = j4;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j5 & j3) < j2) {
                                    for (aVar2 = (kla.a) objArr[(i3 << 3) + i5]; aVar2 != null; aVar2 = aVar2.d) {
                                    }
                                }
                                j5 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                aVar = klaVar.b;
                if (aVar != null) {
                    while (aVar != null) {
                        aVar = aVar.d;
                    }
                }
                klaVar.c = -1L;
            }
            if (klaVar.c > j) {
                h();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j6 = klaVar.d;
            j7 = klaVar.e;
            fArr = klaVar.g;
            aVar3 = klaVar.b;
            if (aVar3 != null) {
                while (aVar3 != null) {
                    qr5 qr5VarF2 = ew2.f(aVar3.b);
                    long jB2 = ur5.a(qr5VarF2).getRectManager().b(qr5VarF2);
                    aVar3.e = jB2;
                    el6 el6Var2 = qr5VarF2.Z.p;
                    aVar3.f = (((long) (el6Var2.t + ((int) (jB2 >> 32)))) << 32) | (((long) (el6Var2.u + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    klaVar.a(aVar3, j6, j7, fArr, jCurrentTimeMillis);
                    aVar3 = aVar3.d;
                }
            }
        }
        if (this.g) {
            i2 = 0;
            this.g = false;
            uk8 uk8Var3 = uk8Var;
            jArr2 = uk8Var3.a;
            int i24 = uk8Var3.c;
            jArr3 = uk8Var3.b;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != vk8.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            uk8Var3.c = i7;
            uk8Var3.a = jArr3;
            uk8Var3.b = jArr2;
        } else {
            i2 = 0;
        }
        if (klaVar.c <= jCurrentTimeMillis) {
            e27<kla.a> e27Var3 = klaVar.a;
            objArr = e27Var3.c;
            jArr = e27Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j4 = jArr[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j5 = j4;
                        while (i5 < i4) {
                            if ((j5 & j3) < j2) {
                                while (aVar2 != null) {
                                }
                            }
                            j5 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            aVar = klaVar.b;
            if (aVar != null) {
                while (aVar != null) {
                    aVar = aVar.d;
                }
            }
            klaVar.c = -1L;
        }
        if (klaVar.c > j) {
            h();
        }
    }

    public final long b(qr5 qr5Var) {
        long j;
        int i = qr5Var.u & 33554431;
        uk8 uk8Var = this.b;
        long[] jArr = uk8Var.a;
        int i2 = uk8Var.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    public final void c(qr5 qr5Var) {
        boolean z;
        qr5 qr5VarI;
        int i;
        boolean z2 = true;
        qr5Var.v = true;
        kb7 kb7Var = qr5Var.Y;
        el6 el6Var = qr5Var.Z.p;
        int iG0 = el6Var.g0();
        float fF0 = el6Var.f0();
        b37 b37Var = this.k;
        b37Var.a = 0.0f;
        b37Var.b = 0.0f;
        b37Var.c = iG0;
        b37Var.d = fF0;
        for (mb7 mb7Var = kb7Var.d; mb7Var != null; mb7Var = mb7Var.L) {
            qr5 qr5Var2 = mb7Var.H;
            if (mb7Var == qr5Var2.Y.d && !qr5Var2.v) {
                long jB = b(qr5Var2);
                if (!bg5.b(jB, 9223372034707292159L)) {
                    b37Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            ln7 ln7Var = mb7Var.g0;
            if (ln7Var != null) {
                float[] fArrMo880getUnderlyingMatrixsQKQjiQ = ln7Var.mo880getUnderlyingMatrixsQKQjiQ();
                if (!z63.f(fArrMo880getUnderlyingMatrixsQKQjiQ)) {
                    xk6.c(fArrMo880getUnderlyingMatrixsQKQjiQ, b37Var);
                }
            }
            long j = mb7Var.U;
            b37Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
        }
        int i2 = (int) b37Var.a;
        int i3 = (int) b37Var.b;
        int i4 = (int) b37Var.c;
        int i5 = (int) b37Var.d;
        int i6 = qr5Var.u;
        boolean z3 = qr5Var.z;
        qr5Var.z = true;
        uk8 uk8Var = this.b;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = uk8Var.a;
            int i8 = uk8Var.c;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    qr5VarI = qr5Var.I();
                    if (qr5VarI != null) {
                        i = qr5VarI.u;
                    } else {
                        i = -1;
                    }
                    uk8Var.a(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, kb7Var.d(1024), kb7Var.d(16), this.c.a.a(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            qr5VarI = qr5Var.I();
            if (qr5VarI != null) {
                i = qr5VarI.u;
            } else {
                i = -1;
            }
            uk8Var.a(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, kb7Var.d(1024), kb7Var.d(16), this.c.a.a(i6), -1);
        }
        qr5Var.y = false;
        this.e = z;
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i11 = k37VarL.v;
        for (int i12 = 0; i12 < i11; i12++) {
            qr5 qr5Var3 = qr5VarArr[i12];
            if (qr5Var3.j()) {
                c(qr5Var3);
            }
        }
    }

    public final void e(qr5 qr5Var) {
        long j;
        ln7 ln7Var;
        boolean zJ = qr5Var.j();
        kb7 kb7Var = qr5Var.Y;
        if (zJ && qr5Var.y) {
            qr5 qr5VarI = qr5Var.I();
            if (qr5VarI == null || qr5VarI.v) {
                j = qr5VarI == null ? 0L : 9223372034707292159L;
            } else {
                if (qr5VarI.x) {
                    qr5VarI.x = false;
                    qr5VarI.w = d(qr5VarI);
                }
                j = qr5VarI.w;
            }
            mb7 mb7Var = kb7Var.d;
            if (bg5.b(j, 9223372034707292159L) || !((ln7Var = mb7Var.g0) == null || z63.f(ln7Var.mo880getUnderlyingMatrixsQKQjiQ()))) {
                c(qr5Var);
            } else if (qr5Var.v) {
                c(qr5Var);
                g(qr5Var);
            } else {
                long jD = bg5.d(j, mb7Var.U);
                el6 el6Var = qr5Var.Z.p;
                int iG0 = el6Var.g0();
                int iF0 = el6Var.f0();
                int i = qr5Var.u;
                boolean z = qr5Var.z;
                uk8 uk8Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    qr5Var.z = true;
                    boolean zD = kb7Var.d(1024);
                    boolean zD2 = kb7Var.d(16);
                    boolean zA = this.c.a.a(i);
                    if (qr5VarI != null) {
                        int i2 = qr5VarI.u;
                        int i3 = (int) (jD >> 32);
                        int i4 = (int) (jD & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = uk8Var.a;
                        for (int i6 = uk8Var.c - 3; i6 >= 0; i6 -= 3) {
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                uk8Var.a(i5, i7, i8, i7 + iG0, i8 + iF0, i2, zD, zD2, zA, i6);
                                break;
                            }
                        }
                    } else {
                        int i9 = (int) (jD >> 32);
                        int i10 = (int) (jD & 4294967295L);
                        uk8Var.a(i, i9, i10, i9 + iG0, i10 + iF0, (512 & 32) != 0 ? -1 : 0, zD, zD2, zA, -1);
                    }
                } else if (qr5VarI != null) {
                    int i11 = qr5VarI.u;
                    int i12 = (int) (jD >> 32);
                    int i13 = (int) (jD & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = uk8Var.a;
                    int i15 = uk8Var.c;
                    int i16 = 0;
                    loop0: while (i16 < jArr2.length - 2 && i16 < i15) {
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iG0;
                            int i20 = i18 + iF0;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = vk8.b;
                                        uk8Var.d((j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25), i25, i26);
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i16 += 3;
                                i11 = i22;
                                i12 = i23;
                                i13 = i24;
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jD >> 32);
                    int i29 = (int) (jD & 4294967295L);
                    int i30 = iG0 + i28;
                    int i31 = i29 + iF0;
                    int i32 = i & 33554431;
                    long[] jArr4 = uk8Var.a;
                    int i33 = uk8Var.c;
                    for (int i34 = 0; i34 < jArr4.length - 2 && i34 < i33; i34 += 3) {
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if (!(i37 != 0) && !(i38 != 0)) {
                                break;
                            }
                            int i39 = vk8.b;
                            uk8Var.d((j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25), i37, i38);
                            break;
                        }
                    }
                }
            }
            qr5Var.y = false;
            this.e = true;
            h();
        }
    }

    public final void f(qr5 qr5Var) {
        if (qr5Var.z) {
            int i = qr5Var.u & 33554431;
            uk8 uk8Var = this.b;
            long[] jArr = uk8Var.a;
            int i2 = uk8Var.c;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = vk8.a;
                    break;
                }
            }
            qr5Var.z = false;
            qr5Var.y = true;
            this.e = true;
            this.g = true;
        }
    }

    public final void h() {
        Object obj = this.h;
        boolean z = obj != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            cm cmVar = this.a;
            if (obj != null) {
                cmVar.d0(obj);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.i = jMax;
            long j2 = jMax - jCurrentTimeMillis;
            final wk8 wk8Var = this.j;
            Runnable runnable = new Runnable() { // from class: yl
                @Override // java.lang.Runnable
                public final void run() {
                    wk8Var.invoke();
                }
            };
            cmVar.postDelayed(runnable, j2);
            this.h = runnable;
        }
    }
}

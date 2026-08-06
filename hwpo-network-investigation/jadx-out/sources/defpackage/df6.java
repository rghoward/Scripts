package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class df6 extends jz7 implements il6, ty6 {
    public lz7 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final ef6 E;
    public xy8 F;
    public c37<uy8, d37<mkb<qr5>>> G;
    public b y;
    public oh4<? super wy8, g2b> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<lz7, g2b> {
        public static final a u = new a(1);

        /* JADX WARN: Code duplicated, block: B:22:0x005c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x005e A[LOOP:0: B:13:0x0027->B:23:0x005e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:24:0x0061 BREAK  A[LOOP:0: B:13:0x0027->B:23:0x005e], SYNTHETIC] */
        @Override // defpackage.oh4
        public final g2b invoke(lz7 lz7Var) {
            lz7 lz7Var2 = lz7Var;
            if (lz7Var2.V()) {
                df6 df6Var = lz7Var2.u;
                if (!df6Var.D) {
                    oh4<wy8, g2b> oh4VarN = lz7Var2.t.n();
                    c37<uy8, d37<mkb<qr5>>> c37Var = df6Var.G;
                    if (oh4VarN != null) {
                        df6Var.q0(lz7Var2, 9223372034707292159L, 0L);
                        df6Var.z = oh4VarN;
                    } else if (c37Var != null) {
                        Object[] objArr = c37Var.c;
                        long[] jArr = c37Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            df6Var.D0((d37) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                        c37Var.g();
                    }
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements wy8 {
        public boolean t;
        public long u = 9223372034707292159L;
        public long v = 0;

        public b() {
        }

        @Override // defpackage.tx2
        public final float N0() {
            return df6.this.N0();
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return df6.this.getDensity();
        }

        @Override // defpackage.wy8
        public final qq5 j0() {
            this.t = true;
            df6 df6Var = df6.this;
            qq5 qq5VarJ0 = df6Var.j0();
            if (bg5.b(this.u, 9223372034707292159L)) {
                this.u = cg5.c(qq5VarJ0.f(0L));
                this.v = qq5VarJ0.a();
            }
            df6Var.x1().Z.b();
            return qq5VarJ0;
        }

        @Override // defpackage.wy8
        public final void j1(uy8 uy8Var, float f) {
            df6 df6Var = df6.this;
            xy8 xy8Var = df6Var.F;
            if (xy8Var == null) {
                xy8Var = new xy8();
                df6Var.F = xy8Var;
            }
            int iA = u30.A(xy8Var.b, uy8Var);
            if (iA >= 0) {
                float[] fArr = xy8Var.c;
                if (fArr[iA] != f) {
                    fArr[iA] = f;
                    xy8Var.d[iA] = 1;
                    return;
                } else {
                    byte[] bArr = xy8Var.d;
                    if (bArr[iA] == 2) {
                        bArr[iA] = 0;
                        return;
                    }
                    return;
                }
            }
            int i = xy8Var.a;
            uy8[] uy8VarArr = xy8Var.b;
            if (i == uy8VarArr.length) {
                int i2 = i * 2;
                xy8Var.b = (uy8[]) Arrays.copyOf(uy8VarArr, i2);
                xy8Var.c = Arrays.copyOf(xy8Var.c, i2);
                xy8Var.d = Arrays.copyOf(xy8Var.d, i2);
            }
            xy8Var.b[i] = uy8Var;
            xy8Var.d[i] = 3;
            xy8Var.c[i] = f;
            xy8Var.a++;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public final /* synthetic */ long v;
        public final /* synthetic */ long w;
        public final /* synthetic */ lz7 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, lz7 lz7Var) {
            super(0);
            this.v = j;
            this.w = j2;
            this.x = lz7Var;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            df6 df6Var = df6.this;
            df6Var.B0().t = false;
            df6Var.B0().u = this.v;
            df6Var.B0().v = this.w;
            oh4<wy8, g2b> oh4VarN = this.x.t.n();
            if (oh4VarN != null) {
                oh4VarN.invoke(df6Var.B0());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements gl6 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<ei, Integer> c;
        public final /* synthetic */ oh4<wy8, g2b> d;
        public final /* synthetic */ oh4<jz7.a, g2b> e;
        public final /* synthetic */ df6 f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2, df6 df6Var) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = oh4Var;
            this.e = oh4Var2;
            this.f = df6Var;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.b;
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.a;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.c;
        }

        @Override // defpackage.gl6
        public final void m() {
            this.e.invoke(this.f.E);
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.d;
        }
    }

    public df6() {
        int i = kz7.b;
        this.E = new ef6(this);
    }

    public static void C0(mb7 mb7Var) {
        sr5 sr5Var;
        mb7 mb7Var2 = mb7Var.K;
        qr5 qr5Var = mb7Var.H;
        if (!xj5.a(mb7Var2 != null ? mb7Var2.H : null, qr5Var)) {
            qr5Var.Z.p.R.g();
            return;
        }
        hi hiVarX = qr5Var.Z.p.x();
        if (hiVarX == null || (sr5Var = ((el6) hiVarX).R) == null) {
            return;
        }
        sr5Var.g();
    }

    public final b B0() {
        b bVar = this.y;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.y = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(d37<mkb<qr5>> d37Var) {
        qr5 qr5Var;
        Object[] objArr = d37Var.b;
        long[] jArr = d37Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (qr5Var = (qr5) ((mkb) objArr[(i << 3) + i3]).get()) != null) {
                        if (P0()) {
                            qr5Var.d0(false);
                        } else {
                            qr5Var.f0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void E0();

    @Override // defpackage.ty6
    public final void M(boolean z) {
        df6 df6VarX0 = x0();
        qr5 qr5VarX1 = df6VarX0 != null ? df6VarX0.x1() : null;
        if (xj5.a(qr5VarX1, x1())) {
            this.B = z;
            return;
        }
        if ((qr5VarX1 != null ? qr5VarX1.Z.d : null) != qr5.d.v) {
            if ((qr5VarX1 != null ? qr5VarX1.Z.d : null) != qr5.d.w) {
                return;
            }
        }
        this.B = z;
    }

    @Override // defpackage.qj5
    public boolean P0() {
        return false;
    }

    @Override // defpackage.kl6
    public final int R(ei eiVar) {
        int iP0;
        if (!t0() || (iP0 = p0(eiVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = eiVar instanceof deb;
        long j = this.x;
        return iP0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.hl6
    public final gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uc5.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i, i2, map, oh4Var, oh4Var2, this);
    }

    public abstract qq5 j0();

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(qr5 qr5Var, uy8 uy8Var) {
        char c2;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c3;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        c37<uy8, d37<mkb<qr5>>> c37Var = this.G;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (c37Var != null) {
            Object[] objArr = c37Var.c;
            long[] jArr3 = c37Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c4) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c3 = c4;
                                d37 d37Var = (d37) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = d37Var.b;
                                long[] jArr4 = d37Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c3) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    qr5 qr5Var2 = (qr5) ((mkb) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (qr5Var2 != null) {
                                                        boolean zE = qr5Var2.e();
                                                        i4 = i8;
                                                        if (zE) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    d37Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c3 = c4;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c4 = c3;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c4 = c2;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c2 = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c2 = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        c37<uy8, d37<mkb<qr5>>> c37Var2 = this.G;
        if (c37Var2 != null) {
            long[] jArr5 = c37Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c2) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((d37) c37Var2.c[i18]).g()) {
                                    c37Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        c37<uy8, d37<mkb<qr5>>> c37Var3 = this.G;
        if (c37Var3 == null) {
            c37Var3 = new c37<>((Object) null);
            this.G = c37Var3;
        }
        d37<mkb<qr5>> d37VarD = c37Var3.d(uy8Var);
        if (d37VarD == null) {
            d37VarD = new d37<>((Object) null);
            c37Var3.m(uy8Var, d37VarD);
        }
        d37VarD.k(new mkb<>(qr5Var));
    }

    public abstract int p0(ei eiVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(lz7 lz7Var, long j, long j2) {
        boolean z;
        char c2;
        long j3;
        long j4;
        long j5;
        qr5 qr5Var;
        boolean z2;
        int i;
        char c3;
        long j6;
        un7 snapshotObserver;
        c37<uy8, d37<mkb<qr5>>> c37Var = this.G;
        xy8 xy8Var = this.F;
        if (xy8Var == null) {
            xy8Var = new xy8();
            this.F = xy8Var;
        }
        xy8 xy8Var2 = xy8Var;
        mn7 mn7Var = x1().G;
        if (mn7Var != null && (snapshotObserver = mn7Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(lz7Var, a.u, new c(j, j2, lz7Var));
        }
        boolean zP0 = P0();
        d37<mkb<qr5>> d37Var = xy8Var2.e;
        d37<uy8> d37Var2 = xy8Var2.f;
        int i2 = xy8Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = xy8Var2.d[i3];
            if (b2 == 3) {
                uy8 uy8Var = xy8Var2.b[i3];
                uy8Var.getClass();
                d37Var2.k(uy8Var);
            } else if (b2 != 0 && c37Var != null) {
                uy8 uy8Var2 = xy8Var2.b[i3];
                uy8Var2.getClass();
                d37<mkb<qr5>> d37VarK = c37Var.k(uy8Var2);
                if (d37VarK != null) {
                    d37Var.j(d37VarK);
                }
            }
        }
        int i4 = xy8Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = xy8Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                uy8[] uy8VarArr = xy8Var2.b;
                uy8VarArr[i6 - i5] = uy8VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = xy8Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            xy8Var2.b[i8] = null;
        }
        xy8Var2.a -= i5;
        df6 df6VarX0 = x0();
        Object[] objArr = d37Var2.b;
        long[] jArr = d37Var2.a;
        int length = jArr.length - 2;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c4) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c3 = c4;
                            uy8 uy8Var3 = (uy8) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            df6 df6Var = df6VarX0 == null ? this : df6VarX0;
                            i = i9;
                            df6 df6Var2 = df6Var;
                            while (true) {
                                xy8 xy8Var3 = df6Var2.F;
                                if (xy8Var3 != null) {
                                    z2 = zP0;
                                    if (u30.t(uy8Var3, xy8Var3.b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zP0;
                                df6 df6VarX1 = df6Var2.x0();
                                if (df6VarX1 == null) {
                                    break;
                                }
                                df6Var2 = df6VarX1;
                                zP0 = z2;
                            }
                            c37<uy8, d37<mkb<qr5>>> c37Var2 = df6Var2.G;
                            d37<mkb<qr5>> d37VarK2 = c37Var2 != null ? c37Var2.k(uy8Var3) : null;
                            if (d37VarK2 != null) {
                                df6Var.D0(d37VarK2);
                            }
                        } else {
                            z2 = zP0;
                            i = i9;
                            c3 = c4;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c4 = c3;
                        j7 = j6;
                        i9 = i;
                        zP0 = z2;
                    }
                    z = zP0;
                    c2 = c4;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zP0;
                    c2 = c4;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c4 = c2;
                j7 = j3;
                zP0 = z;
                i9 = 8;
            }
        } else {
            z = zP0;
            c2 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        d37Var2.b();
        Object[] objArr2 = d37Var.b;
        long[] jArr2 = d37Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c2) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (qr5Var = (qr5) ((mkb) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                qr5Var.d0(false);
                            } else {
                                qr5Var.f0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        d37Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    public final void r0(gl6 gl6Var) {
        long j;
        long j2;
        c37<uy8, d37<mkb<qr5>>> c37Var = this.G;
        if (this.D) {
            return;
        }
        oh4<wy8, g2b> oh4VarN = gl6Var.n();
        if (oh4VarN != null) {
            boolean z = this.z != oh4VarN;
            if (z || !B0().t) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                qq5 qq5VarJ0 = j0();
                long jC = cg5.c(qq5VarJ0.f(0L));
                long jA = qq5VarJ0.a();
                j2 = jC;
                j = jA;
                z = (bg5.b(jC, B0().u) && kg5.b(jA, B0().v)) ? false : true;
            }
            if (z) {
                lz7 lz7Var = this.A;
                if (lz7Var != null) {
                    lz7Var.t = gl6Var;
                } else {
                    lz7Var = new lz7(gl6Var, this);
                    this.A = lz7Var;
                }
                q0(lz7Var, j2, j);
                this.z = gl6Var.n();
                return;
            }
            return;
        }
        if (c37Var != null) {
            Object[] objArr = c37Var.c;
            long[] jArr = c37Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                D0((d37) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c37Var.g();
        }
    }

    public abstract df6 s0();

    public abstract boolean t0();

    public abstract gl6 v0();

    public abstract df6 x0();

    @Override // defpackage.il6
    public abstract qr5 x1();

    public abstract long z0();
}

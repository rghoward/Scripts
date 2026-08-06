package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class my2<T> extends n0a implements ny2<T> {
    public final mh4<T> u;
    public final wu9<T> v;
    public a<T> w = new a<>(qu9.j().g());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends o0a {
        public static final Object h = new Object();
        public long c;
        public int d;
        public s27 e;
        public Object f;
        public int g;

        public a(long j) {
            super(j);
            s27<Object> s27Var = je7.a;
            s27Var.getClass();
            this.e = s27Var;
            this.f = h;
        }

        @Override // defpackage.o0a
        public final void a(o0a o0aVar) {
            o0aVar.getClass();
            a aVar = (a) o0aVar;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // defpackage.o0a
        public final o0a b() {
            return new a(qu9.j().g());
        }

        @Override // defpackage.o0a
        public final o0a c(long j) {
            return new a(j);
        }

        public final boolean d(my2 my2Var, hu9 hu9Var) {
            boolean z;
            boolean z2;
            Object obj = qu9.c;
            synchronized (obj) {
                z = true;
                z2 = (this.c == hu9Var.g() && this.d == hu9Var.h()) ? false : true;
            }
            if (this.f == h || (z2 && this.g != e(my2Var, hu9Var))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (obj) {
                this.c = hu9Var.g();
                this.d = hu9Var.h();
                g2b g2bVar = g2b.a;
            }
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
          0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:50:0x0116, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8, B:56:0x0135, B:60:0x0145), top: B:74:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x014e A[DONT_GENERATE, LOOP:5: B:62:0x014c->B:63:0x014e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10, types: [my2$a] */
        /* JADX WARN: Type inference failed for: r13v5, types: [o0a] */
        /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, o0a] */
        /* JADX WARN: Type inference failed for: r18v3, types: [int] */
        /* JADX WARN: Type inference failed for: r25v0 */
        /* JADX WARN: Type inference failed for: r25v1, types: [int] */
        /* JADX WARN: Type inference failed for: r25v2 */
        /* JADX WARN: Type inference failed for: r25v3 */
        /* JADX WARN: Type inference failed for: r25v4 */
        /* JADX WARN: Type inference failed for: r25v5 */
        /* JADX WARN: Type inference failed for: r25v6 */
        /* JADX WARN: Type inference failed for: r25v7 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8, types: [int] */
        public final int e(my2 my2Var, hu9 hu9Var) {
            s27 s27Var;
            int iIdentityHashCode;
            long[] jArr;
            int i;
            Object[] objArr;
            long[] jArr2;
            ?? r25;
            Object[] objArr2;
            long j;
            long j2;
            int i2;
            ?? r26;
            ?? I;
            synchronized (qu9.c) {
                s27Var = this.e;
            }
            int i3 = 7;
            if (s27Var.e == 0) {
                return 7;
            }
            k37 k37VarE = bl7.e();
            T[] tArr = k37VarE.t;
            int i4 = k37VarE.v;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                ((oy2) tArr[i5]).start();
            }
            try {
                Object[] objArr3 = s27Var.b;
                int[] iArr = s27Var.c;
                long[] jArr3 = s27Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr3[i6];
                        long j4 = -9187201950435737472L;
                        if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            i = i3;
                            ?? r3 = z;
                            while (r3 < i8) {
                                if ((j3 & 255) < 128) {
                                    ?? r18 = (i6 << 3) + r3;
                                    j2 = j4;
                                    m0a m0aVar = (m0a) objArr3[r18];
                                    int i9 = i7;
                                    if (iArr[r18] != 1) {
                                        jArr2 = jArr3;
                                        r25 = r3;
                                        objArr2 = objArr3;
                                        j = j3;
                                    } else {
                                        if (m0aVar instanceof my2) {
                                            my2 my2Var2 = (my2) m0aVar;
                                            I = my2Var2.A((a) qu9.i(my2Var2.w, hu9Var), hu9Var, z, my2Var2.u);
                                            s27 s27Var2 = I.e;
                                            Object[] objArr4 = s27Var2.b;
                                            long[] jArr4 = s27Var2.a;
                                            int length2 = jArr4.length - 2;
                                            jArr2 = jArr3;
                                            r26 = r3;
                                            objArr2 = objArr3;
                                            if (length2 >= 0) {
                                                int i10 = 0;
                                                while (true) {
                                                    long j5 = jArr4[i10];
                                                    j = j3;
                                                    int iIdentityHashCode2 = iIdentityHashCode;
                                                    if ((((~j5) << i) & j5 & j2) == j2) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        if (i10 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i10++;
                                                        j3 = j;
                                                        i9 = 8;
                                                    } else {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                            if ((j5 & 255) < 128) {
                                                                iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((m0a) objArr4[(i10 << 3) + i12]);
                                                            }
                                                            j5 >>= i9;
                                                        }
                                                        if (i11 != i9) {
                                                            iIdentityHashCode = iIdentityHashCode2;
                                                            break;
                                                        }
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        if (i10 != length2) {
                                                            break;
                                                        }
                                                        i10++;
                                                        j3 = j;
                                                        i9 = 8;
                                                    }
                                                }
                                            } else {
                                                j = j3;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            r26 = r3;
                                            objArr2 = objArr3;
                                            j = j3;
                                            I = qu9.i(m0aVar.d(), hu9Var);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.a);
                                        r25 = r26;
                                    }
                                    i2 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr3;
                                    j = j3;
                                    j2 = j4;
                                    i2 = i7;
                                }
                                j3 = j >> i2;
                                i7 = i2;
                                j4 = j2;
                                objArr3 = objArr2;
                                z = false;
                                r3 = r25 + 1;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i = i3;
                            objArr = objArr3;
                        }
                        if (i6 != length) {
                            i6++;
                            i3 = i;
                            jArr3 = jArr;
                            objArr3 = objArr;
                            z = false;
                        } else {
                            i3 = iIdentityHashCode;
                        }
                    }
                    g2b g2bVar = g2b.a;
                    return iIdentityHashCode;
                }
                iIdentityHashCode = i3;
                g2b g2bVar2 = g2b.a;
                return iIdentityHashCode;
            } finally {
                T[] tArr2 = k37VarE.t;
                int i13 = k37VarE.v;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((oy2) tArr2[i14]).a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public my2(mh4<? extends T> mh4Var, wu9<T> wu9Var) {
        this.u = mh4Var;
        this.v = wu9Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x009f A[EDGE_INSN: B:102:0x009f->B:31:0x009f BREAK  A[LOOP:1: B:16:0x004a->B:30:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[Catch: all -> 0x0039, LOOP:1: B:16:0x004a->B:30:0x009b, LOOP_END, TryCatch #1 {all -> 0x0039, blocks: (B:8:0x0024, B:10:0x0030, B:13:0x003c, B:16:0x004a, B:18:0x005a, B:20:0x0066, B:22:0x0070, B:24:0x0088, B:26:0x008e, B:30:0x009b, B:31:0x009f), top: B:94:0x0024 }] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ly2] */
    public final a<T> A(a<T> aVar, hu9 hu9Var, boolean z, mh4<? extends T> mh4Var) {
        int i;
        wu9<T> wu9Var;
        int i2;
        a<T> aVar2 = aVar;
        int i3 = 0;
        if (aVar2.d(this, hu9Var)) {
            if (z) {
                k37 k37VarE = bl7.e();
                T[] tArr = k37VarE.t;
                int i4 = k37VarE.v;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((oy2) tArr[i5]).start();
                }
                try {
                    s27 s27Var = aVar2.e;
                    kv9<hg5> kv9Var = xu9.a;
                    hg5 hg5VarA = kv9Var.a();
                    if (hg5VarA == null) {
                        hg5VarA = new hg5(0);
                        kv9Var.b(hg5VarA);
                    }
                    int i6 = hg5VarA.a;
                    Object[] objArr = s27Var.b;
                    int[] iArr = s27Var.c;
                    long[] jArr = s27Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i7 != length) {
                                    break;
                                    break;
                                }
                                i7++;
                                i3 = 0;
                            } else {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i3;
                                while (i10 < i9) {
                                    if ((j & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        m0a m0aVar = (m0a) objArr[i11];
                                        i2 = i8;
                                        hg5VarA.a = i6 + iArr[i11];
                                        oh4<Object, g2b> oh4VarE = hu9Var.e();
                                        if (oh4VarE != null) {
                                            oh4VarE.invoke(m0aVar);
                                        }
                                    } else {
                                        i2 = i8;
                                    }
                                    j >>= i2;
                                    i10++;
                                    i8 = i2;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                                if (i7 != length) {
                                    break;
                                }
                                i7++;
                                i3 = 0;
                            }
                        }
                    }
                    hg5VarA.a = i6;
                    g2b g2bVar = g2b.a;
                } finally {
                    T[] tArr2 = k37VarE.t;
                    int i12 = k37VarE.v;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((oy2) tArr2[i13]).a();
                    }
                }
            }
            return aVar2;
        }
        final s27 s27Var2 = new s27((Object) null);
        kv9<hg5> kv9Var2 = xu9.a;
        final hg5 hg5VarA2 = kv9Var2.a();
        if (hg5VarA2 == null) {
            i = 0;
            hg5VarA2 = new hg5(0);
            kv9Var2.b(hg5VarA2);
        } else {
            i = 0;
        }
        final int i14 = hg5VarA2.a;
        k37 k37VarE2 = bl7.e();
        T[] tArr3 = k37VarE2.t;
        int i15 = k37VarE2.v;
        for (int i16 = i; i16 < i15; i16++) {
            ((oy2) tArr3[i16]).start();
        }
        try {
            hg5VarA2.a = i14 + 1;
            Object objC = hu9.a.c(new oh4() { // from class: ly2
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    if (obj == this.t) {
                        aa0.c("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof m0a) {
                        int i17 = hg5VarA2.a - i14;
                        s27 s27Var3 = s27Var2;
                        int iD = s27Var3.d(obj);
                        s27Var3.h(Math.min(i17, iD >= 0 ? s27Var3.c[iD] : Integer.MAX_VALUE), obj);
                    }
                    return g2b.a;
                }
            }, mh4Var);
            hg5VarA2.a = i14;
            T[] tArr4 = k37VarE2.t;
            int i17 = k37VarE2.v;
            while (i < i17) {
                ((oy2) tArr4[i]).a();
                i++;
            }
            Object obj = qu9.c;
            synchronized (obj) {
                try {
                    hu9 hu9VarJ = qu9.j();
                    Object obj2 = aVar2.f;
                    if (obj2 == a.h || (wu9Var = this.v) == null || !wu9Var.b((T) objC, (T) obj2)) {
                        a<T> aVar3 = this.w;
                        synchronized (obj) {
                            o0a o0aVarM = qu9.m(aVar3, this);
                            o0aVarM.a(aVar3);
                            o0aVarM.a = hu9VarJ.g();
                            aVar2 = (a) o0aVarM;
                            aVar2.e = s27Var2;
                            aVar2.g = aVar2.e(this, hu9VarJ);
                            aVar2.f = objC;
                        }
                        return aVar2;
                    }
                    aVar2.e = s27Var2;
                    aVar2.g = aVar2.e(this, hu9VarJ);
                } catch (Throwable th) {
                    throw th;
                }
            }
            hg5 hg5VarA3 = xu9.a.a();
            if (hg5VarA3 == null || hg5VarA3.a != 0) {
                return aVar2;
            }
            qu9.j().m();
            synchronized (obj) {
                hu9 hu9VarJ2 = qu9.j();
                aVar2.c = hu9VarJ2.g();
                aVar2.d = hu9VarJ2.h();
                g2b g2bVar2 = g2b.a;
                return aVar2;
            }
        } catch (Throwable th2) {
            T[] tArr5 = k37VarE2.t;
            int i18 = k37VarE2.v;
            for (int i19 = i; i19 < i18; i19++) {
                ((oy2) tArr5[i19]).a();
            }
            throw th2;
        }
    }

    @Override // defpackage.ny2
    public final wu9<T> a() {
        return this.v;
    }

    @Override // defpackage.m0a
    public final o0a d() {
        return this.w;
    }

    @Override // defpackage.yz9
    public final T getValue() {
        oh4<Object, g2b> oh4VarE = qu9.j().e();
        if (oh4VarE != null) {
            oh4VarE.invoke(this);
        }
        hu9 hu9VarJ = qu9.j();
        return (T) A((a) qu9.i(this.w, hu9VarJ), hu9VarJ, true, this.u).f;
    }

    @Override // defpackage.m0a
    public final void q(o0a o0aVar) {
        o0aVar.getClass();
        this.w = (a) o0aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) qu9.h(this.w);
        sb.append(aVar.d(this, qu9.j()) ? String.valueOf(aVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // defpackage.ny2
    public final a x() {
        hu9 hu9VarJ = qu9.j();
        return A((a) qu9.i(this.w, hu9VarJ), hu9VarJ, false, this.u);
    }
}

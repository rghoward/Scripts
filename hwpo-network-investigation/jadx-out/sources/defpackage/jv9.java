package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jv9 {
    public final oh4<mh4<g2b>, g2b> a;
    public boolean c;
    public gu9 h;
    public a i;
    public final AtomicReference<Object> b = new AtomicReference<>(null);
    public final hv9 d = new ci4() { // from class: hv9
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ci4
        public final Object invoke(Object obj, Object obj2) {
            Set setK;
            Set set = (Set) obj;
            final jv9 jv9Var = this.t;
            AtomicReference<Object> atomicReference = jv9Var.b;
            while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 == null) {
                    setK = set;
                } else if (obj3 instanceof Set) {
                    setK = ws0.i(obj3, set);
                } else {
                    if (!(obj3 instanceof List)) {
                        pt1.b("Unexpected notification");
                        fl.a();
                        return null;
                    }
                    setK = th1.K((Collection) obj3, ws0.h(set));
                }
                do {
                    if (atomicReference.compareAndSet(obj3, setK)) {
                        if (jv9Var.c()) {
                            jv9Var.a.invoke(new mh4() { // from class: iv9
                                /* JADX WARN: Code duplicated, block: B:24:0x006a A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: all -> 0x0077, LOOP:2: B:13:0x0029->B:25:0x006c, LOOP_END, TryCatch #0 {all -> 0x0077, blocks: (B:8:0x000e, B:10:0x0017, B:13:0x0029, B:15:0x003c, B:17:0x0048, B:19:0x0052, B:21:0x0060, B:25:0x006c, B:26:0x006f), top: B:45:0x000e, outer: #1 }] */
                                /* JADX WARN: Code duplicated, block: B:53:0x006f A[EDGE_INSN: B:53:0x006f->B:26:0x006f BREAK  A[LOOP:2: B:13:0x0029->B:25:0x006c], SYNTHETIC] */
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    jv9 jv9Var2 = jv9Var;
                                    do {
                                        synchronized (jv9Var2.g) {
                                            try {
                                                if (!jv9Var2.c) {
                                                    jv9Var2.c = true;
                                                    try {
                                                        k37<jv9.a> k37Var = jv9Var2.f;
                                                        jv9.a[] aVarArr = k37Var.t;
                                                        int i = k37Var.v;
                                                        for (int i2 = 0; i2 < i; i2++) {
                                                            jv9.a aVar = aVarArr[i2];
                                                            d37<Object> d37Var = aVar.g;
                                                            oh4<Object, g2b> oh4Var = aVar.a;
                                                            Object[] objArr = d37Var.b;
                                                            long[] jArr = d37Var.a;
                                                            int length = jArr.length - 2;
                                                            if (length >= 0) {
                                                                int i3 = 0;
                                                                while (true) {
                                                                    long j = jArr[i3];
                                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i3 != length) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i3++;
                                                                    } else {
                                                                        int i4 = 8;
                                                                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                                                                        int i6 = 0;
                                                                        while (i6 < i5) {
                                                                            if ((j & 255) < 128) {
                                                                                oh4Var.invoke(objArr[(i3 << 3) + i6]);
                                                                            }
                                                                            j >>= i4;
                                                                            i6++;
                                                                            i4 = i4;
                                                                        }
                                                                        if (i5 != i4) {
                                                                            break;
                                                                        }
                                                                        if (i3 != length) {
                                                                            break;
                                                                        }
                                                                        i3++;
                                                                    }
                                                                }
                                                            }
                                                            d37Var.b();
                                                        }
                                                        jv9Var2.c = false;
                                                    } catch (Throwable th) {
                                                        jv9Var2.c = false;
                                                        throw th;
                                                    }
                                                }
                                                g2b g2bVar = g2b.a;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    } while (jv9Var2.c());
                                    return g2b.a;
                                }
                            });
                        }
                        return g2b.a;
                    }
                } while (atomicReference.get() == obj3);
            }
        }
    };
    public final nl7 e = new nl7(3, this);
    public final k37<a> f = new k37<>(new a[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final oh4<Object, g2b> a;
        public Object b;
        public s27<Object> c;
        public boolean j;
        public int k;
        public int d = -1;
        public final c37<Object, Object> e = z39.b();
        public final c37<Object, s27<Object>> f = new c37<>((Object) null);
        public final d37<Object> g = new d37<>((Object) null);
        public final k37<ny2<?>> h = new k37<>(new ny2[16]);
        public final C0188a i = new C0188a();
        public final c37<Object, Object> l = z39.b();
        public final HashMap<ny2<?>, Object> m = new HashMap<>();

        /* JADX INFO: renamed from: jv9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0188a implements oy2 {
            public C0188a() {
            }

            @Override // defpackage.oy2
            public final void a() {
                a.this.k--;
            }

            @Override // defpackage.oy2
            public final void start() {
                a.this.k++;
            }
        }

        public a(oh4<Object, g2b> oh4Var) {
            this.a = oh4Var;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x024b A[DONT_INVERT, PHI: r12
          0x024b: PHI (r12v49 boolean) = (r12v48 boolean), (r12v50 boolean) binds: [B:96:0x0224, B:104:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:106:0x024d A[Catch: all -> 0x012a, LOOP:8: B:95:0x021a->B:106:0x024d, LOOP_END, TryCatch #1 {all -> 0x012a, blocks: (B:24:0x0077, B:26:0x007d, B:28:0x0081, B:31:0x0097, B:33:0x00a5, B:35:0x00af, B:37:0x00b5, B:40:0x00d2, B:42:0x00e0, B:44:0x00e6, B:46:0x00ea, B:49:0x00fc, B:51:0x010c, B:53:0x0116, B:55:0x011c, B:59:0x0130, B:65:0x0142, B:68:0x0163, B:72:0x0183, B:66:0x014d, B:69:0x0166, B:79:0x01b3, B:83:0x01d8, B:86:0x01f6, B:88:0x0202, B:90:0x0208, B:92:0x020c, B:95:0x021a, B:97:0x0226, B:99:0x0232, B:101:0x0238, B:102:0x0241, B:106:0x024d, B:107:0x0250, B:108:0x0254, B:109:0x0258), top: B:333:0x0077 }] */
        /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[DONT_INVERT, PHI: r12
          0x02c9: PHI (r12v38 boolean) = (r12v37 boolean), (r12v39 boolean) binds: [B:124:0x02a1, B:132:0x02c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:134:0x02cb A[LOOP:6: B:123:0x0297->B:134:0x02cb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:209:0x0454  */
        /* JADX WARN: Code duplicated, block: B:252:0x0528 A[EDGE_INSN: B:252:0x0528->B:253:0x0529 BREAK  A[LOOP:20: B:236:0x04e7->B:249:0x051e], PHI: r3
          0x0528: PHI (r3v10 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v15 boolean) binds: [B:230:0x04d2, B:234:0x04e3, B:250:0x0521] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:256:0x0533  */
        /* JADX WARN: Code duplicated, block: B:280:0x0596 A[DONT_INVERT, PHI: r0
          0x0596: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:271:0x056e, B:279:0x0594] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:281:0x0598 A[LOOP:18: B:270:0x0564->B:281:0x0598, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:347:0x02d2 A[EDGE_INSN: B:347:0x02d2->B:136:0x02d2 BREAK  A[LOOP:6: B:123:0x0297->B:134:0x02cb], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:352:0x0254 A[EDGE_INSN: B:352:0x0254->B:108:0x0254 BREAK  A[LOOP:8: B:95:0x021a->B:106:0x024d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:373:0x059f A[EDGE_INSN: B:373:0x059f->B:283:0x059f BREAK  A[LOOP:18: B:270:0x0564->B:281:0x0598], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x015b  */
        public final boolean a(Set<? extends Object> set) {
            char c;
            long j;
            boolean z;
            Iterator it;
            Object obj;
            int i;
            boolean z2;
            Object[] objArr;
            Iterator it2;
            Object obj2;
            c37<Object, Object> c37Var;
            int i2;
            Object[] objArr2;
            long j2;
            boolean z3;
            long[] jArr;
            int i3;
            int i4;
            boolean z4;
            ny2<?> ny2Var;
            ny2<?> ny2Var2;
            long[] jArr2;
            d3a d3aVar;
            Object[] objArr3;
            c37<Object, Object> c37Var2;
            HashMap<ny2<?>, Object> map;
            long[] jArr3;
            d3a d3aVar2;
            Object[] objArr4;
            c37<Object, Object> c37Var3;
            HashMap<ny2<?>, Object> map2;
            int i5;
            int i6;
            long j3;
            HashMap<ny2<?>, Object> map3;
            Object[] objArr5;
            c37<Object, Object> c37Var4;
            HashMap<ny2<?>, Object> map4;
            int i7;
            int i8;
            long j4;
            int i9;
            long[] jArr4;
            d3a d3aVar3 = d3a.u;
            boolean z5 = set instanceof b49;
            k37<ny2<?>> k37Var = this.h;
            c37<Object, Object> c37Var5 = this.l;
            HashMap<ny2<?>, Object> map5 = this.m;
            c37<Object, Object> c37Var6 = this.e;
            d37<Object> d37Var = this.g;
            if (z5) {
                d37 d37Var2 = ((b49) set).t;
                Object[] objArr6 = d37Var2.b;
                long[] jArr5 = d37Var2.a;
                c = 7;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    z = false;
                    j = -9187201950435737472L;
                    while (true) {
                        int i11 = 8;
                        long j5 = jArr5[i10];
                        int i12 = i10;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    Object obj3 = objArr6[(i12 << 3) + i14];
                                    jArr3 = jArr5;
                                    if (obj3 instanceof n0a) {
                                        d3aVar2 = d3aVar3;
                                        if (!((n0a) obj3).m(2)) {
                                        }
                                        i14++;
                                        i11 = 8;
                                        jArr5 = jArr3;
                                        objArr6 = objArr4;
                                        length = i5;
                                        i13 = i6;
                                        j5 = j3 >> 8;
                                        c37Var5 = c37Var3;
                                        map5 = map2;
                                        d3aVar3 = d3aVar2;
                                    } else {
                                        d3aVar2 = d3aVar3;
                                    }
                                    if (this.j || !c37Var5.b(obj3)) {
                                        objArr4 = objArr6;
                                        c37Var3 = c37Var5;
                                        map2 = map5;
                                        i5 = length;
                                        i6 = i13;
                                        i14 = i14;
                                        j3 = j5;
                                    } else {
                                        this.j = true;
                                        try {
                                            Object objD = c37Var5.d(obj3);
                                            if (objD == null) {
                                                objArr4 = objArr6;
                                                c37Var3 = c37Var5;
                                                map2 = map5;
                                                i5 = length;
                                                i6 = i13;
                                                i14 = i14;
                                                j3 = j5;
                                            } else if (objD instanceof d37) {
                                                d37 d37Var3 = (d37) objD;
                                                Object[] objArr7 = d37Var3.b;
                                                long[] jArr6 = d37Var3.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    boolean z6 = z;
                                                    int i15 = 0;
                                                    while (true) {
                                                        long j6 = jArr6[i15];
                                                        j3 = j5;
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i17 = 0;
                                                            while (i17 < i16) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr5 = objArr6;
                                                                    ny2 ny2Var3 = (ny2) objArr7[(i15 << 3) + i17];
                                                                    ny2Var3.getClass();
                                                                    j4 = j6;
                                                                    Object obj4 = map5.get(ny2Var3);
                                                                    wu9 wu9VarA = ny2Var3.a();
                                                                    if (wu9VarA == null) {
                                                                        wu9VarA = d3aVar2;
                                                                    }
                                                                    i9 = i17;
                                                                    if (wu9VarA.b(ny2Var3.x().f, obj4)) {
                                                                        c37Var4 = c37Var5;
                                                                        map4 = map5;
                                                                        i7 = length;
                                                                        i8 = i13;
                                                                        k37Var.d(ny2Var3);
                                                                    } else {
                                                                        Object objD2 = c37Var6.d(ny2Var3);
                                                                        if (objD2 == null) {
                                                                            c37Var4 = c37Var5;
                                                                            map4 = map5;
                                                                            i7 = length;
                                                                            i8 = i13;
                                                                        } else if (objD2 instanceof d37) {
                                                                            d37 d37Var4 = (d37) objD2;
                                                                            Object[] objArr8 = d37Var4.b;
                                                                            long[] jArr7 = d37Var4.a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i7 = length;
                                                                                i8 = i13;
                                                                                int i18 = 0;
                                                                                while (true) {
                                                                                    long j7 = jArr7[i18];
                                                                                    c37Var4 = c37Var5;
                                                                                    map4 = map5;
                                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                                                        int i20 = 0;
                                                                                        while (i20 < i19) {
                                                                                            if ((j7 & 255) < 128) {
                                                                                                d37Var.a(objArr8[(i18 << 3) + i20]);
                                                                                                z6 = true;
                                                                                            }
                                                                                            j7 >>= i11;
                                                                                            i20++;
                                                                                            jArr7 = jArr7;
                                                                                        }
                                                                                        jArr4 = jArr7;
                                                                                        if (i19 != i11) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr7;
                                                                                    }
                                                                                    if (i18 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i18++;
                                                                                    c37Var5 = c37Var4;
                                                                                    map5 = map4;
                                                                                    jArr7 = jArr4;
                                                                                    i11 = 8;
                                                                                }
                                                                            } else {
                                                                                c37Var4 = c37Var5;
                                                                                map4 = map5;
                                                                                i7 = length;
                                                                                i8 = i13;
                                                                            }
                                                                        } else {
                                                                            c37Var4 = c37Var5;
                                                                            map4 = map5;
                                                                            i7 = length;
                                                                            i8 = i13;
                                                                            d37Var.a(objD2);
                                                                            z6 = true;
                                                                        }
                                                                        g2b g2bVar = g2b.a;
                                                                    }
                                                                } else {
                                                                    objArr5 = objArr6;
                                                                    c37Var4 = c37Var5;
                                                                    map4 = map5;
                                                                    i7 = length;
                                                                    i8 = i13;
                                                                    j4 = j6;
                                                                    i9 = i17;
                                                                }
                                                                j6 = j4 >> 8;
                                                                i17 = i9 + 1;
                                                                i11 = 8;
                                                                objArr6 = objArr5;
                                                                length = i7;
                                                                i13 = i8;
                                                                c37Var5 = c37Var4;
                                                                map5 = map4;
                                                            }
                                                            objArr4 = objArr6;
                                                            c37Var3 = c37Var5;
                                                            map3 = map5;
                                                            i5 = length;
                                                            i6 = i13;
                                                            if (i16 != i11) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr4 = objArr6;
                                                            c37Var3 = c37Var5;
                                                            map3 = map5;
                                                            i5 = length;
                                                            i6 = i13;
                                                        }
                                                        if (i15 == length2) {
                                                            break;
                                                        }
                                                        i15++;
                                                        j5 = j3;
                                                        objArr6 = objArr4;
                                                        length = i5;
                                                        i13 = i6;
                                                        c37Var5 = c37Var3;
                                                        map5 = map3;
                                                        i11 = 8;
                                                    }
                                                    z = z6;
                                                } else {
                                                    objArr4 = objArr6;
                                                    c37Var3 = c37Var5;
                                                    map3 = map5;
                                                    i5 = length;
                                                    i6 = i13;
                                                    j3 = j5;
                                                }
                                                map2 = map3;
                                            } else {
                                                objArr4 = objArr6;
                                                c37Var3 = c37Var5;
                                                i5 = length;
                                                i6 = i13;
                                                i14 = i14;
                                                j3 = j5;
                                                ny2 ny2Var4 = (ny2) objD;
                                                map2 = map5;
                                                Object obj5 = map2.get(ny2Var4);
                                                wu9 wu9VarA2 = ny2Var4.a();
                                                if (wu9VarA2 == null) {
                                                    wu9VarA2 = d3aVar2;
                                                }
                                                if (wu9VarA2.b(ny2Var4.x().f, obj5)) {
                                                    k37Var.d(ny2Var4);
                                                } else {
                                                    Object objD3 = c37Var6.d(ny2Var4);
                                                    if (objD3 != null) {
                                                        if (objD3 instanceof d37) {
                                                            d37 d37Var5 = (d37) objD3;
                                                            Object[] objArr9 = d37Var5.b;
                                                            long[] jArr8 = d37Var5.a;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    long j8 = jArr8[i21];
                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i21 != length4) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                    } else {
                                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j8 & 255) < 128) {
                                                                                d37Var.a(objArr9[(i21 << 3) + i23]);
                                                                                z = true;
                                                                            }
                                                                            j8 >>= 8;
                                                                        }
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i21 != length4) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            d37Var.a(objD3);
                                                            z = true;
                                                        }
                                                    }
                                                    g2b g2bVar2 = g2b.a;
                                                }
                                            }
                                            this.j = false;
                                        } catch (Throwable th) {
                                            this.j = false;
                                            throw th;
                                        }
                                    }
                                    Object objD4 = c37Var6.d(obj3);
                                    if (objD4 != null) {
                                        if (objD4 instanceof d37) {
                                            d37 d37Var6 = (d37) objD4;
                                            Object[] objArr10 = d37Var6.b;
                                            long[] jArr9 = d37Var6.a;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j9 = jArr9[i24];
                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i24 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i24++;
                                                    } else {
                                                        int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                        long j10 = j9;
                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                            if ((j10 & 255) < 128) {
                                                                d37Var.a(objArr10[(i24 << 3) + i26]);
                                                                z = true;
                                                            }
                                                            j10 >>= 8;
                                                        }
                                                        if (i25 != 8) {
                                                            break;
                                                        }
                                                        if (i24 != length5) {
                                                            break;
                                                        }
                                                        i24++;
                                                    }
                                                }
                                            }
                                        } else {
                                            d37Var.a(objD4);
                                            z = true;
                                        }
                                    }
                                    i14++;
                                    i11 = 8;
                                    jArr5 = jArr3;
                                    objArr6 = objArr4;
                                    length = i5;
                                    i13 = i6;
                                    j5 = j3 >> 8;
                                    c37Var5 = c37Var3;
                                    map5 = map2;
                                    d3aVar3 = d3aVar2;
                                } else {
                                    jArr3 = jArr5;
                                    d3aVar2 = d3aVar3;
                                }
                                objArr4 = objArr6;
                                c37Var3 = c37Var5;
                                map2 = map5;
                                i5 = length;
                                i6 = i13;
                                i14 = i14;
                                j3 = j5;
                                i14++;
                                i11 = 8;
                                jArr5 = jArr3;
                                objArr6 = objArr4;
                                length = i5;
                                i13 = i6;
                                j5 = j3 >> 8;
                                c37Var5 = c37Var3;
                                map5 = map2;
                                d3aVar3 = d3aVar2;
                            }
                            jArr2 = jArr5;
                            d3aVar = d3aVar3;
                            objArr3 = objArr6;
                            c37Var2 = c37Var5;
                            map = map5;
                            int i27 = length;
                            if (i13 != i11) {
                                break;
                            }
                            length = i27;
                        } else {
                            jArr2 = jArr5;
                            d3aVar = d3aVar3;
                            objArr3 = objArr6;
                            c37Var2 = c37Var5;
                            map = map5;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i10 = i12 + 1;
                        map5 = map;
                        jArr5 = jArr2;
                        d3aVar3 = d3aVar;
                        objArr6 = objArr3;
                        c37Var5 = c37Var2;
                    }
                } else {
                    j = -9187201950435737472L;
                    z = false;
                }
            } else {
                c37<Object, Object> c37Var7 = c37Var5;
                c = 7;
                j = -9187201950435737472L;
                Iterator it3 = set.iterator();
                boolean z7 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof n0a) || ((n0a) next).m(2)) {
                        if (this.j) {
                            it = it3;
                            obj = next;
                            i = 0;
                        } else {
                            c37<Object, Object> c37Var8 = c37Var7;
                            if (c37Var8.b(next)) {
                                this.j = true;
                                try {
                                    Object objD5 = c37Var8.d(next);
                                    if (objD5 == null) {
                                        it = it3;
                                        obj = next;
                                        c37Var7 = c37Var8;
                                    } else if (objD5 instanceof d37) {
                                        d37 d37Var7 = (d37) objD5;
                                        Object[] objArr11 = d37Var7.b;
                                        long[] jArr10 = d37Var7.a;
                                        int length6 = jArr10.length - 2;
                                        if (length6 >= 0) {
                                            boolean z8 = z7;
                                            int i28 = 0;
                                            while (true) {
                                                long j11 = jArr10[i28];
                                                long[] jArr11 = jArr10;
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length6)) >>> 31);
                                                    int i30 = 0;
                                                    while (i30 < i29) {
                                                        if ((j11 & 255) < 128) {
                                                            it2 = it3;
                                                            ny2 ny2Var5 = (ny2) objArr11[(i28 << 3) + i30];
                                                            ny2Var5.getClass();
                                                            c37Var = c37Var8;
                                                            Object obj6 = map5.get(ny2Var5);
                                                            wu9 wu9VarA3 = ny2Var5.a();
                                                            i2 = i30;
                                                            wu9 wu9Var = wu9VarA3 == null ? d3aVar3 : wu9VarA3;
                                                            objArr2 = objArr11;
                                                            if (wu9Var.b(ny2Var5.x().f, obj6)) {
                                                                obj2 = next;
                                                                j2 = j11;
                                                                k37Var.d(ny2Var5);
                                                            } else {
                                                                Object objD6 = c37Var6.d(ny2Var5);
                                                                if (objD6 == null) {
                                                                    obj2 = next;
                                                                    j2 = j11;
                                                                    z3 = z8;
                                                                    break;
                                                                }
                                                                if (objD6 instanceof d37) {
                                                                    d37 d37Var8 = (d37) objD6;
                                                                    Object[] objArr12 = d37Var8.b;
                                                                    long[] jArr12 = d37Var8.a;
                                                                    int length7 = jArr12.length - 2;
                                                                    if (length7 >= 0) {
                                                                        j2 = j11;
                                                                        int i31 = 0;
                                                                        boolean z9 = z8;
                                                                        while (true) {
                                                                            long j12 = jArr12[i31];
                                                                            obj2 = next;
                                                                            Object[] objArr13 = objArr12;
                                                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                                                                int i33 = 0;
                                                                                while (i33 < i32) {
                                                                                    if ((j12 & 255) < 128) {
                                                                                        d37Var.a(objArr13[(i31 << 3) + i33]);
                                                                                        z9 = true;
                                                                                    }
                                                                                    j12 >>= 8;
                                                                                    i33++;
                                                                                    jArr12 = jArr12;
                                                                                }
                                                                                jArr = jArr12;
                                                                                if (i32 != 8) {
                                                                                    z3 = z9;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr = jArr12;
                                                                            }
                                                                            if (i31 != length7) {
                                                                                i31++;
                                                                                next = obj2;
                                                                                objArr12 = objArr13;
                                                                                jArr12 = jArr;
                                                                            } else {
                                                                                z8 = z9;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj2 = next;
                                                                        j2 = j11;
                                                                    }
                                                                    z3 = z8;
                                                                    break;
                                                                } else {
                                                                    obj2 = next;
                                                                    j2 = j11;
                                                                    d37Var.a(objD6);
                                                                    z3 = true;
                                                                }
                                                                g2b g2bVar3 = g2b.a;
                                                                z8 = z3;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            obj2 = next;
                                                            c37Var = c37Var8;
                                                            i2 = i30;
                                                            objArr2 = objArr11;
                                                            j2 = j11;
                                                        }
                                                        i30 = i2 + 1;
                                                        it3 = it2;
                                                        j11 = j2 >> 8;
                                                        objArr11 = objArr2;
                                                        next = obj2;
                                                        c37Var8 = c37Var;
                                                    }
                                                    it = it3;
                                                    obj = next;
                                                    c37Var7 = c37Var8;
                                                    objArr = objArr11;
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj = next;
                                                    c37Var7 = c37Var8;
                                                    objArr = objArr11;
                                                }
                                                if (i28 == length6) {
                                                    break;
                                                }
                                                i28++;
                                                it3 = it;
                                                jArr10 = jArr11;
                                                objArr11 = objArr;
                                                next = obj;
                                                c37Var8 = c37Var7;
                                            }
                                            z7 = z8;
                                        } else {
                                            it = it3;
                                            obj = next;
                                            c37Var7 = c37Var8;
                                        }
                                    } else {
                                        it = it3;
                                        obj = next;
                                        c37Var7 = c37Var8;
                                        ny2 ny2Var6 = (ny2) objD5;
                                        Object obj7 = map5.get(ny2Var6);
                                        wu9 wu9VarA4 = ny2Var6.a();
                                        if (wu9VarA4 == null) {
                                            wu9VarA4 = d3aVar3;
                                        }
                                        if (wu9VarA4.b(ny2Var6.x().f, obj7)) {
                                            k37Var.d(ny2Var6);
                                        } else {
                                            Object objD7 = c37Var6.d(ny2Var6);
                                            if (objD7 == null) {
                                                z2 = z7;
                                                break;
                                            }
                                            if (objD7 instanceof d37) {
                                                d37 d37Var9 = (d37) objD7;
                                                Object[] objArr14 = d37Var9.b;
                                                long[] jArr13 = d37Var9.a;
                                                int length8 = jArr13.length - 2;
                                                if (length8 < 0) {
                                                    z2 = z7;
                                                    break;
                                                }
                                                boolean z10 = z7;
                                                int i34 = 0;
                                                while (true) {
                                                    long j13 = jArr13[i34];
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i34 - length8)) >>> 31);
                                                        long j14 = j13;
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            if ((j14 & 255) < 128) {
                                                                d37Var.a(objArr14[(i34 << 3) + i36]);
                                                                z10 = true;
                                                            }
                                                            j14 >>= 8;
                                                        }
                                                        if (i35 != 8) {
                                                            z2 = z10;
                                                            break;
                                                        }
                                                    }
                                                    if (i34 == length8) {
                                                        z7 = z10;
                                                        z2 = z7;
                                                        break;
                                                    }
                                                    i34++;
                                                }
                                            } else {
                                                d37Var.a(objD7);
                                                z2 = true;
                                            }
                                            g2b g2bVar4 = g2b.a;
                                            z7 = z2;
                                        }
                                    }
                                    i = 0;
                                    this.j = false;
                                } catch (Throwable th2) {
                                    this.j = false;
                                    throw th2;
                                }
                            } else {
                                c37Var7 = c37Var8;
                                it = it3;
                                obj = next;
                                i = 0;
                            }
                        }
                        boolean z11 = z7;
                        Object objD8 = c37Var6.d(obj);
                        if (objD8 != null) {
                            if (objD8 instanceof d37) {
                                d37 d37Var10 = (d37) objD8;
                                Object[] objArr15 = d37Var10.b;
                                long[] jArr14 = d37Var10.a;
                                int length9 = jArr14.length - 2;
                                if (length9 >= 0) {
                                    int i37 = i;
                                    while (true) {
                                        long j15 = jArr14[i37];
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i37 != length9) {
                                                break;
                                                break;
                                            }
                                            i37++;
                                        } else {
                                            int i38 = 8 - ((~(i37 - length9)) >>> 31);
                                            long j16 = j15;
                                            for (int i39 = i; i39 < i38; i39++) {
                                                if ((j16 & 255) < 128) {
                                                    d37Var.a(objArr15[(i37 << 3) + i39]);
                                                    z11 = true;
                                                }
                                                j16 >>= 8;
                                            }
                                            if (i38 != 8) {
                                                break;
                                            }
                                            if (i37 != length9) {
                                                break;
                                            }
                                            i37++;
                                        }
                                    }
                                }
                            } else {
                                d37Var.a(objD8);
                                z11 = true;
                            }
                        }
                        z7 = z11;
                    } else {
                        it = it3;
                    }
                    it3 = it;
                }
                z = z7;
            }
            int i40 = 0;
            if (this.j || (i3 = k37Var.v) == 0) {
                return z;
            }
            ny2<?>[] ny2VarArr = k37Var.t;
            int i41 = 0;
            while (i41 < i3) {
                ny2<?> ny2Var7 = ny2VarArr[i41];
                int iHashCode = Long.hashCode(qu9.j().g());
                Object objD9 = c37Var6.d(ny2Var7);
                if (objD9 != null) {
                    boolean z12 = objD9 instanceof d37;
                    c37<Object, s27<Object>> c37Var9 = this.f;
                    if (z12) {
                        d37 d37Var11 = (d37) objD9;
                        Object[] objArr16 = d37Var11.b;
                        long[] jArr15 = d37Var11.a;
                        int length10 = jArr15.length - 2;
                        if (length10 >= 0) {
                            int i42 = i40;
                            ny2<?> ny2Var8 = ny2Var7;
                            while (true) {
                                long j17 = jArr15[i42];
                                z4 = z;
                                if ((((~j17) << c) & j17 & j) != j) {
                                    int i43 = 8 - ((~(i42 - length10)) >>> 31);
                                    long j18 = j17;
                                    int i44 = 0;
                                    while (i44 < i43) {
                                        if ((j18 & 255) < 128) {
                                            Object obj8 = objArr16[(i42 << 3) + i44];
                                            s27<Object> s27VarD = c37Var9.d(obj8);
                                            if (s27VarD == null) {
                                                s27VarD = new s27<>((Object) null);
                                                c37Var9.m(obj8, s27VarD);
                                                g2b g2bVar5 = g2b.a;
                                            }
                                            ny2Var2 = ny2Var8;
                                            b(ny2Var2, iHashCode, obj8, s27VarD);
                                        } else {
                                            i3 = i3;
                                            ny2Var2 = ny2Var8;
                                        }
                                        j18 >>= 8;
                                        i44++;
                                        ny2Var8 = ny2Var2;
                                        i3 = i3;
                                    }
                                    i4 = i3;
                                    ny2Var = ny2Var8;
                                    if (i43 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    ny2Var = ny2Var8;
                                }
                                if (i42 == length10) {
                                    break;
                                }
                                i42++;
                                ny2Var8 = ny2Var;
                                z = z4;
                                i3 = i4;
                            }
                        } else {
                            i4 = i3;
                            z4 = z;
                        }
                    } else {
                        i4 = i3;
                        z4 = z;
                        s27<Object> s27VarD2 = c37Var9.d(objD9);
                        if (s27VarD2 == null) {
                            s27VarD2 = new s27<>((Object) null);
                            c37Var9.m(objD9, s27VarD2);
                            g2b g2bVar6 = g2b.a;
                        }
                        b(ny2Var7, iHashCode, objD9, s27VarD2);
                    }
                } else {
                    i4 = i3;
                    z4 = z;
                }
                i41++;
                z = z4;
                i3 = i4;
                i40 = 0;
            }
            boolean z13 = z;
            k37Var.k();
            return z13;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
        public final void b(Object obj, int i, Object obj2, s27<Object> s27Var) {
            int i2;
            if (this.k > 0) {
                return;
            }
            int iC = s27Var.c(obj);
            if (iC < 0) {
                iC = ~iC;
                i2 = -1;
            } else {
                i2 = s27Var.c[iC];
            }
            s27Var.b[iC] = obj;
            s27Var.c[iC] = i;
            if ((obj instanceof ny2) && i2 != i) {
                my2.a aVarX = ((ny2) obj).x();
                this.m.put(obj, aVarX.f);
                s27 s27Var2 = aVarX.e;
                c37<Object, Object> c37Var = this.l;
                j59.c(c37Var, obj);
                Object[] objArr = s27Var2.b;
                long[] jArr = s27Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    m0a m0aVar = (m0a) objArr[(i3 << 3) + i5];
                                    if (m0aVar instanceof n0a) {
                                        ((n0a) m0aVar).y(2);
                                    }
                                    j59.a(c37Var, m0aVar, obj);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof n0a) {
                    ((n0a) obj).y(2);
                }
                j59.a(this.e, obj, obj2);
            }
        }

        public final void c(Object obj, Object obj2) {
            c37<Object, Object> c37Var = this.e;
            j59.b(c37Var, obj2, obj);
            if (!(obj2 instanceof ny2) || c37Var.b(obj2)) {
                return;
            }
            j59.c(this.l, obj2);
            this.m.remove(obj2);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[EDGE_INSN: B:49:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
        public final void d() {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            Boolean bool;
            c37<Object, s27<Object>> c37Var = this.f;
            long[] jArr3 = c37Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j3 = jArr3[i2];
                char c2 = 7;
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = c37Var.b[i6];
                            j2 = j4;
                            s27 s27Var = (s27) c37Var.c[i6];
                            Boolean bool2 = (Boolean) on7.u.invoke(obj);
                            if (bool2.booleanValue()) {
                                Object[] objArr = s27Var.b;
                                int[] iArr = s27Var.c;
                                long[] jArr4 = s27Var.a;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j3;
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        bool = bool2;
                                        if ((((~j5) << c) & j5 & j2) == j2) {
                                            if (i8 != length2) {
                                                break;
                                                break;
                                            }
                                            i8++;
                                            bool2 = bool;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        } else {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j5 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    c(obj, obj2);
                                                }
                                                j5 >>= i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                            if (i8 != length2) {
                                                break;
                                            }
                                            i8++;
                                            bool2 = bool;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j = j3;
                                    bool = bool2;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                c37Var.l(i6);
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                            c = c2;
                            j2 = j4;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j3 = j >> i;
                        c2 = c;
                        j4 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [hv9] */
    public jv9(oh4<? super mh4<g2b>, g2b> oh4Var) {
        this.a = oh4Var;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                k37<a> k37Var = this.f;
                a[] aVarArr = k37Var.t;
                int i = k37Var.v;
                for (int i2 = 0; i2 < i; i2++) {
                    a aVar = aVarArr[i2];
                    aVar.e.g();
                    aVar.f.g();
                    aVar.l.g();
                    aVar.m.clear();
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                k37<a> k37Var = this.f;
                int i2 = k37Var.v;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    a[] aVarArr = k37Var.t;
                    if (i3 < i2) {
                        a aVar = aVarArr[i3];
                        s27<Object> s27VarK = aVar.f.k(obj);
                        if (s27VarK == null) {
                            i = i3;
                        } else {
                            Object[] objArr = s27VarK.b;
                            int[] iArr = s27VarK.c;
                            long[] jArr = s27VarK.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr[i8];
                                                int i9 = iArr[i8];
                                                aVar.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!aVar.f.f()) {
                            i4++;
                        } else if (i4 > 0) {
                            a[] aVarArr2 = k37Var.t;
                            aVarArr2[i - i4] = aVarArr2[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(aVarArr, i10, i2, (Object) null);
                        k37Var.v = i10;
                        g2b g2bVar = g2b.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference<Object> atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        pt1.b("Unexpected notification");
                        fl.a();
                        return false;
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                do {
                    if (atomicReference.compareAndSet(obj, objSubList)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                try {
                    k37<a> k37Var = this.f;
                    a[] aVarArr = k37Var.t;
                    int i = k37Var.v;
                    for (int i2 = 0; i2 < i; i2++) {
                        z2 = aVarArr[i2].a(set) || z2;
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void d(T t, oh4<? super T, g2b> oh4Var, mh4<g2b> mh4Var) {
        a aVar;
        a aVar2;
        boolean z;
        a aVar3;
        long j;
        g2b g2bVar;
        long j2;
        a aVar4;
        hu9 zwaVar;
        long j3;
        s27<Object> s27Var;
        int i;
        long j4;
        s27<Object> s27Var2;
        long jA = e00.a();
        synchronized (this.g) {
            k37<a> k37Var = this.f;
            a[] aVarArr = k37Var.t;
            int i2 = k37Var.v;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    aVar = null;
                    break;
                }
                aVar = aVarArr[i3];
                if (aVar.a == oh4Var) {
                    break;
                } else {
                    i3++;
                }
            }
            aVar2 = aVar;
            z = true;
            if (aVar2 == null) {
                oh4Var.getClass();
                fza.b(1, oh4Var);
                aVar2 = new a(oh4Var);
                k37Var.d(aVar2);
            }
            aVar3 = this.i;
            j = this.j;
            g2bVar = g2b.a;
        }
        Object obj = g2bVar;
        if (j != -1 && j != jA) {
            obj = g2bVar;
            StringBuilder sbB = ao3.b("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j, "), currentThread={id=");
            sbB.append(jA);
            sbB.append(", name=");
            sbB.append(Thread.currentThread().getName());
            sbB.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            c78.a(sbB.toString());
            obj = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj = g2bVar;
            synchronized (this.g) {
                try {
                    this.i = aVar2;
                    this.j = jA;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj;
                }
            }
            nl7 nl7Var = this.e;
            Object obj2 = aVar2.b;
            s27<Object> s27Var3 = aVar2.c;
            int i4 = aVar2.d;
            aVar2.b = t;
            aVar2.c = aVar2.f.d(t);
            if (aVar2.d == -1) {
                aVar2.d = Long.hashCode(qu9.j().g());
            }
            a.C0188a c0188a = aVar2.i;
            k37 k37VarE = bl7.e();
            try {
                k37VarE.d(c0188a);
                if (nl7Var == null) {
                    mh4Var.invoke();
                    aVar4 = aVar2;
                } else {
                    hu9 hu9VarA = qu9.b.a();
                    if (hu9VarA instanceof zwa) {
                        aVar4 = aVar2;
                        if (((zwa) hu9VarA).t == e00.a()) {
                            oh4<Object, g2b> oh4Var2 = ((zwa) hu9VarA).r;
                            oh4<Object, g2b> oh4Var3 = ((zwa) hu9VarA).s;
                            try {
                                ((zwa) hu9VarA).r = qu9.k(nl7Var, oh4Var2, true);
                                ((zwa) hu9VarA).s = oh4Var3;
                                mh4Var.invoke();
                                ((zwa) hu9VarA).r = oh4Var2;
                                ((zwa) hu9VarA).s = oh4Var3;
                            } catch (Throwable th2) {
                                ((zwa) hu9VarA).r = oh4Var2;
                                ((zwa) hu9VarA).s = oh4Var3;
                                throw th2;
                            }
                        }
                    } else {
                        aVar4 = aVar2;
                    }
                    if (hu9VarA == null || (hu9VarA instanceof g37)) {
                        zwaVar = new zwa(hu9VarA instanceof g37 ? (g37) hu9VarA : null, nl7Var, null, true, false);
                    } else {
                        zwaVar = hu9VarA.u(nl7Var);
                    }
                    try {
                        hu9 hu9VarJ = zwaVar.j();
                        try {
                            mh4Var.invoke();
                            hu9.q(hu9VarJ);
                            zwaVar.c();
                        } catch (Throwable th3) {
                            try {
                                hu9.q(hu9VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    zwaVar.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    k37VarE.o(k37VarE.v - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                k37VarE.o(k37VarE.v - 1);
                a aVar5 = aVar4;
                Object obj3 = aVar5.b;
                obj3.getClass();
                int i5 = aVar5.d;
                s27<Object> s27Var4 = aVar5.c;
                if (s27Var4 != null) {
                    try {
                        long[] jArr = s27Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                s27<Object> s27Var5 = s27Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            s27Var2 = s27Var5;
                                            Object obj4 = s27Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = s27Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    aVar5.c(obj3, obj4);
                                                }
                                                if (z3) {
                                                    s27Var2.g(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = aVar3;
                                                    this.j = j2;
                                                    g2b g2bVar2 = g2b.a;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            s27Var2 = s27Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        s27Var5 = s27Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    s27Var = s27Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    s27Var = s27Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                s27Var4 = s27Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = aVar3;
                            this.j = j2;
                            g2b g2bVar3 = g2b.a;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                aVar5.b = obj2;
                aVar5.c = s27Var3;
                aVar5.d = i4;
                synchronized (this.g) {
                    this.i = aVar3;
                    this.j = j3;
                    g2b g2bVar4 = g2b.a;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        hv9 hv9Var = this.d;
        qu9.e(qu9.a);
        synchronized (qu9.c) {
            qu9.h = th1.L(qu9.h, hv9Var);
            g2b g2bVar = g2b.a;
        }
        this.h = new gu9(hv9Var);
    }
}

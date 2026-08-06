package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {647, 177, 659}, m = "invokeSuspend", v = 1)
public final class cp7 extends p6a implements ci4<np9<oo7<Object>>, r02<? super g2b>, Object> {
    public Object t;
    public Object u;
    public a47 v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ uo7<Object, Object> y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ uo7<Object, Object> u;
        public final /* synthetic */ np9<oo7<Object>> v;

        /* JADX INFO: renamed from: cp7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0065a<T> implements s54 {
            public final /* synthetic */ np9<oo7<Object>> t;

            /* JADX INFO: renamed from: cp7$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {96}, m = "emit", v = 1)
            public static final class C0066a extends u02 {
                public /* synthetic */ Object t;
                public final /* synthetic */ C0065a<T> u;
                public int v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0066a(C0065a<? super T> c0065a, r02<? super C0066a> r02Var) {
                    super(r02Var);
                    this.u = c0065a;
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) {
                    this.t = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.u.emit(null, this);
                }
            }

            public C0065a(np9<oo7<Object>> np9Var) {
                this.t = np9Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.s54
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(oo7<Object> oo7Var, r02<? super g2b> r02Var) throws Throwable {
                C0066a c0066a;
                if (r02Var instanceof C0066a) {
                    c0066a = (C0066a) r02Var;
                    int i = c0066a.v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0066a.v = i - Integer.MIN_VALUE;
                    } else {
                        c0066a = new C0066a(this, r02Var);
                    }
                } else {
                    c0066a = new C0066a(this, r02Var);
                }
                Object obj = c0066a.t;
                int i2 = c0066a.v;
                try {
                    if (i2 == 0) {
                        dv8.b(obj);
                        np9<oo7<Object>> np9Var = this.t;
                        c0066a.v = 1;
                        Object objA = np9Var.a(c0066a, oo7Var);
                        v72 v72Var = v72.t;
                        if (objA == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                    }
                } catch (ig1 unused) {
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uo7<Object, Object> uo7Var, np9<oo7<Object>> np9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = uo7Var;
            this.v = np9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                q91 q91VarG = yk2.g(this.u.g);
                C0065a c0065a = new C0065a(this.v);
                this.t = 1;
                Object objCollect = q91VarG.collect(c0065a, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ uo7<Object, Object> u;
        public final /* synthetic */ zx0 v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ zx0 t;

            public a(zx0 zx0Var) {
                this.t = zx0Var;
            }

            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) {
                this.t.n((g2b) obj);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zx0 zx0Var, r02 r02Var, uo7 uo7Var) {
            super(2, r02Var);
            this.u = uo7Var;
            this.v = zx0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.v, r02Var, this.u);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                r54<g2b> r54Var = this.u.d;
                a aVar = new a(this.v);
                this.t = 1;
                Object objCollect = r54Var.collect(aVar, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {111}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ zx0 v;
        public final /* synthetic */ uo7<Object, Object> w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ uo7<Object, Object> t;
            public final /* synthetic */ t72 u;

            /* JADX INFO: renamed from: cp7$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final /* synthetic */ class C0067a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[wb6.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            public a(uo7<Object, Object> uo7Var, t72 t72Var) {
                this.t = uo7Var;
                this.u = t72Var;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0322  */
            /* JADX WARN: Code duplicated, block: B:103:0x0342  */
            /* JADX WARN: Code duplicated, block: B:109:0x0372  */
            /* JADX WARN: Code duplicated, block: B:111:0x0376  */
            /* JADX WARN: Code duplicated, block: B:118:0x03a2 A[PHI: r3 r7 r8
              0x03a2: PHI (r3v45 t72) = (r3v40 t72), (r3v46 t72), (r3v46 t72) binds: [B:110:0x0374, B:116:0x039d, B:117:0x039f] A[DONT_GENERATE, DONT_INLINE]
              0x03a2: PHI (r7v48 uo7<java.lang.Object, java.lang.Object>) = 
              (r7v43 uo7<java.lang.Object, java.lang.Object>)
              (r7v50 uo7<java.lang.Object, java.lang.Object>)
              (r7v50 uo7<java.lang.Object, java.lang.Object>)
             binds: [B:110:0x0374, B:116:0x039d, B:117:0x039f] A[DONT_GENERATE, DONT_INLINE]
              0x03a2: PHI (r8v44 vb6) = (r8v41 vb6), (r8v46 vb6), (r8v46 vb6) binds: [B:110:0x0374, B:116:0x039d, B:117:0x039f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:128:0x03b5  */
            /* JADX WARN: Code duplicated, block: B:131:0x03bc  */
            /* JADX WARN: Code duplicated, block: B:134:0x03d8 A[Catch: all -> 0x008a, PHI: r1 r3 r7 r8 r13
              0x03d8: PHI (r1v44 hp7$a<java.lang.Object, java.lang.Object>) = (r1v40 hp7$a<java.lang.Object, java.lang.Object>), (r1v49 hp7$a<java.lang.Object, java.lang.Object>) binds: [B:132:0x03d4, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r3v49 wb6) = (r3v44 wb6), (r3v51 wb6) binds: [B:132:0x03d4, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r7v53 t72) = (r7v47 t72), (r7v56 t72) binds: [B:132:0x03d4, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r8v49 uo7<java.lang.Object, java.lang.Object>) = (r8v43 uo7<java.lang.Object, java.lang.Object>), (r8v52 uo7<java.lang.Object, java.lang.Object>) binds: [B:132:0x03d4, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r13v61 x37) = (r13v97 x37), (r13v98 x37) binds: [B:132:0x03d4, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #7 {all -> 0x008a, blocks: (B:16:0x0084, B:138:0x03f4, B:134:0x03d8), top: B:178:0x0024 }] */
            /* JADX WARN: Code duplicated, block: B:136:0x03ee  */
            /* JADX WARN: Code duplicated, block: B:137:0x03f0  */
            /* JADX WARN: Code duplicated, block: B:141:0x0403  */
            /* JADX WARN: Code duplicated, block: B:142:0x0407  */
            /* JADX WARN: Code duplicated, block: B:145:0x0424  */
            /* JADX WARN: Code duplicated, block: B:151:0x0450  */
            /* JADX WARN: Code duplicated, block: B:153:0x0454  */
            /* JADX WARN: Code duplicated, block: B:156:0x046b  */
            /* JADX WARN: Code duplicated, block: B:160:0x047e  */
            /* JADX WARN: Code duplicated, block: B:56:0x022d  */
            /* JADX WARN: Code duplicated, block: B:59:0x023a  */
            /* JADX WARN: Code duplicated, block: B:60:0x023e  */
            /* JADX WARN: Code duplicated, block: B:63:0x025d  */
            /* JADX WARN: Code duplicated, block: B:69:0x028c  */
            /* JADX WARN: Code duplicated, block: B:71:0x0291  */
            /* JADX WARN: Code duplicated, block: B:78:0x02bc A[PHI: r3 r7 r8
              0x02bc: PHI (r3v22 t72) = (r3v16 t72), (r3v24 t72), (r3v24 t72) binds: [B:70:0x028f, B:76:0x02b7, B:77:0x02b9] A[DONT_GENERATE, DONT_INLINE]
              0x02bc: PHI (r7v26 uo7<java.lang.Object, java.lang.Object>) = 
              (r7v21 uo7<java.lang.Object, java.lang.Object>)
              (r7v27 uo7<java.lang.Object, java.lang.Object>)
              (r7v27 uo7<java.lang.Object, java.lang.Object>)
             binds: [B:70:0x028f, B:76:0x02b7, B:77:0x02b9] A[DONT_GENERATE, DONT_INLINE]
              0x02bc: PHI (r8v26 vb6) = (r8v19 vb6), (r8v27 vb6), (r8v27 vb6) binds: [B:70:0x028f, B:76:0x02b7, B:77:0x02b9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code duplicated, block: B:82:0x02c4 A[PHI: r3 r8 r13
              0x02c4: PHI (r3v20 uo7<java.lang.Object, java.lang.Object>) = (r3v0 uo7<java.lang.Object, java.lang.Object>), (r3v23 uo7<java.lang.Object, java.lang.Object>) binds: [B:55:0x022b, B:78:0x02bc] A[DONT_GENERATE, DONT_INLINE]
              0x02c4: PHI (r8v21 vb6) = (r8v3 vb6), (r8v26 vb6) binds: [B:55:0x022b, B:78:0x02bc] A[DONT_GENERATE, DONT_INLINE]
              0x02c4: PHI (r13v25 t72) = (r13v5 t72), (r13v29 t72) binds: [B:55:0x022b, B:78:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:88:0x02d2  */
            /* JADX WARN: Code duplicated, block: B:91:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:94:0x0309  */
            /* JADX WARN: Code duplicated, block: B:95:0x030b  */
            /* JADX WARN: Code duplicated, block: B:99:0x031e  */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x038c, code lost:
            
                if (r13.b(r0) == r6) goto L155;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x02a6, code lost:
            
                if (r13.b(r0) == r6) goto L155;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [cp7$c$a, cp7$c$a<T>] */
            /* JADX WARN: Type inference failed for: r13v1, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v100 */
            /* JADX WARN: Type inference failed for: r13v103 */
            /* JADX WARN: Type inference failed for: r13v104 */
            /* JADX WARN: Type inference failed for: r13v13, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v2, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v3, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v37, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v64, types: [x37] */
            /* JADX WARN: Type inference failed for: r13v95 */
            /* JADX WARN: Type inference failed for: r13v96 */
            /* JADX WARN: Type inference failed for: r13v99 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(defpackage.r02 r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: cp7.c.a.a(r02):java.lang.Object");
            }

            @Override // defpackage.s54
            public final /* bridge */ /* synthetic */ Object emit(Object obj, r02 r02Var) {
                return a(r02Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zx0 zx0Var, r02 r02Var, uo7 uo7Var) {
            super(2, r02Var);
            this.v = zx0Var;
            this.w = uo7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(this.v, r02Var, this.w);
            cVar.u = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                q91 q91VarG = yk2.g(this.v);
                a aVar = new a(this.w, t72Var);
                this.t = 1;
                Object objCollect = q91VarG.collect(aVar, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp7(uo7<Object, Object> uo7Var, r02<? super cp7> r02Var) {
        super(2, r02Var);
        this.y = uo7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        cp7 cp7Var = new cp7(this.y, r02Var);
        cp7Var.x = obj;
        return cp7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(np9<oo7<Object>> np9Var, r02<? super g2b> r02Var) {
        return ((cp7) create(np9Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        np9 np9Var;
        np9 np9Var2;
        hp7.a<Object, Object> aVar;
        x37 x37Var;
        ub6 ub6VarA;
        int i = this.w;
        uo7<Object, Object> uo7Var = this.y;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            np9Var = (np9) this.x;
            if (!uo7Var.f.compareAndSet(false, true)) {
                aa0.c("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                return null;
            }
            oy0.d(np9Var, null, null, new a(uo7Var, np9Var, null), 3);
            zx0 zx0VarA = da1.a(0, 6, null);
            oy0.d(np9Var, null, null, new b(zx0VarA, null, uo7Var), 3);
            oy0.d(np9Var, null, null, new c(zx0VarA, null, uo7Var), 3);
            this.x = np9Var;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = 2;
            if (uo7Var.f(this) != v72Var) {
            }
            return v72Var;
        }
        if (i == 1) {
            a47 a47Var = this.v;
            hp7.a aVar2 = (hp7.a) this.u;
            ym8 ym8Var = (ym8) this.t;
            dv8.b(obj);
            try {
                as7 as7VarA = aVar2.b.a(null);
                a47Var.c(null);
                ym8Var.a(as7VarA);
                throw null;
            } catch (Throwable th) {
                a47Var.c(null);
                throw th;
            }
        }
        if (i == 2) {
            np9 np9Var3 = (np9) this.x;
            dv8.b(obj);
            np9Var = np9Var3;
        } else {
            if (i != 3) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x37Var = (x37) this.u;
            aVar = (hp7.a) this.t;
            np9Var2 = (np9) this.x;
            dv8.b(obj);
        }
        try {
            ub6VarA = aVar.b.h.a(wb6.t);
            x37Var.c(null);
            if (!(ub6VarA instanceof ub6.a)) {
                uo7.d(uo7Var, np9Var2);
            }
            return g2b.a;
        } catch (Throwable th2) {
            x37Var.c(null);
            throw th2;
        }
        hp7.a<Object, Object> aVar3 = uo7Var.h;
        a47 a47Var2 = aVar3.a;
        this.x = np9Var;
        this.t = aVar3;
        this.u = a47Var2;
        this.w = 3;
        if (a47Var2.b(this) != v72Var) {
            np9Var2 = np9Var;
            aVar = aVar3;
            x37Var = a47Var2;
            ub6VarA = aVar.b.h.a(wb6.t);
            x37Var.c(null);
            if (!(ub6VarA instanceof ub6.a)) {
                uo7.d(uo7Var, np9Var2);
            }
            return g2b.a;
        }
        return v72Var;
    }
}

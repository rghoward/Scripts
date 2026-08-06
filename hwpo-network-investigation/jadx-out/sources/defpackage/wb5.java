package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb5 {
    public final k37<a<?, ?>> a = new k37<>(new a[16]);
    public final dt7 b = bl7.i(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final dt7 d = bl7.i(Boolean.TRUE);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a<T, V extends fw> implements yz9<T> {
        public boolean A;
        public long B;
        public T t;
        public T u;
        public final cza<T, V> v;
        public final dt7 w;
        public wv<T> x;
        public l9a<T, V> y;
        public boolean z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2, cza czaVar, ub5 ub5Var) {
            this.t = obj;
            this.u = obj2;
            this.v = czaVar;
            this.w = bl7.i(obj);
            this.x = ub5Var;
            this.y = new l9a<>(ub5Var, czaVar, this.t, this.u, null);
        }

        @Override // defpackage.yz9
        public final T getValue() {
            return this.w.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public dl8 t;
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ h37<yz9<Long>> w;
        public final /* synthetic */ wb5 x;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends p6a implements ci4<Float, r02<? super Boolean>, Object> {
            public /* synthetic */ float t;

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(2, r02Var);
                aVar.t = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(Float f, r02<? super Boolean> r02Var) {
                return ((a) create(Float.valueOf(f.floatValue()), r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                return Boolean.valueOf(this.t > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h37<yz9<Long>> h37Var, wb5 wb5Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.w = h37Var;
            this.x = wb5Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.w, this.x, r02Var);
            bVar.v = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
            ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r0 r9
          0x0039: PHI (r0v3 dl8) = (r0v1 dl8), (r0v2 dl8), (r0v2 dl8), (r0v5 dl8) binds: [B:10:0x0029, B:15:0x0054, B:17:0x006f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
          0x0039: PHI (r9v4 t72) = (r9v2 t72), (r9v3 t72), (r9v3 t72), (r9v6 t72) binds: [B:10:0x0029, B:15:0x0054, B:17:0x006f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r0 r9
          0x004f: PHI (r0v2 dl8) = (r0v3 dl8), (r0v4 dl8) binds: [B:12:0x004c, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
          0x004f: PHI (r9v3 t72) = (r9v4 t72), (r9v5 t72) binds: [B:12:0x004c, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0054 -> B:11:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:11:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                int r0 = r8.u
                r1 = 0
                r2 = 1
                r3 = 2
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L29
                if (r0 == r2) goto L1e
                if (r0 != r3) goto L18
                dl8 r0 = r8.t
                java.lang.Object r5 = r8.v
                t72 r5 = (defpackage.t72) r5
                defpackage.dv8.b(r9)
                r9 = r5
                goto L39
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r8)
                return r1
            L1e:
                dl8 r0 = r8.t
                java.lang.Object r5 = r8.v
                t72 r5 = (defpackage.t72) r5
                defpackage.dv8.b(r9)
                r9 = r5
                goto L4f
            L29:
                defpackage.dv8.b(r9)
                java.lang.Object r9 = r8.v
                t72 r9 = (defpackage.t72) r9
                dl8 r0 = new dl8
                r0.<init>()
                r5 = 1065353216(0x3f800000, float:1.0)
                r0.t = r5
            L39:
                xb5 r5 = new xb5
                h37<yz9<java.lang.Long>> r6 = r8.w
                wb5 r7 = r8.x
                r5.<init>()
                r8.v = r9
                r8.t = r0
                r8.u = r2
                java.lang.Object r5 = defpackage.tb5.a(r5, r8)
                if (r5 != r4) goto L4f
                goto L71
            L4f:
                float r5 = r0.t
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L39
                yb5 r5 = new yb5
                r6 = 0
                r5.<init>(r6, r9)
                oz8 r5 = defpackage.bl7.k(r5)
                wb5$b$a r6 = new wb5$b$a
                r6.<init>(r3, r1)
                r8.v = r9
                r8.t = r0
                r8.u = r3
                java.lang.Object r5 = defpackage.yk2.l(r5, r6, r8)
                if (r5 != r4) goto L39
            L71:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: wb5.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-318043801);
        int i2 = (bj4VarO.j(this) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            h37 h37Var = (h37) objF;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                bj4VarO.K(-144841960);
                boolean zJ = bj4VarO.j(this);
                Object objF2 = bj4VarO.f();
                if (zJ || objF2 == c0187a) {
                    objF2 = new b(h37Var, this, null);
                    bj4VarO.C(objF2);
                }
                wd3.d(bj4VarO, (ci4) objF2, this);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-143455237);
                bj4VarO.U(false);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: vb5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    this.t.a((jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}

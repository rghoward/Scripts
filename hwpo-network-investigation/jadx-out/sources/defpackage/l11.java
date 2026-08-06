package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {73}, m = "invokeSuspend", v = 1)
public final class l11 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ r54<oo7<Object>> u;
    public final /* synthetic */ n11<Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ n11<T> t;

        /* JADX INFO: renamed from: l11$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {74, 75}, m = "emit", v = 1)
        public static final class C0193a extends u02 {
            public sa5 t;
            public /* synthetic */ Object u;
            public final /* synthetic */ a<T> v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0193a(a<? super T> aVar, r02<? super C0193a> r02Var) {
                super(r02Var);
                this.v = aVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.u = obj;
                this.w |= Integer.MIN_VALUE;
                return this.v.emit(null, this);
            }
        }

        public a(n11<T> n11Var) {
            this.t = n11Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            if (r6.b(r7, r0) == r5) goto L21;
         */
        @Override // defpackage.s54
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.sa5<? extends defpackage.oo7<T>> r7, defpackage.r02<? super defpackage.g2b> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l11.a.C0193a
                if (r0 == 0) goto L13
                r0 = r8
                l11$a$a r0 = (l11.a.C0193a) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                l11$a$a r0 = new l11$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.u
                int r1 = r0.w
                r2 = 0
                n11<T> r6 = r6.t
                r3 = 2
                r4 = 1
                v72 r5 = defpackage.v72.t
                if (r1 == 0) goto L39
                if (r1 == r4) goto L33
                if (r1 != r3) goto L2d
                defpackage.dv8.b(r8)
                goto L56
            L2d:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r6)
                return r2
            L33:
                sa5 r7 = r0.t
                defpackage.dv8.b(r8)
                goto L49
            L39:
                defpackage.dv8.b(r8)
                am9 r8 = r6.b
                r0.t = r7
                r0.w = r4
                java.lang.Object r8 = r8.emit(r7, r0)
                if (r8 != r5) goto L49
                goto L55
            L49:
                b44<T> r6 = r6.a
                r0.t = r2
                r0.w = r3
                java.lang.Object r6 = r6.b(r7, r0)
                if (r6 != r5) goto L56
            L55:
                return r5
            L56:
                g2b r6 = defpackage.g2b.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l11.a.emit(sa5, r02):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l11(r54<? extends oo7<Object>> r54Var, n11<Object> n11Var, r02<? super l11> r02Var) {
        super(2, r02Var);
        this.u = r54Var;
        this.v = n11Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new l11(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((l11) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(this.v);
            this.t = 1;
            Object objCollect = this.u.collect(new l74(aVar, new el8()), this);
            Object obj2 = v72.t;
            if (objCollect != obj2) {
                objCollect = g2b.a;
            }
            if (objCollect == obj2) {
                return obj2;
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

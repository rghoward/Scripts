package defpackage;

import io.intercom.android.sdk.models.Config;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {69, 71, 98}, m = "invokeSuspend", v = 1)
public final class yf2 extends p6a implements ci4<s54<Object>, r02<? super g2b>, Object> {
    public ne2 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ xf2<Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {Config.DEFAULT_RATE_LIMIT_COUNT}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<s54<? super xz9<Object>>, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ xf2<Object> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xf2<Object> xf2Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = xf2Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(s54<? super xz9<Object>> s54Var, r02<? super g2b> r02Var) {
            return ((a) create(s54Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objD = xf2.d(this.u, this);
                v72 v72Var = v72.t;
                if (objD == v72Var) {
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
    @xm2(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<xz9<Object>, r02<? super Boolean>, Object> {
        public /* synthetic */ Object t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(2, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(xz9<Object> xz9Var, r02<? super Boolean> r02Var) {
            return ((b) create(xz9Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return Boolean.valueOf(!(((xz9) this.t) instanceof yz3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<xz9<Object>, r02<? super Boolean>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ xz9<Object> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xz9<Object> xz9Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = xz9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(this.u, r02Var);
            cVar.t = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(xz9<Object> xz9Var, r02<? super Boolean> r02Var) {
            return ((c) create(xz9Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            xz9 xz9Var = (xz9) this.t;
            return Boolean.valueOf((xz9Var instanceof ne2) && ((ne2) xz9Var).a <= ((ne2) this.u).a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {115}, m = "invokeSuspend", v = 1)
    public static final class d extends p6a implements ei4<s54<Object>, Throwable, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ xf2<Object> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xf2<Object> xf2Var, r02<? super d> r02Var) {
            super(3, r02Var);
            this.u = xf2Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(s54<Object> s54Var, Throwable th, r02<? super g2b> r02Var) {
            return new d(this.u, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objB = xf2.b(this.u, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
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
    public static final class e implements r54<Object> {
        public final /* synthetic */ v64 t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ s54 t;

            /* JADX INFO: renamed from: yf2$e$a$a, reason: collision with other inner class name */
            @xm2(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {50}, m = "emit", v = 1)
            public static final class C0283a extends u02 {
                public /* synthetic */ Object t;
                public int u;

                public C0283a(r02 r02Var) {
                    super(r02Var);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) {
                    this.t = obj;
                    this.u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(s54 s54Var) {
                this.t = s54Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) throws Throwable {
                C0283a c0283a;
                if (r02Var instanceof C0283a) {
                    c0283a = (C0283a) r02Var;
                    int i = c0283a.u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0283a.u = i - Integer.MIN_VALUE;
                    } else {
                        c0283a = new C0283a(r02Var);
                    }
                } else {
                    c0283a = new C0283a(r02Var);
                }
                Object obj2 = c0283a.t;
                int i2 = c0283a.u;
                if (i2 == 0) {
                    dv8.b(obj2);
                    xz9 xz9Var = (xz9) obj;
                    if (xz9Var instanceof di8) {
                        throw ((di8) xz9Var).b;
                    }
                    if (!(xz9Var instanceof ne2)) {
                        if ((xz9Var instanceof yz3) || (xz9Var instanceof q1b) || (xz9Var instanceof hb7)) {
                            aa0.c("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        u.b();
                        return null;
                    }
                    T t = ((ne2) xz9Var).b;
                    c0283a.u = 1;
                    Object objEmit = this.t.emit(t, c0283a);
                    v72 v72Var = v72.t;
                    if (objEmit == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj2);
                }
                return g2b.a;
            }
        }

        public e(v64 v64Var) {
            this.t = v64Var;
        }

        @Override // defpackage.r54
        public final Object collect(s54<? super Object> s54Var, r02 r02Var) {
            Object objCollect = this.t.collect(new a(s54Var), r02Var);
            return objCollect == v72.t ? objCollect : g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(xf2<Object> xf2Var, r02<? super yf2> r02Var) {
        super(2, r02Var);
        this.w = xf2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        yf2 yf2Var = new yf2(this.w, r02Var);
        yf2Var.v = obj;
        return yf2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<Object> s54Var, r02<? super g2b> r02Var) {
        return ((yf2) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r9 == r6) goto L28;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

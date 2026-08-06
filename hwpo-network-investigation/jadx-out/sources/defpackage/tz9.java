package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tz9 implements um9 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements r54<sm9> {
        public final /* synthetic */ zz9 t;

        /* JADX INFO: renamed from: tz9$a$a, reason: collision with other inner class name */
        @xm2(c = "kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1", f = "SharingStarted.kt", l = {113}, m = "collect", v = 1)
        public static final class C0253a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0253a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                a.this.collect(null, this);
                return v72.t;
            }
        }

        public a(zz9 zz9Var) {
            this.t = zz9Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.r54
        public final Object collect(s54<? super sm9> s54Var, r02<? super g2b> r02Var) throws Throwable {
            C0253a c0253a;
            if (r02Var instanceof C0253a) {
                c0253a = (C0253a) r02Var;
                int i = c0253a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0253a.u = i - Integer.MIN_VALUE;
                } else {
                    c0253a = new C0253a(r02Var);
                }
            } else {
                c0253a = new C0253a(r02Var);
            }
            Object obj = c0253a.t;
            int i2 = c0253a.u;
            if (i2 == 0) {
                dv8.b(obj);
                b bVar = new b(new cl8(), s54Var);
                c0253a.u = 1;
                Object objCollect = this.t.collect(bVar, c0253a);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            fl.a();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements s54 {
        public final /* synthetic */ cl8 t;
        public final /* synthetic */ s54<sm9> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {155}, m = "emit", v = 1)
        public static final class a extends u02 {
            public /* synthetic */ Object t;
            public final /* synthetic */ b<T> u;
            public int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, r02<? super a> r02Var) {
                super(r02Var);
                this.u = bVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.v |= Integer.MIN_VALUE;
                return this.u.a(0, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(cl8 cl8Var, s54<? super sm9> s54Var) {
            this.t = cl8Var;
            this.u = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(int i, r02<? super g2b> r02Var) throws Throwable {
            a aVar;
            if (r02Var instanceof a) {
                aVar = (a) r02Var;
                int i2 = aVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.v = i2 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, r02Var);
                }
            } else {
                aVar = new a(this, r02Var);
            }
            Object obj = aVar.t;
            int i3 = aVar.v;
            if (i3 == 0) {
                dv8.b(obj);
                if (i > 0) {
                    cl8 cl8Var = this.t;
                    if (!cl8Var.t) {
                        cl8Var.t = true;
                        aVar.v = 1;
                        Object objEmit = this.u.emit(sm9.t, aVar);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    }
                }
                return g2b.a;
            }
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            return g2b.a;
        }

        @Override // defpackage.s54
        public final /* bridge */ /* synthetic */ Object emit(Object obj, r02 r02Var) {
            return a(((Number) obj).intValue(), r02Var);
        }
    }

    @Override // defpackage.um9
    public final r54<sm9> b(zz9<Integer> zz9Var) {
        return new a(zz9Var);
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yo7 implements r54<hk4> {
    public final /* synthetic */ t64 t;
    public final /* synthetic */ int u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ int u;

        /* JADX INFO: renamed from: yo7$a$a, reason: collision with other inner class name */
        @xm2(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {50}, m = "emit", v = 1)
        public static final class C0287a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0287a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, int i) {
            this.t = s54Var;
            this.u = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0287a c0287a;
            if (r02Var instanceof C0287a) {
                c0287a = (C0287a) r02Var;
                int i = c0287a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0287a.u = i - Integer.MIN_VALUE;
                } else {
                    c0287a = new C0287a(r02Var);
                }
            } else {
                c0287a = new C0287a(r02Var);
            }
            Object obj2 = c0287a.t;
            int i2 = c0287a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                hk4 hk4Var = new hk4(this.u, (hjb) obj);
                c0287a.u = 1;
                Object objEmit = this.t.emit(hk4Var, c0287a);
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

    public yo7(t64 t64Var, int i) {
        this.t = t64Var;
        this.u = i;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super hk4> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

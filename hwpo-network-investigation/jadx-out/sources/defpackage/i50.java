package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 implements r54<br9> {
    public final /* synthetic */ r54 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: i50$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {221}, m = "emit")
        public static final class C0107a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0107a(r02 r02Var) {
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
            C0107a c0107a;
            if (r02Var instanceof C0107a) {
                c0107a = (C0107a) r02Var;
                int i = c0107a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0107a.u = i - Integer.MIN_VALUE;
                } else {
                    c0107a = new C0107a(r02Var);
                }
            } else {
                c0107a = new C0107a(r02Var);
            }
            Object obj2 = c0107a.t;
            int i2 = c0107a.u;
            br9 br9Var = null;
            if (i2 == 0) {
                dv8.b(obj2);
                long j = ((cr9) obj).a;
                if (j == 9205357640488583168L) {
                    br9Var = br9.c;
                } else {
                    hj8 hj8Var = x6b.b;
                    if (cr9.d(j) >= 0.5d && cr9.b(j) >= 0.5d) {
                        float fD = cr9.d(j);
                        s03 aVar = (Float.isInfinite(fD) || Float.isNaN(fD)) ? s03.b.a : new s03.a(wk6.b(cr9.d(j)));
                        float fB = cr9.b(j);
                        br9Var = new br9(aVar, (Float.isInfinite(fB) || Float.isNaN(fB)) ? s03.b.a : new s03.a(wk6.b(cr9.b(j))));
                    }
                }
                if (br9Var != null) {
                    c0107a.u = 1;
                    Object objEmit = this.t.emit(br9Var, c0107a);
                    v72 v72Var = v72.t;
                    if (objEmit == v72Var) {
                        return v72Var;
                    }
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

    public i50(a0a a0aVar) {
        this.t = a0aVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super br9> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

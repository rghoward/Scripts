package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 implements r54<br9> {
    public final /* synthetic */ r54 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: ay1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", l = {221}, m = "emit")
        public static final class C0028a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0028a(r02 r02Var) {
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
            C0028a c0028a;
            if (r02Var instanceof C0028a) {
                c0028a = (C0028a) r02Var;
                int i = c0028a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0028a.u = i - Integer.MIN_VALUE;
                } else {
                    c0028a = new C0028a(r02Var);
                }
            } else {
                c0028a = new C0028a(r02Var);
            }
            Object obj2 = c0028a.t;
            int i2 = c0028a.u;
            br9 br9Var = null;
            if (i2 == 0) {
                dv8.b(obj2);
                long j = ((xx1) obj).a;
                hj8 hj8Var = x6b.b;
                int i3 = (int) (3 & j);
                int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
                if (!(((((int) (j >> 33)) & ((1 << (i4 + 13)) - 1)) - 1 == 0) | ((((1 << (18 - i4)) - 1) & ((int) (j >> (i4 + 46)))) - 1 == 0))) {
                    br9Var = new br9(xx1.d(j) ? new s03.a(xx1.h(j)) : s03.b.a, xx1.c(j) ? new s03.a(xx1.g(j)) : s03.b.a);
                }
                if (br9Var != null) {
                    c0028a.u = 1;
                    Object objEmit = this.t.emit(br9Var, c0028a);
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

    public ay1(a0a a0aVar) {
        this.t = a0aVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super br9> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

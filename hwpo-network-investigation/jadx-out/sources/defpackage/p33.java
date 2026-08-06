package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p33<T> implements r54<T> {
    public final r54<T> t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ gl8<Object> t;
        public final /* synthetic */ s54<T> u;

        /* JADX INFO: renamed from: p33$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit", v = 1)
        public static final class C0218a extends u02 {
            public /* synthetic */ Object t;
            public final /* synthetic */ a<T> u;
            public int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0218a(a<? super T> aVar, r02<? super C0218a> r02Var) {
                super(r02Var);
                this.u = aVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.v |= Integer.MIN_VALUE;
                return this.u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p33<T> p33Var, gl8<Object> gl8Var, s54<? super T> s54Var) {
            this.t = gl8Var;
            this.u = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
            C0218a c0218a;
            if (r02Var instanceof C0218a) {
                c0218a = (C0218a) r02Var;
                int i = c0218a.v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0218a.v = i - Integer.MIN_VALUE;
                } else {
                    c0218a = new C0218a(this, r02Var);
                }
            } else {
                c0218a = new C0218a(this, r02Var);
            }
            Object obj = c0218a.t;
            int i2 = c0218a.v;
            if (i2 == 0) {
                dv8.b(obj);
                gl8<Object> gl8Var = this.t;
                Object obj2 = gl8Var.t;
                if (obj2 != rd7.a && xj5.a(obj2, t)) {
                    return g2b.a;
                }
                gl8Var.t = t;
                c0218a.v = 1;
                Object objEmit = this.u.emit(t, c0218a);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public p33(r54 r54Var) {
        this.t = r54Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<? super g2b> r02Var) {
        gl8 gl8Var = new gl8();
        gl8Var.t = (T) rd7.a;
        Object objCollect = this.t.collect(new a(this, gl8Var, s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

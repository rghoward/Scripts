package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class el3 implements r54<xd3<? extends Exception, ? extends rsa>> {
    public final /* synthetic */ e84 t;
    public final /* synthetic */ gl3 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ gl3 u;

        /* JADX INFO: renamed from: el3$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.EntryDetailsViewModel$observeTrackingActions$$inlined$filter$1$2", f = "EntryDetailsViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0082a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0082a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, gl3 gl3Var) {
            this.t = s54Var;
            this.u = gl3Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0082a c0082a;
            if (r02Var instanceof C0082a) {
                c0082a = (C0082a) r02Var;
                int i = c0082a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0082a.u = i - Integer.MIN_VALUE;
                } else {
                    c0082a = new C0082a(r02Var);
                }
            } else {
                c0082a = new C0082a(r02Var);
            }
            Object obj2 = c0082a.t;
            int i2 = c0082a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                xd3 xd3Var = (xd3) obj;
                if (xd3Var instanceof xd3.b) {
                    R r = ((xd3.b) xd3Var).a;
                    if (((rsa) r).a() == this.u.G && (r instanceof rsa.a)) {
                        c0082a.u = 1;
                        Object objEmit = this.t.emit(obj, c0082a);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
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

    public el3(e84 e84Var, gl3 gl3Var) {
        this.t = e84Var;
        this.u = gl3Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super xd3<? extends Exception, ? extends rsa>> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

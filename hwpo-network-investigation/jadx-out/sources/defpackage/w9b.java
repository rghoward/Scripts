package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w9b implements r54<xd3<? extends Exception, ? extends rsa>> {
    public final /* synthetic */ e84 t;
    public final /* synthetic */ o9b u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ o9b u;

        /* JADX INFO: renamed from: w9b$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$observeTrackingActions$$inlined$filter$1$2", f = "ValueDetailsViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0276a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0276a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, o9b o9bVar) {
            this.t = s54Var;
            this.u = o9bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0276a c0276a;
            if (r02Var instanceof C0276a) {
                c0276a = (C0276a) r02Var;
                int i = c0276a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0276a.u = i - Integer.MIN_VALUE;
                } else {
                    c0276a = new C0276a(r02Var);
                }
            } else {
                c0276a = new C0276a(r02Var);
            }
            Object obj2 = c0276a.t;
            int i2 = c0276a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                xd3 xd3Var = (xd3) obj;
                if ((xd3Var instanceof xd3.b) && ((rsa) ((xd3.b) xd3Var).a).a() == this.u.O) {
                    c0276a.u = 1;
                    Object objEmit = this.t.emit(obj, c0276a);
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

    public w9b(e84 e84Var, o9b o9bVar) {
        this.t = e84Var;
        this.u = o9bVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super xd3<? extends Exception, ? extends rsa>> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

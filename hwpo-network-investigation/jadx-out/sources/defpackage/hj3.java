package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hj3 implements r54<fx3> {
    public final /* synthetic */ e84 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: hj3$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$listenFilesUpdate$$inlined$map$1$2", f = "EnterValueViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0102a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0102a(r02 r02Var) {
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
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0102a c0102a;
            if (r02Var instanceof C0102a) {
                c0102a = (C0102a) r02Var;
                int i = c0102a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0102a.u = i - Integer.MIN_VALUE;
                } else {
                    c0102a = new C0102a(r02Var);
                }
            } else {
                c0102a = new C0102a(r02Var);
            }
            Object obj2 = c0102a.t;
            int i2 = c0102a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                xd3 xd3Var = (xd3) obj;
                xd3.b bVar = xd3Var instanceof xd3.b ? (xd3.b) xd3Var : null;
                fx3 fx3Var = bVar != null ? (fx3) bVar.a : null;
                c0102a.u = 1;
                Object objEmit = this.t.emit(fx3Var, c0102a);
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

    public hj3(e84 e84Var) {
        this.t = e84Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super fx3> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

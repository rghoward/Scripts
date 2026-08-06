package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff7 implements r54<zz7> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ef7.a u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ ef7.a u;

        /* JADX INFO: renamed from: ff7$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.sessions.domain.use_case.plan.ObservePlanOptionIdUseCase$executeOnBackground$$inlined$filter$1$2", f = "ObservePlanOptionIdUseCase.kt", l = {217}, m = "emit", v = 2)
        public static final class C0087a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0087a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, ef7.a aVar) {
            this.t = s54Var;
            this.u = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0087a c0087a;
            if (r02Var instanceof C0087a) {
                c0087a = (C0087a) r02Var;
                int i = c0087a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0087a.u = i - Integer.MIN_VALUE;
                } else {
                    c0087a = new C0087a(r02Var);
                }
            } else {
                c0087a = new C0087a(r02Var);
            }
            Object obj2 = c0087a.t;
            int i2 = c0087a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                if (((zz7) obj).a == this.u.a) {
                    c0087a.u = 1;
                    Object objEmit = this.t.emit(obj, c0087a);
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

    public ff7(r54 r54Var, ef7.a aVar) {
        this.t = r54Var;
        this.u = aVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super zz7> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

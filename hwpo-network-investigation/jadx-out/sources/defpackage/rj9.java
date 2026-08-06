package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rj9 implements r54<id8> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ lj9 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ lj9 u;

        /* JADX INFO: renamed from: rj9$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenProgramsUpdates$$inlined$filter$1$2", f = "SessionsViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0230a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0230a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, lj9 lj9Var) {
            this.t = s54Var;
            this.u = lj9Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0230a c0230a;
            if (r02Var instanceof C0230a) {
                c0230a = (C0230a) r02Var;
                int i = c0230a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0230a.u = i - Integer.MIN_VALUE;
                } else {
                    c0230a = new C0230a(r02Var);
                }
            } else {
                c0230a = new C0230a(r02Var);
            }
            Object obj2 = c0230a.t;
            int i2 = c0230a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                id8 id8Var = (id8) obj;
                lj9.a aVar = lj9.Companion;
                bc8 bc8Var = this.u.b().a;
                if (bc8Var != null && bc8Var.y == yk2.y(id8Var.a)) {
                    c0230a.u = 1;
                    Object objEmit = this.t.emit(obj, c0230a);
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

    public rj9(ji8 ji8Var, lj9 lj9Var) {
        this.t = ji8Var;
        this.u = lj9Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super id8> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ita implements r54<String> {
    public final /* synthetic */ r54 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: ita$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.tracking.presentation.container.TrackingFragment$initSearchQueryFlow$$inlined$map$1$2", f = "TrackingFragment.kt", l = {217}, m = "emit", v = 2)
        public static final class C0181a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0181a(r02 r02Var) {
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
            C0181a c0181a;
            if (r02Var instanceof C0181a) {
                c0181a = (C0181a) r02Var;
                int i = c0181a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0181a.u = i - Integer.MIN_VALUE;
                } else {
                    c0181a = new C0181a(r02Var);
                }
            } else {
                c0181a = new C0181a(r02Var);
            }
            Object obj2 = c0181a.t;
            int i2 = c0181a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                String string = z2a.R((String) obj).toString();
                c0181a.u = 1;
                Object objEmit = this.t.emit(string, c0181a);
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

    public ita(r54 r54Var) {
        this.t = r54Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super String> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}

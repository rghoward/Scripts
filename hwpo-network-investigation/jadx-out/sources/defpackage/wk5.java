package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
public final class wk5 extends p6a implements ci4<t72, r02<? super t78>, Object> {
    public int t;
    public final /* synthetic */ al5 u;
    public final /* synthetic */ oh4<x27, g2b> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<x27, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ oh4<x27, g2b> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(oh4<? super x27, g2b> oh4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = oh4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
            return ((a) create(x27Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.u.invoke((x27) this.t);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wk5(al5 al5Var, oh4<? super x27, g2b> oh4Var, r02<? super wk5> r02Var) {
        super(2, r02Var);
        this.u = al5Var;
        this.v = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wk5(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
        return ((wk5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        al5 al5Var = this.u;
        ThreadLocal<Boolean> threadLocal = al5Var.b;
        int i = this.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                Boolean bool = threadLocal.get();
                Boolean bool2 = Boolean.TRUE;
                if (xj5.a(bool, bool2)) {
                    aa0.c("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal.set(bool2);
                pf2<t78> pf2Var = al5Var.c;
                a aVar = new a(this.v, null);
                this.t = 1;
                obj = v78.a(pf2Var, aVar, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            t78 t78Var = (t78) obj;
            threadLocal.set(Boolean.FALSE);
            return t78Var;
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }
}

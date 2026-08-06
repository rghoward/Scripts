package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x21<T> extends v91<T> {
    public final ci4<ua8<? super T>, r02<? super g2b>, Object> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo", v = 1)
    public static final class a extends u02 {
        public ua8 t;
        public /* synthetic */ Object u;
        public int w;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return x21.this.i(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x21(ci4<? super ua8<? super T>, ? super r02<? super g2b>, ? extends Object> ci4Var, h72 h72Var, int i, xx0 xx0Var) {
        super(ci4Var, h72Var, i, xx0Var);
        this.x = ci4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.v91, defpackage.u91
    public final Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        Object obj = aVar.u;
        int i2 = aVar.w;
        if (i2 == 0) {
            dv8.b(obj);
            aVar.t = ua8Var;
            aVar.w = 1;
            Object objI = super.i(ua8Var, aVar);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua8Var = aVar.t;
            dv8.b(obj);
        }
        if (ua8Var.o()) {
            return g2b.a;
        }
        aa0.c("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.v91, defpackage.u91
    public final u91<T> j(h72 h72Var, int i, xx0 xx0Var) {
        return new x21(this.x, h72Var, i, xx0Var);
    }
}

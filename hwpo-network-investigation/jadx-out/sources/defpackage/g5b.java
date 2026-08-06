package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g5b<Params, ResultType> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.base.domain.UseCase", f = "UseCase.kt", l = {z97.PERF_SESSIONS_FIELD_NUMBER}, m = "invoke$suspendImpl", v = 2)
    public static final class a<Params, ResultType> extends u02 {
        public /* synthetic */ Object t;
        public final /* synthetic */ g5b<Params, ResultType> u;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g5b<? super Params, ? extends ResultType> g5bVar, r02<? super a> r02Var) {
            super(r02Var);
            this.u = g5bVar;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return g5b.b(this.u, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.base.domain.UseCase$invoke$2$1", f = "UseCase.kt", l = {z97.PERF_SESSIONS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<t72, r02<? super ResultType>, Object> {
        public int t;
        public final /* synthetic */ g5b<Params, ResultType> u;
        public final /* synthetic */ Params v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g5b<? super Params, ? extends ResultType> g5bVar, Params params, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = g5bVar;
            this.v = params;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, Object obj) {
            return ((b) create(t72Var, (r02) obj)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            this.t = 1;
            Object objA = this.u.a(this.v, this);
            v72 v72Var = v72.t;
            return objA == v72Var ? v72Var : objA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static <Params, ResultType> Object b(g5b<? super Params, ? extends ResultType> g5bVar, Params params, r02<? super xd3<? extends Exception, ? extends ResultType>> r02Var) {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(g5bVar, r02Var);
            }
        } else {
            aVar = new a(g5bVar, r02Var);
        }
        Object objG = aVar.t;
        int i2 = aVar.v;
        try {
            if (i2 == 0) {
                dv8.b(objG);
                et2 et2Var = i23.a;
                wr2 wr2Var = wr2.v;
                b bVar = new b(g5bVar, params, null);
                aVar.v = 1;
                objG = oy0.g(wr2Var, bVar, aVar);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(objG);
            }
            return new xd3.b(objG);
        } catch (Exception e) {
            return new xd3.a(e);
        }
    }

    public abstract Object a(Object obj, b bVar);
}

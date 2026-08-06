package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
public final class zk5 extends p6a implements ci4<t72, r02<? super t78>, Object> {
    public int t;
    public final /* synthetic */ al5 u;
    public final /* synthetic */ t78.a<Object> v;
    public final /* synthetic */ Long w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<x27, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ t78.a<Object> u;
        public final /* synthetic */ Long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t78.a aVar, Long l, r02 r02Var) {
            super(2, r02Var);
            this.u = aVar;
            this.v = l;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, this.v, r02Var);
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
            ((x27) this.t).g(this.u, this.v);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk5(al5 al5Var, t78.a aVar, Long l, r02 r02Var) {
        super(2, r02Var);
        this.u = al5Var;
        this.v = aVar;
        this.w = l;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zk5(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super t78> r02Var) {
        return ((zk5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
        pf2<t78> pf2Var = this.u.c;
        a aVar = new a(this.v, this.w, null);
        this.t = 1;
        Object objA = v78.a(pf2Var, aVar, this);
        v72 v72Var = v72.t;
        return objA == v72Var ? v72Var : objA;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v78 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {343}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t78, r02<? super t78>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ci4<x27, r02<? super g2b>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ci4<? super x27, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t78 t78Var, r02<? super t78> r02Var) {
            return ((a) create(t78Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x27 x27Var = (x27) this.u;
                dv8.b(obj);
                return x27Var;
            }
            dv8.b(obj);
            x27 x27VarC = ((t78) this.u).c();
            this.u = x27VarC;
            this.t = 1;
            Object objInvoke = this.v.invoke(x27VarC, this);
            v72 v72Var = v72.t;
            return objInvoke == v72Var ? v72Var : x27VarC;
        }
    }

    public static final Object a(pf2<t78> pf2Var, ci4<? super x27, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super t78> r02Var) {
        return pf2Var.a(new a(ci4Var, null), r02Var);
    }
}

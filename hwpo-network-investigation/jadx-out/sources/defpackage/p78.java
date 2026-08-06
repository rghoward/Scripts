package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p78 implements pf2<t78> {
    public final pf2<t78> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t78, r02<? super t78>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ci4<t78, r02<? super t78>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ci4<? super t78, ? super r02<? super t78>, ? extends Object> ci4Var, r02<? super a> r02Var) {
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
            if (i == 0) {
                dv8.b(obj);
                t78 t78Var = (t78) this.u;
                this.t = 1;
                obj = this.v.invoke(t78Var, this);
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
            t78 t78Var2 = (t78) obj;
            t78Var2.getClass();
            ((AtomicBoolean) ((x27) t78Var2).b.t).set(true);
            return t78Var2;
        }
    }

    public p78(pf2<t78> pf2Var) {
        this.a = pf2Var;
    }

    @Override // defpackage.pf2
    public final Object a(ci4<? super t78, ? super r02<? super t78>, ? extends Object> ci4Var, r02<? super t78> r02Var) {
        return this.a.a(new a(ci4Var, null), r02Var);
    }

    @Override // defpackage.pf2
    public final r54<t78> getData() {
        return this.a.getData();
    }
}

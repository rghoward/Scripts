package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {119}, m = "invokeSuspend", v = 1)
public final class wr7 extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ur7<Object> u;
    public final /* synthetic */ sr7<Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ ur7<T> t;
        public final /* synthetic */ sr7<T> u;

        public a(ur7<T> ur7Var, sr7<T> sr7Var) {
            this.t = ur7Var;
            this.u = sr7Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            oo7 oo7Var = (oo7) obj;
            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Collected " + oo7Var, null);
            }
            ur7<T> ur7Var = this.t;
            Object objG = oy0.g(ur7Var.a, new vr7(oo7Var, ur7Var, this.u, null), r02Var);
            return objG == v72.t ? objG : g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr7(ur7<Object> ur7Var, sr7<Object> sr7Var, r02<? super wr7> r02Var) {
        super(1, r02Var);
        this.u = ur7Var;
        this.v = sr7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new wr7(this.u, this.v, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((wr7) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            sr7<Object> sr7Var = this.v;
            n1b n1bVar = sr7Var.b;
            ur7<Object> ur7Var = this.u;
            n1b n1bVar2 = ur7Var.c;
            ur7Var.c = n1bVar;
            if (n1bVar2 instanceof ur7.a) {
                ur7.a aVar = (ur7.a) n1bVar2;
                if (aVar.a) {
                    n1bVar.c();
                }
                if (aVar.b) {
                    n1bVar.a();
                }
            }
            r54<oo7<Object>> r54Var = sr7Var.a;
            a aVar2 = new a(ur7Var, sr7Var);
            this.t = 1;
            Object objCollect = r54Var.collect(aVar2, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend", v = 1)
public final class fhb extends zu8 implements ci4<ad9<? super View>, r02<? super g2b>, Object> {
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhb(View view, r02<? super fhb> r02Var) {
        super(2, r02Var);
        this.w = view;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        fhb fhbVar = new fhb(this.w, r02Var);
        fhbVar.v = obj;
        return fhbVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(ad9<? super View> ad9Var, r02<? super g2b> r02Var) {
        return ((fhb) create(ad9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.u;
        View view = this.w;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            ad9 ad9Var = (ad9) this.v;
            this.v = ad9Var;
            this.u = 1;
            ad9Var.a(this, view);
            return v72Var;
        }
        if (i == 1) {
            ad9 ad9Var2 = (ad9) this.v;
            dv8.b(obj);
            if (view instanceof ViewGroup) {
                this.v = null;
                this.u = 2;
                ad9Var2.getClass();
                Object objB = ad9Var2.b(new wxa(new chb((ViewGroup) view)), this);
                if (objB != v72Var) {
                    objB = g2b.a;
                }
                if (objB == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}

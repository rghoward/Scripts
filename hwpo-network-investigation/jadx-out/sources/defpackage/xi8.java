package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {196}, m = "invokeSuspend")
public final class xi8 extends p6a implements ci4<t72, r02<? super l85>, Object> {
    public int t;
    public final /* synthetic */ k85 u;
    public final /* synthetic */ ti8 v;
    public final /* synthetic */ br9 w;
    public final /* synthetic */ nm3 x;
    public final /* synthetic */ Bitmap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi8(k85 k85Var, ti8 ti8Var, br9 br9Var, nm3 nm3Var, Bitmap bitmap, r02<? super xi8> r02Var) {
        super(2, r02Var);
        this.u = k85Var;
        this.v = ti8Var;
        this.w = br9Var;
        this.x = nm3Var;
        this.y = bitmap;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xi8(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super l85> r02Var) {
        return ((xi8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
        ArrayList arrayList = this.v.h;
        boolean z = this.y != null;
        k85 k85Var = this.u;
        bj8 bj8Var = new bj8(k85Var, arrayList, 0, k85Var, this.w, this.x, z);
        this.t = 1;
        Object objC = bj8Var.c(k85Var, this);
        v72 v72Var = v72.t;
        return objC == v72Var ? v72Var : objC;
    }
}

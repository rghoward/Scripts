package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq implements a28, t72 {
    public final View t;
    public final xha u;
    public final t72 v;
    public final AtomicReference<bh9<pd5>> w = new AtomicReference<>(null);

    public cq(View view, xha xhaVar, t72 t72Var) {
        this.t = view;
        this.u = xhaVar;
        this.v = t72Var;
    }

    @Override // defpackage.z18
    public final View a() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.z18
    public final void b(x56 x56Var, u02 u02Var) throws Throwable {
        yp ypVar;
        if (u02Var instanceof yp) {
            ypVar = (yp) u02Var;
            int i = ypVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypVar.v = i - Integer.MIN_VALUE;
            } else {
                ypVar = new yp(this, u02Var);
            }
        } else {
            ypVar = new yp(this, u02Var);
        }
        Object obj = ypVar.t;
        int i2 = ypVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            aq aqVar = new aq(x56Var, this);
            bq bqVar = new bq(this, null);
            ypVar.v = 1;
            if (u72.d(new ch9(aqVar, this.w, bqVar, null), ypVar) == v72.t) {
                return;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            dv8.b(obj);
        }
        fl.a();
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.v.getCoroutineContext();
    }
}

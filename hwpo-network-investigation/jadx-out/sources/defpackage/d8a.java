package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d8a extends je5 {
    public oh4<? super fnb, ? extends omb> K;
    public fnb L;

    public d8a() {
        throw null;
    }

    @Override // defpackage.ae5, ox6.c
    public final void U1() {
        View viewA = fw2.a(this);
        WeakHashMap<View, fnb> weakHashMap = fnb.w;
        fnb fnbVarD = fnb.a.d(viewA);
        fnbVarD.a(viewA);
        omb ombVarInvoke = this.K.invoke(fnbVarD);
        if (!xj5.a(ombVarInvoke, this.J)) {
            this.J = ombVarInvoke;
            d2();
        }
        this.L = fnbVarD;
        super.U1();
    }

    @Override // defpackage.ae5, ox6.c
    public final void V1() {
        View viewA = fw2.a(this);
        fnb fnbVar = this.L;
        if (fnbVar != null) {
            int i = fnbVar.u - 1;
            fnbVar.u = i;
            if (i == 0) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                egb.d.c(viewA, null);
                egb.q(viewA, null);
                viewA.removeOnAttachStateChangeListener(fnbVar.v);
            }
        }
        super.V1();
    }
}

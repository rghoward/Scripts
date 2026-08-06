package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tfa implements PointerInputEventHandler {
    public final /* synthetic */ qga a;

    public tfa(qga qgaVar) {
        this.a = qgaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        qga qgaVar = this.a;
        Object objB = cc4.b(i58Var, new pa9(new cf1(i58Var.getViewConfiguration()), qgaVar.A, qgaVar.z, null), r02Var);
        v72 v72Var = v72.t;
        if (objB != v72Var) {
            objB = g2b.a;
        }
        return objB == v72Var ? objB : g2b.a;
    }
}

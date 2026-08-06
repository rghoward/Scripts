package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kca.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jca implements PointerInputEventHandler {
    public final /* synthetic */ kca a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<vf7, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(vf7 vf7Var) {
            long j = vf7Var.a;
            kca kcaVar = (kca) this.receiver;
            kcaVar.getClass();
            wca wcaVar = (wca) ku1.a(kcaVar, yca.a);
            if (wcaVar != null) {
                oy0.d(kcaVar.Q1(), null, null, new lca(kcaVar, j, wcaVar, kcaVar.new a(j), null), 3);
            }
            return g2b.a;
        }
    }

    public jca(kca kcaVar) {
        this.a = kcaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objB = cc4.b(i58Var, new nw8(new a(1, this.a, kca.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), null), r02Var);
        v72 v72Var = v72.t;
        if (objB != v72Var) {
            objB = g2b.a;
        }
        return objB == v72Var ? objB : g2b.a;
    }
}

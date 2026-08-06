package defpackage;

import android.content.Context;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ds implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ds(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((h37) obj2).setValue((qq5) obj);
                return g2b.a;
            case 1:
                ql2 ql2Var = (ql2) obj2;
                gm3 gm3Var = (gm3) obj;
                ql2.a aVar = ql2.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof em2) {
                    ql2Var.m(null);
                    throw null;
                }
                if (gm3Var instanceof dm2) {
                    Context context = ql2Var.getContext();
                    if (context != null) {
                        yz1.a(context, null);
                    }
                } else if (gm3Var instanceof atb) {
                    btb.a aVar2 = btb.Companion;
                    String str = ((atb) gm3Var).b;
                    aVar2.getClass();
                    hk0.l(ql2Var, btb.a.a(str));
                }
                return g2b.a;
            default:
                return ((OverlayPresenter) obj2).lambda$new$0((Set) obj);
        }
    }
}

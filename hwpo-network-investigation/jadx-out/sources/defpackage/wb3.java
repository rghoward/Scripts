package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb3 implements oh4<tc8, g2b> {
    public final /* synthetic */ rb3 t;

    public wb3(rb3 rb3Var) {
        this.t = rb3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(tc8 tc8Var) {
        rb3.a aVar = rb3.Companion;
        final rb3 rb3Var = this.t;
        rb3Var.r().i.setText(tc8Var.u);
        rb3Var.getChildFragmentManager().f0("result_dialog_media_library", rb3Var.getViewLifecycleOwner(), new pf4() { // from class: kb3
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                rb3.p(rb3Var, str, bundle);
            }
        });
        return g2b.a;
    }
}

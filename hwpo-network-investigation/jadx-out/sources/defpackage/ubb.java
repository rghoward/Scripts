package defpackage;

import androidx.fragment.app.f;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ubb implements oh4<List<? extends y23>, g2b> {
    public final /* synthetic */ rbb t;

    public ubb(rbb rbbVar) {
        this.t = rbbVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends y23> list) {
        List<? extends y23> list2 = list;
        rbb rbbVar = this.t;
        f parentFragment = rbbVar.getParentFragment();
        hk0 hk0Var = parentFragment instanceof hk0 ? (hk0) parentFragment : null;
        if (hk0Var != null) {
            hk0Var.k(new wbb(rbbVar, list2));
        }
        return g2b.a;
    }
}

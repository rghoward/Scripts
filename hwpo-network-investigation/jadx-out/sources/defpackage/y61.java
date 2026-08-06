package defpackage;

import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y61 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ y61(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                t61 t61Var = (t61) obj2;
                t61.a aVar = t61.Companion;
                t61Var.p().d.g((vz7) obj, new b71(0, t61Var.q(), w71.class, "onRetryClick", "onRetryClick()V", 0));
                break;
            default:
                ((MaterialToolbar) obj2).setTitle((CharSequence) obj);
                break;
        }
        return g2b.a;
    }
}

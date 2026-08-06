package defpackage;

import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x8b implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ x8b(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((MaterialToolbar) obj2).setTitle((CharSequence) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((SimpleProgressBar) ((psb) obj2).receiver).setVisible(bool.booleanValue());
                break;
        }
        return g2b.a;
    }
}

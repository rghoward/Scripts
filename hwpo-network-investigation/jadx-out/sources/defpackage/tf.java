package defpackage;

import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ tf(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((SimpleProgressBar) ((yf) obj2).receiver).setVisible(bool.booleanValue());
                break;
            default:
                hi9.a aVar = hi9.Companion;
                ((hi9) obj2).p().c.g((vz7) obj, new bi9(0));
                break;
        }
        return g2b.a;
    }
}

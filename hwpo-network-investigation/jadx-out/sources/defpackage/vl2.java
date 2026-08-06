package defpackage;

import com.hwpo_training_app.core.widget.SimpleProgressBar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vl2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vl2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((xob) obj2).u((List) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((SimpleProgressBar) ((vbb) obj2).receiver).setVisible(bool.booleanValue());
                break;
        }
        return g2b.a;
    }
}

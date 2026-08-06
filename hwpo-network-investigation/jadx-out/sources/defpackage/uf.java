package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class uf implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ uf(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((MaterialButton) obj2).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((View) ((ki9) obj2).receiver).setVisibility(bool.booleanValue() ? 0 : 8);
                break;
        }
        return g2b.a;
    }
}

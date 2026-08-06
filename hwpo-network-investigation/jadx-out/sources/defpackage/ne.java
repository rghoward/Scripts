package defpackage;

import com.hwpo_training_app.core.widget.PickedOptionTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ne implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ y27 u;

    public /* synthetic */ ne(y27 y27Var, int i) {
        this.t = i;
        this.u = y27Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        y27 y27Var = this.u;
        switch (i) {
            case 0:
                ((PickedOptionTextView) ((pe) y27Var).receiver).setPickedOptionText((String) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((oe) y27Var).f(bool);
                break;
        }
        return g2b.a;
    }
}

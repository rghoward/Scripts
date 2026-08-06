package defpackage;

import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rl7 implements oh4<Boolean, g2b> {
    public final /* synthetic */ tl7 t;

    public rl7(tl7 tl7Var) {
        this.t = tl7Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        ((SimpleProgressBar) this.t.receiver).setVisible(bool2.booleanValue());
        return g2b.a;
    }
}

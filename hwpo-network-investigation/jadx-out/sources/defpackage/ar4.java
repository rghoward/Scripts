package defpackage;

import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ar4 implements oh4<Boolean, g2b> {
    public final /* synthetic */ er4 t;

    public ar4(er4 er4Var) {
        this.t = er4Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        ((SimpleProgressBar) this.t.receiver).setVisible(bool2.booleanValue());
        return g2b.a;
    }
}

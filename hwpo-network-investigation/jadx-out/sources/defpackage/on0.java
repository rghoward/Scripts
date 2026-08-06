package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 implements oh4<no5, Boolean> {
    public final /* synthetic */ fra t;
    public final /* synthetic */ h37<Boolean> u;

    public on0(fra fraVar, h37 h37Var) {
        this.t = fraVar;
        this.u = h37Var;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(no5 no5Var) {
        KeyEvent keyEvent = no5Var.a;
        if (!this.t.b()) {
            this.u.setValue(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }
}

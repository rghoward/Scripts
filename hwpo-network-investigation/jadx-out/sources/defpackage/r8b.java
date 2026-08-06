package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class r8b implements oh4<Boolean, g2b> {
    public final /* synthetic */ f9b t;

    public r8b(f9b f9bVar) {
        this.t = f9bVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        ((View) this.t.receiver).setVisibility(bool2.booleanValue() ? 0 : 8);
        return g2b.a;
    }
}

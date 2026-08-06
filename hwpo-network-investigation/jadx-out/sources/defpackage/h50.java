package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements k9a {
    public final /* synthetic */ f50 t;

    public h50(f50 f50Var) {
        this.t = f50Var;
    }

    @Override // defpackage.k9a
    public final void onStart(Drawable drawable) {
        f50 f50Var = this.t;
        f50Var.k(new f50.a.c(drawable != null ? f50Var.j(drawable) : null));
    }

    @Override // defpackage.k9a
    public final void onError(Drawable drawable) {
    }

    @Override // defpackage.k9a
    public final void onSuccess(Drawable drawable) {
    }
}

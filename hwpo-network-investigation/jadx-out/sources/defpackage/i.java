package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends tt {
    public final /* synthetic */ mh4<g2b> b;
    public final /* synthetic */ mh4<g2b> c;

    public i(mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
        this.b = mh4Var;
        this.c = mh4Var2;
    }

    @Override // defpackage.tt
    public final void a(Drawable drawable) {
        mh4<g2b> mh4Var = this.c;
        if (mh4Var != null) {
            mh4Var.invoke();
        }
    }

    @Override // defpackage.tt
    public final void b(Drawable drawable) {
        mh4<g2b> mh4Var = this.b;
        if (mh4Var != null) {
            mh4Var.invoke();
        }
    }
}

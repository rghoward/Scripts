package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k73 implements eu8<Drawable, byte[]> {
    public final qq0 t;
    public final cq0 u;
    public final u00 v;

    public k73(qq0 qq0Var, cq0 cq0Var, u00 u00Var) {
        this.t = qq0Var;
        this.u = cq0Var;
        this.v = u00Var;
    }

    @Override // defpackage.eu8
    public final kt8<byte[]> a(kt8<Drawable> kt8Var, xk7 xk7Var) {
        Drawable drawable = kt8Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.u.a(sq0.d(this.t, ((BitmapDrawable) drawable).getBitmap()), xk7Var);
        }
        if (drawable instanceof xl4) {
            return this.v.a(kt8Var, xk7Var);
        }
        return null;
    }
}

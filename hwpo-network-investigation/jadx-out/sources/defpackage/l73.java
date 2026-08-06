package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l73 implements awa<Drawable> {
    public final boolean a;
    public m73 b;

    public l73(boolean z) {
        this.a = z;
    }

    @Override // defpackage.awa
    public final yva a(kf2 kf2Var) {
        if (kf2Var == kf2.x) {
            return gb7.a;
        }
        if (this.b == null) {
            this.b = new m73(this.a);
        }
        return this.b;
    }
}

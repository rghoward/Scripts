package defpackage;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class zmb extends ymb {
    @Override // defpackage.x10
    public final boolean c() {
        return (this.f.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.x10
    public final void h(boolean z) {
        if (!z) {
            k(8192);
            return;
        }
        Window window = this.f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        j(8192);
    }
}

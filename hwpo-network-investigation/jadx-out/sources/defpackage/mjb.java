package defpackage;

import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class mjb extends ImageButton {
    public int t;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.t = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.t;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}

package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends ClickableSpan {
    public final int t;
    public final j4 u;
    public final int v;

    public l3(int i, j4 j4Var, int i2) {
        this.t = i;
        this.u = j4Var;
        this.v = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.t);
        this.u.a.performAction(this.v, bundle);
    }
}

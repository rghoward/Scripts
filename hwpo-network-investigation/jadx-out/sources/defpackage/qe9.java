package defpackage;

import android.view.View;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qe9 implements Runnable {
    public final /* synthetic */ MaterialTextView t;
    public final /* synthetic */ na6 u;

    public qe9(MaterialTextView materialTextView, na6 na6Var) {
        this.t = materialTextView;
        this.u = na6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.u.c;
        MaterialTextView materialTextView = this.t;
        view.setVisibility(materialTextView.getLineCount() >= materialTextView.getMaxLines() ? 0 : 8);
    }
}

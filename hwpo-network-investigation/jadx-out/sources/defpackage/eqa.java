package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eqa implements Runnable {
    public final /* synthetic */ MaterialTextView t;
    public final /* synthetic */ pa6 u;
    public final /* synthetic */ hi9.f v;
    public final /* synthetic */ ya w;

    public eqa(MaterialTextView materialTextView, pa6 pa6Var, hi9.f fVar, ya yaVar) {
        this.t = materialTextView;
        this.u = pa6Var;
        this.v = fVar;
        this.w = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pa6 pa6Var = this.u;
        View view = pa6Var.d;
        MaterialTextView materialTextView = this.t;
        view.setVisibility(materialTextView.getLineCount() >= materialTextView.getMaxLines() ? 0 : 8);
        ConstraintLayout constraintLayout = pa6Var.a;
        constraintLayout.getClass();
        xgb.a(constraintLayout, new dqa(this.v, this.w, null));
    }
}

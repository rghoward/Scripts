package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gq implements b33 {
    public final /* synthetic */ d68 a;

    public gq(d68 d68Var) {
        this.a = d68Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        d68 d68Var = this.a;
        d68Var.disposeComposition();
        d68Var.setTag(R.id.view_tree_lifecycle_owner, null);
        d68Var.z.removeViewImmediate(d68Var);
    }
}

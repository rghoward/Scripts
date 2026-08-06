package defpackage;

import android.view.ActionMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class js implements b33 {
    public final /* synthetic */ zr a;

    public js(zr zrVar) {
        this.a = zrVar;
    }

    @Override // defpackage.b33
    public final void dispose() {
        zr zrVar = this.a;
        jv9 jv9Var = zrVar.e;
        gu9 gu9Var = jv9Var.h;
        if (gu9Var != null) {
            gu9Var.a();
        }
        jv9Var.a();
        ActionMode actionMode = zrVar.h;
        if (actionMode != null) {
            actionMode.finish();
        }
        zrVar.h = null;
    }
}

package defpackage;

import android.view.ActionMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr implements oh4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ Object u;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ActionMode actionMode = ((zr) obj2).h;
                if (actionMode != null) {
                    actionMode.invalidateContentRect();
                }
                break;
            default:
                ((a47) obj2).c(null);
                break;
        }
        return g2b.a;
    }
}

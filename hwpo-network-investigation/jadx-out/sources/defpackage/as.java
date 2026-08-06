package defpackage;

import android.app.Activity;
import android.view.ActionMode;
import android.view.View;
import io.intercom.android.sdk.overlay.OverlayPresenter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ as(Object obj, Object obj2, Object obj3, int i) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.w;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                zr zrVar = (zr) obj3;
                zr.b bVar = (zr.b) obj;
                ActionMode actionModeStartActionMode = zrVar.a.startActionMode(new p54((uaa) obj2), 1);
                xj5.a(zrVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    bVar.close();
                }
                break;
            default:
                ((OverlayPresenter) obj3).lambda$removeOverlaysIfPresent$6((View) obj2, (Activity) obj);
                break;
        }
    }
}

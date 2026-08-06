package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class no implements View.OnAttachStateChangeListener {
    public final /* synthetic */ oo t;

    public no(oo ooVar) {
        this.t = ooVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        oo ooVar = this.t;
        if (ooVar.d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(ooVar.e);
        ooVar.d = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Context context = view.getContext();
        oo ooVar = this.t;
        if (ooVar.d) {
            context.getApplicationContext().unregisterComponentCallbacks(ooVar.e);
            ooVar.d = false;
        }
    }
}

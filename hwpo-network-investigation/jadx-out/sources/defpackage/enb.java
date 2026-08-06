package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class enb implements b33 {
    public final /* synthetic */ fnb a;
    public final /* synthetic */ View b;

    public enb(fnb fnbVar, View view) {
        this.a = fnbVar;
        this.b = view;
    }

    @Override // defpackage.b33
    public final void dispose() {
        fnb fnbVar = this.a;
        int i = fnbVar.u - 1;
        fnbVar.u = i;
        if (i == 0) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            View view = this.b;
            egb.d.c(view, null);
            egb.q(view, null);
            view.removeOnAttachStateChangeListener(fnbVar.v);
        }
    }
}

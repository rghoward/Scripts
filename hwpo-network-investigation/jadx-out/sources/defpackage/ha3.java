package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha3 implements Runnable {
    public final /* synthetic */ pa3 t;
    public final /* synthetic */ w7a u;
    public final /* synthetic */ w7a v;
    public final /* synthetic */ dq1 w;
    public final /* synthetic */ View x;

    public /* synthetic */ ha3(pa3 pa3Var, w7a w7aVar, w7a w7aVar2, dq1 dq1Var, View view) {
        this.t = pa3Var;
        this.u = w7aVar;
        this.v = w7aVar2;
        this.w = dq1Var;
        this.x = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.w.getWindow();
        window.getClass();
        w7a w7aVar = this.u;
        oh4<Resources, Boolean> oh4Var = w7aVar.d;
        View view = this.x;
        Resources resources = view.getResources();
        resources.getClass();
        boolean zBooleanValue = oh4Var.invoke(resources).booleanValue();
        w7a w7aVar2 = this.v;
        oh4<Resources, Boolean> oh4Var2 = w7aVar2.d;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.t.b(w7aVar, w7aVar2, window, view, zBooleanValue, oh4Var2.invoke(resources2).booleanValue());
    }
}

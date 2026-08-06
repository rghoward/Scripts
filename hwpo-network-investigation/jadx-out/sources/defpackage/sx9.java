package defpackage;

import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx9 implements Runnable {
    public final /* synthetic */ dy9 t;
    public final /* synthetic */ mp2 u;

    public /* synthetic */ sx9(dy9 dy9Var, mp2 mp2Var) {
        this.t = dy9Var;
        this.u = mp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy9 dy9Var = this.t;
        dy9Var.a.b().bringToFront();
        this.u.getClass();
        ho5<Object>[] ho5VarArr = HostActivity.K;
        dy9Var.a.c();
    }
}

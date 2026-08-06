package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4b implements Runnable {
    public final /* synthetic */ v4b t;
    public final /* synthetic */ ef0 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Runnable w;

    public /* synthetic */ l4b(v4b v4bVar, ef0 ef0Var, int i, Runnable runnable) {
        this.t = v4bVar;
        this.u = ef0Var;
        this.v = i;
        this.w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ef0 ef0Var = this.u;
        final int i = this.v;
        Runnable runnable = this.w;
        final v4b v4bVar = this.t;
        n7a n7aVar = v4bVar.f;
        try {
            an3 an3Var = v4bVar.c;
            Objects.requireNonNull(an3Var);
            n7aVar.m(new m4b(an3Var));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) v4bVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                n7aVar.m(new n7a.a() { // from class: n4b
                    @Override // n7a.a
                    public final Object execute() {
                        v4bVar.d.a(ef0Var, i + 1);
                        return null;
                    }
                });
            } else {
                v4bVar.a(ef0Var, i);
            }
        } catch (m7a unused) {
            v4bVar.d.a(ef0Var, i + 1);
        } finally {
            runnable.run();
        }
    }
}

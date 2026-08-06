package defpackage;

import com.google.firebase.remoteconfig.internal.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv1 implements e5a {
    public final /* synthetic */ gv1 t;
    public final /* synthetic */ b u;

    public /* synthetic */ fv1(gv1 gv1Var, b bVar) {
        this.t = gv1Var;
        this.u = bVar;
    }

    @Override // defpackage.e5a
    public final r9a b(Object obj) {
        gv1 gv1Var = this.t;
        b bVar = this.u;
        synchronized (gv1Var) {
            gv1Var.c = caa.e(bVar);
        }
        return caa.e(bVar);
    }
}

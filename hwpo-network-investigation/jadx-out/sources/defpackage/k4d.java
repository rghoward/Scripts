package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k4d extends l5d {
    public static final k4d a = new k4d();

    @Override // defpackage.l5d
    public final z4d b(x3d x3dVar, String str, Executor executor, j2d j2dVar) {
        f1c f1cVarA;
        if (x3dVar.f) {
            f1cVarA = f1c.a();
        } else {
            f1c f1cVar = f1c.b;
            int i = h0c.a;
            f1cVarA = f1c.c;
        }
        return new z4d(str, ti4.k1(x3dVar.a), new u5d(x3dVar.b, f1cVarA), executor, j2dVar, x3dVar.c, new p50());
    }

    @Override // defpackage.l5d
    public final void a() {
    }
}
